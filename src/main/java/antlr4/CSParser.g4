parser grammar CSParser;

options { tokenVocab=CSLexer; }

entry_point:            source_file EOF;

source_file:            using_list namespace*;

using_list:             using*;

using:                  USING origin_class identifier ';';

namespace:              NAMESPACE identifier OPEN_BRACE
                            classdef*
                        CLOSE_BRACE;

classdef:               class_access_m? STATIC? CLASS identifier OPEN_BRACE
                            ( constructor
                            | field
                            | method
                            )*
                        CLOSE_BRACE;

class_access_m:         (PUBLIC | INTERNAL);

access_modifier:        (PRIVATE | PUBLIC) | (PRIVATE? PROTECTED) | (PROTECTED? INTERNAL);

number:                 '-'? (integer | floating);

integer:                DIGIT+;

floating:               integer '.' integer;

//word:                   (LOWERCASE | UPPERCASE);
//word:                   WORD;

//identifier:             (word | '_')+ (word | integer | '_')*;
identifier:             IDENTIFIER;

constructor_access_m:   (PRIVATE | PUBLIC | STATIC);

constructor:            constructor_access_m identifier '(' paramedefs ')' OPEN_BRACE
                            constructor_command
                        CLOSE_BRACE;

assignment:             '=' value;

field:                  access_modifier? STATIC? declaration assignment? ';';

declaration:            type identifier;

local_declaration:      (type | VAR) identifier;

method_declaration:     (type | VOID) identifier;

value:                  ( number
                        | STRING_LITERAL
                        | TRUE
                        | FALSE
                        | NULL
                        | identifier
                        | new_object
                        | arithmetic
                        | call
                        );

type:                     BOOL
                        | BYTE
                        | CHAR
                        | DECIMAL
                        | DOUBLE
                        | FLOAT
                        | INT
                        | LONG
                        | OBJECT
                        | SBYTE
                        | SHORT
                        | STRING
                        | UINT
                        | ULONG
                        | USHORT;

method:                 access_modifier? STATIC? method_declaration '(' paramedefs? ')' OPEN_BRACE
                            command*
                        CLOSE_BRACE;

paramedefs:             declaration (',' declaration)*;

return_com:             RETURN value;

control_statement:      ( if_cond
                        | for_loop
                        | foreach
                        | while_loop
                        | do_while_loop
                        | switch_cond
                        );

command_void:           ( call
                        | in_decrement
                        | local_declaration assignment?
                        | identifier assignment
                        | delete_object
                        );

constructor_command:    (command_void ';') | control_statement;

command:                (
                            ( command_void
                            | return_com
                            ) ';'
                        |   control_statement
                        );

call:                   origin_class identifier '(' parameters? ')';

new_object:             NEW call;

delete_object:          DELETE identifier;

origin_class:           (identifier '.')*;

parameters:             value (',' value)*;

arithmetic:             add | subtract | multiply | divide;

operand:                (number | identifier | call) | ('(' (number | identifier | call) ')');

add_operand:            (operand | STRING_LITERAL | call);

add:                    add_operand '+' add_operand ('+' add_operand)*;

subtract:               operand '-' operand ('-' operand)*;

multiply:               operand '*' operand ('*' operand)*;

divide:                 operand '/' operand ('/' operand)*;

greater_than:           operand '>' operand;

lesser_than:            operand '<' operand;

greater_or_equal:       operand '<=' operand;

lesser_or_equal:        operand '>=' operand;

equal:                  (operand | TRUE | FALSE) '==' (operand | TRUE | FALSE);

not_equal:              (operand | TRUE | FALSE) '!=' (operand | TRUE | FALSE);

comparison:             greater_or_equal | lesser_or_equal |greater_than | lesser_than | equal | not_equal;

logical_operand:        (call | identifier |comparison | TRUE | FALSE ) | ( '(' (call | identifier | comparison | TRUE | FALSE ) ')');

conjunction:            logical_operand '&&' logical_operand ( '&&' logical_operand )*;

alternative:            logical_operand '||' logical_operand ( '||' logical_operand )*;

negation:               '!' logical_operand;

logical_operator:       ( conjunction | alternative | negation );

condition:              logical_operand | logical_operator;

while_loop:             WHILE '(' condition ')' ((OPEN_BRACE
                            command*
                        CLOSE_BRACE) | command );

do_while_loop:          DO ( (OPEN_BRACE
                            command*
                        CLOSE_BRACE) | command )
                        WHILE '(' condition ')';

for_loop:               FOR '(' (declaration | identifier) assignment ';' condition ';' ( identifier assignment | call | in_decrement ) ')' ((OPEN_BRACE
                                     command+
                                     CLOSE_BRACE) | command );

if_cond:                IF '(' condition ')'((OPEN_BRACE
                                           command+
                                           CLOSE_BRACE) | command )
                                           else_cond?;

else_cond:             ELSE((OPEN_BRACE
                             command+
                             CLOSE_BRACE) | command );

foreach:                FOREACH '(' declaration IN identifier ')'((OPEN_BRACE
                                                   command+
                                                    CLOSE_BRACE) | command );

switch_cond:            SWITCH  '(' operand ')' OPEN_BRACE
                            (CASE value ':' (command)* (BREAK ';') ?)*
                            (DEFAULT ':'(command)* (BREAK ';'))?
                            CLOSE_BRACE;

pre_increment:          identifier '++';

post_increment:         '++' identifier;

pre_decrement:          identifier '--';

post_decrement:          '--' identifier;

in_decrement:           pre_increment | post_increment | pre_decrement | post_decrement;