grammar MountC; // Probably change this for later

program:   fun_def_list;

fun_def_list: fun_def fun_def_list
    | /* Epsilon */
    ;

fun_def: ID LPAREN id_list RPAREN LBRACE RETURN expr_list SCOLON RBRACE;

id_list: ID id_list_tail
    | /* Epsilon */
    ;

id_list_tail: COMMA ID id_list_tail
    | /* Epsilon */
    ;

expr_list: expr expr_list_tail
    ;

expr_list_tail: COMMA expr expr_list_tail
    | /* Epsilon */
    ;

expr: expr QUEST expr COLON expr
    | term expr_tail
    | LPAREN expr_list RPAREN
    ;

expr_tail: op expr
    | /* Epsilon */
    ;

term: NUM
    | ID term_tail
    ;

term_tail: LPAREN arg_list RPAREN
    | GETS expr
    | /* Epsilon */
    ;

arg_list: expr arg_list_tail
    | /* Epsilon */
    ;

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
ID     : [a-zA-Z]+ ;

C      : '//'.*?'\n' -> skip    ;
WS  :   [\r\n \t]+ -> skip ;
