lexer grammar CSLexer;

WHITESPACES:   (Whitespace | NewLine)+ -> skip;

// słowa kluczowe
BOOL:          'bool';
BYTE:          'byte';
CHAR:          'char';
CLASS:         'class';
CONST:         'const';
DECIMAL:       'decimal';
DELETE:        'delete';
DOUBLE:        'double';
ELSE:          'else';
FALSE:         'false';
FLOAT:         'float';
FOR:           'for';
FOREACH:       'foreach';
IF:            'if';
INT:           'int';
INTERNAL:      'internal';
LONG:          'long';
NAMESPACE:     'namespace';
NEW:           'new';
NULL:          'null';
OBJECT:        'object';
PRIVATE:       'private';
PROTECTED:     'protected';
PUBLIC:        'public';
RETURN:        'return';
SBYTE:         'sbyte';
SHORT:         'short';
STATIC:        'static';
STRING:        'string';
TRUE:          'true';
UINT:          'uint';
ULONG:         'ulong';
USHORT:        'ushort';
USING:         'using';
VAR:		   'var';
VOID:          'void';
WHILE:         'while';
IN:            'in';

LOWERCASE:      [a-z]+;
UPPERCASE:      [A-Z]+;
DIGIT:          [0-9];
UNDERSCORE:     '_';
STRING_LITERAL: '"' Character* '"';


// operatory, nawiasy, itd.
OPEN_BRACE:               '{';
CLOSE_BRACE:              '}';
OPEN_BRACKET:             '[';
CLOSE_BRACKET:            ']';
OPEN_PARENS:              '(';
CLOSE_PARENS:             ')';
DOT:                      '.';
COMMA:                    ',';
COLON:                    ':';
SEMICOLON:                ';';
PLUS:                     '+';
MINUS:                    '-';
STAR:                     '*';
SLASH:                    '/';
PERCENT:                  '%';
AMP:                      '&';
BITWISE_OR:               '|';
CARET:                    '^';
BANG:                     '!';
TILDE:                    '~';
ASSIGNMENT:               '=';
LT:                       '<';
GT:                       '>';
INTERR:                   '?';
DOUBLE_COLON:             '::';
OP_COALESCING:            '??';
OP_INC:                   '++';
OP_DEC:                   '--';
OP_AND:                   '&&';
OP_OR:                    '||';
OP_PTR:                   '->';
OP_EQ:                    '==';
OP_NE:                    '!=';
OP_LE:                    '<=';
OP_GE:                    '>=';
OP_ADD_ASSIGNMENT:        '+=';
OP_SUB_ASSIGNMENT:        '-=';
OP_MULT_ASSIGNMENT:       '*=';
OP_DIV_ASSIGNMENT:        '/=';
OP_MOD_ASSIGNMENT:        '%=';
OP_AND_ASSIGNMENT:        '&=';
OP_OR_ASSIGNMENT:         '|=';
OP_XOR_ASSIGNMENT:        '^=';
OP_LEFT_SHIFT:            '<<';
OP_LEFT_SHIFT_ASSIGNMENT: '<<=';

// fragmenty

fragment Character: ~[\r\n];

fragment NewLine: ('\r\n' | '\r' | '\n');

fragment Whitespace : (' ' | '\t');