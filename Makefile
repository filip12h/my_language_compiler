ANTLR=java -jar /usr/local/lib/antlr-4.7.2-complete.jar
GRAMMAR_FILE=main/java/com/grammar
VISITOR_FILE=main/java/com/visitor
FILE_PATH=com.compiler.Compiler

default: grammar-visitor install

install:
	mvn package

grammar-visitor:
	mv $(GRAMMAR_FILE)/*.g4 $(VISITOR_FILE); \
	$(ANTLR) -visitor -no-listener $(VISITOR_FILE)/ProjectGrammar.g4; \
	mv $(VISITOR_FILE)/*.g4 $(GRAMMAR_FILE);
	sed -i '1s/^/package main.java.com.visitor;\n /' $(VISITOR_FILE)/ProjectGrammar*.java

clean:
	rm $(VISITOR_FILE)/SimplerPlusPlusLexer*; \
	rm $(VISITOR_FILE)/SimplerPlusPlusParser*;



compile:	
	javac main/java/com/compiler/Compiler.java
	java main/java/com/compiler/Compiler
	gcc -fPIC -shared -o main/java/com/library/library.so main/java/com/library/library.c
llvm_run:
	lli -load=./main/java/com/library/library.so ./main/java/com/compiler/llvm_output.ll

run: compile llvm_run

tests:
	javac main/java/com/tests/CompilerTests.java
	java main/java/com/tests/CompilerTests
	gcc -fPIC -shared -o main/java/com/library/library.so main/java/com/library/library.c
	lli -load=./main/java/com/library/library.so ./main/java/com/tests/llvm_output1.ll
	lli -load=./main/java/com/library/library.so ./main/java/com/tests/llvm_output2.ll
	lli -load=./main/java/com/library/library.so ./main/java/com/tests/llvm_output3.ll