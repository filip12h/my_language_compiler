package main.java.com.tests;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import main.java.com.codefragment.CodeFragment;
import main.java.com.visitor.ProjectGrammarLexer;
import main.java.com.visitor.ProjectGrammarParser;
import main.java.com.visitor.ProjectVisitor;

import java.io.*;
import java.util.*;

public class CompilerTests {
     public static void main(String[] args) throws Exception {

        for (int j = 1; j < 4; j++) {
            String inputFile = "./main/java/com/tests/test"+j;
            String outputFile = "./main/java/com/tests/llvm_output"+j+".ll";
            int i = 0;
            while (i < args.length) {
                if (args[i].equals("-o")) {
                    if (i < args.length - 1) {
                        outputFile = new String(args[i+1]);
                        i += 2;
                    }
                    else {
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
}
