// Generated from ProjectGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectGrammarParser}.
 */
public interface ProjectGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProjectGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(ProjectGrammarParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(ProjectGrammarParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ProjectGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ProjectGrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decl}
	 * labeled alternative in {@link ProjectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterDecl(ProjectGrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decl}
	 * labeled alternative in {@link ProjectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitDecl(ProjectGrammarParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statm}
	 * labeled alternative in {@link ProjectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterStatm(ProjectGrammarParser.StatmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statm}
	 * labeled alternative in {@link ProjectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitStatm(ProjectGrammarParser.StatmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutInt}
	 * labeled alternative in {@link ProjectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterOutInt(ProjectGrammarParser.OutIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutInt}
	 * labeled alternative in {@link ProjectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitOutInt(ProjectGrammarParser.OutIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutStr}
	 * labeled alternative in {@link ProjectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterOutStr(ProjectGrammarParser.OutStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutStr}
	 * labeled alternative in {@link ProjectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitOutStr(ProjectGrammarParser.OutStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutChar}
	 * labeled alternative in {@link ProjectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterOutChar(ProjectGrammarParser.OutCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutChar}
	 * labeled alternative in {@link ProjectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitOutChar(ProjectGrammarParser.OutCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutLine}
	 * labeled alternative in {@link ProjectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterOutLine(ProjectGrammarParser.OutLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutLine}
	 * labeled alternative in {@link ProjectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitOutLine(ProjectGrammarParser.OutLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link ProjectGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ProjectGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link ProjectGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ProjectGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link ProjectGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(ProjectGrammarParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link ProjectGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(ProjectGrammarParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectGrammarParser#retexpr}.
	 * @param ctx the parse tree
	 */
	void enterRetexpr(ProjectGrammarParser.RetexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectGrammarParser#retexpr}.
	 * @param ctx the parse tree
	 */
	void exitRetexpr(ProjectGrammarParser.RetexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncBody}
	 * labeled alternative in {@link ProjectGrammarParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(ProjectGrammarParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncBody}
	 * labeled alternative in {@link ProjectGrammarParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(ProjectGrammarParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ProjectGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ProjectGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ProjectGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ProjectGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ProjectGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ProjectGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ProjectGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ProjectGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link ProjectGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ProjectGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link ProjectGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ProjectGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link ProjectGrammarParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void enterParamList(ProjectGrammarParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link ProjectGrammarParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void exitParamList(ProjectGrammarParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationInt}
	 * labeled alternative in {@link ProjectGrammarParser#parameterVar}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationInt(ProjectGrammarParser.VariableDeclarationIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationInt}
	 * labeled alternative in {@link ProjectGrammarParser#parameterVar}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationInt(ProjectGrammarParser.VariableDeclarationIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationBool}
	 * labeled alternative in {@link ProjectGrammarParser#parameterVar}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationBool(ProjectGrammarParser.VariableDeclarationBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationBool}
	 * labeled alternative in {@link ProjectGrammarParser#parameterVar}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationBool(ProjectGrammarParser.VariableDeclarationBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationChar}
	 * labeled alternative in {@link ProjectGrammarParser#parameterVar}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationChar(ProjectGrammarParser.VariableDeclarationCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationChar}
	 * labeled alternative in {@link ProjectGrammarParser#parameterVar}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationChar(ProjectGrammarParser.VariableDeclarationCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableInFuncDeclarationInt}
	 * labeled alternative in {@link ProjectGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterVariableInFuncDeclarationInt(ProjectGrammarParser.VariableInFuncDeclarationIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableInFuncDeclarationInt}
	 * labeled alternative in {@link ProjectGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitVariableInFuncDeclarationInt(ProjectGrammarParser.VariableInFuncDeclarationIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableInFuncDeclarationBool}
	 * labeled alternative in {@link ProjectGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterVariableInFuncDeclarationBool(ProjectGrammarParser.VariableInFuncDeclarationBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableInFuncDeclarationBool}
	 * labeled alternative in {@link ProjectGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitVariableInFuncDeclarationBool(ProjectGrammarParser.VariableInFuncDeclarationBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectGrammarParser#arrayslistFuncDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayslistFuncDecl(ProjectGrammarParser.ArrayslistFuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectGrammarParser#arrayslistFuncDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayslistFuncDecl(ProjectGrammarParser.ArrayslistFuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arr}
	 * labeled alternative in {@link ProjectGrammarParser#arrayslist}.
	 * @param ctx the parse tree
	 */
	void enterArr(ProjectGrammarParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arr}
	 * labeled alternative in {@link ProjectGrammarParser#arrayslist}.
	 * @param ctx the parse tree
	 */
	void exitArr(ProjectGrammarParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfCtx}
	 * labeled alternative in {@link ProjectGrammarParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfCtx(ProjectGrammarParser.IfCtxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfCtx}
	 * labeled alternative in {@link ProjectGrammarParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfCtx(ProjectGrammarParser.IfCtxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatements}
	 * labeled alternative in {@link ProjectGrammarParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterIfStatements(ProjectGrammarParser.IfStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatements}
	 * labeled alternative in {@link ProjectGrammarParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitIfStatements(ProjectGrammarParser.IfStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseStatements}
	 * labeled alternative in {@link ProjectGrammarParser#elseblock}.
	 * @param ctx the parse tree
	 */
	void enterElseStatements(ProjectGrammarParser.ElseStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseStatements}
	 * labeled alternative in {@link ProjectGrammarParser#elseblock}.
	 * @param ctx the parse tree
	 */
	void exitElseStatements(ProjectGrammarParser.ElseStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileCtx}
	 * labeled alternative in {@link ProjectGrammarParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileCtx(ProjectGrammarParser.WhileCtxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileCtx}
	 * labeled alternative in {@link ProjectGrammarParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileCtx(ProjectGrammarParser.WhileCtxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CycBd}
	 * labeled alternative in {@link ProjectGrammarParser#cyclebody}.
	 * @param ctx the parse tree
	 */
	void enterCycBd(ProjectGrammarParser.CycBdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CycBd}
	 * labeled alternative in {@link ProjectGrammarParser#cyclebody}.
	 * @param ctx the parse tree
	 */
	void exitCycBd(ProjectGrammarParser.CycBdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ProjectGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(ProjectGrammarParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ProjectGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(ProjectGrammarParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExp}
	 * labeled alternative in {@link ProjectGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMathExp(ProjectGrammarParser.MathExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExp}
	 * labeled alternative in {@link ProjectGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMathExp(ProjectGrammarParser.MathExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicExp}
	 * labeled alternative in {@link ProjectGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicExp(ProjectGrammarParser.LogicExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicExp}
	 * labeled alternative in {@link ProjectGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicExp(ProjectGrammarParser.LogicExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignMath}
	 * labeled alternative in {@link ProjectGrammarParser#assignexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignMath(ProjectGrammarParser.AssignMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignMath}
	 * labeled alternative in {@link ProjectGrammarParser#assignexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignMath(ProjectGrammarParser.AssignMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpCtxLog}
	 * labeled alternative in {@link ProjectGrammarParser#assignexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpCtxLog(ProjectGrammarParser.AssignExpCtxLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpCtxLog}
	 * labeled alternative in {@link ProjectGrammarParser#assignexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpCtxLog(ProjectGrammarParser.AssignExpCtxLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpCtxInpInt}
	 * labeled alternative in {@link ProjectGrammarParser#assignexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpCtxInpInt(ProjectGrammarParser.AssignExpCtxInpIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpCtxInpInt}
	 * labeled alternative in {@link ProjectGrammarParser#assignexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpCtxInpInt(ProjectGrammarParser.AssignExpCtxInpIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpCtxInpLine}
	 * labeled alternative in {@link ProjectGrammarParser#assignexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpCtxInpLine(ProjectGrammarParser.AssignExpCtxInpLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpCtxInpLine}
	 * labeled alternative in {@link ProjectGrammarParser#assignexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpCtxInpLine(ProjectGrammarParser.AssignExpCtxInpLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpCtxInpChar}
	 * labeled alternative in {@link ProjectGrammarParser#assignexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpCtxInpChar(ProjectGrammarParser.AssignExpCtxInpCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpCtxInpChar}
	 * labeled alternative in {@link ProjectGrammarParser#assignexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpCtxInpChar(ProjectGrammarParser.AssignExpCtxInpCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpCtxFunc}
	 * labeled alternative in {@link ProjectGrammarParser#assignexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpCtxFunc(ProjectGrammarParser.AssignExpCtxFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpCtxFunc}
	 * labeled alternative in {@link ProjectGrammarParser#assignexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpCtxFunc(ProjectGrammarParser.AssignExpCtxFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathAtom}
	 * labeled alternative in {@link ProjectGrammarParser#mathexpression}.
	 * @param ctx the parse tree
	 */
	void enterMathAtom(ProjectGrammarParser.MathAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathAtom}
	 * labeled alternative in {@link ProjectGrammarParser#mathexpression}.
	 * @param ctx the parse tree
	 */
	void exitMathAtom(ProjectGrammarParser.MathAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathOp}
	 * labeled alternative in {@link ProjectGrammarParser#mathexpression}.
	 * @param ctx the parse tree
	 */
	void enterMathOp(ProjectGrammarParser.MathOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathOp}
	 * labeled alternative in {@link ProjectGrammarParser#mathexpression}.
	 * @param ctx the parse tree
	 */
	void exitMathOp(ProjectGrammarParser.MathOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpOr}
	 * labeled alternative in {@link ProjectGrammarParser#logicexpression}.
	 * @param ctx the parse tree
	 */
	void enterOpOr(ProjectGrammarParser.OpOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpOr}
	 * labeled alternative in {@link ProjectGrammarParser#logicexpression}.
	 * @param ctx the parse tree
	 */
	void exitOpOr(ProjectGrammarParser.OpOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpGLE}
	 * labeled alternative in {@link ProjectGrammarParser#logicexpression}.
	 * @param ctx the parse tree
	 */
	void enterOpGLE(ProjectGrammarParser.OpGLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpGLE}
	 * labeled alternative in {@link ProjectGrammarParser#logicexpression}.
	 * @param ctx the parse tree
	 */
	void exitOpGLE(ProjectGrammarParser.OpGLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpNeg}
	 * labeled alternative in {@link ProjectGrammarParser#logicexpression}.
	 * @param ctx the parse tree
	 */
	void enterOpNeg(ProjectGrammarParser.OpNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpNeg}
	 * labeled alternative in {@link ProjectGrammarParser#logicexpression}.
	 * @param ctx the parse tree
	 */
	void exitOpNeg(ProjectGrammarParser.OpNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperLog}
	 * labeled alternative in {@link ProjectGrammarParser#logicexpression}.
	 * @param ctx the parse tree
	 */
	void enterOperLog(ProjectGrammarParser.OperLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperLog}
	 * labeled alternative in {@link ProjectGrammarParser#logicexpression}.
	 * @param ctx the parse tree
	 */
	void exitOperLog(ProjectGrammarParser.OperLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpAnd}
	 * labeled alternative in {@link ProjectGrammarParser#logicexpression}.
	 * @param ctx the parse tree
	 */
	void enterOpAnd(ProjectGrammarParser.OpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpAnd}
	 * labeled alternative in {@link ProjectGrammarParser#logicexpression}.
	 * @param ctx the parse tree
	 */
	void exitOpAnd(ProjectGrammarParser.OpAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharOpGLE}
	 * labeled alternative in {@link ProjectGrammarParser#logicexpression}.
	 * @param ctx the parse tree
	 */
	void enterCharOpGLE(ProjectGrammarParser.CharOpGLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharOpGLE}
	 * labeled alternative in {@link ProjectGrammarParser#logicexpression}.
	 * @param ctx the parse tree
	 */
	void exitCharOpGLE(ProjectGrammarParser.CharOpGLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntVar}
	 * labeled alternative in {@link ProjectGrammarParser#mathoperand}.
	 * @param ctx the parse tree
	 */
	void enterIntVar(ProjectGrammarParser.IntVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntVar}
	 * labeled alternative in {@link ProjectGrammarParser#mathoperand}.
	 * @param ctx the parse tree
	 */
	void exitIntVar(ProjectGrammarParser.IntVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntArrayOperand}
	 * labeled alternative in {@link ProjectGrammarParser#mathoperand}.
	 * @param ctx the parse tree
	 */
	void enterIntArrayOperand(ProjectGrammarParser.IntArrayOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntArrayOperand}
	 * labeled alternative in {@link ProjectGrammarParser#mathoperand}.
	 * @param ctx the parse tree
	 */
	void exitIntArrayOperand(ProjectGrammarParser.IntArrayOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntNeg}
	 * labeled alternative in {@link ProjectGrammarParser#mathoperand}.
	 * @param ctx the parse tree
	 */
	void enterIntNeg(ProjectGrammarParser.IntNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntNeg}
	 * labeled alternative in {@link ProjectGrammarParser#mathoperand}.
	 * @param ctx the parse tree
	 */
	void exitIntNeg(ProjectGrammarParser.IntNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ProjectGrammarParser#mathoperand}.
	 * @param ctx the parse tree
	 */
	void enterInt(ProjectGrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ProjectGrammarParser#mathoperand}.
	 * @param ctx the parse tree
	 */
	void exitInt(ProjectGrammarParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntOpInParen}
	 * labeled alternative in {@link ProjectGrammarParser#mathoperand}.
	 * @param ctx the parse tree
	 */
	void enterIntOpInParen(ProjectGrammarParser.IntOpInParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntOpInParen}
	 * labeled alternative in {@link ProjectGrammarParser#mathoperand}.
	 * @param ctx the parse tree
	 */
	void exitIntOpInParen(ProjectGrammarParser.IntOpInParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpInLogic}
	 * labeled alternative in {@link ProjectGrammarParser#logicoperand}.
	 * @param ctx the parse tree
	 */
	void enterMathExpInLogic(ProjectGrammarParser.MathExpInLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpInLogic}
	 * labeled alternative in {@link ProjectGrammarParser#logicoperand}.
	 * @param ctx the parse tree
	 */
	void exitMathExpInLogic(ProjectGrammarParser.MathExpInLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link ProjectGrammarParser#logicoperand}.
	 * @param ctx the parse tree
	 */
	void enterBoolVar(ProjectGrammarParser.BoolVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link ProjectGrammarParser#logicoperand}.
	 * @param ctx the parse tree
	 */
	void exitBoolVar(ProjectGrammarParser.BoolVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolArrayOperand}
	 * labeled alternative in {@link ProjectGrammarParser#logicoperand}.
	 * @param ctx the parse tree
	 */
	void enterBoolArrayOperand(ProjectGrammarParser.BoolArrayOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolArrayOperand}
	 * labeled alternative in {@link ProjectGrammarParser#logicoperand}.
	 * @param ctx the parse tree
	 */
	void exitBoolArrayOperand(ProjectGrammarParser.BoolArrayOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolConst}
	 * labeled alternative in {@link ProjectGrammarParser#logicoperand}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(ProjectGrammarParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolConst}
	 * labeled alternative in {@link ProjectGrammarParser#logicoperand}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(ProjectGrammarParser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolOpInParen}
	 * labeled alternative in {@link ProjectGrammarParser#logicoperand}.
	 * @param ctx the parse tree
	 */
	void enterBoolOpInParen(ProjectGrammarParser.BoolOpInParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolOpInParen}
	 * labeled alternative in {@link ProjectGrammarParser#logicoperand}.
	 * @param ctx the parse tree
	 */
	void exitBoolOpInParen(ProjectGrammarParser.BoolOpInParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarMaybeArray}
	 * labeled alternative in {@link ProjectGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterVarMaybeArray(ProjectGrammarParser.VarMaybeArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarMaybeArray}
	 * labeled alternative in {@link ProjectGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitVarMaybeArray(ProjectGrammarParser.VarMaybeArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpInParen}
	 * labeled alternative in {@link ProjectGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterExpInParen(ProjectGrammarParser.ExpInParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpInParen}
	 * labeled alternative in {@link ProjectGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitExpInParen(ProjectGrammarParser.ExpInParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDimensions}
	 * labeled alternative in {@link ProjectGrammarParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterArrayDimensions(ProjectGrammarParser.ArrayDimensionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDimensions}
	 * labeled alternative in {@link ProjectGrammarParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitArrayDimensions(ProjectGrammarParser.ArrayDimensionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Func}
	 * labeled alternative in {@link ProjectGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ProjectGrammarParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link ProjectGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ProjectGrammarParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Args}
	 * labeled alternative in {@link ProjectGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArgs(ProjectGrammarParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Args}
	 * labeled alternative in {@link ProjectGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArgs(ProjectGrammarParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathE}
	 * labeled alternative in {@link ProjectGrammarParser#writeintcontext}.
	 * @param ctx the parse tree
	 */
	void enterMathE(ProjectGrammarParser.MathEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathE}
	 * labeled alternative in {@link ProjectGrammarParser#writeintcontext}.
	 * @param ctx the parse tree
	 */
	void exitMathE(ProjectGrammarParser.MathEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogE}
	 * labeled alternative in {@link ProjectGrammarParser#writeintcontext}.
	 * @param ctx the parse tree
	 */
	void enterLogE(ProjectGrammarParser.LogEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogE}
	 * labeled alternative in {@link ProjectGrammarParser#writeintcontext}.
	 * @param ctx the parse tree
	 */
	void exitLogE(ProjectGrammarParser.LogEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrE}
	 * labeled alternative in {@link ProjectGrammarParser#writestrcontext}.
	 * @param ctx the parse tree
	 */
	void enterStrE(ProjectGrammarParser.StrEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrE}
	 * labeled alternative in {@link ProjectGrammarParser#writestrcontext}.
	 * @param ctx the parse tree
	 */
	void exitStrE(ProjectGrammarParser.StrEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharConst}
	 * labeled alternative in {@link ProjectGrammarParser#charoperand}.
	 * @param ctx the parse tree
	 */
	void enterCharConst(ProjectGrammarParser.CharConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharConst}
	 * labeled alternative in {@link ProjectGrammarParser#charoperand}.
	 * @param ctx the parse tree
	 */
	void exitCharConst(ProjectGrammarParser.CharConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharVarMaybeArray}
	 * labeled alternative in {@link ProjectGrammarParser#charoperand}.
	 * @param ctx the parse tree
	 */
	void enterCharVarMaybeArray(ProjectGrammarParser.CharVarMaybeArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharVarMaybeArray}
	 * labeled alternative in {@link ProjectGrammarParser#charoperand}.
	 * @param ctx the parse tree
	 */
	void exitCharVarMaybeArray(ProjectGrammarParser.CharVarMaybeArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharConstInLogic}
	 * labeled alternative in {@link ProjectGrammarParser#charoperandinlogic}.
	 * @param ctx the parse tree
	 */
	void enterCharConstInLogic(ProjectGrammarParser.CharConstInLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharConstInLogic}
	 * labeled alternative in {@link ProjectGrammarParser#charoperandinlogic}.
	 * @param ctx the parse tree
	 */
	void exitCharConstInLogic(ProjectGrammarParser.CharConstInLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharVarMaybeArrayInLogic}
	 * labeled alternative in {@link ProjectGrammarParser#charoperandinlogic}.
	 * @param ctx the parse tree
	 */
	void enterCharVarMaybeArrayInLogic(ProjectGrammarParser.CharVarMaybeArrayInLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharVarMaybeArrayInLogic}
	 * labeled alternative in {@link ProjectGrammarParser#charoperandinlogic}.
	 * @param ctx the parse tree
	 */
	void exitCharVarMaybeArrayInLogic(ProjectGrammarParser.CharVarMaybeArrayInLogicContext ctx);
}