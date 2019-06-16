// Generated from C:/Users/6bart/cs-to-java-antlr/src/main/java/antlr4\CSParser.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSParser#using_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_token(CSParser.Using_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#namespace_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_token(CSParser.Namespace_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#open_brace_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_brace_token(CSParser.Open_brace_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#closed_brace_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosed_brace_token(CSParser.Closed_brace_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#static_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_token(CSParser.Static_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#class_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_token(CSParser.Class_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#public_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublic_token(CSParser.Public_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#internal_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternal_token(CSParser.Internal_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#private_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate_token(CSParser.Private_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#proteceted_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProteceted_token(CSParser.Proteceted_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#digit_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit_token(CSParser.Digit_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#var_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_token(CSParser.Var_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#void_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_token(CSParser.Void_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#identifier_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_token(CSParser.Identifier_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#string_literal_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal_token(CSParser.String_literal_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#true_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_token(CSParser.True_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#false_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse_token(CSParser.False_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#null_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_token(CSParser.Null_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#return_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_token(CSParser.Return_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#new_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_token(CSParser.New_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#delete_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_token(CSParser.Delete_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#while_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_token(CSParser.While_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#for_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_token(CSParser.For_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#case_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_token(CSParser.Case_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#do_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_token(CSParser.Do_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#foreach_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_token(CSParser.Foreach_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#if_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_token(CSParser.If_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#else_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_token(CSParser.Else_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#switch_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_token(CSParser.Switch_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#break_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_token(CSParser.Break_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#default_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_token(CSParser.Default_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#in_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_token(CSParser.In_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#semicolon_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_sign(CSParser.Semicolon_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#dot_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_sign(CSParser.Dot_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#coma_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComa_sign(CSParser.Coma_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#open_bracket_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_bracket_sign(CSParser.Open_bracket_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#close_bracket_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_bracket_sign(CSParser.Close_bracket_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#equals_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals_sign(CSParser.Equals_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#plus_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_sign(CSParser.Plus_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#slash_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlash_sign(CSParser.Slash_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#asterisk_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsterisk_sign(CSParser.Asterisk_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#minus_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus_sign(CSParser.Minus_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#logical_equals_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_equals_sign(CSParser.Logical_equals_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#not_equal_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_equal_sign(CSParser.Not_equal_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#greater_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_sign(CSParser.Greater_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#lesser_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesser_sign(CSParser.Lesser_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#greater_or_equal_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_or_equal_sign(CSParser.Greater_or_equal_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#lesser_or_equal_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesser_or_equal_sign(CSParser.Lesser_or_equal_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#incrementation_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementation_sign(CSParser.Incrementation_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#decrementation_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementation_sign(CSParser.Decrementation_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#and_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_sign(CSParser.And_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#or_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_sign(CSParser.Or_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#negation_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation_sign(CSParser.Negation_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#colon_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon_sign(CSParser.Colon_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CSParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#entry_point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_point(CSParser.Entry_pointContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#source_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_file(CSParser.Source_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#using_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_list(CSParser.Using_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing(CSParser.UsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(CSParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(CSParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#class_access_m}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_access_m(CSParser.Class_access_mContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#access_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modifier(CSParser.Access_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CSParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(CSParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#floating}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating(CSParser.FloatingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#constructor_access_m}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_access_m(CSParser.Constructor_access_mContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(CSParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CSParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(CSParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CSParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#local_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_declaration(CSParser.Local_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(CSParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CSParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(CSParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#paramedefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamedefs(CSParser.ParamedefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#return_com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_com(CSParser.Return_comContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_statement(CSParser.Control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#command_void}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand_void(CSParser.Command_voidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#constructor_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_command(CSParser.Constructor_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(CSParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(CSParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#new_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_object(CSParser.New_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#delete_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_object(CSParser.Delete_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#origin_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrigin_class(CSParser.Origin_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(CSParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(CSParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(CSParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#add_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_operand(CSParser.Add_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(CSParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#subtract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(CSParser.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(CSParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#divide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(CSParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#greater_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_than(CSParser.Greater_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#lesser_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesser_than(CSParser.Lesser_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#greater_or_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_or_equal(CSParser.Greater_or_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#lesser_or_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesser_or_equal(CSParser.Lesser_or_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(CSParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#not_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_equal(CSParser.Not_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(CSParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#logical_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operand(CSParser.Logical_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(CSParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(CSParser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(CSParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operator(CSParser.Logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CSParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(CSParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#do_while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_loop(CSParser.Do_while_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(CSParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#if_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_cond(CSParser.If_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#else_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_cond(CSParser.Else_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#foreach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(CSParser.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#switch_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_cond(CSParser.Switch_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#pre_increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_increment(CSParser.Pre_incrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#post_increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_increment(CSParser.Post_incrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#pre_decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_decrement(CSParser.Pre_decrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#post_decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_decrement(CSParser.Post_decrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSParser#in_decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_decrement(CSParser.In_decrementContext ctx);
}