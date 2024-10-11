grammar Expression;

prog:   stat+ ;

stat:   expr                  # calcExpr;

expr:   SUB expr              # negate
    |   expr op='×' expr      # Mult
    |   expr op='÷' expr      # Div
    |   expr op='+' expr      # Add
    |   expr op='-' expr      # Sub
    |   NUMBER                # num

    |   '(' expr ')'          # parens
    ;

MULT :  '×' ;
DIV :   '÷' ;
ADD :   '+' ;
SUB :   '-' ;
NUMBER :  [0-9]+ ('.' [0-9]+)?;