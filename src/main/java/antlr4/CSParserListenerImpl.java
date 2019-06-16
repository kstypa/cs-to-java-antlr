package antlr4;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.BufferedWriter;
import java.io.IOException;

public class CSParserListenerImpl implements CSParserListener {

    private BufferedWriter writer;
    private int fileSize = 0;
    private boolean isNamespace = false;
    private boolean isClassDefinition = false;
    private boolean isStatic = false;
    private boolean isFloat = false;
    private boolean isIdentifier = false;
    private boolean isConstructor = false;
    private boolean isMethod = false;
    private boolean isCall = false;
    private boolean isParameters = false;
    private boolean secondParam = false;
    private boolean isParamedefs = false;
    private String arithmSign = "";
    private boolean isArithmetic = false;
    private int indents = 0;


    public CSParserListenerImpl(BufferedWriter writer, int size){
        this.writer = writer;
        this.fileSize = size;
    }

    private void putIndents() {
        try {
            for (int i=0;i<indents;i++) {
                writer.write("\t");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void enterUsing_token(CSParser.Using_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitUsing_token(CSParser.Using_tokenContext ctx) {

    }

    @Override
    public void enterNamespace_token(CSParser.Namespace_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitNamespace_token(CSParser.Namespace_tokenContext ctx) {

    }

    @Override
    public void enterOpen_brace_token(CSParser.Open_brace_tokenContext ctx) {

        try {
            indents++;
            writer.write(ctx.getText() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitOpen_brace_token(CSParser.Open_brace_tokenContext ctx) {
        indents--;
    }

    @Override
    public void enterClosed_brace_token(CSParser.Closed_brace_tokenContext ctx) {
        try {
            writer.write(ctx.getText() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitClosed_brace_token(CSParser.Closed_brace_tokenContext ctx) {

    }

    @Override
    public void enterStatic_token(CSParser.Static_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitStatic_token(CSParser.Static_tokenContext ctx) {

    }

    @Override
    public void enterClass_token(CSParser.Class_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitClass_token(CSParser.Class_tokenContext ctx) {

    }

    @Override
    public void enterPublic_token(CSParser.Public_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitPublic_token(CSParser.Public_tokenContext ctx) {

    }

    @Override
    public void enterInternal_token(CSParser.Internal_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitInternal_token(CSParser.Internal_tokenContext ctx) {

    }

    @Override
    public void enterPrivate_token(CSParser.Private_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitPrivate_token(CSParser.Private_tokenContext ctx) {

    }

    @Override
    public void enterProteceted_token(CSParser.Proteceted_tokenContext ctx) {
        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitProteceted_token(CSParser.Proteceted_tokenContext ctx) {

    }

    @Override
    public void enterDigit_token(CSParser.Digit_tokenContext ctx) {

        try {
            writer.write(ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitDigit_token(CSParser.Digit_tokenContext ctx) {

    }

    @Override
    public void enterVar_token(CSParser.Var_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitVar_token(CSParser.Var_tokenContext ctx) {

    }

    @Override
    public void enterVoid_token(CSParser.Void_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitVoid_token(CSParser.Void_tokenContext ctx) {

    }

    @Override
    public void enterIdentifier_token(CSParser.Identifier_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitIdentifier_token(CSParser.Identifier_tokenContext ctx) {


    }

    @Override
    public void enterString_literal_token(CSParser.String_literal_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitString_literal_token(CSParser.String_literal_tokenContext ctx) {

    }

    @Override
    public void enterTrue_token(CSParser.True_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitTrue_token(CSParser.True_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void enterFalse_token(CSParser.False_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitFalse_token(CSParser.False_tokenContext ctx) {

    }

    @Override
    public void enterNull_token(CSParser.Null_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitNull_token(CSParser.Null_tokenContext ctx) {

    }

    @Override
    public void enterReturn_token(CSParser.Return_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitReturn_token(CSParser.Return_tokenContext ctx) {

    }

    @Override
    public void enterNew_token(CSParser.New_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitNew_token(CSParser.New_tokenContext ctx) {


    }

    @Override
    public void enterDelete_token(CSParser.Delete_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitDelete_token(CSParser.Delete_tokenContext ctx) {

    }

    @Override
    public void enterWhile_token(CSParser.While_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitWhile_token(CSParser.While_tokenContext ctx) {

    }

    @Override
    public void enterFor_token(CSParser.For_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitFor_token(CSParser.For_tokenContext ctx) {

    }

    @Override
    public void enterCase_token(CSParser.Case_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitCase_token(CSParser.Case_tokenContext ctx) {

    }

    @Override
    public void enterDo_token(CSParser.Do_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitDo_token(CSParser.Do_tokenContext ctx) {


    }

    @Override
    public void enterForeach_token(CSParser.Foreach_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitForeach_token(CSParser.Foreach_tokenContext ctx) {


    }

    @Override
    public void enterIf_token(CSParser.If_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitIf_token(CSParser.If_tokenContext ctx) {

    }

    @Override
    public void enterElse_token(CSParser.Else_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitElse_token(CSParser.Else_tokenContext ctx) {

    }

    @Override
    public void enterSwitch_token(CSParser.Switch_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitSwitch_token(CSParser.Switch_tokenContext ctx) {

    }

    @Override
    public void enterBreak_token(CSParser.Break_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitBreak_token(CSParser.Break_tokenContext ctx) {

    }

    @Override
    public void enterDefault_token(CSParser.Default_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitDefault_token(CSParser.Default_tokenContext ctx) {

    }

    @Override
    public void enterIn_token(CSParser.In_tokenContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitIn_token(CSParser.In_tokenContext ctx) {

    }

    @Override
    public void enterSemicolon_sign(CSParser.Semicolon_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitSemicolon_sign(CSParser.Semicolon_signContext ctx) {

    }

    @Override
    public void enterDot_sign(CSParser.Dot_signContext ctx) {

        try {
            writer.write(ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitDot_sign(CSParser.Dot_signContext ctx) {

    }

    @Override
    public void enterComa_sign(CSParser.Coma_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitComa_sign(CSParser.Coma_signContext ctx) {

    }

    @Override
    public void enterOpen_bracket_sign(CSParser.Open_bracket_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitOpen_bracket_sign(CSParser.Open_bracket_signContext ctx) {

    }

    @Override
    public void enterClose_bracket_sign(CSParser.Close_bracket_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitClose_bracket_sign(CSParser.Close_bracket_signContext ctx) {

    }

    @Override
    public void enterEquals_sign(CSParser.Equals_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitEquals_sign(CSParser.Equals_signContext ctx) {

    }

    @Override
    public void enterPlus_sign(CSParser.Plus_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitPlus_sign(CSParser.Plus_signContext ctx) {

    }

    @Override
    public void enterSlash_sign(CSParser.Slash_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitSlash_sign(CSParser.Slash_signContext ctx) {

    }

    @Override
    public void enterAsterisk_sign(CSParser.Asterisk_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitAsterisk_sign(CSParser.Asterisk_signContext ctx) {

    }

    @Override
    public void enterMinus_sign(CSParser.Minus_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitMinus_sign(CSParser.Minus_signContext ctx) {

    }

    @Override
    public void enterLogical_equals_sign(CSParser.Logical_equals_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitLogical_equals_sign(CSParser.Logical_equals_signContext ctx) {


    }

    @Override
    public void enterNot_equal_sign(CSParser.Not_equal_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitNot_equal_sign(CSParser.Not_equal_signContext ctx) {

    }

    @Override
    public void enterGreater_sign(CSParser.Greater_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitGreater_sign(CSParser.Greater_signContext ctx) {

    }

    @Override
    public void enterLesser_sign(CSParser.Lesser_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitLesser_sign(CSParser.Lesser_signContext ctx) {

    }

    @Override
    public void enterGreater_or_equal_sign(CSParser.Greater_or_equal_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitGreater_or_equal_sign(CSParser.Greater_or_equal_signContext ctx) {

    }

    @Override
    public void enterLesser_or_equal_sign(CSParser.Lesser_or_equal_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitLesser_or_equal_sign(CSParser.Lesser_or_equal_signContext ctx) {

    }

    @Override
    public void enterIncrementation_sign(CSParser.Incrementation_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitIncrementation_sign(CSParser.Incrementation_signContext ctx) {

    }

    @Override
    public void enterDecrementation_sign(CSParser.Decrementation_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitDecrementation_sign(CSParser.Decrementation_signContext ctx) {

    }

    @Override
    public void enterAnd_sign(CSParser.And_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitAnd_sign(CSParser.And_signContext ctx) {

    }

    @Override
    public void enterOr_sign(CSParser.Or_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitOr_sign(CSParser.Or_signContext ctx) {

    }

    @Override
    public void enterNegation_sign(CSParser.Negation_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitNegation_sign(CSParser.Negation_signContext ctx) {

    }

    @Override
    public void enterColon_sign(CSParser.Colon_signContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitColon_sign(CSParser.Colon_signContext ctx) {

    }

    @Override
    public void enterType(CSParser.TypeContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitType(CSParser.TypeContext ctx) {

    }

    @Override
    public void enterEntry_point(CSParser.Entry_pointContext ctx) {

    }

    @Override
    public void exitEntry_point(CSParser.Entry_pointContext ctx) {

    }

    @Override
    public void enterSource_file(CSParser.Source_fileContext ctx) {

    }

    @Override
    public void exitSource_file(CSParser.Source_fileContext ctx) {

    }

    @Override
    public void enterUsing_list(CSParser.Using_listContext ctx) {

    }

    @Override
    public void exitUsing_list(CSParser.Using_listContext ctx) {

    }

    @Override
    public void enterUsing(CSParser.UsingContext ctx) {

    }

    @Override
    public void exitUsing(CSParser.UsingContext ctx) {
        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterNamespace(CSParser.NamespaceContext ctx) {

    }

    @Override
    public void exitNamespace(CSParser.NamespaceContext ctx) {

    }

    @Override
    public void enterClassdef(CSParser.ClassdefContext ctx) {

    }

    @Override
    public void exitClassdef(CSParser.ClassdefContext ctx) {

    }

    @Override
    public void enterClass_access_m(CSParser.Class_access_mContext ctx) {

    }

    @Override
    public void exitClass_access_m(CSParser.Class_access_mContext ctx) {

    }

    @Override
    public void enterAccess_modifier(CSParser.Access_modifierContext ctx) {

    }

    @Override
    public void exitAccess_modifier(CSParser.Access_modifierContext ctx) {

    }

    @Override
    public void enterNumber(CSParser.NumberContext ctx) {

    }

    @Override
    public void exitNumber(CSParser.NumberContext ctx) {
        try {
            writer.write(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterInteger(CSParser.IntegerContext ctx) {

    }

    @Override
    public void exitInteger(CSParser.IntegerContext ctx) {

    }

    @Override
    public void enterFloating(CSParser.FloatingContext ctx) {

    }

    @Override
    public void exitFloating(CSParser.FloatingContext ctx) {

    }

    @Override
    public void enterConstructor_access_m(CSParser.Constructor_access_mContext ctx) {

    }

    @Override
    public void exitConstructor_access_m(CSParser.Constructor_access_mContext ctx) {

    }

    @Override
    public void enterConstructor(CSParser.ConstructorContext ctx) {

    }

    @Override
    public void exitConstructor(CSParser.ConstructorContext ctx) {

    }

    @Override
    public void enterAssignment(CSParser.AssignmentContext ctx) {

    }

    @Override
    public void exitAssignment(CSParser.AssignmentContext ctx) {

    }

    @Override
    public void enterField(CSParser.FieldContext ctx) {

    }

    @Override
    public void exitField(CSParser.FieldContext ctx) {

    }

    @Override
    public void enterDeclaration(CSParser.DeclarationContext ctx) {

    }

    @Override
    public void exitDeclaration(CSParser.DeclarationContext ctx) {

    }

    @Override
    public void enterLocal_declaration(CSParser.Local_declarationContext ctx) {

    }

    @Override
    public void exitLocal_declaration(CSParser.Local_declarationContext ctx) {

    }

    @Override
    public void enterMethod_declaration(CSParser.Method_declarationContext ctx) {

    }

    @Override
    public void exitMethod_declaration(CSParser.Method_declarationContext ctx) {

    }

    @Override
    public void enterValue(CSParser.ValueContext ctx) {

    }

    @Override
    public void exitValue(CSParser.ValueContext ctx) {

    }

    @Override
    public void enterMethod(CSParser.MethodContext ctx) {

    }

    @Override
    public void exitMethod(CSParser.MethodContext ctx) {

    }

    @Override
    public void enterParamedefs(CSParser.ParamedefsContext ctx) {

    }

    @Override
    public void exitParamedefs(CSParser.ParamedefsContext ctx) {

    }

    @Override
    public void enterReturn_com(CSParser.Return_comContext ctx) {

    }

    @Override
    public void exitReturn_com(CSParser.Return_comContext ctx) {

    }

    @Override
    public void enterControl_statement(CSParser.Control_statementContext ctx) {

    }

    @Override
    public void exitControl_statement(CSParser.Control_statementContext ctx) {

    }

    @Override
    public void enterCommand_void(CSParser.Command_voidContext ctx) {

    }

    @Override
    public void exitCommand_void(CSParser.Command_voidContext ctx) {

    }

    @Override
    public void enterConstructor_command(CSParser.Constructor_commandContext ctx) {

    }

    @Override
    public void exitConstructor_command(CSParser.Constructor_commandContext ctx) {

    }

    @Override
    public void enterCommand(CSParser.CommandContext ctx) {
        putIndents();

    }

    @Override
    public void exitCommand(CSParser.CommandContext ctx) {
        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterCall(CSParser.CallContext ctx) {

    }

    @Override
    public void exitCall(CSParser.CallContext ctx) {

    }

    @Override
    public void enterNew_object(CSParser.New_objectContext ctx) {

    }

    @Override
    public void exitNew_object(CSParser.New_objectContext ctx) {

    }

    @Override
    public void enterDelete_object(CSParser.Delete_objectContext ctx) {

    }

    @Override
    public void exitDelete_object(CSParser.Delete_objectContext ctx) {

    }

    @Override
    public void enterOrigin_class(CSParser.Origin_classContext ctx) {

    }

    @Override
    public void exitOrigin_class(CSParser.Origin_classContext ctx) {

    }

    @Override
    public void enterParameters(CSParser.ParametersContext ctx) {

    }

    @Override
    public void exitParameters(CSParser.ParametersContext ctx) {

    }

    @Override
    public void enterArithmetic(CSParser.ArithmeticContext ctx) {

    }

    @Override
    public void exitArithmetic(CSParser.ArithmeticContext ctx) {

    }

    @Override
    public void enterOperand(CSParser.OperandContext ctx) {

    }

    @Override
    public void exitOperand(CSParser.OperandContext ctx) {

    }

    @Override
    public void enterAdd_operand(CSParser.Add_operandContext ctx) {

    }

    @Override
    public void exitAdd_operand(CSParser.Add_operandContext ctx) {

    }

    @Override
    public void enterAdd(CSParser.AddContext ctx) {

    }

    @Override
    public void exitAdd(CSParser.AddContext ctx) {

    }

    @Override
    public void enterSubtract(CSParser.SubtractContext ctx) {

    }

    @Override
    public void exitSubtract(CSParser.SubtractContext ctx) {

    }

    @Override
    public void enterMultiply(CSParser.MultiplyContext ctx) {

    }

    @Override
    public void exitMultiply(CSParser.MultiplyContext ctx) {

    }

    @Override
    public void enterDivide(CSParser.DivideContext ctx) {

    }

    @Override
    public void exitDivide(CSParser.DivideContext ctx) {

    }

    @Override
    public void enterGreater_than(CSParser.Greater_thanContext ctx) {

    }

    @Override
    public void exitGreater_than(CSParser.Greater_thanContext ctx) {

    }

    @Override
    public void enterLesser_than(CSParser.Lesser_thanContext ctx) {

    }

    @Override
    public void exitLesser_than(CSParser.Lesser_thanContext ctx) {

    }

    @Override
    public void enterGreater_or_equal(CSParser.Greater_or_equalContext ctx) {

    }

    @Override
    public void exitGreater_or_equal(CSParser.Greater_or_equalContext ctx) {

    }

    @Override
    public void enterLesser_or_equal(CSParser.Lesser_or_equalContext ctx) {

    }

    @Override
    public void exitLesser_or_equal(CSParser.Lesser_or_equalContext ctx) {

    }

    @Override
    public void enterEqual(CSParser.EqualContext ctx) {

    }

    @Override
    public void exitEqual(CSParser.EqualContext ctx) {

    }

    @Override
    public void enterNot_equal(CSParser.Not_equalContext ctx) {

    }

    @Override
    public void exitNot_equal(CSParser.Not_equalContext ctx) {

    }

    @Override
    public void enterComparison(CSParser.ComparisonContext ctx) {

    }

    @Override
    public void exitComparison(CSParser.ComparisonContext ctx) {

    }

    @Override
    public void enterLogical_operand(CSParser.Logical_operandContext ctx) {

    }

    @Override
    public void exitLogical_operand(CSParser.Logical_operandContext ctx) {

    }

    @Override
    public void enterConjunction(CSParser.ConjunctionContext ctx) {

    }

    @Override
    public void exitConjunction(CSParser.ConjunctionContext ctx) {

    }

    @Override
    public void enterAlternative(CSParser.AlternativeContext ctx) {

    }

    @Override
    public void exitAlternative(CSParser.AlternativeContext ctx) {

    }

    @Override
    public void enterNegation(CSParser.NegationContext ctx) {

    }

    @Override
    public void exitNegation(CSParser.NegationContext ctx) {

    }

    @Override
    public void enterLogical_operator(CSParser.Logical_operatorContext ctx) {

    }

    @Override
    public void exitLogical_operator(CSParser.Logical_operatorContext ctx) {

    }

    @Override
    public void enterCondition(CSParser.ConditionContext ctx) {

    }

    @Override
    public void exitCondition(CSParser.ConditionContext ctx) {

    }

    @Override
    public void enterWhile_loop(CSParser.While_loopContext ctx) {

    }

    @Override
    public void exitWhile_loop(CSParser.While_loopContext ctx) {

    }

    @Override
    public void enterDo_while_loop(CSParser.Do_while_loopContext ctx) {

    }

    @Override
    public void exitDo_while_loop(CSParser.Do_while_loopContext ctx) {

    }

    @Override
    public void enterFor_loop(CSParser.For_loopContext ctx) {

    }

    @Override
    public void exitFor_loop(CSParser.For_loopContext ctx) {

    }

    @Override
    public void enterIf_cond(CSParser.If_condContext ctx) {

    }

    @Override
    public void exitIf_cond(CSParser.If_condContext ctx) {

    }

    @Override
    public void enterElse_cond(CSParser.Else_condContext ctx) {

    }

    @Override
    public void exitElse_cond(CSParser.Else_condContext ctx) {

    }

    @Override
    public void enterForeach(CSParser.ForeachContext ctx) {

    }

    @Override
    public void exitForeach(CSParser.ForeachContext ctx) {

    }

    @Override
    public void enterSwitch_cond(CSParser.Switch_condContext ctx) {

    }

    @Override
    public void exitSwitch_cond(CSParser.Switch_condContext ctx) {

    }

    @Override
    public void enterPre_increment(CSParser.Pre_incrementContext ctx) {

    }

    @Override
    public void exitPre_increment(CSParser.Pre_incrementContext ctx) {

    }

    @Override
    public void enterPost_increment(CSParser.Post_incrementContext ctx) {

    }

    @Override
    public void exitPost_increment(CSParser.Post_incrementContext ctx) {

    }

    @Override
    public void enterPre_decrement(CSParser.Pre_decrementContext ctx) {

    }

    @Override
    public void exitPre_decrement(CSParser.Pre_decrementContext ctx) {

    }

    @Override
    public void enterPost_decrement(CSParser.Post_decrementContext ctx) {

    }

    @Override
    public void exitPost_decrement(CSParser.Post_decrementContext ctx) {

    }

    @Override
    public void enterIn_decrement(CSParser.In_decrementContext ctx) {

    }

    @Override
    public void exitIn_decrement(CSParser.In_decrementContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}