// Generated from CSParser.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACES=1, BOOL=2, BYTE=3, CHAR=4, CLASS=5, CONST=6, DECIMAL=7, DELETE=8, 
		DOUBLE=9, ELSE=10, FALSE=11, FLOAT=12, FOR=13, FOREACH=14, IF=15, INT=16, 
		INTERNAL=17, LONG=18, NAMESPACE=19, NEW=20, NULL=21, OBJECT=22, PRIVATE=23, 
		PROTECTED=24, PUBLIC=25, RETURN=26, SBYTE=27, SHORT=28, STATIC=29, STRING=30, 
		TRUE=31, UINT=32, ULONG=33, USHORT=34, USING=35, VAR=36, VOID=37, WHILE=38, 
		IN=39, SWITCH=40, CASE=41, DEFAULT=42, CONTINUE=43, BREAK=44, DO=45, DIGIT=46, 
		UNDERSCORE=47, STRING_LITERAL=48, IDENTIFIER=49, OPEN_BRACE=50, CLOSE_BRACE=51, 
		OPEN_BRACKET=52, CLOSE_BRACKET=53, OPEN_PARENS=54, CLOSE_PARENS=55, DOT=56, 
		COMMA=57, COLON=58, SEMICOLON=59, PLUS=60, MINUS=61, STAR=62, SLASH=63, 
		PERCENT=64, AMP=65, BITWISE_OR=66, CARET=67, BANG=68, TILDE=69, ASSIGNMENT=70, 
		LT=71, GT=72, INTERR=73, DOUBLE_COLON=74, OP_COALESCING=75, OP_INC=76, 
		OP_DEC=77, OP_AND=78, OP_OR=79, OP_PTR=80, OP_EQ=81, OP_NE=82, OP_LE=83, 
		OP_GE=84, OP_ADD_ASSIGNMENT=85, OP_SUB_ASSIGNMENT=86, OP_MULT_ASSIGNMENT=87, 
		OP_DIV_ASSIGNMENT=88, OP_MOD_ASSIGNMENT=89, OP_AND_ASSIGNMENT=90, OP_OR_ASSIGNMENT=91, 
		OP_XOR_ASSIGNMENT=92, OP_LEFT_SHIFT=93, OP_LEFT_SHIFT_ASSIGNMENT=94;
	public static final int
		RULE_entry_point = 0, RULE_source_file = 1, RULE_using_list = 2, RULE_using = 3, 
		RULE_namespace = 4, RULE_classdef = 5, RULE_class_access_m = 6, RULE_access_modifier = 7, 
		RULE_number = 8, RULE_integer = 9, RULE_floating = 10, RULE_identifier = 11, 
		RULE_constructor_access_m = 12, RULE_constructor = 13, RULE_assignment = 14, 
		RULE_field = 15, RULE_declaration = 16, RULE_local_declaration = 17, RULE_method_declaration = 18, 
		RULE_value = 19, RULE_type = 20, RULE_method = 21, RULE_paramedefs = 22, 
		RULE_return_com = 23, RULE_control_statement = 24, RULE_command_void = 25, 
		RULE_constructor_command = 26, RULE_command = 27, RULE_call = 28, RULE_new_object = 29, 
		RULE_delete_object = 30, RULE_origin_class = 31, RULE_parameters = 32, 
		RULE_arithmetic = 33, RULE_operand = 34, RULE_add_operand = 35, RULE_add = 36, 
		RULE_subtract = 37, RULE_multiply = 38, RULE_divide = 39, RULE_greater_than = 40, 
		RULE_lesser_than = 41, RULE_greater_or_equal = 42, RULE_lesser_or_equal = 43, 
		RULE_equal = 44, RULE_not_equal = 45, RULE_comparison = 46, RULE_logical_operand = 47, 
		RULE_conjunction = 48, RULE_alternative = 49, RULE_negation = 50, RULE_logical_operator = 51, 
		RULE_condition = 52, RULE_while_loop = 53, RULE_do_while_loop = 54, RULE_for_loop = 55, 
		RULE_if_cond = 56, RULE_else_cond = 57, RULE_foreach = 58, RULE_switch_cond = 59, 
		RULE_pre_increment = 60, RULE_post_increment = 61, RULE_pre_decrement = 62, 
		RULE_post_decrement = 63, RULE_in_decrement = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"entry_point", "source_file", "using_list", "using", "namespace", "classdef", 
			"class_access_m", "access_modifier", "number", "integer", "floating", 
			"identifier", "constructor_access_m", "constructor", "assignment", "field", 
			"declaration", "local_declaration", "method_declaration", "value", "type", 
			"method", "paramedefs", "return_com", "control_statement", "command_void", 
			"constructor_command", "command", "call", "new_object", "delete_object", 
			"origin_class", "parameters", "arithmetic", "operand", "add_operand", 
			"add", "subtract", "multiply", "divide", "greater_than", "lesser_than", 
			"greater_or_equal", "lesser_or_equal", "equal", "not_equal", "comparison", 
			"logical_operand", "conjunction", "alternative", "negation", "logical_operator", 
			"condition", "while_loop", "do_while_loop", "for_loop", "if_cond", "else_cond", 
			"foreach", "switch_cond", "pre_increment", "post_increment", "pre_decrement", 
			"post_decrement", "in_decrement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'bool'", "'byte'", "'char'", "'class'", "'const'", "'decimal'", 
			"'delete'", "'double'", "'else'", "'false'", "'float'", "'for'", "'foreach'", 
			"'if'", "'int'", "'internal'", "'long'", "'namespace'", "'new'", "'null'", 
			"'object'", "'private'", "'protected'", "'public'", "'return'", "'sbyte'", 
			"'short'", "'static'", "'string'", "'true'", "'uint'", "'ulong'", "'ushort'", 
			"'using'", "'var'", "'void'", "'while'", "'in'", "'switch'", "'case'", 
			"'default'", "'continue'", "'break'", "'do'", null, "'_'", null, null, 
			"'{'", "'}'", "'['", "']'", "'('", "')'", "'.'", "','", "':'", "';'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", "'~'", 
			"'='", "'<'", "'>'", "'?'", "'::'", "'??'", "'++'", "'--'", "'&&'", "'||'", 
			"'->'", "'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'&='", "'|='", "'^='", "'<<'", "'<<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACES", "BOOL", "BYTE", "CHAR", "CLASS", "CONST", "DECIMAL", 
			"DELETE", "DOUBLE", "ELSE", "FALSE", "FLOAT", "FOR", "FOREACH", "IF", 
			"INT", "INTERNAL", "LONG", "NAMESPACE", "NEW", "NULL", "OBJECT", "PRIVATE", 
			"PROTECTED", "PUBLIC", "RETURN", "SBYTE", "SHORT", "STATIC", "STRING", 
			"TRUE", "UINT", "ULONG", "USHORT", "USING", "VAR", "VOID", "WHILE", "IN", 
			"SWITCH", "CASE", "DEFAULT", "CONTINUE", "BREAK", "DO", "DIGIT", "UNDERSCORE", 
			"STRING_LITERAL", "IDENTIFIER", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_PARENS", "CLOSE_PARENS", "DOT", "COMMA", "COLON", 
			"SEMICOLON", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "AMP", "BITWISE_OR", 
			"CARET", "BANG", "TILDE", "ASSIGNMENT", "LT", "GT", "INTERR", "DOUBLE_COLON", 
			"OP_COALESCING", "OP_INC", "OP_DEC", "OP_AND", "OP_OR", "OP_PTR", "OP_EQ", 
			"OP_NE", "OP_LE", "OP_GE", "OP_ADD_ASSIGNMENT", "OP_SUB_ASSIGNMENT", 
			"OP_MULT_ASSIGNMENT", "OP_DIV_ASSIGNMENT", "OP_MOD_ASSIGNMENT", "OP_AND_ASSIGNMENT", 
			"OP_OR_ASSIGNMENT", "OP_XOR_ASSIGNMENT", "OP_LEFT_SHIFT", "OP_LEFT_SHIFT_ASSIGNMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Entry_pointContext extends ParserRuleContext {
		public Source_fileContext source_file() {
			return getRuleContext(Source_fileContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CSParser.EOF, 0); }
		public Entry_pointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterEntry_point(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitEntry_point(this);
		}
	}

	public final Entry_pointContext entry_point() throws RecognitionException {
		Entry_pointContext _localctx = new Entry_pointContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entry_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			source_file();
			setState(131);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_fileContext extends ParserRuleContext {
		public Using_listContext using_list() {
			return getRuleContext(Using_listContext.class,0);
		}
		public List<NamespaceContext> namespace() {
			return getRuleContexts(NamespaceContext.class);
		}
		public NamespaceContext namespace(int i) {
			return getRuleContext(NamespaceContext.class,i);
		}
		public Source_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterSource_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitSource_file(this);
		}
	}

	public final Source_fileContext source_file() throws RecognitionException {
		Source_fileContext _localctx = new Source_fileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_source_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			using_list();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAMESPACE) {
				{
				{
				setState(134);
				namespace();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_listContext extends ParserRuleContext {
		public List<UsingContext> using() {
			return getRuleContexts(UsingContext.class);
		}
		public UsingContext using(int i) {
			return getRuleContext(UsingContext.class,i);
		}
		public Using_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterUsing_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitUsing_list(this);
		}
	}

	public final Using_listContext using_list() throws RecognitionException {
		Using_listContext _localctx = new Using_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_using_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USING) {
				{
				{
				setState(140);
				using();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(CSParser.USING, 0); }
		public Origin_classContext origin_class() {
			return getRuleContext(Origin_classContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSParser.SEMICOLON, 0); }
		public UsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitUsing(this);
		}
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_using);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(USING);
			setState(147);
			origin_class();
			setState(148);
			identifier();
			setState(149);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(CSParser.NAMESPACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSParser.CLOSE_BRACE, 0); }
		public List<ClassdefContext> classdef() {
			return getRuleContexts(ClassdefContext.class);
		}
		public ClassdefContext classdef(int i) {
			return getRuleContext(ClassdefContext.class,i);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(NAMESPACE);
			setState(152);
			identifier();
			setState(153);
			match(OPEN_BRACE);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERNAL) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
				{
				{
				setState(154);
				classdef();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassdefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CSParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSParser.CLOSE_BRACE, 0); }
		public Class_access_mContext class_access_m() {
			return getRuleContext(Class_access_mContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(CSParser.STATIC, 0); }
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitClassdef(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERNAL || _la==PUBLIC) {
				{
				setState(162);
				class_access_m();
				}
			}

			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(165);
				match(STATIC);
				}
			}

			setState(168);
			match(CLASS);
			setState(169);
			identifier();
			setState(170);
			match(OPEN_BRACE);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << INTERNAL) | (1L << LONG) | (1L << OBJECT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SBYTE) | (1L << SHORT) | (1L << STATIC) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VOID))) != 0)) {
				{
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(171);
					constructor();
					}
					break;
				case 2:
					{
					setState(172);
					field();
					}
					break;
				case 3:
					{
					setState(173);
					method();
					}
					break;
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_access_mContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(CSParser.PUBLIC, 0); }
		public TerminalNode INTERNAL() { return getToken(CSParser.INTERNAL, 0); }
		public Class_access_mContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_access_m; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterClass_access_m(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitClass_access_m(this);
		}
	}

	public final Class_access_mContext class_access_m() throws RecognitionException {
		Class_access_mContext _localctx = new Class_access_mContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_access_m);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==INTERNAL || _la==PUBLIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_modifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(CSParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(CSParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(CSParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(CSParser.INTERNAL, 0); }
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterAccess_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitAccess_modifier(this);
		}
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_access_modifier);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==PRIVATE || _la==PUBLIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE) {
					{
					setState(184);
					match(PRIVATE);
					}
				}

				setState(187);
				match(PROTECTED);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROTECTED) {
					{
					setState(188);
					match(PROTECTED);
					}
				}

				setState(191);
				match(INTERNAL);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FloatingContext floating() {
			return getRuleContext(FloatingContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CSParser.MINUS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(194);
				match(MINUS);
				}
			}

			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(197);
				integer();
				}
				break;
			case 2:
				{
				setState(198);
				floating();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(CSParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(CSParser.DIGIT, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				match(DIGIT);
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingContext extends ParserRuleContext {
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public TerminalNode DOT() { return getToken(CSParser.DOT, 0); }
		public FloatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterFloating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitFloating(this);
		}
	}

	public final FloatingContext floating() throws RecognitionException {
		FloatingContext _localctx = new FloatingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_floating);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			integer();
			setState(207);
			match(DOT);
			setState(208);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CSParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_access_mContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(CSParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(CSParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(CSParser.STATIC, 0); }
		public Constructor_access_mContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_access_m; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterConstructor_access_m(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitConstructor_access_m(this);
		}
	}

	public final Constructor_access_mContext constructor_access_m() throws RecognitionException {
		Constructor_access_mContext _localctx = new Constructor_access_mContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constructor_access_m);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public Constructor_access_mContext constructor_access_m() {
			return getRuleContext(Constructor_access_mContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSParser.OPEN_PARENS, 0); }
		public ParamedefsContext paramedefs() {
			return getRuleContext(ParamedefsContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSParser.CLOSE_PARENS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSParser.OPEN_BRACE, 0); }
		public Constructor_commandContext constructor_command() {
			return getRuleContext(Constructor_commandContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSParser.CLOSE_BRACE, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			constructor_access_m();
			setState(215);
			identifier();
			setState(216);
			match(OPEN_PARENS);
			setState(217);
			paramedefs();
			setState(218);
			match(CLOSE_PARENS);
			setState(219);
			match(OPEN_BRACE);
			setState(220);
			constructor_command();
			setState(221);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(CSParser.ASSIGNMENT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ASSIGNMENT);
			setState(224);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSParser.SEMICOLON, 0); }
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(CSParser.STATIC, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTERNAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(226);
				access_modifier();
				}
			}

			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(229);
				match(STATIC);
				}
			}

			setState(232);
			declaration();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(233);
				assignment();
				}
			}

			setState(236);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			type();
			setState(239);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(CSParser.VAR, 0); }
		public Local_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterLocal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitLocal_declaration(this);
		}
	}

	public final Local_declarationContext local_declaration() throws RecognitionException {
		Local_declarationContext _localctx = new Local_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_local_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case OBJECT:
			case SBYTE:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
				{
				setState(241);
				type();
				}
				break;
			case VAR:
				{
				setState(242);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(245);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSParser.VOID, 0); }
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitMethod_declaration(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case OBJECT:
			case SBYTE:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
				{
				setState(247);
				type();
				}
				break;
			case VOID:
				{
				setState(248);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(251);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(CSParser.STRING_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(CSParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(CSParser.NULL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public New_objectContext new_object() {
			return getRuleContext(New_objectContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(253);
				number();
				}
				break;
			case 2:
				{
				setState(254);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(255);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(256);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(257);
				match(NULL);
				}
				break;
			case 6:
				{
				setState(258);
				identifier();
				}
				break;
			case 7:
				{
				setState(259);
				new_object();
				}
				break;
			case 8:
				{
				setState(260);
				arithmetic();
				}
				break;
			case 9:
				{
				setState(261);
				call();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(CSParser.BOOL, 0); }
		public TerminalNode BYTE() { return getToken(CSParser.BYTE, 0); }
		public TerminalNode CHAR() { return getToken(CSParser.CHAR, 0); }
		public TerminalNode DECIMAL() { return getToken(CSParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(CSParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(CSParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(CSParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CSParser.LONG, 0); }
		public TerminalNode OBJECT() { return getToken(CSParser.OBJECT, 0); }
		public TerminalNode SBYTE() { return getToken(CSParser.SBYTE, 0); }
		public TerminalNode SHORT() { return getToken(CSParser.SHORT, 0); }
		public TerminalNode STRING() { return getToken(CSParser.STRING, 0); }
		public TerminalNode UINT() { return getToken(CSParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(CSParser.ULONG, 0); }
		public TerminalNode USHORT() { return getToken(CSParser.USHORT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSParser.CLOSE_PARENS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSParser.CLOSE_BRACE, 0); }
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(CSParser.STATIC, 0); }
		public ParamedefsContext paramedefs() {
			return getRuleContext(ParamedefsContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTERNAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(266);
				access_modifier();
				}
			}

			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(269);
				match(STATIC);
				}
			}

			setState(272);
			method_declaration();
			setState(273);
			match(OPEN_PARENS);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT))) != 0)) {
				{
				setState(274);
				paramedefs();
				}
			}

			setState(277);
			match(CLOSE_PARENS);
			setState(278);
			match(OPEN_BRACE);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC) {
				{
				{
				setState(279);
				command();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamedefsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSParser.COMMA, i);
		}
		public ParamedefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramedefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterParamedefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitParamedefs(this);
		}
	}

	public final ParamedefsContext paramedefs() throws RecognitionException {
		ParamedefsContext _localctx = new ParamedefsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_paramedefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			declaration();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(288);
				match(COMMA);
				setState(289);
				declaration();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_comContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CSParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Return_comContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_com; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterReturn_com(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitReturn_com(this);
		}
	}

	public final Return_comContext return_com() throws RecognitionException {
		Return_comContext _localctx = new Return_comContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_return_com);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(RETURN);
			setState(296);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Control_statementContext extends ParserRuleContext {
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public Switch_condContext switch_cond() {
			return getRuleContext(Switch_condContext.class,0);
		}
		public Control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterControl_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitControl_statement(this);
		}
	}

	public final Control_statementContext control_statement() throws RecognitionException {
		Control_statementContext _localctx = new Control_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_control_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(298);
				if_cond();
				}
				break;
			case FOR:
				{
				setState(299);
				for_loop();
				}
				break;
			case FOREACH:
				{
				setState(300);
				foreach();
				}
				break;
			case WHILE:
				{
				setState(301);
				while_loop();
				}
				break;
			case DO:
				{
				setState(302);
				do_while_loop();
				}
				break;
			case SWITCH:
				{
				setState(303);
				switch_cond();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Command_voidContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public In_decrementContext in_decrement() {
			return getRuleContext(In_decrementContext.class,0);
		}
		public Local_declarationContext local_declaration() {
			return getRuleContext(Local_declarationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Delete_objectContext delete_object() {
			return getRuleContext(Delete_objectContext.class,0);
		}
		public Command_voidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_void; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterCommand_void(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitCommand_void(this);
		}
	}

	public final Command_voidContext command_void() throws RecognitionException {
		Command_voidContext _localctx = new Command_voidContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_command_void);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(306);
				call();
				}
				break;
			case 2:
				{
				setState(307);
				in_decrement();
				}
				break;
			case 3:
				{
				setState(308);
				local_declaration();
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(309);
					assignment();
					}
				}

				}
				break;
			case 4:
				{
				setState(312);
				identifier();
				setState(313);
				assignment();
				}
				break;
			case 5:
				{
				setState(315);
				delete_object();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_commandContext extends ParserRuleContext {
		public Command_voidContext command_void() {
			return getRuleContext(Command_voidContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSParser.SEMICOLON, 0); }
		public Control_statementContext control_statement() {
			return getRuleContext(Control_statementContext.class,0);
		}
		public Constructor_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterConstructor_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitConstructor_command(this);
		}
	}

	public final Constructor_commandContext constructor_command() throws RecognitionException {
		Constructor_commandContext _localctx = new Constructor_commandContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constructor_command);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DELETE:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case OBJECT:
			case SBYTE:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case IDENTIFIER:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(318);
				command_void();
				setState(319);
				match(SEMICOLON);
				}
				}
				break;
			case FOR:
			case FOREACH:
			case IF:
			case WHILE:
			case SWITCH:
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CSParser.SEMICOLON, 0); }
		public Control_statementContext control_statement() {
			return getRuleContext(Control_statementContext.class,0);
		}
		public Command_voidContext command_void() {
			return getRuleContext(Command_voidContext.class,0);
		}
		public Return_comContext return_com() {
			return getRuleContext(Return_comContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DELETE:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case OBJECT:
			case RETURN:
			case SBYTE:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case IDENTIFIER:
			case OP_INC:
			case OP_DEC:
				{
				setState(326);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DELETE:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case OBJECT:
				case SBYTE:
				case SHORT:
				case STRING:
				case UINT:
				case ULONG:
				case USHORT:
				case VAR:
				case IDENTIFIER:
				case OP_INC:
				case OP_DEC:
					{
					setState(324);
					command_void();
					}
					break;
				case RETURN:
					{
					setState(325);
					return_com();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(328);
				match(SEMICOLON);
				}
				break;
			case FOR:
			case FOREACH:
			case IF:
			case WHILE:
			case SWITCH:
			case DO:
				{
				setState(330);
				control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public Origin_classContext origin_class() {
			return getRuleContext(Origin_classContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSParser.CLOSE_PARENS, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			origin_class();
			setState(334);
			identifier();
			setState(335);
			match(OPEN_PARENS);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << DIGIT) | (1L << STRING_LITERAL) | (1L << IDENTIFIER) | (1L << OPEN_PARENS) | (1L << MINUS))) != 0)) {
				{
				setState(336);
				parameters();
				}
			}

			setState(339);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_objectContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CSParser.NEW, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public New_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterNew_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitNew_object(this);
		}
	}

	public final New_objectContext new_object() throws RecognitionException {
		New_objectContext _localctx = new New_objectContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_new_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(NEW);
			setState(342);
			call();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_objectContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(CSParser.DELETE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Delete_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterDelete_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitDelete_object(this);
		}
	}

	public final Delete_objectContext delete_object() throws RecognitionException {
		Delete_objectContext _localctx = new Delete_objectContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_delete_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(DELETE);
			setState(345);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Origin_classContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CSParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CSParser.DOT, i);
		}
		public Origin_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origin_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterOrigin_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitOrigin_class(this);
		}
	}

	public final Origin_classContext origin_class() throws RecognitionException {
		Origin_classContext _localctx = new Origin_classContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_origin_class);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(347);
					identifier();
					setState(348);
					match(DOT);
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			value();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(356);
				match(COMMA);
				setState(357);
				value();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubtractContext subtract() {
			return getRuleContext(SubtractContext.class,0);
		}
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitArithmetic(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arithmetic);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				add();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				subtract();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				multiply();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				divide();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSParser.CLOSE_PARENS, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operand);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case IDENTIFIER:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(369);
					number();
					}
					break;
				case 2:
					{
					setState(370);
					identifier();
					}
					break;
				case 3:
					{
					setState(371);
					call();
					}
					break;
				}
				}
				break;
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(374);
				match(OPEN_PARENS);
				setState(378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(375);
					number();
					}
					break;
				case 2:
					{
					setState(376);
					identifier();
					}
					break;
				case 3:
					{
					setState(377);
					call();
					}
					break;
				}
				setState(380);
				match(CLOSE_PARENS);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_operandContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(CSParser.STRING_LITERAL, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Add_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterAdd_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitAdd_operand(this);
		}
	}

	public final Add_operandContext add_operand() throws RecognitionException {
		Add_operandContext _localctx = new Add_operandContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_add_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(384);
				operand();
				}
				break;
			case 2:
				{
				setState(385);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(386);
				call();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddContext extends ParserRuleContext {
		public List<Add_operandContext> add_operand() {
			return getRuleContexts(Add_operandContext.class);
		}
		public Add_operandContext add_operand(int i) {
			return getRuleContext(Add_operandContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CSParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CSParser.PLUS, i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			add_operand();
			setState(390);
			match(PLUS);
			setState(391);
			add_operand();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(392);
				match(PLUS);
				setState(393);
				add_operand();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubtractContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CSParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CSParser.MINUS, i);
		}
		public SubtractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitSubtract(this);
		}
	}

	public final SubtractContext subtract() throws RecognitionException {
		SubtractContext _localctx = new SubtractContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_subtract);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			operand();
			setState(400);
			match(MINUS);
			setState(401);
			operand();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(402);
				match(MINUS);
				setState(403);
				operand();
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplyContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(CSParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(CSParser.STAR, i);
		}
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitMultiply(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			operand();
			setState(410);
			match(STAR);
			setState(411);
			operand();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR) {
				{
				{
				setState(412);
				match(STAR);
				setState(413);
				operand();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivideContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(CSParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(CSParser.SLASH, i);
		}
		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitDivide(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_divide);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			operand();
			setState(420);
			match(SLASH);
			setState(421);
			operand();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(422);
				match(SLASH);
				setState(423);
				operand();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Greater_thanContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode GT() { return getToken(CSParser.GT, 0); }
		public Greater_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterGreater_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitGreater_than(this);
		}
	}

	public final Greater_thanContext greater_than() throws RecognitionException {
		Greater_thanContext _localctx = new Greater_thanContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_greater_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			operand();
			setState(430);
			match(GT);
			setState(431);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lesser_thanContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode LT() { return getToken(CSParser.LT, 0); }
		public Lesser_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterLesser_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitLesser_than(this);
		}
	}

	public final Lesser_thanContext lesser_than() throws RecognitionException {
		Lesser_thanContext _localctx = new Lesser_thanContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lesser_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			operand();
			setState(434);
			match(LT);
			setState(435);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Greater_or_equalContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode OP_LE() { return getToken(CSParser.OP_LE, 0); }
		public Greater_or_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_or_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterGreater_or_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitGreater_or_equal(this);
		}
	}

	public final Greater_or_equalContext greater_or_equal() throws RecognitionException {
		Greater_or_equalContext _localctx = new Greater_or_equalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_greater_or_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			operand();
			setState(438);
			match(OP_LE);
			setState(439);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lesser_or_equalContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode OP_GE() { return getToken(CSParser.OP_GE, 0); }
		public Lesser_or_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser_or_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterLesser_or_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitLesser_or_equal(this);
		}
	}

	public final Lesser_or_equalContext lesser_or_equal() throws RecognitionException {
		Lesser_or_equalContext _localctx = new Lesser_or_equalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lesser_or_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			operand();
			setState(442);
			match(OP_GE);
			setState(443);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualContext extends ParserRuleContext {
		public TerminalNode OP_EQ() { return getToken(CSParser.OP_EQ, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> TRUE() { return getTokens(CSParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(CSParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(CSParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(CSParser.FALSE, i);
		}
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case IDENTIFIER:
			case OPEN_PARENS:
			case MINUS:
				{
				setState(445);
				operand();
				}
				break;
			case TRUE:
				{
				setState(446);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(447);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(450);
			match(OP_EQ);
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case IDENTIFIER:
			case OPEN_PARENS:
			case MINUS:
				{
				setState(451);
				operand();
				}
				break;
			case TRUE:
				{
				setState(452);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(453);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_equalContext extends ParserRuleContext {
		public TerminalNode OP_NE() { return getToken(CSParser.OP_NE, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> TRUE() { return getTokens(CSParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(CSParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(CSParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(CSParser.FALSE, i);
		}
		public Not_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterNot_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitNot_equal(this);
		}
	}

	public final Not_equalContext not_equal() throws RecognitionException {
		Not_equalContext _localctx = new Not_equalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_not_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case IDENTIFIER:
			case OPEN_PARENS:
			case MINUS:
				{
				setState(456);
				operand();
				}
				break;
			case TRUE:
				{
				setState(457);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(458);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(461);
			match(OP_NE);
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case IDENTIFIER:
			case OPEN_PARENS:
			case MINUS:
				{
				setState(462);
				operand();
				}
				break;
			case TRUE:
				{
				setState(463);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(464);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public Greater_or_equalContext greater_or_equal() {
			return getRuleContext(Greater_or_equalContext.class,0);
		}
		public Lesser_or_equalContext lesser_or_equal() {
			return getRuleContext(Lesser_or_equalContext.class,0);
		}
		public Greater_thanContext greater_than() {
			return getRuleContext(Greater_thanContext.class,0);
		}
		public Lesser_thanContext lesser_than() {
			return getRuleContext(Lesser_thanContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public Not_equalContext not_equal() {
			return getRuleContext(Not_equalContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_comparison);
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				greater_or_equal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				lesser_or_equal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				greater_than();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				lesser_than();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(471);
				equal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(472);
				not_equal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_operandContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(CSParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSParser.FALSE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSParser.CLOSE_PARENS, 0); }
		public Logical_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterLogical_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitLogical_operand(this);
		}
	}

	public final Logical_operandContext logical_operand() throws RecognitionException {
		Logical_operandContext _localctx = new Logical_operandContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_logical_operand);
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(475);
					call();
					}
					break;
				case 2:
					{
					setState(476);
					identifier();
					}
					break;
				case 3:
					{
					setState(477);
					comparison();
					}
					break;
				case 4:
					{
					setState(478);
					match(TRUE);
					}
					break;
				case 5:
					{
					setState(479);
					match(FALSE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(482);
				match(OPEN_PARENS);
				setState(488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(483);
					call();
					}
					break;
				case 2:
					{
					setState(484);
					identifier();
					}
					break;
				case 3:
					{
					setState(485);
					comparison();
					}
					break;
				case 4:
					{
					setState(486);
					match(TRUE);
					}
					break;
				case 5:
					{
					setState(487);
					match(FALSE);
					}
					break;
				}
				setState(490);
				match(CLOSE_PARENS);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionContext extends ParserRuleContext {
		public List<Logical_operandContext> logical_operand() {
			return getRuleContexts(Logical_operandContext.class);
		}
		public Logical_operandContext logical_operand(int i) {
			return getRuleContext(Logical_operandContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(CSParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(CSParser.OP_AND, i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			logical_operand();
			setState(494);
			match(OP_AND);
			setState(495);
			logical_operand();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				setState(496);
				match(OP_AND);
				setState(497);
				logical_operand();
				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlternativeContext extends ParserRuleContext {
		public List<Logical_operandContext> logical_operand() {
			return getRuleContexts(Logical_operandContext.class);
		}
		public Logical_operandContext logical_operand(int i) {
			return getRuleContext(Logical_operandContext.class,i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(CSParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(CSParser.OP_OR, i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitAlternative(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			logical_operand();
			setState(504);
			match(OP_OR);
			setState(505);
			logical_operand();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(506);
				match(OP_OR);
				setState(507);
				logical_operand();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegationContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(CSParser.BANG, 0); }
		public Logical_operandContext logical_operand() {
			return getRuleContext(Logical_operandContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitNegation(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(BANG);
			setState(514);
			logical_operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_operatorContext extends ParserRuleContext {
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public AlternativeContext alternative() {
			return getRuleContext(AlternativeContext.class,0);
		}
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitLogical_operator(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_logical_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(516);
				conjunction();
				}
				break;
			case 2:
				{
				setState(517);
				alternative();
				}
				break;
			case 3:
				{
				setState(518);
				negation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public Logical_operandContext logical_operand() {
			return getRuleContext(Logical_operandContext.class,0);
		}
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_condition);
		try {
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				logical_operand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				logical_operator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CSParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSParser.OPEN_PARENS, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSParser.CLOSE_PARENS, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSParser.CLOSE_BRACE, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(WHILE);
			setState(526);
			match(OPEN_PARENS);
			setState(527);
			condition();
			setState(528);
			match(CLOSE_PARENS);
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				{
				setState(529);
				match(OPEN_BRACE);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC) {
					{
					{
					setState(530);
					command();
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536);
				match(CLOSE_BRACE);
				}
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DELETE:
			case DOUBLE:
			case FLOAT:
			case FOR:
			case FOREACH:
			case IF:
			case INT:
			case LONG:
			case OBJECT:
			case RETURN:
			case SBYTE:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case WHILE:
			case SWITCH:
			case DO:
			case IDENTIFIER:
			case OP_INC:
			case OP_DEC:
				{
				setState(537);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CSParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(CSParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSParser.OPEN_PARENS, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSParser.CLOSE_PARENS, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSParser.CLOSE_BRACE, 0); }
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterDo_while_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitDo_while_loop(this);
		}
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_do_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(DO);
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				{
				setState(541);
				match(OPEN_BRACE);
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC) {
					{
					{
					setState(542);
					command();
					}
					}
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(548);
				match(CLOSE_BRACE);
				}
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DELETE:
			case DOUBLE:
			case FLOAT:
			case FOR:
			case FOREACH:
			case IF:
			case INT:
			case LONG:
			case OBJECT:
			case RETURN:
			case SBYTE:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case WHILE:
			case SWITCH:
			case DO:
			case IDENTIFIER:
			case OP_INC:
			case OP_DEC:
				{
				setState(549);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(552);
			match(WHILE);
			setState(553);
			match(OPEN_PARENS);
			setState(554);
			condition();
			setState(555);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CSParser.FOR, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSParser.OPEN_PARENS, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CSParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSParser.SEMICOLON, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSParser.CLOSE_PARENS, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public In_decrementContext in_decrement() {
			return getRuleContext(In_decrementContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSParser.CLOSE_BRACE, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(FOR);
			setState(558);
			match(OPEN_PARENS);
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case OBJECT:
			case SBYTE:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
				{
				setState(559);
				declaration();
				}
				break;
			case IDENTIFIER:
				{
				setState(560);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(563);
			assignment();
			setState(564);
			match(SEMICOLON);
			setState(565);
			condition();
			setState(566);
			match(SEMICOLON);
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(567);
				identifier();
				setState(568);
				assignment();
				}
				break;
			case 2:
				{
				setState(570);
				call();
				}
				break;
			case 3:
				{
				setState(571);
				in_decrement();
				}
				break;
			}
			setState(574);
			match(CLOSE_PARENS);
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				{
				setState(575);
				match(OPEN_BRACE);
				setState(577); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(576);
					command();
					}
					}
					setState(579); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC );
				setState(581);
				match(CLOSE_BRACE);
				}
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DELETE:
			case DOUBLE:
			case FLOAT:
			case FOR:
			case FOREACH:
			case IF:
			case INT:
			case LONG:
			case OBJECT:
			case RETURN:
			case SBYTE:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case WHILE:
			case SWITCH:
			case DO:
			case IDENTIFIER:
			case OP_INC:
			case OP_DEC:
				{
				setState(583);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_condContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CSParser.IF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSParser.OPEN_PARENS, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSParser.CLOSE_PARENS, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Else_condContext else_cond() {
			return getRuleContext(Else_condContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSParser.CLOSE_BRACE, 0); }
		public If_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterIf_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitIf_cond(this);
		}
	}

	public final If_condContext if_cond() throws RecognitionException {
		If_condContext _localctx = new If_condContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_if_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(IF);
			setState(587);
			match(OPEN_PARENS);
			setState(588);
			condition();
			setState(589);
			match(CLOSE_PARENS);
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				{
				setState(590);
				match(OPEN_BRACE);
				setState(592); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(591);
					command();
					}
					}
					setState(594); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC );
				setState(596);
				match(CLOSE_BRACE);
				}
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DELETE:
			case DOUBLE:
			case FLOAT:
			case FOR:
			case FOREACH:
			case IF:
			case INT:
			case LONG:
			case OBJECT:
			case RETURN:
			case SBYTE:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case WHILE:
			case SWITCH:
			case DO:
			case IDENTIFIER:
			case OP_INC:
			case OP_DEC:
				{
				setState(598);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(601);
				else_cond();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_condContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CSParser.ELSE, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSParser.CLOSE_BRACE, 0); }
		public Else_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterElse_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitElse_cond(this);
		}
	}

	public final Else_condContext else_cond() throws RecognitionException {
		Else_condContext _localctx = new Else_condContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_else_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(ELSE);
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				{
				setState(605);
				match(OPEN_BRACE);
				setState(607); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(606);
					command();
					}
					}
					setState(609); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC );
				setState(611);
				match(CLOSE_BRACE);
				}
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DELETE:
			case DOUBLE:
			case FLOAT:
			case FOR:
			case FOREACH:
			case IF:
			case INT:
			case LONG:
			case OBJECT:
			case RETURN:
			case SBYTE:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case WHILE:
			case SWITCH:
			case DO:
			case IDENTIFIER:
			case OP_INC:
			case OP_DEC:
				{
				setState(613);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(CSParser.FOREACH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSParser.OPEN_PARENS, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(CSParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSParser.CLOSE_PARENS, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSParser.CLOSE_BRACE, 0); }
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitForeach(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_foreach);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(FOREACH);
			setState(617);
			match(OPEN_PARENS);
			setState(618);
			declaration();
			setState(619);
			match(IN);
			setState(620);
			identifier();
			setState(621);
			match(CLOSE_PARENS);
			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				{
				setState(622);
				match(OPEN_BRACE);
				setState(624); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(623);
					command();
					}
					}
					setState(626); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC );
				setState(628);
				match(CLOSE_BRACE);
				}
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DELETE:
			case DOUBLE:
			case FLOAT:
			case FOR:
			case FOREACH:
			case IF:
			case INT:
			case LONG:
			case OBJECT:
			case RETURN:
			case SBYTE:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case WHILE:
			case SWITCH:
			case DO:
			case IDENTIFIER:
			case OP_INC:
			case OP_DEC:
				{
				setState(630);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_condContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(CSParser.SWITCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSParser.OPEN_PARENS, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSParser.CLOSE_PARENS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> CASE() { return getTokens(CSParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(CSParser.CASE, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(CSParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CSParser.COLON, i);
		}
		public TerminalNode DEFAULT() { return getToken(CSParser.DEFAULT, 0); }
		public List<TerminalNode> BREAK() { return getTokens(CSParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(CSParser.BREAK, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CSParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSParser.SEMICOLON, i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Switch_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterSwitch_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitSwitch_cond(this);
		}
	}

	public final Switch_condContext switch_cond() throws RecognitionException {
		Switch_condContext _localctx = new Switch_condContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_switch_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(SWITCH);
			setState(634);
			match(OPEN_PARENS);
			setState(635);
			operand();
			setState(636);
			match(CLOSE_PARENS);
			setState(637);
			match(OPEN_BRACE);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(638);
				match(CASE);
				setState(639);
				value();
				setState(640);
				match(COLON);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC) {
					{
					{
					setState(641);
					command();
					}
					}
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(647);
					match(BREAK);
					setState(648);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(656);
				match(DEFAULT);
				setState(657);
				match(COLON);
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC) {
					{
					{
					setState(658);
					command();
					}
					}
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(664);
				match(BREAK);
				setState(665);
				match(SEMICOLON);
				}
				}
			}

			setState(668);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_incrementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OP_INC() { return getToken(CSParser.OP_INC, 0); }
		public Pre_incrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterPre_increment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitPre_increment(this);
		}
	}

	public final Pre_incrementContext pre_increment() throws RecognitionException {
		Pre_incrementContext _localctx = new Pre_incrementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_pre_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			identifier();
			setState(671);
			match(OP_INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Post_incrementContext extends ParserRuleContext {
		public TerminalNode OP_INC() { return getToken(CSParser.OP_INC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Post_incrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterPost_increment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitPost_increment(this);
		}
	}

	public final Post_incrementContext post_increment() throws RecognitionException {
		Post_incrementContext _localctx = new Post_incrementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_post_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(OP_INC);
			setState(674);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_decrementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OP_DEC() { return getToken(CSParser.OP_DEC, 0); }
		public Pre_decrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterPre_decrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitPre_decrement(this);
		}
	}

	public final Pre_decrementContext pre_decrement() throws RecognitionException {
		Pre_decrementContext _localctx = new Pre_decrementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_pre_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			identifier();
			setState(677);
			match(OP_DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Post_decrementContext extends ParserRuleContext {
		public TerminalNode OP_DEC() { return getToken(CSParser.OP_DEC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Post_decrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterPost_decrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitPost_decrement(this);
		}
	}

	public final Post_decrementContext post_decrement() throws RecognitionException {
		Post_decrementContext _localctx = new Post_decrementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_post_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(OP_DEC);
			setState(680);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_decrementContext extends ParserRuleContext {
		public Pre_incrementContext pre_increment() {
			return getRuleContext(Pre_incrementContext.class,0);
		}
		public Post_incrementContext post_increment() {
			return getRuleContext(Post_incrementContext.class,0);
		}
		public Pre_decrementContext pre_decrement() {
			return getRuleContext(Pre_decrementContext.class,0);
		}
		public Post_decrementContext post_decrement() {
			return getRuleContext(Post_decrementContext.class,0);
		}
		public In_decrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).enterIn_decrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSParserListener ) ((CSParserListener)listener).exitIn_decrement(this);
		}
	}

	public final In_decrementContext in_decrement() throws RecognitionException {
		In_decrementContext _localctx = new In_decrementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_in_decrement);
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				pre_increment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				post_increment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(684);
				pre_decrement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(685);
				post_decrement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3`\u02b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\3\3\3\7\3\u008a\n\3\f\3\16"+
		"\3\u008d\13\3\3\4\7\4\u0090\n\4\f\4\16\4\u0093\13\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\7\6\u009e\n\6\f\6\16\6\u00a1\13\6\3\6\3\6\3\7\5\7\u00a6"+
		"\n\7\3\7\5\7\u00a9\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b1\n\7\f\7\16\7"+
		"\u00b4\13\7\3\7\3\7\3\b\3\b\3\t\3\t\5\t\u00bc\n\t\3\t\3\t\5\t\u00c0\n"+
		"\t\3\t\5\t\u00c3\n\t\3\n\5\n\u00c6\n\n\3\n\3\n\5\n\u00ca\n\n\3\13\6\13"+
		"\u00cd\n\13\r\13\16\13\u00ce\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\5\21\u00e6"+
		"\n\21\3\21\5\21\u00e9\n\21\3\21\3\21\5\21\u00ed\n\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\5\23\u00f6\n\23\3\23\3\23\3\24\3\24\5\24\u00fc\n\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0109\n\25"+
		"\3\26\3\26\3\27\5\27\u010e\n\27\3\27\5\27\u0111\n\27\3\27\3\27\3\27\5"+
		"\27\u0116\n\27\3\27\3\27\3\27\7\27\u011b\n\27\f\27\16\27\u011e\13\27\3"+
		"\27\3\27\3\30\3\30\3\30\7\30\u0125\n\30\f\30\16\30\u0128\13\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0133\n\32\3\33\3\33\3\33"+
		"\3\33\5\33\u0139\n\33\3\33\3\33\3\33\3\33\5\33\u013f\n\33\3\34\3\34\3"+
		"\34\3\34\5\34\u0145\n\34\3\35\3\35\5\35\u0149\n\35\3\35\3\35\3\35\5\35"+
		"\u014e\n\35\3\36\3\36\3\36\3\36\5\36\u0154\n\36\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3!\7!\u0161\n!\f!\16!\u0164\13!\3\"\3\"\3\"\7\"\u0169"+
		"\n\"\f\"\16\"\u016c\13\"\3#\3#\3#\3#\5#\u0172\n#\3$\3$\3$\5$\u0177\n$"+
		"\3$\3$\3$\3$\5$\u017d\n$\3$\3$\5$\u0181\n$\3%\3%\3%\5%\u0186\n%\3&\3&"+
		"\3&\3&\3&\7&\u018d\n&\f&\16&\u0190\13&\3\'\3\'\3\'\3\'\3\'\7\'\u0197\n"+
		"\'\f\'\16\'\u019a\13\'\3(\3(\3(\3(\3(\7(\u01a1\n(\f(\16(\u01a4\13(\3)"+
		"\3)\3)\3)\3)\7)\u01ab\n)\f)\16)\u01ae\13)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3.\3.\3.\5.\u01c3\n.\3.\3.\3.\3.\5.\u01c9\n.\3/\3"+
		"/\3/\5/\u01ce\n/\3/\3/\3/\3/\5/\u01d4\n/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u01dc\n\60\3\61\3\61\3\61\3\61\3\61\5\61\u01e3\n\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u01eb\n\61\3\61\5\61\u01ee\n\61\3\62\3\62\3\62"+
		"\3\62\3\62\7\62\u01f5\n\62\f\62\16\62\u01f8\13\62\3\63\3\63\3\63\3\63"+
		"\3\63\7\63\u01ff\n\63\f\63\16\63\u0202\13\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\5\65\u020a\n\65\3\66\3\66\5\66\u020e\n\66\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\7\67\u0216\n\67\f\67\16\67\u0219\13\67\3\67\3\67\5\67\u021d\n"+
		"\67\38\38\38\78\u0222\n8\f8\168\u0225\138\38\38\58\u0229\n8\38\38\38\3"+
		"8\38\39\39\39\39\59\u0234\n9\39\39\39\39\39\39\39\39\39\59\u023f\n9\3"+
		"9\39\39\69\u0244\n9\r9\169\u0245\39\39\39\59\u024b\n9\3:\3:\3:\3:\3:\3"+
		":\6:\u0253\n:\r:\16:\u0254\3:\3:\3:\5:\u025a\n:\3:\5:\u025d\n:\3;\3;\3"+
		";\6;\u0262\n;\r;\16;\u0263\3;\3;\3;\5;\u0269\n;\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\6<\u0273\n<\r<\16<\u0274\3<\3<\3<\5<\u027a\n<\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\7=\u0285\n=\f=\16=\u0288\13=\3=\3=\5=\u028c\n=\7=\u028e\n=\f=\16"+
		"=\u0291\13=\3=\3=\3=\7=\u0296\n=\f=\16=\u0299\13=\3=\3=\5=\u029d\n=\3"+
		"=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\5B\u02b1\nB\3B\2"+
		"\2C\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\2\6\4\2\23\23\33\33\4\2\31"+
		"\31\33\33\5\2\31\31\33\33\37\37\f\2\4\6\t\t\13\13\16\16\22\22\24\24\30"+
		"\30\35\36  \"$\2\u02e3\2\u0084\3\2\2\2\4\u0087\3\2\2\2\6\u0091\3\2\2\2"+
		"\b\u0094\3\2\2\2\n\u0099\3\2\2\2\f\u00a5\3\2\2\2\16\u00b7\3\2\2\2\20\u00c2"+
		"\3\2\2\2\22\u00c5\3\2\2\2\24\u00cc\3\2\2\2\26\u00d0\3\2\2\2\30\u00d4\3"+
		"\2\2\2\32\u00d6\3\2\2\2\34\u00d8\3\2\2\2\36\u00e1\3\2\2\2 \u00e5\3\2\2"+
		"\2\"\u00f0\3\2\2\2$\u00f5\3\2\2\2&\u00fb\3\2\2\2(\u0108\3\2\2\2*\u010a"+
		"\3\2\2\2,\u010d\3\2\2\2.\u0121\3\2\2\2\60\u0129\3\2\2\2\62\u0132\3\2\2"+
		"\2\64\u013e\3\2\2\2\66\u0144\3\2\2\28\u014d\3\2\2\2:\u014f\3\2\2\2<\u0157"+
		"\3\2\2\2>\u015a\3\2\2\2@\u0162\3\2\2\2B\u0165\3\2\2\2D\u0171\3\2\2\2F"+
		"\u0180\3\2\2\2H\u0185\3\2\2\2J\u0187\3\2\2\2L\u0191\3\2\2\2N\u019b\3\2"+
		"\2\2P\u01a5\3\2\2\2R\u01af\3\2\2\2T\u01b3\3\2\2\2V\u01b7\3\2\2\2X\u01bb"+
		"\3\2\2\2Z\u01c2\3\2\2\2\\\u01cd\3\2\2\2^\u01db\3\2\2\2`\u01ed\3\2\2\2"+
		"b\u01ef\3\2\2\2d\u01f9\3\2\2\2f\u0203\3\2\2\2h\u0209\3\2\2\2j\u020d\3"+
		"\2\2\2l\u020f\3\2\2\2n\u021e\3\2\2\2p\u022f\3\2\2\2r\u024c\3\2\2\2t\u025e"+
		"\3\2\2\2v\u026a\3\2\2\2x\u027b\3\2\2\2z\u02a0\3\2\2\2|\u02a3\3\2\2\2~"+
		"\u02a6\3\2\2\2\u0080\u02a9\3\2\2\2\u0082\u02b0\3\2\2\2\u0084\u0085\5\4"+
		"\3\2\u0085\u0086\7\2\2\3\u0086\3\3\2\2\2\u0087\u008b\5\6\4\2\u0088\u008a"+
		"\5\n\6\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\5\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\5\b\5\2"+
		"\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\7\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7%\2\2\u0095"+
		"\u0096\5@!\2\u0096\u0097\5\30\r\2\u0097\u0098\7=\2\2\u0098\t\3\2\2\2\u0099"+
		"\u009a\7\25\2\2\u009a\u009b\5\30\r\2\u009b\u009f\7\64\2\2\u009c\u009e"+
		"\5\f\7\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\65"+
		"\2\2\u00a3\13\3\2\2\2\u00a4\u00a6\5\16\b\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\7\37\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\7\2\2\u00ab\u00ac"+
		"\5\30\r\2\u00ac\u00b2\7\64\2\2\u00ad\u00b1\5\34\17\2\u00ae\u00b1\5 \21"+
		"\2\u00af\u00b1\5,\27\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\65\2\2\u00b6\r\3\2\2"+
		"\2\u00b7\u00b8\t\2\2\2\u00b8\17\3\2\2\2\u00b9\u00c3\t\3\2\2\u00ba\u00bc"+
		"\7\31\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00c3\7\32\2\2\u00be\u00c0\7\32\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\7\23\2\2\u00c2\u00b9\3\2\2\2"+
		"\u00c2\u00bb\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\21\3\2\2\2\u00c4\u00c6"+
		"\7?\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00ca\5\24\13\2\u00c8\u00ca\5\26\f\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca\23\3\2\2\2\u00cb\u00cd\7\60\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\25\3\2\2"+
		"\2\u00d0\u00d1\5\24\13\2\u00d1\u00d2\7:\2\2\u00d2\u00d3\5\24\13\2\u00d3"+
		"\27\3\2\2\2\u00d4\u00d5\7\63\2\2\u00d5\31\3\2\2\2\u00d6\u00d7\t\4\2\2"+
		"\u00d7\33\3\2\2\2\u00d8\u00d9\5\32\16\2\u00d9\u00da\5\30\r\2\u00da\u00db"+
		"\78\2\2\u00db\u00dc\5.\30\2\u00dc\u00dd\79\2\2\u00dd\u00de\7\64\2\2\u00de"+
		"\u00df\5\66\34\2\u00df\u00e0\7\65\2\2\u00e0\35\3\2\2\2\u00e1\u00e2\7H"+
		"\2\2\u00e2\u00e3\5(\25\2\u00e3\37\3\2\2\2\u00e4\u00e6\5\20\t\2\u00e5\u00e4"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e9\7\37\2\2"+
		"\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec"+
		"\5\"\22\2\u00eb\u00ed\5\36\20\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2"+
		"\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7=\2\2\u00ef!\3\2\2\2\u00f0\u00f1\5"+
		"*\26\2\u00f1\u00f2\5\30\r\2\u00f2#\3\2\2\2\u00f3\u00f6\5*\26\2\u00f4\u00f6"+
		"\7&\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\5\30\r\2\u00f8%\3\2\2\2\u00f9\u00fc\5*\26\2\u00fa\u00fc\7\'\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe"+
		"\5\30\r\2\u00fe\'\3\2\2\2\u00ff\u0109\5\22\n\2\u0100\u0109\7\62\2\2\u0101"+
		"\u0109\7!\2\2\u0102\u0109\7\r\2\2\u0103\u0109\7\27\2\2\u0104\u0109\5\30"+
		"\r\2\u0105\u0109\5<\37\2\u0106\u0109\5D#\2\u0107\u0109\5:\36\2\u0108\u00ff"+
		"\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0101\3\2\2\2\u0108\u0102\3\2\2\2\u0108"+
		"\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0107\3\2\2\2\u0109)\3\2\2\2\u010a\u010b\t\5\2\2\u010b+\3\2"+
		"\2\2\u010c\u010e\5\20\t\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u0111\7\37\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\5&\24\2\u0113\u0115\78\2\2\u0114"+
		"\u0116\5.\30\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0118\79\2\2\u0118\u011c\7\64\2\2\u0119\u011b\58\35\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7\65\2\2\u0120"+
		"-\3\2\2\2\u0121\u0126\5\"\22\2\u0122\u0123\7;\2\2\u0123\u0125\5\"\22\2"+
		"\u0124\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127/\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\34\2\2\u012a"+
		"\u012b\5(\25\2\u012b\61\3\2\2\2\u012c\u0133\5r:\2\u012d\u0133\5p9\2\u012e"+
		"\u0133\5v<\2\u012f\u0133\5l\67\2\u0130\u0133\5n8\2\u0131\u0133\5x=\2\u0132"+
		"\u012c\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u012e\3\2\2\2\u0132\u012f\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\63\3\2\2\2\u0134\u013f"+
		"\5:\36\2\u0135\u013f\5\u0082B\2\u0136\u0138\5$\23\2\u0137\u0139\5\36\20"+
		"\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013f\3\2\2\2\u013a\u013b"+
		"\5\30\r\2\u013b\u013c\5\36\20\2\u013c\u013f\3\2\2\2\u013d\u013f\5> \2"+
		"\u013e\u0134\3\2\2\2\u013e\u0135\3\2\2\2\u013e\u0136\3\2\2\2\u013e\u013a"+
		"\3\2\2\2\u013e\u013d\3\2\2\2\u013f\65\3\2\2\2\u0140\u0141\5\64\33\2\u0141"+
		"\u0142\7=\2\2\u0142\u0145\3\2\2\2\u0143\u0145\5\62\32\2\u0144\u0140\3"+
		"\2\2\2\u0144\u0143\3\2\2\2\u0145\67\3\2\2\2\u0146\u0149\5\64\33\2\u0147"+
		"\u0149\5\60\31\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3"+
		"\2\2\2\u014a\u014b\7=\2\2\u014b\u014e\3\2\2\2\u014c\u014e\5\62\32\2\u014d"+
		"\u0148\3\2\2\2\u014d\u014c\3\2\2\2\u014e9\3\2\2\2\u014f\u0150\5@!\2\u0150"+
		"\u0151\5\30\r\2\u0151\u0153\78\2\2\u0152\u0154\5B\"\2\u0153\u0152\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\79\2\2\u0156"+
		";\3\2\2\2\u0157\u0158\7\26\2\2\u0158\u0159\5:\36\2\u0159=\3\2\2\2\u015a"+
		"\u015b\7\n\2\2\u015b\u015c\5\30\r\2\u015c?\3\2\2\2\u015d\u015e\5\30\r"+
		"\2\u015e\u015f\7:\2\2\u015f\u0161\3\2\2\2\u0160\u015d\3\2\2\2\u0161\u0164"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163A\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u016a\5(\25\2\u0166\u0167\7;\2\2\u0167\u0169\5(\25"+
		"\2\u0168\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016bC\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0172\5J&\2\u016e\u0172"+
		"\5L\'\2\u016f\u0172\5N(\2\u0170\u0172\5P)\2\u0171\u016d\3\2\2\2\u0171"+
		"\u016e\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172E\3\2\2\2"+
		"\u0173\u0177\5\22\n\2\u0174\u0177\5\30\r\2\u0175\u0177\5:\36\2\u0176\u0173"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177\u0181\3\2\2\2\u0178"+
		"\u017c\78\2\2\u0179\u017d\5\22\n\2\u017a\u017d\5\30\r\2\u017b\u017d\5"+
		":\36\2\u017c\u0179\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u017f\79\2\2\u017f\u0181\3\2\2\2\u0180\u0176\3\2"+
		"\2\2\u0180\u0178\3\2\2\2\u0181G\3\2\2\2\u0182\u0186\5F$\2\u0183\u0186"+
		"\7\62\2\2\u0184\u0186\5:\36\2\u0185\u0182\3\2\2\2\u0185\u0183\3\2\2\2"+
		"\u0185\u0184\3\2\2\2\u0186I\3\2\2\2\u0187\u0188\5H%\2\u0188\u0189\7>\2"+
		"\2\u0189\u018e\5H%\2\u018a\u018b\7>\2\2\u018b\u018d\5H%\2\u018c\u018a"+
		"\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"K\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\5F$\2\u0192\u0193\7?\2\2\u0193"+
		"\u0198\5F$\2\u0194\u0195\7?\2\2\u0195\u0197\5F$\2\u0196\u0194\3\2\2\2"+
		"\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199M\3"+
		"\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\5F$\2\u019c\u019d\7@\2\2\u019d"+
		"\u01a2\5F$\2\u019e\u019f\7@\2\2\u019f\u01a1\5F$\2\u01a0\u019e\3\2\2\2"+
		"\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3O\3"+
		"\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\5F$\2\u01a6\u01a7\7A\2\2\u01a7"+
		"\u01ac\5F$\2\u01a8\u01a9\7A\2\2\u01a9\u01ab\5F$\2\u01aa\u01a8\3\2\2\2"+
		"\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01adQ\3"+
		"\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\5F$\2\u01b0\u01b1\7J\2\2\u01b1"+
		"\u01b2\5F$\2\u01b2S\3\2\2\2\u01b3\u01b4\5F$\2\u01b4\u01b5\7I\2\2\u01b5"+
		"\u01b6\5F$\2\u01b6U\3\2\2\2\u01b7\u01b8\5F$\2\u01b8\u01b9\7U\2\2\u01b9"+
		"\u01ba\5F$\2\u01baW\3\2\2\2\u01bb\u01bc\5F$\2\u01bc\u01bd\7V\2\2\u01bd"+
		"\u01be\5F$\2\u01beY\3\2\2\2\u01bf\u01c3\5F$\2\u01c0\u01c3\7!\2\2\u01c1"+
		"\u01c3\7\r\2\2\u01c2\u01bf\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2"+
		"\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c8\7S\2\2\u01c5\u01c9\5F$\2\u01c6\u01c9"+
		"\7!\2\2\u01c7\u01c9\7\r\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8"+
		"\u01c7\3\2\2\2\u01c9[\3\2\2\2\u01ca\u01ce\5F$\2\u01cb\u01ce\7!\2\2\u01cc"+
		"\u01ce\7\r\2\2\u01cd\u01ca\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d3\7T\2\2\u01d0\u01d4\5F$\2\u01d1\u01d4"+
		"\7!\2\2\u01d2\u01d4\7\r\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4]\3\2\2\2\u01d5\u01dc\5V,\2\u01d6\u01dc\5X-\2\u01d7"+
		"\u01dc\5R*\2\u01d8\u01dc\5T+\2\u01d9\u01dc\5Z.\2\u01da\u01dc\5\\/\2\u01db"+
		"\u01d5\3\2\2\2\u01db\u01d6\3\2\2\2\u01db\u01d7\3\2\2\2\u01db\u01d8\3\2"+
		"\2\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dc_\3\2\2\2\u01dd\u01e3"+
		"\5:\36\2\u01de\u01e3\5\30\r\2\u01df\u01e3\5^\60\2\u01e0\u01e3\7!\2\2\u01e1"+
		"\u01e3\7\r\2\2\u01e2\u01dd\3\2\2\2\u01e2\u01de\3\2\2\2\u01e2\u01df\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01ee\3\2\2\2\u01e4"+
		"\u01ea\78\2\2\u01e5\u01eb\5:\36\2\u01e6\u01eb\5\30\r\2\u01e7\u01eb\5^"+
		"\60\2\u01e8\u01eb\7!\2\2\u01e9\u01eb\7\r\2\2\u01ea\u01e5\3\2\2\2\u01ea"+
		"\u01e6\3\2\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\79\2\2\u01ed\u01e2\3\2\2\2\u01ed"+
		"\u01e4\3\2\2\2\u01eea\3\2\2\2\u01ef\u01f0\5`\61\2\u01f0\u01f1\7P\2\2\u01f1"+
		"\u01f6\5`\61\2\u01f2\u01f3\7P\2\2\u01f3\u01f5\5`\61\2\u01f4\u01f2\3\2"+
		"\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"c\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\5`\61\2\u01fa\u01fb\7Q\2\2\u01fb"+
		"\u0200\5`\61\2\u01fc\u01fd\7Q\2\2\u01fd\u01ff\5`\61\2\u01fe\u01fc\3\2"+
		"\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"e\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204\7F\2\2\u0204\u0205\5`\61\2\u0205"+
		"g\3\2\2\2\u0206\u020a\5b\62\2\u0207\u020a\5d\63\2\u0208\u020a\5f\64\2"+
		"\u0209\u0206\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020ai\3"+
		"\2\2\2\u020b\u020e\5`\61\2\u020c\u020e\5h\65\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020c\3\2\2\2\u020ek\3\2\2\2\u020f\u0210\7(\2\2\u0210\u0211\78\2\2\u0211"+
		"\u0212\5j\66\2\u0212\u021c\79\2\2\u0213\u0217\7\64\2\2\u0214\u0216\58"+
		"\35\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021d\7\65"+
		"\2\2\u021b\u021d\58\35\2\u021c\u0213\3\2\2\2\u021c\u021b\3\2\2\2\u021d"+
		"m\3\2\2\2\u021e\u0228\7/\2\2\u021f\u0223\7\64\2\2\u0220\u0222\58\35\2"+
		"\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224"+
		"\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0229\7\65\2\2"+
		"\u0227\u0229\58\35\2\u0228\u021f\3\2\2\2\u0228\u0227\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u022b\7(\2\2\u022b\u022c\78\2\2\u022c\u022d\5j\66\2\u022d"+
		"\u022e\79\2\2\u022eo\3\2\2\2\u022f\u0230\7\17\2\2\u0230\u0233\78\2\2\u0231"+
		"\u0234\5\"\22\2\u0232\u0234\5\30\r\2\u0233\u0231\3\2\2\2\u0233\u0232\3"+
		"\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\5\36\20\2\u0236\u0237\7=\2\2\u0237"+
		"\u0238\5j\66\2\u0238\u023e\7=\2\2\u0239\u023a\5\30\r\2\u023a\u023b\5\36"+
		"\20\2\u023b\u023f\3\2\2\2\u023c\u023f\5:\36\2\u023d\u023f\5\u0082B\2\u023e"+
		"\u0239\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u024a\79\2\2\u0241\u0243\7\64\2\2\u0242\u0244\58\35\2\u0243"+
		"\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2"+
		"\2\2\u0246\u0247\3\2\2\2\u0247\u0248\7\65\2\2\u0248\u024b\3\2\2\2\u0249"+
		"\u024b\58\35\2\u024a\u0241\3\2\2\2\u024a\u0249\3\2\2\2\u024bq\3\2\2\2"+
		"\u024c\u024d\7\21\2\2\u024d\u024e\78\2\2\u024e\u024f\5j\66\2\u024f\u0259"+
		"\79\2\2\u0250\u0252\7\64\2\2\u0251\u0253\58\35\2\u0252\u0251\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\u0257\7\65\2\2\u0257\u025a\3\2\2\2\u0258\u025a\58\35\2\u0259"+
		"\u0250\3\2\2\2\u0259\u0258\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u025d\5t"+
		";\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025ds\3\2\2\2\u025e\u0268"+
		"\7\f\2\2\u025f\u0261\7\64\2\2\u0260\u0262\58\35\2\u0261\u0260\3\2\2\2"+
		"\u0262\u0263\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265"+
		"\3\2\2\2\u0265\u0266\7\65\2\2\u0266\u0269\3\2\2\2\u0267\u0269\58\35\2"+
		"\u0268\u025f\3\2\2\2\u0268\u0267\3\2\2\2\u0269u\3\2\2\2\u026a\u026b\7"+
		"\20\2\2\u026b\u026c\78\2\2\u026c\u026d\5\"\22\2\u026d\u026e\7)\2\2\u026e"+
		"\u026f\5\30\r\2\u026f\u0279\79\2\2\u0270\u0272\7\64\2\2\u0271\u0273\5"+
		"8\35\2\u0272\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0272\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\7\65\2\2\u0277\u027a\3"+
		"\2\2\2\u0278\u027a\58\35\2\u0279\u0270\3\2\2\2\u0279\u0278\3\2\2\2\u027a"+
		"w\3\2\2\2\u027b\u027c\7*\2\2\u027c\u027d\78\2\2\u027d\u027e\5F$\2\u027e"+
		"\u027f\79\2\2\u027f\u028f\7\64\2\2\u0280\u0281\7+\2\2\u0281\u0282\5(\25"+
		"\2\u0282\u0286\7<\2\2\u0283\u0285\58\35\2\u0284\u0283\3\2\2\2\u0285\u0288"+
		"\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u028b\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0289\u028a\7.\2\2\u028a\u028c\7=\2\2\u028b\u0289\3\2\2"+
		"\2\u028b\u028c\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u0280\3\2\2\2\u028e\u0291"+
		"\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u029c\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0292\u0293\7,\2\2\u0293\u0297\7<\2\2\u0294\u0296\58\35"+
		"\2\u0295\u0294\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298\u029a\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029b\7.\2\2\u029b"+
		"\u029d\7=\2\2\u029c\u0292\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2"+
		"\2\2\u029e\u029f\7\65\2\2\u029fy\3\2\2\2\u02a0\u02a1\5\30\r\2\u02a1\u02a2"+
		"\7N\2\2\u02a2{\3\2\2\2\u02a3\u02a4\7N\2\2\u02a4\u02a5\5\30\r\2\u02a5}"+
		"\3\2\2\2\u02a6\u02a7\5\30\r\2\u02a7\u02a8\7O\2\2\u02a8\177\3\2\2\2\u02a9"+
		"\u02aa\7O\2\2\u02aa\u02ab\5\30\r\2\u02ab\u0081\3\2\2\2\u02ac\u02b1\5z"+
		">\2\u02ad\u02b1\5|?\2\u02ae\u02b1\5~@\2\u02af\u02b1\5\u0080A\2\u02b0\u02ac"+
		"\3\2\2\2\u02b0\u02ad\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02af\3\2\2\2\u02b1"+
		"\u0083\3\2\2\2M\u008b\u0091\u009f\u00a5\u00a8\u00b0\u00b2\u00bb\u00bf"+
		"\u00c2\u00c5\u00c9\u00ce\u00e5\u00e8\u00ec\u00f5\u00fb\u0108\u010d\u0110"+
		"\u0115\u011c\u0126\u0132\u0138\u013e\u0144\u0148\u014d\u0153\u0162\u016a"+
		"\u0171\u0176\u017c\u0180\u0185\u018e\u0198\u01a2\u01ac\u01c2\u01c8\u01cd"+
		"\u01d3\u01db\u01e2\u01ea\u01ed\u01f6\u0200\u0209\u020d\u0217\u021c\u0223"+
		"\u0228\u0233\u023e\u0245\u024a\u0254\u0259\u025c\u0263\u0268\u0274\u0279"+
		"\u0286\u028b\u028f\u0297\u029c\u02b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}