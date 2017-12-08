grammar MountC; // Probably change this for later

program:   fun_def_list;

fun_def_list: fun_def fun_def_list
    | /* Epsilon */
    ;

fun_def: ID LPAREN id_list RPAREN LBRACE RETURN expr_list SCOLON RBRACE;

id_list: ID (COMMA ID)*
    | /* Epsilon */
    ;

id_list_tail: COMMA ID id_list_tail #parameter
    | /* Epsilon */                 #epsilon1
    ;

expr_list: expr expr_list_tail
    ;

expr_list_tail: COMMA expr expr_list_tail
    | /* Epsilon */
    ;

expr returns [int ifID]
    : expr thenPart expr elsePart expr  #ifExpr
    | term expr_tail                    #termExpr
    | LPAREN expr_list RPAREN           #mathExpr
    ;

thenPart:   QUEST ;

elsePart:   COLON ;

expr_tail: op expr          # add
    | /* Epsilon */         # epsilon3
    ;

term: NUM                   # numTerm
    | ID term_tail          # idTerm
    ;

term_tail: LPAREN arg_list RPAREN   #funCall
    | GETS expr                     #varAssign
    | /* Epsilon */                 #epsilon2
    ;

arg_list: ( expr ( COMMA expr)* ) ? ;

arg_list_tail: COMMA expr arg_list_tail
    | /* Epsilon */
    ;

op: PLUS
    | MINUS
    ;

/* This starts the naming of terminals to shortcuts */

LBRACE : '{' ;
RBRACE : '}' ;
LPAREN : '(' ;
RPAREN : ')' ;
COMMA  : ',' ;
QUEST  : '?' ;
COLON  : ':' ;
SCOLON : ';' ;
GETS   : '=' ;
PLUS   : '+' ;
MINUS  : '-' ;
RETURN : 'return'  ;
NUM    : [0-9]+    ;
ID     : [a-zA-Z][_a-zA-Z0-9]* ;

C      : '//'.*?'\n' -> skip    ;
WS  :   [\r\n \t]+ -> skip ;
