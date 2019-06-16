parser grammar CSParser;

options { tokenVocab=CSLexer; }

using_token:            USING;

namespace_token:        NAMESPACE;

open_brace_token:       OPEN_BRACE;

closed_brace_token:     CLOSE_BRACE;

static_token:           STATIC;

class_token:            CLASS;

public_token:           PUBLIC;

internal_token:         INTERNAL;

private_token:          PRIVATE;

proteceted_token:       PROTECTED;

digit_token:            DIGIT;

var_token:              VAR;

void_token:             VOID;

//word:                   (LOWERCASE | UPPERCASE);
//word:                   WORD;

//identifier:             (word | '_')+ (word | integer | '_')*;
identifier_token:       IDENTIFIER;

string_literal_token:   STRING_LITERAL;

true_token:             TRUE;

false_token:            FALSE;

null_token:             NULL;

return_token:           RETURN;

new_token:              NEW;

delete_token:           DELETE;

while_token:            WHILE;

for_token:              FOR;

case_token:             CASE;

do_token:               DO;

foreach_token:          FOREACH;

if_token:               IF;

else_token:             ELSE;

switch_token:           SWITCH;

break_token:            BREAK;

default_token:          DEFAULT;

in_token:               IN;


semicolon_sign:         ';';

dot_sign:               '.';

coma_sign:              ',';

open_bracket_sign:      '(';

close_bracket_sign:     ')';

equals_sign:            '=';

plus_sign:              '+';

slash_sign:             '/';

asterisk_sign:          '*';

minus_sign:             '-';

logical_equals_sign:    '==';

not_equal_sign:         '!=';

greater_sign:           '>';

lesser_sign:            '<';

greater_or_equal_sign:  '>=';

lesser_or_equal_sign:   '<=';

incrementation_sign:    '++';

decrementation_sign:    '--';

and_sign:               '&&';

or_sign:                '||';

negation_sign:          '!';

colon_sign:             ':';

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



///

entry_point:            source_file EOF;

source_file:            using_list namespace*;

using_list:             using*;

using:                  using_token origin_class identifier_token semicolon_sign;

namespace:              namespace_token identifier_token open_brace_token
                            classdef*
                        closed_brace_token;

classdef:               class_access_m? static_token? class_token identifier_token open_brace_token
                            ( constructor
                            | field
                            | method
                            )*
                        closed_brace_token;

class_access_m:         (public_token | internal_token);

access_modifier:        (private_token | public_token) | (private_token? proteceted_token) | (proteceted_token? internal_token);

number:                 minus_sign? (integer | floating);

integer:                digit_token+;

floating:               integer dot_sign integer;



constructor_access_m:   (private_token | public_token | static_token);

constructor:            constructor_access_m identifier_token open_bracket_sign paramedefs close_bracket_sign open_brace_token
                            constructor_command
                        closed_brace_token;

assignment:             equals_sign value;

field:                  access_modifier? static_token? declaration assignment? semicolon_sign;

declaration:            type identifier_token;

local_declaration:      (type | var_token) identifier_token;

method_declaration:     (type | void_token) identifier_token;

value:                  ( number
                        | string_literal_token
                        | true_token
                        | false_token
                        | null_token
                        | identifier_token
                        | new_object
                        | arithmetic
                        | call
                        );



method:                 access_modifier? static_token? method_declaration open_bracket_sign paramedefs? close_bracket_sign open_brace_token
                            command*
                        closed_brace_token;

paramedefs:             declaration (coma_sign declaration)*;

return_com:             return_token value;

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
                        | identifier_token assignment
                        | delete_object
                        );

constructor_command:    (command_void semicolon_sign) | control_statement;

command:                (
                            ( command_void
                            | return_com
                            ) semicolon_sign
                        |   control_statement
                        );

call:                   origin_class identifier_token open_bracket_sign parameters? close_bracket_sign;

new_object:             new_token call;

delete_object:          delete_token identifier_token;

origin_class:           (identifier_token dot_sign)*;

parameters:             value (coma_sign value)*;

arithmetic:             add | subtract | multiply | divide;

operand:                (number | identifier_token | call) | (open_bracket_sign (number | identifier_token | call) close_bracket_sign);

add_operand:            (operand | string_literal_token | call);

add:                    add_operand plus_sign add_operand (plus_sign add_operand)*;

subtract:               operand minus_sign operand (minus_sign operand)*;

multiply:               operand asterisk_sign operand (asterisk_sign operand)*;

divide:                 operand slash_sign operand (slash_sign operand)*;

greater_than:           operand greater_sign operand;

lesser_than:            operand lesser_sign operand;

greater_or_equal:       operand greater_or_equal_sign operand;

lesser_or_equal:        operand lesser_or_equal_sign operand;

equal:                  (operand | true_token | false_token) logical_equals_sign (operand | true_token | false_token);

not_equal:              (operand | true_token | false_token) not_equal_sign (operand | true_token | false_token);

comparison:             greater_or_equal | lesser_or_equal |greater_than | lesser_than | equal | not_equal;

logical_operand:        (call | identifier_token |comparison | true_token | false_token ) | ( open_bracket_sign (call | identifier_token | comparison | true_token | false_token ) close_bracket_sign);

conjunction:            logical_operand and_sign logical_operand ( and_sign logical_operand )*;

alternative:            logical_operand or_sign logical_operand ( or_sign logical_operand )*;

negation:               negation_sign logical_operand;

logical_operator:       ( conjunction | alternative | negation );

condition:              logical_operand | logical_operator;

while_loop:             while_token open_bracket_sign condition close_bracket_sign ((open_brace_token
                            command*
                        closed_brace_token) | command );

do_while_loop:          do_token ( (open_brace_token
                            command*
                        closed_brace_token) | command )
                        while_token open_bracket_sign condition close_bracket_sign;

for_loop:               for_token open_bracket_sign (declaration | identifier_token) assignment semicolon_sign condition semicolon_sign ( identifier_token assignment | call | in_decrement ) close_bracket_sign ((open_brace_token
                                     command+
                                     closed_brace_token) | command );

if_cond:                if_token open_bracket_sign condition close_bracket_sign((open_brace_token
                                           command+
                                           closed_brace_token) | command )
                                           else_cond?;

else_cond:             else_token((open_brace_token
                             command+
                             closed_brace_token) | command );

foreach:                foreach_token open_bracket_sign declaration in_token identifier_token close_bracket_sign((open_brace_token
                                                   command+
                                                    closed_brace_token) | command );

switch_cond:            switch_token  open_bracket_sign operand close_bracket_sign open_brace_token
                            (case_token value colon_sign (command)* (break_token semicolon_sign) ?)*
                            (default_token colon_sign(command)* (break_token semicolon_sign))?
                            closed_brace_token;

pre_increment:          identifier_token incrementation_sign;

post_increment:         incrementation_sign identifier_token;

pre_decrement:          identifier_token decrementation_sign;

post_decrement:          decrementation_sign identifier_token;

in_decrement:           pre_increment | post_increment | pre_decrement | post_decrement;