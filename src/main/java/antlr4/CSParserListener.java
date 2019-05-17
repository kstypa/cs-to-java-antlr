package antlr4;

// Generated from CSParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSParser}.
 */
public interface CSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSParser#entry_point}.
	 * @param ctx the parse tree
	 */
	void enterEntry_point(CSParser.Entry_pointContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#entry_point}.
	 * @param ctx the parse tree
	 */
	void exitEntry_point(CSParser.Entry_pointContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#source_file}.
	 * @param ctx the parse tree
	 */
	void enterSource_file(CSParser.Source_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#source_file}.
	 * @param ctx the parse tree
	 */
	void exitSource_file(CSParser.Source_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#using_list}.
	 * @param ctx the parse tree
	 */
	void enterUsing_list(CSParser.Using_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#using_list}.
	 * @param ctx the parse tree
	 */
	void exitUsing_list(CSParser.Using_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#using}.
	 * @param ctx the parse tree
	 */
	void enterUsing(CSParser.UsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#using}.
	 * @param ctx the parse tree
	 */
	void exitUsing(CSParser.UsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(CSParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(CSParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(CSParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(CSParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#class_access_m}.
	 * @param ctx the parse tree
	 */
	void enterClass_access_m(CSParser.Class_access_mContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#class_access_m}.
	 * @param ctx the parse tree
	 */
	void exitClass_access_m(CSParser.Class_access_mContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modifier(CSParser.Access_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modifier(CSParser.Access_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CSParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CSParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(CSParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(CSParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#floating}.
	 * @param ctx the parse tree
	 */
	void enterFloating(CSParser.FloatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#floating}.
	 * @param ctx the parse tree
	 */
	void exitFloating(CSParser.FloatingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(CSParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(CSParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CSParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CSParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#constructor_access_m}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_access_m(CSParser.Constructor_access_mContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#constructor_access_m}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_access_m(CSParser.Constructor_access_mContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(CSParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(CSParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CSParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CSParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(CSParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(CSParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#local_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declaration(CSParser.Local_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#local_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declaration(CSParser.Local_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(CSParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(CSParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CSParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CSParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CSParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CSParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(CSParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(CSParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#paramedefs}.
	 * @param ctx the parse tree
	 */
	void enterParamedefs(CSParser.ParamedefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#paramedefs}.
	 * @param ctx the parse tree
	 */
	void exitParamedefs(CSParser.ParamedefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#return_com}.
	 * @param ctx the parse tree
	 */
	void enterReturn_com(CSParser.Return_comContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#return_com}.
	 * @param ctx the parse tree
	 */
	void exitReturn_com(CSParser.Return_comContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#command_void}.
	 * @param ctx the parse tree
	 */
	void enterCommand_void(CSParser.Command_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#command_void}.
	 * @param ctx the parse tree
	 */
	void exitCommand_void(CSParser.Command_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#constructor_command}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_command(CSParser.Constructor_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#constructor_command}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_command(CSParser.Constructor_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(CSParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(CSParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(CSParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(CSParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#new_object}.
	 * @param ctx the parse tree
	 */
	void enterNew_object(CSParser.New_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#new_object}.
	 * @param ctx the parse tree
	 */
	void exitNew_object(CSParser.New_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#delete_object}.
	 * @param ctx the parse tree
	 */
	void enterDelete_object(CSParser.Delete_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#delete_object}.
	 * @param ctx the parse tree
	 */
	void exitDelete_object(CSParser.Delete_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#origin_class}.
	 * @param ctx the parse tree
	 */
	void enterOrigin_class(CSParser.Origin_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#origin_class}.
	 * @param ctx the parse tree
	 */
	void exitOrigin_class(CSParser.Origin_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(CSParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(CSParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(CSParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(CSParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(CSParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(CSParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#add_operand}.
	 * @param ctx the parse tree
	 */
	void enterAdd_operand(CSParser.Add_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#add_operand}.
	 * @param ctx the parse tree
	 */
	void exitAdd_operand(CSParser.Add_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CSParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CSParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#subtract}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(CSParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#subtract}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(CSParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(CSParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(CSParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(CSParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(CSParser.DivideContext ctx);
}