package main.java.com.compiler;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import main.java.com.codefragment.CodeFragment;
import main.java.com.visitor.ProjectGrammarLexer;
import main.java.com.visitor.ProjectGrammarParser;
import main.java.com.visitor.ProjectVisitor;

import java.io.*;
import java.util.*;

public class Compiler {
    public static void main(String[] args) throws Exception {
        String inputFile = "./main/java/com/compiler/input.txt";
        String outputFile = "./main/java/com/compiler/llvm_output.ll";
        int i = 0;
        while (i < args.length) {
            if (args[i].equals("-o")) {
                if (i < args.length - 1) {
                    outputFile = new String(args[i+1]);
                    i += 2;
                } else {
                    throw new IllegalArgumentException();
                }
            } 
            else {
                inputFile = new String(args[i]);
                i++;
            }
        }
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        PrintStream ps = System.out;
        if (outputFile != null) {
            ps = new PrintStream(new FileOutputStream(outputFile));
        }
        CharStream input = CharStreams.fromStream(is);
        ProjectGrammarLexer lexer = new ProjectGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProjectGrammarParser parser = new ProjectGrammarParser(tokens);
        
        ParseTree tree = parser.init();
        
        ProjectVisitor visitor = new ProjectVisitor();
        CodeFragment code = visitor.visit(tree);
        ps.print(code.toString());
    }
}
