grammar ProjectGrammar;

init
    :    stat* EOF
    ;
    
stat
    :   block NEWLINE?
    |   NEWLINE
    ;
    
block
    :   declaration                                                                             #Decl
    |   statement                                                                               #Statm
    |   'writeint' '(' writeintcontext ')' ';'                                                  #OutInt
    |   'writechar' '(' charoperandinlogic ')' ';'                                              #OutChar
    ;
    
declaration
    :   parameter arrayslistFuncDecl* '(' parameterlist? ')' '{' functionbody 'return' retexpr NEWLINE* '}' #FunctionDeclaration
    |   parameterVar ';'                                                                                    #VarDeclaration
    ;
    
retexpr
    :   expr ';'
    ;
    
functionbody
    :   stat*                                                                                   #FuncBody
    ;
    
statement
    :   ifstatement                                                                             #IfStatement
    |   whilestatement                                                                          #WhileStatement
    |   expr ';'                                                                                #Expression
    ;
    
parameterlist
    :   parameter (',' parameter)*                                                              #ParamList
    ;
    
parameterVar
    :   INT VARIABLE arrayslist*                                                                #VariableDeclarationInt     
    |   BOOLEAN VARIABLE arrayslist*                                                            #VariableDeclarationBool
    |   'char' VARIABLE arrayslist*                                                             #VariableDeclarationChar
    ;
    
parameter
    :   INT VARIABLE arrayslistFuncDecl*                                                        #VariableInFuncDeclarationInt     
    |   BOOLEAN VARIABLE arrayslistFuncDecl*                                                    #VariableInFuncDeclarationBool
    ;
    
arrayslistFuncDecl
    :   '[]'                                                                          
    ;
    
arrayslist
    :   '[' mathexpression ']'                                                                  #Arr
    ;
    
ifstatement
    :   'if' '(' logicexpression ')' NEWLINE? '{' ifblock '}' NEWLINE? 'else' NEWLINE? '{' elseblock '}'  #IfCtx
    ;
    
ifblock
    :   stat*                                                                                   #IfStatements
    ;
    
elseblock
    :   stat*                                                                                   #ElseStatements
    ;
    
whilestatement
    :   'while' '(' logicexpression ')' '{' cyclebody '}'                                       #WhileCtx
    ;
    
cyclebody
    :   (block|NEWLINE)*                                                                        #CycBd
    ;
    
expr
    :   assignexpression                                                                        #AssignExp
    |   mathexpression                                                                          #MathExp
    |   logicexpression                                                                         #LogicExp
    ;
    
assignexpression
    :   charoperand ASSIGN '(char)'charexpression                                               #AssignChar
    |   operand ASSIGN mathexpression                                                           #AssignMath
    |   operand ASSIGN logicexpression                                                          #AssignExpCtxLog
    |   operand ASSIGN 'readint()'                                                              #AssignExpCtxInpInt
    |   charoperand ASSIGN 'readchar()'                                                         #AssignExpCtxInpChar
    |   operand ASSIGN function                                                                 #AssignExpCtxFunc
    ;
    
mathexpression
    :   mathexpression op=(MUL|DIV) mathexpression                                              #MathOp
    |   mathexpression op=(PLUS|MINUS) mathexpression                                           #MathOp
    |   mathoperand                                                                             #MathAtom
    ;
    
logicexpression
    :   charoperandinlogic rel=(GR|LO|GE|LE|EQ) '(char)'charoperandinlogic                      #CharOpGLE   
    |   logicoperand rel=(GR|LO|GE|LE|EQ) logicoperand                                          #OpGLE
    |   logicexpression ('and') logicexpression                                                 #OpAnd
    |   logicexpression ('or') logicexpression                                                  #OpOr
    |   NEG logicoperand                                                                        #OpNeg
    |   logicoperand                                                                            #OperLog
    ;

mathoperand
    :   VARIABLE                                                                                #IntVar
    |   VARIABLE dimensions*                                                                    #IntArrayOperand
    |   '-' mathoperand                                                                         #IntNeg
    |   NUMBER                                                                                  #Int
    |   '(' mathexpression ')'                                                                  #IntOpInParen
    ;
    
logicoperand
    :   mathexpression                                                                          #MathExpInLogic   
    |   VARIABLE                                                                                #BoolVar
    |   VARIABLE dimensions+                                                                    #BoolArrayOperand
    |   BOOL                                                                                    #BoolConst
    |   '(' logicexpression ')'                                                                 #BoolOpInParen
    ;
    
operand
    :   VARIABLE dimensions*                                                                    #VarMaybeArray
    |   '(' (mathexpression|logicexpression) ')'                                                #ExpInParen
    ;

dimensions
    :   '[' mathexpression ']'                                                                  #ArrayDimensions
    ;
    
function
    :   VARIABLE '(' ')'                                                                        #Func
    |   VARIABLE '(' arguments ')'                                                              #Func
    ;
       
arguments
    :   VARIABLE (',' VARIABLE)*                                                                #Args
    ;
    
writeintcontext
    :   mathexpression                                                                          #MathE
    |   logicexpression                                                                         #LogE
    ;

writestrcontext
    :   VARIABLE                                                                                #StrE
    ;

charoperand
    :   CHARCONST                                                                               #CharConst
    |   VARIABLE dimensions*                                                                    #CharVarMaybeArray
    ;

charoperandinlogic
    :   CHARCONST                                                                               #CharConstInLogic
    |   VARIABLE dimensions*                                                                    #CharVarMaybeArrayInLogic
    ;

charexpression
    :   CHARCONST                                                                               #CharConstExp
    |   VARIABLE dimensions*                                                                    #CharVarMaybeArrayExp
    ;

CHARCONST
    :   '\''CHAR'\''
    ;
    
ASSIGN
    :    '<-'
    ;
    
NEG
    :   '!'
    ;
    
INT
    :   'int'
    ;

BOOLEAN
    :   'bool'
    ;
    
GR
    :   '>'
    ;
    
LO
    :   '<'
    ;
    
GE
    :   '>='
    ;
    
LE
    :   '<='
    ;
    
EQ
    :   '='
    ;
    
MUL
    :   '*'
    ;
    
DIV
    :   '/'
    ;
    
PLUS
    :   '+'
    ;
    
MINUS
    :   '-'
    ;
    
NUMBER
    :   [1-9] DIGIT*
    |   [0]
    ;
    
BOOL
    :   'true'
    |   'false'
    ;
    
CONST
    :   '\''CHAR'\''
    |   NUMBER
    |   BOOL
    ;
    
fragment STRING
    :   '"' (CHARS|WS) '"'
    |   '\'' (CHARS|WS) '\''
    |   'L\'' (CHARS|WS) '\''
    |   'u\'' (CHARS|WS) '\''
    |   'U\'' (CHARS|WS) '\''
    ;

fragment CHARS
    :   CHAR+
    ;

fragment CHAR
    :   '\\' ['"?abfnrtv\\]
    |   ~['\\\r\n]
    |   '\\\n'   
    |   '\\\r\n' 
    ;
    
fragment NONZERODIGIT
    :   [1-9]
    ;
    
fragment DIGIT
    :    [0-9]
    ;
    
fragment LETTER
    :    [a-zA-Z]
    ;
    
VARIABLE
    :    LETTER (LETTER|DIGIT)*
    ;  
    
    
NEWLINE
    :    ('\r\n' | '\n' | '\r')
    ;
    
WS
    :    [ \t]+ -> skip
    ;
    
BLOCKCOMMENT
    :   '$$' .*? '$$' -> skip
    ;
    
LINECOMMENT
    :   '$' .*? NEWLINE -> skip
    ;

