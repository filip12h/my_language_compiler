package main.java.com.visitor;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;
import org.stringtemplate.v4.*;

import main.java.com.codefragment.CodeFragment;

public class ProjectVisitor extends ProjectGrammarBaseVisitor<CodeFragment> {
    
    private Map<String,String> memory = new HashMap<String,String>();
    private Map<String, ArrayList<CodeFragment>> arrayMemory = new HashMap<>();
    private STGroup group = new STGroupFile("./main/java/com/templates/LLVM.stg");

    private int registerIndex = 0;
    private int labelIndex = 0;
    
    /* Pomocne metody */
    
    private String generateNewRegister() {
        return String.format("%%reg%d", registerIndex++);
    }
    
    private String generateNewLabel() {
        return String.format("%d", labelIndex++);
    }
    /*
    cely program
    */
    @Override
    public CodeFragment visitInit(ProjectGrammarParser.InitContext ctx) {
        ST template = group.getInstanceOf("init");
        int n = ctx.stat().size();
        for (int i = 0; i < n; i++) {
            CodeFragment statCodeFragment = visit(ctx.stat(i));
            template.add("code", statCodeFragment + "\r\n");
        }
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment;
    }
    /*
    nejaky blok kodu alebo novy riadok
    */
    @Override
    public CodeFragment visitStat(ProjectGrammarParser.StatContext ctx) {
        if (ctx.block() != null) {
            return visit(ctx.block());
        } else {
            return new CodeFragment();
        }
    }
    /*
    deklaracia premennych alebo funkcii
    */
	@Override public CodeFragment visitDecl(ProjectGrammarParser.DeclContext ctx) {
        return visit(ctx.declaration());
    }
    /*
    statementy
    */
    @Override
    public CodeFragment visitStatm(ProjectGrammarParser.StatmContext ctx) {
        return visit(ctx.statement());
    }
    /*
    vypisovanie integerov
    */
	@Override public CodeFragment visitOutInt(ProjectGrammarParser.OutIntContext ctx) { 
        ST template = group.getInstanceOf("OutputInt");
        CodeFragment valueCodeFragment = visit(ctx.writeintcontext());
        template.add("compute_value", valueCodeFragment);
        template.add("value_register", valueCodeFragment.getRegister());
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment;
    }
    /*
    vypisovanie charakteru
    */
    @Override public CodeFragment visitOutChar(ProjectGrammarParser.OutCharContext ctx) { 
        ST template = group.getInstanceOf("OutputChar");
        CodeFragment valueCodeFragment = visit(ctx.charoperandinlogic());
        template.add("compute_value", valueCodeFragment);
        template.add("value_register", valueCodeFragment.getRegister());
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment;
    }
    /*
    deklaracia funkcie
    */
    @Override public CodeFragment visitFunctionDeclaration(ProjectGrammarParser.FunctionDeclarationContext ctx) {
        ST template = group.getInstanceOf("FunctionDeclaration");
        String memoryRegister;
        memoryRegister = generateNewRegister();
        String variable = ctx.parameter().getText();
        memory.put(variable, memoryRegister);
        //int n = ctx.parameterlist().size();
        CodeFragment parameters = visit(ctx.parameterlist());
        template.add("code", parameters + "\r\n");
        CodeFragment functionbody = visit(ctx.functionbody());
        template.add("code", functionbody);
        CodeFragment returnstatement = visit(ctx.retexpr());
        template.add("code", returnstatement);
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        //System.out.println(retCodeFragment);
        return retCodeFragment;
    }
    /*
    deklarovanie premennej, resp. pola
	*/
	@Override public CodeFragment visitVarDeclaration(ProjectGrammarParser.VarDeclarationContext ctx) {
        return visit(ctx.parameterVar());
	}
    /*
    obstaranie vyrazu prisluchajuceho k returnu funkcie
    */
    @Override public CodeFragment visitRetexpr(ProjectGrammarParser.RetexprContext ctx) {
        ST template = group.getInstanceOf("Return");
        CodeFragment expr = visit(ctx.expr()); 
        template.add("expr", expr);
        template.add("expr_register", expr.getRegister());
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment;
    }
    /*
    prechadzanie telom funkcie
    */
    @Override public CodeFragment visitFuncBody(ProjectGrammarParser.FuncBodyContext ctx) {
        ST template = group.getInstanceOf("Statements");
        int n = ctx.stat().size();
        for (int i = 0; i < n; i++) {
            CodeFragment statCodeFragment = visit(ctx.stat(i));
            template.add("code", statCodeFragment + "\r\n");
        } 
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment;
    }
    /*
    podmienka if
    */
	@Override public CodeFragment visitIfStatement(ProjectGrammarParser.IfStatementContext ctx) { 
        return visit(ctx.ifstatement()); 
    }
    /*
    while cyklus
    */
	@Override public CodeFragment visitWhileStatement(ProjectGrammarParser.WhileStatementContext ctx) {
        return visit(ctx.whilestatement()); 
    }
	/*
	jednoduchy prikaz zakonceny bodkociarkou
	*/
	@Override public CodeFragment visitExpression(ProjectGrammarParser.ExpressionContext ctx) {
        return visit(ctx.expr()); 
    }
    /*
    argumenty funkcie pri deklarovani
    */
	@Override public CodeFragment visitParamList(ProjectGrammarParser.ParamListContext ctx) {
        ST template = group.getInstanceOf("ParameterList");
        int n = ctx.parameter().size();
        for (int i = 0; i < n; i++) {
            CodeFragment statCodeFragment = visit(ctx.parameter(i));
            template.add("code", statCodeFragment + "\r\n");
        }
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment;
    }
    /*
    deklaracie integerovaskej premennej
    */
	@Override public CodeFragment visitVariableDeclarationInt(ProjectGrammarParser.VariableDeclarationIntContext ctx) {
        if (ctx.arrayslist().size()>0){//(ctx.arrayslist()!=null){
            ST template = group.getInstanceOf("VariableDeclarationIntegerArray");
            CodeFragment dim = new CodeFragment();
            String code = "";
            ArrayList<CodeFragment> arraysSizes = new ArrayList<>(); 
            for (int i = 0; i < ctx.arrayslist().size(); i++) {
                dim = visit(ctx.arrayslist(i));
                code += dim.toString();
                arraysSizes.add(dim);
            }
            String lastRegister = arraysSizes.get(0).getRegister();
            for (int i = 1; i < arraysSizes.size(); i++) {
                String reg = generateNewRegister();
                code += reg + " = mul nuw i32 " + lastRegister + ", " + arraysSizes.get(i).getRegister() + "\n" ;
                lastRegister = reg;
            }

            String memoryRegister = generateNewRegister();
            arrayMemory.put(ctx.VARIABLE().getText(), arraysSizes);
            memory.put(ctx.VARIABLE().getText(), memoryRegister);
            template.add("memory_register", memoryRegister);
            template.add("dim_alloc", lastRegister);
            template.add("code", new CodeFragment(code));
            CodeFragment retCodeFragment = new CodeFragment(template.render());
            //System.out.println(retCodeFragment);
            return retCodeFragment;
        } else {
            ST template = group.getInstanceOf("VariableDeclarationInteger");
            String memoryRegister;
            memoryRegister = generateNewRegister();
            memory.put(ctx.VARIABLE().getText(), memoryRegister);
            template.add("allocate","1");
            template.add("memory_register", memoryRegister);
            CodeFragment retCodeFragment = new CodeFragment(template.render());
            //System.out.println(retCodeFragment);
            return retCodeFragment; 
        }
    }
    /*
    deklaracie booleovskej premennej
    */
    @Override public CodeFragment visitVariableDeclarationBool(ProjectGrammarParser.VariableDeclarationBoolContext ctx) {
        if (ctx.arrayslist().size()>0){//(ctx.arrayslist()!=null){
            ST template = group.getInstanceOf("VariableDeclarationBoolArray");
            CodeFragment dim = new CodeFragment();
            String code = "";
            ArrayList<CodeFragment> arraysSizes = new ArrayList<>(); 
            for (int i = 0; i < ctx.arrayslist().size(); i++) {
                dim = visit(ctx.arrayslist(i));
                code += dim.toString();
                arraysSizes.add(dim);
            }

            String lastRegister = arraysSizes.get(0).getRegister();
            for (int i = 1; i < arraysSizes.size(); i++) {
                String reg = generateNewRegister();
                code += reg + " = mul nuw i32 " + lastRegister + ", " + arraysSizes.get(i).getRegister() + "\n" ;
                lastRegister = reg;
            }

            String memoryRegister = generateNewRegister();
            memory.put(ctx.VARIABLE().getText(), memoryRegister);
            arrayMemory.put(ctx.VARIABLE().getText(), arraysSizes);
            template.add("memory_register", memoryRegister);
            template.add("dim_alloc", lastRegister);
            template.add("code", new CodeFragment(code));
            CodeFragment retCodeFragment = new CodeFragment(template.render());
            //System.out.println(retCodeFragment);
            return retCodeFragment;
        } else {
            ST template = group.getInstanceOf("VariableDeclarationBool");
            String memoryRegister;
            memoryRegister = generateNewRegister();
            memory.put(ctx.VARIABLE().getText(), memoryRegister);
            template.add("allocate","1");
            template.add("memory_register", memoryRegister);
            CodeFragment retCodeFragment = new CodeFragment(template.render());
            //System.out.println(retCodeFragment);
            return retCodeFragment; 
        }
    }
    /*
    deklaracia charakterovskej premennej
    */
    @Override public CodeFragment visitVariableDeclarationChar(ProjectGrammarParser.VariableDeclarationCharContext ctx) {
        if (ctx.arrayslist().size()>0){//(ctx.arrayslist()!=null){
            ST template = group.getInstanceOf("VariableDeclarationCharArray");
            CodeFragment dim = new CodeFragment();
            String code = "";
            ArrayList<CodeFragment> arraysSizes = new ArrayList<>(); 
            for (int i = 0; i < ctx.arrayslist().size(); i++) {
                dim = visit(ctx.arrayslist(i));
                code += dim.toString();
                arraysSizes.add(dim);
            }

            String lastRegister = arraysSizes.get(0).getRegister();
            for (int i = 1; i < arraysSizes.size(); i++) {
                String reg = generateNewRegister();
                code += reg + " = mul nuw i32 " + lastRegister + ", " + arraysSizes.get(i).getRegister() + "\n" ;
                lastRegister = reg;
            }

            String memoryRegister = generateNewRegister();
            memory.put(ctx.VARIABLE().getText(), memoryRegister);
            arrayMemory.put(ctx.VARIABLE().getText(), arraysSizes);
            template.add("memory_register", memoryRegister);
            template.add("dim_alloc", lastRegister);
            template.add("code", new CodeFragment(code));
            CodeFragment retCodeFragment = new CodeFragment(template.render());
            //System.out.println(retCodeFragment);
            return retCodeFragment;
        } else {
            ST template = group.getInstanceOf("VariableDeclarationChar");
            String memoryRegister;
            memoryRegister = generateNewRegister();
            memory.put(ctx.VARIABLE().getText(), memoryRegister);
            template.add("memory_register", memoryRegister);
            CodeFragment retCodeFragment = new CodeFragment(template.render());
            //System.out.println(retCodeFragment);
            return retCodeFragment;
        }
    }
    /*
    integerovske parametre funkcie pri deklarovani
    */
    @Override public CodeFragment visitVariableInFuncDeclarationInt(ProjectGrammarParser.VariableInFuncDeclarationIntContext ctx) {
            ST template = group.getInstanceOf("VariableDeclarationInteger");
            String memoryRegister;
            memoryRegister = generateNewRegister();
            memory.put(ctx.VARIABLE().getText(), memoryRegister);
            template.add("allocate","1");
            template.add("memory_register", memoryRegister);
            CodeFragment retCodeFragment = new CodeFragment(template.render());
            //System.out.println(retCodeFragment);
            return retCodeFragment; 
    }
    /*
    booleovske parametre funkcie pri deklarovani
    */
    @Override public CodeFragment visitVariableInFuncDeclarationBool(ProjectGrammarParser.VariableInFuncDeclarationBoolContext ctx) {
            ST template = group.getInstanceOf("VariableDeclarationInteger");
            String memoryRegister;
            memoryRegister = generateNewRegister();
            memory.put(ctx.VARIABLE().getText(), memoryRegister);
            template.add("allocate","1");
            template.add("memory_register", memoryRegister);
            CodeFragment retCodeFragment = new CodeFragment(template.render());
            //System.out.println(retCodeFragment);
            return retCodeFragment; 
    }
    /*
    velkost pola
    */
	@Override public CodeFragment visitArr(ProjectGrammarParser.ArrContext ctx) { 
        ST template = group.getInstanceOf("ParameterList");
        CodeFragment statCodeFragment = visit(ctx.mathexpression());
        template.add("code", statCodeFragment + "\r\n");
        CodeFragment retCodeFragment = new CodeFragment(template.render(), statCodeFragment.getRegister());
        return retCodeFragment;
	}
    /*
    podmienka if - jej telo
    */
	@Override public CodeFragment visitIfCtx(ProjectGrammarParser.IfCtxContext ctx) {
        ST template = group.getInstanceOf("IfStatement");
        CodeFragment value1CodeFragment = visit(ctx.logicexpression());
        String cmpRegister = generateNewRegister();
        CodeFragment ifTrueCodeFragment = visit(ctx.ifblock());
        CodeFragment ifFalseCodeFragment = visit(ctx.elseblock());
        String labelID = generateNewLabel();
        template.add("compute_value1", value1CodeFragment);
        template.add("value1_register", value1CodeFragment.getRegister());
        template.add("cmp_register", cmpRegister);
        template.add("if_true", ifTrueCodeFragment);
        template.add("if_false", ifFalseCodeFragment);
        template.add("label_id", labelID);
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment;
    }
    /*
    if statement
    */
	@Override public CodeFragment visitIfStatements(ProjectGrammarParser.IfStatementsContext ctx) {
        ST template = group.getInstanceOf("Statements");
        int n = ctx.stat().size();
        for (int i = 0; i < n; i++) {
            CodeFragment statCodeFragment = visit(ctx.stat(i));
            template.add("code", statCodeFragment + "\r\n");
        } 
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment;
    }
	/*
	prechadzanie else vetvy
	*/
	@Override public CodeFragment visitElseStatements(ProjectGrammarParser.ElseStatementsContext ctx) {
        ST template = group.getInstanceOf("Statements");
        int n = ctx.stat().size();
        for (int i = 0; i < n; i++) {
            CodeFragment statCodeFragment = visit(ctx.stat(i));
            template.add("code", statCodeFragment + "\r\n");
        } 
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment;
    }
    /*
    while cyklus
    */
	@Override public CodeFragment visitWhileCtx(ProjectGrammarParser.WhileCtxContext ctx) {
        ST template = group.getInstanceOf("WhileStatement");
        CodeFragment logexp = visit(ctx.logicexpression());
        template.add("condition", logexp);
        template.add("cond_register", logexp.getRegister());
        CodeFragment body = visit(ctx.cyclebody());
        template.add("cycle_body", body);
        String labelID = generateNewLabel();
        template.add("label_id", labelID);
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment; 
    }
    /*
    prechadzanie telom cyklu
    */
    @Override public CodeFragment visitCycBd(ProjectGrammarParser.CycBdContext ctx) {
        ST template = group.getInstanceOf("Statements");
        int n = ctx.block().size();
        for (int i = 0; i < n; i++) {
            CodeFragment statCodeFragment = visit(ctx.block(i));
            template.add("code", statCodeFragment + "\r\n");
        }
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment;
    }
    /*
    priradenie vyrazu do premennej
    */
	@Override public CodeFragment visitAssignExp(ProjectGrammarParser.AssignExpContext ctx) {
        return visit(ctx.assignexpression()); 
    }
    /*
    aritmeticky vyraz
    */
	@Override public CodeFragment visitMathExp(ProjectGrammarParser.MathExpContext ctx) { 
        return visit(ctx.mathexpression());  
    }
    /*
    logicky vyraz
    */
	@Override public CodeFragment visitLogicExp(ProjectGrammarParser.LogicExpContext ctx) {
        return visit(ctx.logicexpression()); 
    }
    /*
    priradenie booleovskej hodnoty do premennej
    */
    @Override public CodeFragment visitAssignExpCtxLog(ProjectGrammarParser.AssignExpCtxLogContext ctx) {
        ST template = group.getInstanceOf("AssignmentLog");
        CodeFragment valueCodeFragment = visit(ctx.logicexpression());
        String id = ctx.operand().getText();
        String memoryRegister;
        memoryRegister = memory.get(id);
        template.add("compute_value", valueCodeFragment);
        template.add("value_register", valueCodeFragment.getRegister());
        template.add("memory_register", memoryRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment;
    }
    @Override public CodeFragment visitAssignMath(ProjectGrammarParser.AssignMathContext ctx) {
        ST template = group.getInstanceOf("AssignmentMath");
        CodeFragment index_register = visit(ctx.operand());
        CodeFragment valueCodeFragment = visit(ctx.mathexpression());
        template.add("compute_value", valueCodeFragment);
        template.add("value_register", valueCodeFragment.getRegister());
        template.add("index_register", index_register.getRegister());
        template.add("code", index_register);
        if (index_register.toString().length() > 10){
            template.add("isArray", 1);
        } else {
            template.add("isNotArray", 1);
        }
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        //System.out.println(retCodeFragment);
        return retCodeFragment;
    }
    /*
    priradenie vstupnej hodnoty do premennej
    */
    @Override public CodeFragment visitAssignExpCtxInpInt(ProjectGrammarParser.AssignExpCtxInpIntContext ctx) {
        ST template = group.getInstanceOf("AssignmentInpInt");
        CodeFragment code = visit(ctx.operand());
        String valueRegister = generateNewRegister();
        template.add("value_register", valueRegister);
        template.add("index_register", code.getRegister());
        template.add("code", code);
        if (code.toString().length()>10){
            template.add("isArray", 1);
        } else template.add("isNotArray", 1);
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        //System.out.println(retCodeFragment);
        return retCodeFragment;
    }
    /*
    priradenie vstupnej hodnoty do premennej
    */
    @Override public CodeFragment visitAssignExpCtxInpChar(ProjectGrammarParser.AssignExpCtxInpCharContext ctx) {
        ST template = group.getInstanceOf("AssignmentInpChar");
        CodeFragment code = visit(ctx.charoperand());
        String valueRegister = generateNewRegister();
        template.add("value_register", valueRegister);
        template.add("index_register", code.getRegister());
        template.add("code", code);
        if (code.toString().length()>10){
            template.add("isArray", 1);
        } else template.add("isNotArray", 1);
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        //System.out.println(retCodeFragment);
        return retCodeFragment;
    }
    /*
    priradenie charakterovej konstanty/premmej
    */
    @Override public CodeFragment visitAssignChar(ProjectGrammarParser.AssignCharContext ctx) {
        ST template = group.getInstanceOf("AssignmentChar");
        CodeFragment code = visit(ctx.charoperand());
        CodeFragment value = visit(ctx.charexpression());
        template.add("compute_value", value);
        template.add("value_register", value.getRegister());
        template.add("index_register", code.getRegister());
        template.add("code", code);
        if (code.toString().length()>10){
            template.add("isArray", 1);
        } else template.add("isNotArray", 1);
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        //System.out.println(retCodeFragment);
        return retCodeFragment;
    }
    /*
    priradenie hodnoty funkcie do premennej
    */
    @Override public CodeFragment visitAssignExpCtxFunc(ProjectGrammarParser.AssignExpCtxFuncContext ctx) {
        ST template = group.getInstanceOf("AssignmentFunc");
        CodeFragment valueCodeFragment = visit(ctx.function());
        String id = ctx.operand().getText();
        String memoryRegister;
        memoryRegister = memory.get(id);
        template.add("compute_value", valueCodeFragment);
        template.add("value_register", valueCodeFragment.getRegister());
        template.add("memory_register", memoryRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment;
    }
    /*
    vypocitanie matematickej operacie
    */
	@Override public CodeFragment visitMathOp(ProjectGrammarParser.MathOpContext ctx) {
        ST template = group.getInstanceOf("MathOp"); 
        CodeFragment leftCodeFragment = visit(ctx.mathexpression(0));
        CodeFragment rightCodeFragment = visit(ctx.mathexpression(1));
        String instruction = null;
        switch (ctx.op.getType()) {
        case ProjectGrammarParser.MUL:
            instruction = "mul";
            break;
        case ProjectGrammarParser.DIV:
            instruction = "sdiv";
            break;
        case ProjectGrammarParser.PLUS:
            instruction = "add";
            break;
        case ProjectGrammarParser.MINUS:
            instruction = "sub";
            break;
        }
        String retRegister = generateNewRegister();
        template.add("compute_left", leftCodeFragment);
        template.add("left_register", leftCodeFragment.getRegister());
        template.add("compute_right", rightCodeFragment);
        template.add("right_register", rightCodeFragment.getRegister());
        template.add("return_register", retRegister);
        template.add("instruction", instruction);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), retRegister);
        return retCodeFragment;
    }
	/*
	navstivenie aritmetickeho prvku
	*/
	@Override public CodeFragment visitMathAtom(ProjectGrammarParser.MathAtomContext ctx) {
        return visit(ctx.mathoperand());
    }
	/*
    porovnanie dvoch hodnot relacnou operaciou
    */
	@Override public CodeFragment visitOpGLE(ProjectGrammarParser.OpGLEContext ctx) {
        ST template = group.getInstanceOf("GLEoperations");
        CodeFragment value1CodeFragment = visit(ctx.logicoperand(0));
        CodeFragment value2CodeFragment = visit(ctx.logicoperand(1));
        String cmpRegister = generateNewRegister();
        String relation = null;
        switch (ctx.rel.getType()) {
        case ProjectGrammarParser.EQ:
            relation = "eq";
            break;
        case ProjectGrammarParser.LO:
            relation = "slt";
            break;
        case ProjectGrammarParser.GR:
            relation = "sgt";
            break;
        case ProjectGrammarParser.LE:
            relation = "sle";
            break;
        case ProjectGrammarParser.GE:
            relation = "sge";
            break;
        }
        String labelID = generateNewLabel();
        template.add("compute_left", value1CodeFragment);
        template.add("left_register", value1CodeFragment.getRegister());
        template.add("compute_right", value2CodeFragment);
        template.add("right_register", value2CodeFragment.getRegister());
        template.add("return_register", cmpRegister);
        template.add("relation", relation);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), cmpRegister);
        return retCodeFragment;
    }
    /*
    porovnanie dvoch hodnot relacnou operaciou
    */
	@Override public CodeFragment visitCharOpGLE(ProjectGrammarParser.CharOpGLEContext ctx) {
        ST template = group.getInstanceOf("CharGLEoperations");
        CodeFragment value1CodeFragment = visit(ctx.charoperandinlogic(0));
        CodeFragment value2CodeFragment = visit(ctx.charoperandinlogic(1));
        String cmpRegister = generateNewRegister();
        String relation = null;
        switch (ctx.rel.getType()) {
        case ProjectGrammarParser.EQ:
            relation = "eq";
            break;
        case ProjectGrammarParser.LO:
            relation = "slt";
            break;
        case ProjectGrammarParser.GR:
            relation = "sgt";
            break;
        case ProjectGrammarParser.LE:
            relation = "sle";
            break;
        case ProjectGrammarParser.GE:
            relation = "sge";
            break;
        }
        template.add("compute_left", value1CodeFragment);
        template.add("left_register", value1CodeFragment.getRegister());
        template.add("compute_right", value2CodeFragment);
        template.add("right_register", value2CodeFragment.getRegister());
        template.add("return_register", cmpRegister);
        template.add("relation", relation);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), cmpRegister);
        return retCodeFragment;
    }
    /*
    porovnanie dvoch hodnot relacnou operaciou
    */
	@Override public CodeFragment visitMathExpInLogic(ProjectGrammarParser.MathExpInLogicContext ctx) {
        CodeFragment valueCodeFragment = visit(ctx.mathexpression());
        return valueCodeFragment;
    }
    /*
    vypocitanie booleovskeho AND
    */
	@Override public CodeFragment visitOpAnd(ProjectGrammarParser.OpAndContext ctx) { 
        ST template = group.getInstanceOf("OpAnd");
        CodeFragment value1CodeFragment = visit(ctx.logicexpression(0));
        CodeFragment value2CodeFragment = visit(ctx.logicexpression(1));
        String cmpRegister = generateNewRegister();
        String instruction = "and";
        template.add("compute_left", value1CodeFragment);
        template.add("left_register", value1CodeFragment.getRegister());
        template.add("compute_right", value2CodeFragment);
        template.add("right_register", value2CodeFragment.getRegister());
        template.add("return_register", cmpRegister);
        template.add("instruction", instruction);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), cmpRegister);
        return retCodeFragment;
    }
    /*
    vypocitanie booleovskeho OR
    */
	@Override public CodeFragment visitOpOr(ProjectGrammarParser.OpOrContext ctx) { 
        ST template = group.getInstanceOf("OpOr");
        CodeFragment value1CodeFragment = visit(ctx.logicexpression(0));
        CodeFragment value2CodeFragment = visit(ctx.logicexpression(1));
        String cmpRegister = generateNewRegister();
        String instruction = "or";
        template.add("compute_left", value1CodeFragment);
        template.add("left_register", value1CodeFragment.getRegister());
        template.add("compute_right", value2CodeFragment);
        template.add("right_register", value2CodeFragment.getRegister());
        template.add("return_register", cmpRegister);
        template.add("instruction", instruction);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), cmpRegister);
        return retCodeFragment;
	}
    /*
    negacia vyroku
    */
	@Override public CodeFragment visitOpNeg(ProjectGrammarParser.OpNegContext ctx) {
        ST template = group.getInstanceOf("OpNeg");
        CodeFragment value1CodeFragment = visit(ctx.logicoperand());
        String cmpRegister = generateNewRegister();
        template.add("compute_value", value1CodeFragment);
        template.add("value_register", value1CodeFragment.getRegister());
        template.add("return_register", cmpRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), cmpRegister);
        return retCodeFragment;
        /*
        ST template = group.getInstanceOf("OpNeg");
        String unsignedConstValue = ctx.logicoperand().getText();
        String retRegister = generateNewRegister();
        template.add("unsigned_const_value", unsignedConstValue);
        template.add("return_register", retRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), retRegister);
        return retCodeFragment;*/
    }
    /*
    navstivenie logickeho operandu
    */
    @Override public CodeFragment visitOperLog(ProjectGrammarParser.OperLogContext ctx) {
        return visit(ctx.logicoperand());
    }
    /*
    navstivenie integerovskej premennej 
    */
	@Override public CodeFragment visitIntVar(ProjectGrammarParser.IntVarContext ctx) {
        ST template = group.getInstanceOf("Variable");
        String var = ctx.getText();
        String memoryRegister;
        if (memory.containsKey(var)) {
            memoryRegister = memory.get(var);
        }
        else {
            memoryRegister = "";
            template.add("undefined","1");
        }
        String retRegister = generateNewRegister();
        template.add("memory_register", memoryRegister);
        template.add("return_register", retRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), retRegister);
        return retCodeFragment;
    }
    /*
    navstivenie integerovskej premennej predstavujucej pole
    */
	@Override public CodeFragment visitIntArrayOperand(ProjectGrammarParser.IntArrayOperandContext ctx) { 
        ST template = group.getInstanceOf("VariableArray");
        String var = ctx.VARIABLE().getText();
        String memoryRegister;
        memoryRegister = memory.get(var);
        ArrayList<CodeFragment> memoryArray = arrayMemory.get(var);
        String dimensionsCompute = "";
        CodeFragment statCodeFragment = new CodeFragment();
        String addressPointer = "";
        String lastAddressPointer = memoryRegister;
        for (int i = 0; i < ctx.dimensions().size(); i++) {
            statCodeFragment = visit(ctx.dimensions(i));
            dimensionsCompute += statCodeFragment.toString() + "\n";
            String lastRegister = statCodeFragment.getRegister();
            for (int j = i+1; j < ctx.dimensions().size(); j++) {
                String newRegister = generateNewRegister();
                dimensionsCompute += newRegister + " = mul nuw i32 " + lastRegister + ", " + memoryArray.get(j).getRegister() + "\n";
                lastRegister = newRegister;
            }
            addressPointer = generateNewRegister();
            dimensionsCompute += addressPointer + " = getelementptr inbounds i32, i32* " + lastAddressPointer + ", i32 " + lastRegister +"\n";
            lastAddressPointer = addressPointer;
        }
        String loadRegister = generateNewRegister();
        dimensionsCompute += loadRegister + " = load i32, i32*" + addressPointer + "\n";
        template.add("dimensions_compute", dimensionsCompute);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), loadRegister);
        return retCodeFragment;
	}
    /*
    navstivenie negovanej integerovskej hodnoty 
    */
	@Override public CodeFragment visitIntNeg(ProjectGrammarParser.IntNegContext ctx) {
        ST template = group.getInstanceOf("NegParen");
        CodeFragment compute_value = visit(ctx.mathoperand());
        String retRegister = generateNewRegister();
        template.add("compute_value", compute_value);
        template.add("value_register", compute_value.getRegister());
        template.add("return_register", retRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), retRegister);
        return retCodeFragment;
    }
	/*
    navstivenie integerovskej hodnoty 
    */
	@Override public CodeFragment visitInt(ProjectGrammarParser.IntContext ctx) { 
        ST template = group.getInstanceOf("Number");
        String constValue = ctx.NUMBER().getText();
        String retRegister = generateNewRegister();
        template.add("const_value", constValue);
        template.add("return_register", retRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), retRegister);
        return retCodeFragment; 
    }
	/*
    integerovsky vyraz v zatvorkach
    */
	@Override public CodeFragment visitIntOpInParen(ProjectGrammarParser.IntOpInParenContext ctx) {
        return visit(ctx.mathexpression());
    }
    /*
    booleovska premenna
    */
	@Override public CodeFragment visitBoolVar(ProjectGrammarParser.BoolVarContext ctx) {
        ST template = group.getInstanceOf("BoolVariable");
        String var = ctx.getText();
        String memoryRegister;
        if (memory.containsKey(var)) {
            memoryRegister = memory.get(var);
        }
        else {
            memoryRegister = "";
            template.add("undefined","1");
        }
        String retRegister = generateNewRegister();
        template.add("memory_register", memoryRegister);
        template.add("return_register", retRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), retRegister);
        return retCodeFragment;
    }
    /*
    navstivenie booleovskeho pola
    */
	@Override public CodeFragment visitBoolArrayOperand(ProjectGrammarParser.BoolArrayOperandContext ctx) { 
        ST template = group.getInstanceOf("VariableArray");
        String var = ctx.VARIABLE().getText();
        String memoryRegister;
        memoryRegister = memory.get(var);
        template.add("memory_register", memoryRegister);
        int n = ctx.dimensions().size();
        for (int i = 0; i < n; i++) {
            CodeFragment statCodeFragment = visit(ctx.dimensions(i));
            template.add("dimensions", statCodeFragment + "\r\n");
        }
        String retRegister = generateNewRegister();
        template.add("return_register", retRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), retRegister);
        return retCodeFragment;
	}
    /*
    navstivenie booleovskej konstanty - zaroven tu true menim na 1, false na 0
    */
	@Override public CodeFragment visitBoolConst(ProjectGrammarParser.BoolConstContext ctx) {
        ST template = group.getInstanceOf("Boolean");
        String constValue = ctx.BOOL().getText();
        String retRegister = generateNewRegister();
        if (constValue.equals("true")){
            constValue = "1";
        } else if (constValue.equals("false")){
            constValue = "0";
        } else return new CodeFragment(); //CHYBA
        template.add("const_value", constValue);
        template.add("return_register", retRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), retRegister);
        return retCodeFragment; 
    }
	/*
	booleovsky vyraz v zatvorkach
	*/
	@Override public CodeFragment visitBoolOpInParen(ProjectGrammarParser.BoolOpInParenContext ctx) {
        return visit(ctx.logicexpression());
    }
    /*
    vyraz v zatvorke
    */
	@Override public CodeFragment visitExpInParen(ProjectGrammarParser.ExpInParenContext ctx) {
        if (ctx.mathexpression() != null){
            return visit(ctx.mathexpression()); 
        } else return visit(ctx.logicexpression());
    }
    /*
    navstivenie vseobecneho pola
    */
    @Override public CodeFragment visitVarMaybeArray(ProjectGrammarParser.VarMaybeArrayContext ctx) {
        if (ctx.dimensions().size()==0){
            String var = ctx.getText();
            String memoryRegister = memory.get(var);
            CodeFragment retCodeFragment = new CodeFragment(memoryRegister);
            return retCodeFragment;
        }
        ST template = group.getInstanceOf("VariableArray");
        String var = ctx.VARIABLE().getText();
        String memoryRegister;
        memoryRegister = memory.get(var);
        ArrayList<CodeFragment> memoryArray = arrayMemory.get(var);
        String dimensionsCompute = "";
        CodeFragment statCodeFragment = new CodeFragment();
        String addressPointer = "";
        String lastAddressPointer = memoryRegister;
        for (int i = 0; i < ctx.dimensions().size(); i++) {
            statCodeFragment = visit(ctx.dimensions(i));
            dimensionsCompute += statCodeFragment.toString() + "\n";
            String lastRegister = statCodeFragment.getRegister(), newRegister = "";
            for (int j = i+1; j < ctx.dimensions().size(); j++) {
                newRegister = generateNewRegister();
                dimensionsCompute += newRegister + " = mul nuw i32 " + lastRegister + ", " + memoryArray.get(j).getRegister() + "\n";
                lastRegister = newRegister;
            }
            addressPointer = generateNewRegister();
            dimensionsCompute += addressPointer + " = getelementptr inbounds i32, i32* " + lastAddressPointer + ", i32 " + lastRegister +"\n";
            lastAddressPointer = addressPointer;
        }
        template.add("dimensions_compute", dimensionsCompute);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), addressPointer);
        return retCodeFragment;
    }
    /*
    navstivenie charakteroveho pola
    */
    @Override public CodeFragment visitCharVarMaybeArray(ProjectGrammarParser.CharVarMaybeArrayContext ctx) {
        if (ctx.dimensions().size()==0){
            String var = ctx.getText();
            String memoryRegister = memory.get(var);
            CodeFragment retCodeFragment = new CodeFragment(memoryRegister);
            return retCodeFragment;
        }
        ST template = group.getInstanceOf("VariableArray");
        String var = ctx.VARIABLE().getText();
        String memoryRegister;
        memoryRegister = memory.get(var);
        ArrayList<CodeFragment> memoryArray = arrayMemory.get(var);
        String dimensionsCompute = "";
        CodeFragment statCodeFragment = new CodeFragment();
        String addressPointer = "";
        String lastAddressPointer = memoryRegister;
        for (int i = 0; i < ctx.dimensions().size(); i++) {
            statCodeFragment = visit(ctx.dimensions(i));
            dimensionsCompute += statCodeFragment.toString() + "\n";
            String lastRegister = statCodeFragment.getRegister(), newRegister = "";
            for (int j = i+1; j < ctx.dimensions().size(); j++) {
                newRegister = generateNewRegister();
                dimensionsCompute += newRegister + " = mul nuw i32 " + lastRegister + ", " + memoryArray.get(j).getRegister() + "\n";
                lastRegister = newRegister;
            }
            addressPointer = generateNewRegister();
            dimensionsCompute += addressPointer + " = getelementptr inbounds i8, i8* " + lastAddressPointer + ", i32 " + lastRegister +"\n";
            lastAddressPointer = addressPointer;
        }
        template.add("dimensions_compute", dimensionsCompute);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), addressPointer);
        return retCodeFragment;
    }
    /*
    navstivenie charakteroveho pola
    */
    @Override public CodeFragment visitCharVarMaybeArrayExp(ProjectGrammarParser.CharVarMaybeArrayExpContext ctx) {
        if (ctx.dimensions().size()==0){
            ST template = group.getInstanceOf("VariableCharArrayInLogic");
            String var = ctx.getText();
            String memoryRegister = memory.get(var), loadRegister = generateNewRegister();
            template.add("load_register", loadRegister);
            template.add("memory_register", memoryRegister);
            CodeFragment retCodeFragment = new CodeFragment(template.render(), loadRegister);
            return retCodeFragment;
        }
        ST template = group.getInstanceOf("VariableCharArrayInLogic");
        String var = ctx.VARIABLE().getText();
        String memoryRegister, loadRegister = generateNewRegister();
        template.add("load_register", loadRegister);
        memoryRegister = memory.get(var);
        ArrayList<CodeFragment> memoryArray = arrayMemory.get(var);
        String dimensionsCompute = "";
        CodeFragment statCodeFragment = new CodeFragment();
        String addressPointer = "";
        String lastAddressPointer = memoryRegister;
        for (int i = 0; i < ctx.dimensions().size(); i++) {
            statCodeFragment = visit(ctx.dimensions(i));
            dimensionsCompute += statCodeFragment.toString() + "\n";
            String lastRegister = statCodeFragment.getRegister(), newRegister = "";
            for (int j = i+1; j < ctx.dimensions().size(); j++) {
                newRegister = generateNewRegister();
                dimensionsCompute += newRegister + " = mul nuw i32 " + lastRegister + ", " + memoryArray.get(j).getRegister() + "\n";
                lastRegister = newRegister;
            }
            addressPointer = generateNewRegister();
            dimensionsCompute += addressPointer + " = getelementptr inbounds i8, i8* " + lastAddressPointer + ", i32 " + lastRegister +"\n";
            lastAddressPointer = addressPointer;
        }
        template.add("dimensions_compute", dimensionsCompute);
        template.add("memory_register", addressPointer);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), loadRegister);
        return retCodeFragment;
    }
    /*
    navstivenie charakteroveho pola v logickom vyraze
    */
    @Override public CodeFragment visitCharVarMaybeArrayInLogic(ProjectGrammarParser.CharVarMaybeArrayInLogicContext ctx) {
        ST template = group.getInstanceOf("VariableCharArrayInLogic");
        if (ctx.dimensions().size()==0){
            String var = ctx.getText();
            String memoryRegister = memory.get(var), loadRegister = generateNewRegister();
            template.add("load_register", loadRegister);
            template.add("memory_register", memoryRegister);

            CodeFragment retCodeFragment = new CodeFragment(template.render(), loadRegister);
            return retCodeFragment;
        }
        String var = ctx.VARIABLE().getText();
        String memoryRegister;
        memoryRegister = memory.get(var);
        ArrayList<CodeFragment> memoryArray = arrayMemory.get(var);
        String dimensionsCompute = "";
        CodeFragment statCodeFragment = new CodeFragment();
        String addressPointer = "";
        String lastAddressPointer = memoryRegister;
        for (int i = 0; i < ctx.dimensions().size(); i++) {
            statCodeFragment = visit(ctx.dimensions(i));
            dimensionsCompute += statCodeFragment.toString() + "\n";
            String lastRegister = statCodeFragment.getRegister(), newRegister = "";
            for (int j = i+1; j < ctx.dimensions().size(); j++) {
                newRegister = generateNewRegister();
                dimensionsCompute += newRegister + " = mul nuw i32 " + lastRegister + ", " + memoryArray.get(j).getRegister() + "\n";
                lastRegister = newRegister;
            }
            addressPointer = generateNewRegister();
            dimensionsCompute += addressPointer + " = getelementptr inbounds i8, i8* " + lastAddressPointer + ", i32 " + lastRegister +"\n";
            lastAddressPointer = addressPointer;
        }
        template.add("dimensions_compute", dimensionsCompute);
        String loadRegister = generateNewRegister();
        template.add("memory_register", addressPointer);
        template.add("load_register", loadRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), loadRegister);
        return retCodeFragment;
    }
    /*
    vypocitanie velkosti dimenzie pola
    */
    @Override public CodeFragment visitArrayDimensions(ProjectGrammarParser.ArrayDimensionsContext ctx) {
        ST template = group.getInstanceOf("Dimensions");
        CodeFragment dimsize = visit(ctx.mathexpression());
        template.add("dimsize", dimsize);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), dimsize.getRegister());
        return retCodeFragment;
    }
    /*
    osetrenie volania funkcie
    */
	@Override public CodeFragment visitFunc(ProjectGrammarParser.FuncContext ctx) {
        ST template = group.getInstanceOf("Function");
        String var = ctx.VARIABLE().getText();
        String memoryRegister = memory.get(var);
        template.add("memory_register", memoryRegister);
        CodeFragment args = null;
        if (visit(ctx.arguments())!=null){
            args = visit(ctx.arguments());
            template.add("args", args);
        }
        CodeFragment retCodeFragment = new CodeFragment(template.render(), memoryRegister);
        return retCodeFragment;
    }
    /*
    prechadzanie argumentov vo funkcii
    */
    @Override
    public CodeFragment visitArgs(ProjectGrammarParser.ArgsContext ctx) {
        ST template = group.getInstanceOf("Statements");
        int n = ctx.VARIABLE().size();
        for (int i = 0; i < n; i++) {
            CodeFragment statCodeFragment = visit(ctx.VARIABLE(i));
            template.add("code", statCodeFragment + "\r\n");
        } 
        CodeFragment retCodeFragment = new CodeFragment(template.render());
        return retCodeFragment;
    }
    /*
    integerovsky vyraz
    */
	@Override public CodeFragment visitMathE(ProjectGrammarParser.MathEContext ctx) {
        return visit(ctx.mathexpression()); 
    }
    /*
    booleovsky vyraz
    */
	@Override public CodeFragment visitLogE(ProjectGrammarParser.LogEContext ctx) {
        return visit(ctx.logicexpression());
    }
    //stringova konstanta
	@Override public CodeFragment visitStrE(ProjectGrammarParser.StrEContext ctx) {
        ST template = group.getInstanceOf("String");
        String retRegister = generateNewRegister(), memoryRegister;
        memoryRegister = memory.get(ctx.VARIABLE().getText());
        template.add("memory_register", memoryRegister);
        template.add("return_register", retRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), retRegister);
        return retCodeFragment;
        
    }
	/*
    charakterovska konstanta
    */
	@Override public CodeFragment visitCharConst(ProjectGrammarParser.CharConstContext ctx) { 
        ST template = group.getInstanceOf("CharConst");
        int constValue = (int)ctx.CHARCONST().getText().charAt(1);
        for (int i = 0; i < ctx.CHARCONST().getText().length(); i++) {
            if (ctx.CHARCONST().getText().charAt(i) != "'\\n'".charAt(i)) break;
            if (i == 1) constValue = 10;
        }
        String retRegister = generateNewRegister();
        template.add("const_value", constValue);
        template.add("return_register", retRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), retRegister);
        return retCodeFragment; 
    }
    /*
    charakterovska konstanta
    */
	@Override public CodeFragment visitCharConstInLogic(ProjectGrammarParser.CharConstInLogicContext ctx) { 
        ST template = group.getInstanceOf("CharConst");
        int constValue = (int)ctx.CHARCONST().getText().charAt(1);
        for (int i = 0; i < ctx.CHARCONST().getText().length(); i++) {
            if (ctx.CHARCONST().getText().charAt(i) != "'\\n'".charAt(i)) break;
            if (i == 1) constValue = 10;
        }
        String retRegister = generateNewRegister();
        template.add("const_value", constValue);
        template.add("return_register", retRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), retRegister);
        return retCodeFragment; 
    }
    /*
    charakterovska konstanta
    */
	@Override public CodeFragment visitCharConstExp(ProjectGrammarParser.CharConstExpContext ctx) { 
        ST template = group.getInstanceOf("CharConst");
        int constValue = (int)ctx.CHARCONST().getText().charAt(1);
        for (int i = 0; i < ctx.CHARCONST().getText().length(); i++) {
            if (ctx.CHARCONST().getText().charAt(i) != "'\\n'".charAt(i)) break;
            if (i == 1) constValue = 10;
        }
        String retRegister = generateNewRegister();
        template.add("const_value", constValue);
        template.add("return_register", retRegister);
        CodeFragment retCodeFragment = new CodeFragment(template.render(), retRegister);
        return retCodeFragment; 
    }
}
