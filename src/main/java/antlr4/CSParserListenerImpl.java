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



    @Override public void enterEntry_point(CSParser.Entry_pointContext ctx) {

    }

    @Override public void exitEntry_point(CSParser.Entry_pointContext ctx) { }

    @Override public void enterSource_file(CSParser.Source_fileContext ctx) { }

    @Override public void exitSource_file(CSParser.Source_fileContext ctx) { }

    @Override public void enterUsing_list(CSParser.Using_listContext ctx) { }

    @Override public void exitUsing_list(CSParser.Using_listContext ctx) { }

    @Override public void enterUsing(CSParser.UsingContext ctx) {

        try {
            writer.write("import ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override public void exitUsing(CSParser.UsingContext ctx) {

        try {
            writer.write(";\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override public void enterNamespace(CSParser.NamespaceContext ctx) {
        isNamespace = true;

    }

    @Override public void exitNamespace(CSParser.NamespaceContext ctx) {

    }

    @Override public void enterClassdef(CSParser.ClassdefContext ctx) {
        putIndents();
        indents++;
        isClassDefinition = true;
        if (ctx.getText().contains("static")) isStatic = true;
    }


    @Override public void exitClassdef(CSParser.ClassdefContext ctx) {

        try {
            indents --;
            putIndents();
            isClassDefinition = false;
            isStatic = false;
            writer.write("}\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override public void enterClass_access_m(CSParser.Class_access_mContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override public void exitClass_access_m(CSParser.Class_access_mContext ctx) { }

    @Override public void enterAccess_modifier(CSParser.Access_modifierContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override public void exitAccess_modifier(CSParser.Access_modifierContext ctx) { }

    @Override public void enterNumber(CSParser.NumberContext ctx) {

        try {
            if(ctx.getText().charAt(0) == '-')writer.write('-');
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override public void exitNumber(CSParser.NumberContext ctx) { }

    @Override public void enterInteger(CSParser.IntegerContext ctx) {

        try {
            if(!isIdentifier)writer.write(ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override public void exitInteger(CSParser.IntegerContext ctx) {

        try {
            if(isFloat) {
                writer.write('.');
                isFloat = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override public void enterFloating(CSParser.FloatingContext ctx) {

        isFloat = true;

    }

    @Override public void exitFloating(CSParser.FloatingContext ctx) {	}

//    @Override public void enterWord(CSParser.WordContext ctx) {
//
//    }
//
//    @Override public void exitWord(CSParser.WordContext ctx) { }

    @Override public void enterIdentifier(CSParser.IdentifierContext ctx) {

        try {
            if(isStatic){
                writer.write("static ");
            }
            if(isClassDefinition) {
                writer.write("class ");
            }
            isIdentifier = true;
            if(!isNamespace){
                writer.write(ctx.getText());
                if(isClassDefinition)writer.write("{\n");
            }else isNamespace = false;
            isClassDefinition = false;
            isStatic = false;


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override public void exitIdentifier(CSParser.IdentifierContext ctx) {


    }

    @Override public void enterConstructor_access_m(CSParser.Constructor_access_mContext ctx) {

        try {
            writer.write(ctx.getText()+" ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override public void exitConstructor_access_m(CSParser.Constructor_access_mContext ctx) { }

    @Override public void enterConstructor(CSParser.ConstructorContext ctx) {
        putIndents();
        indents++;
        isConstructor = true;

    }

    @Override public void exitConstructor(CSParser.ConstructorContext ctx) {

        try {
            indents--;
            putIndents();
            writer.write("} \n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override public void enterAssignment(CSParser.AssignmentContext ctx) {

        try {
            writer.write("=");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override public void exitAssignment(CSParser.AssignmentContext ctx) { }

    @Override public void enterField(CSParser.FieldContext ctx) {

        putIndents();
        if(ctx.getText().contains("static")) isStatic = true;

    }

    @Override public void exitField(CSParser.FieldContext ctx) {

        try {
            writer.write(";\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override public void enterDeclaration(CSParser.DeclarationContext ctx) {

        try {
            if(isStatic){
                isStatic = false;
                writer.write("static ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override public void exitDeclaration(CSParser.DeclarationContext ctx) { }

    @Override public void enterLocal_declaration(CSParser.Local_declarationContext ctx) { }

    @Override public void exitLocal_declaration(CSParser.Local_declarationContext ctx) { }

    @Override public void enterMethod_declaration(CSParser.Method_declarationContext ctx) { }

    @Override public void exitMethod_declaration(CSParser.Method_declarationContext ctx) { }

    @Override public void enterValue(CSParser.ValueContext ctx) { }

    @Override public void exitValue(CSParser.ValueContext ctx) { }

    @Override public void enterType(CSParser.TypeContext ctx) {

        try {
            writer.write(ctx.getText() + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override public void exitType(CSParser.TypeContext ctx) { }

    @Override public void enterMethod(CSParser.MethodContext ctx) { }

    @Override public void exitMethod(CSParser.MethodContext ctx) { }

    @Override public void enterParamedefs(CSParser.ParamedefsContext ctx) {

        try {
            writer.write("( ");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override public void exitParamedefs(CSParser.ParamedefsContext ctx) {

        try {
            writer.write(") { \n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override public void enterReturn_com(CSParser.Return_comContext ctx) { }

    @Override public void exitReturn_com(CSParser.Return_comContext ctx) { }

    @Override
    public void enterControl_statement(CSParser.Control_statementContext ctx) {

    }

    @Override
    public void exitControl_statement(CSParser.Control_statementContext ctx) {

    }

    @Override public void enterCommand_void(CSParser.Command_voidContext ctx) { }

    @Override public void exitCommand_void(CSParser.Command_voidContext ctx) { }

    @Override public void enterConstructor_command(CSParser.Constructor_commandContext ctx) { }

    @Override public void exitConstructor_command(CSParser.Constructor_commandContext ctx) { }

    @Override public void enterCommand(CSParser.CommandContext ctx) { }

    @Override public void exitCommand(CSParser.CommandContext ctx) { }

    @Override public void enterCall(CSParser.CallContext ctx) { }

    @Override public void exitCall(CSParser.CallContext ctx) { }

    @Override public void enterNew_object(CSParser.New_objectContext ctx) { }

    @Override public void exitNew_object(CSParser.New_objectContext ctx) { }

    @Override public void enterDelete_object(CSParser.Delete_objectContext ctx) { }

    @Override public void exitDelete_object(CSParser.Delete_objectContext ctx) { }

    @Override public void enterOrigin_class(CSParser.Origin_classContext ctx) { }

    @Override public void exitOrigin_class(CSParser.Origin_classContext ctx) { }

    @Override public void enterParameters(CSParser.ParametersContext ctx) { }

    @Override public void exitParameters(CSParser.ParametersContext ctx) { }

    @Override public void enterArithmetic(CSParser.ArithmeticContext ctx) { }

    @Override public void exitArithmetic(CSParser.ArithmeticContext ctx) { }

    @Override public void enterOperand(CSParser.OperandContext ctx) { }

    @Override public void exitOperand(CSParser.OperandContext ctx) { }

    @Override public void enterAdd_operand(CSParser.Add_operandContext ctx) { }

    @Override public void exitAdd_operand(CSParser.Add_operandContext ctx) { }

    @Override public void enterAdd(CSParser.AddContext ctx) { }

    @Override public void exitAdd(CSParser.AddContext ctx) { }

    @Override public void enterSubtract(CSParser.SubtractContext ctx) { }

    @Override public void exitSubtract(CSParser.SubtractContext ctx) { }

    @Override public void enterMultiply(CSParser.MultiplyContext ctx) { }

    @Override public void exitMultiply(CSParser.MultiplyContext ctx) { }

    @Override public void enterDivide(CSParser.DivideContext ctx) { }

    @Override public void exitDivide(CSParser.DivideContext ctx) { }

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


    @Override public void enterEveryRule(ParserRuleContext ctx) { }

    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }


}