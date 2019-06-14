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
		RULE_return_com = 23, RULE_command_void = 24, RULE_constructor_command = 25, 
		RULE_command = 26, RULE_call = 27, RULE_new_object = 28, RULE_delete_object = 29, 
		RULE_origin_class = 30, RULE_parameters = 31, RULE_arithmetic = 32, RULE_operand = 33, 
		RULE_add_operand = 34, RULE_add = 35, RULE_subtract = 36, RULE_multiply = 37, 
		RULE_divide = 38, RULE_greater_than = 39, RULE_lesser_than = 40, RULE_greater_or_equal = 41, 
		RULE_lesser_or_equal = 42, RULE_equal = 43, RULE_not_equal = 44, RULE_comparison = 45, 
		RULE_logical_operand = 46, RULE_conjunction = 47, RULE_alternative = 48, 
		RULE_negation = 49, RULE_logical_operator = 50, RULE_condition = 51, RULE_while_loop = 52, 
		RULE_do_while_loop = 53, RULE_for_loop = 54, RULE_if_cond = 55, RULE_else_cond = 56, 
		RULE_foreach = 57, RULE_switch_cond = 58, RULE_pre_increment = 59, RULE_post_increment = 60, 
		RULE_pre_decrement = 61, RULE_post_decrement = 62, RULE_in_decrement = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"entry_point", "source_file", "using_list", "using", "namespace", "classdef", 
			"class_access_m", "access_modifier", "number", "integer", "floating", 
			"identifier", "constructor_access_m", "constructor", "assignment", "field", 
			"declaration", "local_declaration", "method_declaration", "value", "type", 
			"method", "paramedefs", "return_com", "command_void", "constructor_command", 
			"command", "call", "new_object", "delete_object", "origin_class", "parameters", 
			"arithmetic", "operand", "add_operand", "add", "subtract", "multiply", 
			"divide", "greater_than", "lesser_than", "greater_or_equal", "lesser_or_equal", 
			"equal", "not_equal", "comparison", "logical_operand", "conjunction", 
			"alternative", "negation", "logical_operator", "condition", "while_loop", 
			"do_while_loop", "for_loop", "if_cond", "else_cond", "foreach", "switch_cond", 
			"pre_increment", "post_increment", "pre_decrement", "post_decrement", 
			"in_decrement"
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
			setState(128);
			source_file();
			setState(129);
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
			setState(131);
			using_list();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAMESPACE) {
				{
				{
				setState(132);
				namespace();
				}
				}
				setState(137);
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
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USING) {
				{
				{
				setState(138);
				using();
				}
				}
				setState(143);
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
			setState(144);
			match(USING);
			setState(145);
			origin_class();
			setState(146);
			identifier();
			setState(147);
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
			setState(149);
			match(NAMESPACE);
			setState(150);
			identifier();
			setState(151);
			match(OPEN_BRACE);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERNAL) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
				{
				{
				setState(152);
				classdef();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERNAL || _la==PUBLIC) {
				{
				setState(160);
				class_access_m();
				}
			}

			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(163);
				match(STATIC);
				}
			}

			setState(166);
			match(CLASS);
			setState(167);
			identifier();
			setState(168);
			match(OPEN_BRACE);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << INTERNAL) | (1L << LONG) | (1L << OBJECT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SBYTE) | (1L << SHORT) | (1L << STATIC) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VOID))) != 0)) {
				{
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(169);
					constructor();
					}
					break;
				case 2:
					{
					setState(170);
					field();
					}
					break;
				case 3:
					{
					setState(171);
					method();
					}
					break;
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
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
			setState(179);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
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
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE) {
					{
					setState(182);
					match(PRIVATE);
					}
				}

				setState(185);
				match(PROTECTED);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROTECTED) {
					{
					setState(186);
					match(PROTECTED);
					}
				}

				setState(189);
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
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(192);
				match(MINUS);
				}
			}

			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(195);
				integer();
				}
				break;
			case 2:
				{
				setState(196);
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
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				match(DIGIT);
				}
				}
				setState(202); 
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
			setState(204);
			integer();
			setState(205);
			match(DOT);
			setState(206);
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
			setState(208);
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
			setState(210);
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
			setState(212);
			constructor_access_m();
			setState(213);
			identifier();
			setState(214);
			match(OPEN_PARENS);
			setState(215);
			paramedefs();
			setState(216);
			match(CLOSE_PARENS);
			setState(217);
			match(OPEN_BRACE);
			setState(218);
			constructor_command();
			setState(219);
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
			setState(221);
			match(ASSIGNMENT);
			setState(222);
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
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTERNAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(224);
				access_modifier();
				}
			}

			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(227);
				match(STATIC);
				}
			}

			setState(230);
			declaration();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(231);
				assignment();
				}
			}

			setState(234);
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
			setState(236);
			type();
			setState(237);
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
			setState(241);
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
				setState(239);
				type();
				}
				break;
			case VAR:
				{
				setState(240);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(243);
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
			setState(247);
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
				setState(245);
				type();
				}
				break;
			case VOID:
				{
				setState(246);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(249);
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(251);
				number();
				}
				break;
			case 2:
				{
				setState(252);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(253);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(254);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(255);
				match(NULL);
				}
				break;
			case 6:
				{
				setState(256);
				identifier();
				}
				break;
			case 7:
				{
				setState(257);
				new_object();
				}
				break;
			case 8:
				{
				setState(258);
				arithmetic();
				}
				break;
			case 9:
				{
				setState(259);
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
			setState(262);
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
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTERNAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(264);
				access_modifier();
				}
			}

			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(267);
				match(STATIC);
				}
			}

			setState(270);
			method_declaration();
			setState(271);
			match(OPEN_PARENS);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT))) != 0)) {
				{
				setState(272);
				paramedefs();
				}
			}

			setState(275);
			match(CLOSE_PARENS);
			setState(276);
			match(OPEN_BRACE);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC) {
				{
				{
				setState(277);
				command();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
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
			setState(285);
			declaration();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(286);
				match(COMMA);
				setState(287);
				declaration();
				}
				}
				setState(292);
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
			setState(293);
			match(RETURN);
			setState(294);
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
		enterRule(_localctx, 48, RULE_command_void);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(296);
				call();
				}
				break;
			case 2:
				{
				setState(297);
				in_decrement();
				}
				break;
			case 3:
				{
				setState(298);
				local_declaration();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(299);
					assignment();
					}
				}

				}
				break;
			case 4:
				{
				setState(302);
				identifier();
				setState(303);
				assignment();
				}
				break;
			case 5:
				{
				setState(305);
				delete_object();
				}
				break;
			case 6:
				{
				setState(306);
				if_cond();
				}
				break;
			case 7:
				{
				setState(307);
				for_loop();
				}
				break;
			case 8:
				{
				setState(308);
				foreach();
				}
				break;
			case 9:
				{
				setState(309);
				while_loop();
				}
				break;
			case 10:
				{
				setState(310);
				do_while_loop();
				}
				break;
			case 11:
				{
				setState(311);
				switch_cond();
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
		enterRule(_localctx, 50, RULE_constructor_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			command_void();
			setState(315);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CSParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 52, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				setState(317);
				command_void();
				}
				break;
			case RETURN:
				{
				setState(318);
				return_com();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(321);
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
		enterRule(_localctx, 54, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			origin_class();
			setState(324);
			identifier();
			setState(325);
			match(OPEN_PARENS);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << DIGIT) | (1L << STRING_LITERAL) | (1L << IDENTIFIER) | (1L << OPEN_PARENS) | (1L << MINUS))) != 0)) {
				{
				setState(326);
				parameters();
				}
			}

			setState(329);
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
		enterRule(_localctx, 56, RULE_new_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(NEW);
			setState(332);
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
		enterRule(_localctx, 58, RULE_delete_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(DELETE);
			setState(335);
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
		enterRule(_localctx, 60, RULE_origin_class);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(337);
					identifier();
					setState(338);
					match(DOT);
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 62, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			value();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(346);
				match(COMMA);
				setState(347);
				value();
				}
				}
				setState(352);
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
		enterRule(_localctx, 64, RULE_arithmetic);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				add();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				subtract();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				multiply();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
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
		enterRule(_localctx, 66, RULE_operand);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case IDENTIFIER:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(359);
					number();
					}
					break;
				case 2:
					{
					setState(360);
					identifier();
					}
					break;
				case 3:
					{
					setState(361);
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
				setState(364);
				match(OPEN_PARENS);
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(365);
					number();
					}
					break;
				case 2:
					{
					setState(366);
					identifier();
					}
					break;
				case 3:
					{
					setState(367);
					call();
					}
					break;
				}
				setState(370);
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
		enterRule(_localctx, 68, RULE_add_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(374);
				operand();
				}
				break;
			case 2:
				{
				setState(375);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(376);
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
		enterRule(_localctx, 70, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			add_operand();
			setState(380);
			match(PLUS);
			setState(381);
			add_operand();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(382);
				match(PLUS);
				setState(383);
				add_operand();
				}
				}
				setState(388);
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
		enterRule(_localctx, 72, RULE_subtract);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			operand();
			setState(390);
			match(MINUS);
			setState(391);
			operand();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(392);
				match(MINUS);
				setState(393);
				operand();
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
		enterRule(_localctx, 74, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			operand();
			setState(400);
			match(STAR);
			setState(401);
			operand();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR) {
				{
				{
				setState(402);
				match(STAR);
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
		enterRule(_localctx, 76, RULE_divide);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			operand();
			setState(410);
			match(SLASH);
			setState(411);
			operand();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(412);
				match(SLASH);
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
		enterRule(_localctx, 78, RULE_greater_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			operand();
			setState(420);
			match(GT);
			setState(421);
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
		enterRule(_localctx, 80, RULE_lesser_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			operand();
			setState(424);
			match(LT);
			setState(425);
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
		enterRule(_localctx, 82, RULE_greater_or_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			operand();
			setState(428);
			match(OP_LE);
			setState(429);
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
		enterRule(_localctx, 84, RULE_lesser_or_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			operand();
			setState(432);
			match(OP_GE);
			setState(433);
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
		enterRule(_localctx, 86, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case IDENTIFIER:
			case OPEN_PARENS:
			case MINUS:
				{
				setState(435);
				operand();
				}
				break;
			case TRUE:
				{
				setState(436);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(437);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(440);
			match(OP_EQ);
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case IDENTIFIER:
			case OPEN_PARENS:
			case MINUS:
				{
				setState(441);
				operand();
				}
				break;
			case TRUE:
				{
				setState(442);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(443);
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
		enterRule(_localctx, 88, RULE_not_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case IDENTIFIER:
			case OPEN_PARENS:
			case MINUS:
				{
				setState(446);
				operand();
				}
				break;
			case TRUE:
				{
				setState(447);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(448);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(451);
			match(OP_NE);
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case IDENTIFIER:
			case OPEN_PARENS:
			case MINUS:
				{
				setState(452);
				operand();
				}
				break;
			case TRUE:
				{
				setState(453);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(454);
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
		enterRule(_localctx, 90, RULE_comparison);
		try {
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				greater_or_equal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				lesser_or_equal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				greater_than();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				lesser_than();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				equal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
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
		enterRule(_localctx, 92, RULE_logical_operand);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(465);
					call();
					}
					break;
				case 2:
					{
					setState(466);
					identifier();
					}
					break;
				case 3:
					{
					setState(467);
					comparison();
					}
					break;
				case 4:
					{
					setState(468);
					match(TRUE);
					}
					break;
				case 5:
					{
					setState(469);
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
				setState(472);
				match(OPEN_PARENS);
				setState(478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(473);
					call();
					}
					break;
				case 2:
					{
					setState(474);
					identifier();
					}
					break;
				case 3:
					{
					setState(475);
					comparison();
					}
					break;
				case 4:
					{
					setState(476);
					match(TRUE);
					}
					break;
				case 5:
					{
					setState(477);
					match(FALSE);
					}
					break;
				}
				setState(480);
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
		enterRule(_localctx, 94, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			logical_operand();
			setState(484);
			match(OP_AND);
			setState(485);
			logical_operand();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				setState(486);
				match(OP_AND);
				setState(487);
				logical_operand();
				}
				}
				setState(492);
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
		enterRule(_localctx, 96, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			logical_operand();
			setState(494);
			match(OP_OR);
			setState(495);
			logical_operand();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(496);
				match(OP_OR);
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
		enterRule(_localctx, 98, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(BANG);
			setState(504);
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
		enterRule(_localctx, 100, RULE_logical_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(506);
				conjunction();
				}
				break;
			case 2:
				{
				setState(507);
				alternative();
				}
				break;
			case 3:
				{
				setState(508);
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
		enterRule(_localctx, 102, RULE_condition);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				logical_operand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
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
		enterRule(_localctx, 104, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(WHILE);
			setState(516);
			match(OPEN_PARENS);
			setState(517);
			condition();
			setState(518);
			match(CLOSE_PARENS);
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				{
				setState(519);
				match(OPEN_BRACE);
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC) {
					{
					{
					setState(520);
					command();
					}
					}
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(526);
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
				setState(527);
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
		enterRule(_localctx, 106, RULE_do_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(DO);
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				{
				setState(531);
				match(OPEN_BRACE);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC) {
					{
					{
					setState(532);
					command();
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(538);
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
				setState(539);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(542);
			match(WHILE);
			setState(543);
			match(OPEN_PARENS);
			setState(544);
			condition();
			setState(545);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 108, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(FOR);
			setState(548);
			match(OPEN_PARENS);
			setState(549);
			declaration();
			setState(550);
			assignment();
			setState(551);
			match(SEMICOLON);
			setState(552);
			condition();
			setState(553);
			match(SEMICOLON);
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(554);
				identifier();
				setState(555);
				assignment();
				}
				break;
			case 2:
				{
				setState(557);
				call();
				}
				break;
			case 3:
				{
				setState(558);
				in_decrement();
				}
				break;
			}
			setState(561);
			match(CLOSE_PARENS);
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				{
				setState(562);
				match(OPEN_BRACE);
				setState(564); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(563);
					command();
					}
					}
					setState(566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC );
				setState(568);
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
				setState(570);
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
		enterRule(_localctx, 110, RULE_if_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(IF);
			setState(574);
			match(OPEN_PARENS);
			setState(575);
			condition();
			setState(576);
			match(CLOSE_PARENS);
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				{
				setState(577);
				match(OPEN_BRACE);
				setState(579); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(578);
					command();
					}
					}
					setState(581); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC );
				setState(583);
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
				setState(585);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(588);
				else_cond();
				}
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
		enterRule(_localctx, 112, RULE_else_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(ELSE);
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				{
				setState(592);
				match(OPEN_BRACE);
				setState(594); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(593);
					command();
					}
					}
					setState(596); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC );
				setState(598);
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
				setState(600);
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
		enterRule(_localctx, 114, RULE_foreach);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(FOREACH);
			setState(604);
			match(OPEN_PARENS);
			setState(605);
			declaration();
			setState(606);
			match(IN);
			setState(607);
			identifier();
			setState(608);
			match(CLOSE_PARENS);
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				{
				setState(609);
				match(OPEN_BRACE);
				setState(611); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(610);
					command();
					}
					}
					setState(613); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC );
				setState(615);
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
				setState(617);
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
		enterRule(_localctx, 116, RULE_switch_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(SWITCH);
			setState(621);
			match(OPEN_PARENS);
			setState(622);
			operand();
			setState(623);
			match(CLOSE_PARENS);
			setState(624);
			match(OPEN_BRACE);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(625);
				match(CASE);
				setState(626);
				value();
				setState(627);
				match(COLON);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC) {
					{
					{
					setState(628);
					command();
					}
					}
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(634);
					match(BREAK);
					setState(635);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(643);
				match(DEFAULT);
				setState(644);
				match(COLON);
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DELETE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << STRING) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VAR) | (1L << WHILE) | (1L << SWITCH) | (1L << DO) | (1L << IDENTIFIER))) != 0) || _la==OP_INC || _la==OP_DEC) {
					{
					{
					setState(645);
					command();
					}
					}
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(651);
				match(BREAK);
				setState(652);
				match(SEMICOLON);
				}
				}
			}

			setState(655);
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
		enterRule(_localctx, 118, RULE_pre_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			identifier();
			setState(658);
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
		enterRule(_localctx, 120, RULE_post_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(OP_INC);
			setState(661);
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
		enterRule(_localctx, 122, RULE_pre_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			identifier();
			setState(664);
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
		enterRule(_localctx, 124, RULE_post_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(OP_DEC);
			setState(667);
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
		enterRule(_localctx, 126, RULE_in_decrement);
		try {
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				pre_increment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				post_increment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				pre_decrement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3`\u02a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\3\3\3\7\3\u0088\n\3\f\3\16\3\u008b"+
		"\13\3\3\4\7\4\u008e\n\4\f\4\16\4\u0091\13\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\7\6\u009c\n\6\f\6\16\6\u009f\13\6\3\6\3\6\3\7\5\7\u00a4\n\7"+
		"\3\7\5\7\u00a7\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00af\n\7\f\7\16\7\u00b2"+
		"\13\7\3\7\3\7\3\b\3\b\3\t\3\t\5\t\u00ba\n\t\3\t\3\t\5\t\u00be\n\t\3\t"+
		"\5\t\u00c1\n\t\3\n\5\n\u00c4\n\n\3\n\3\n\5\n\u00c8\n\n\3\13\6\13\u00cb"+
		"\n\13\r\13\16\13\u00cc\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\5\21\u00e4\n\21\3\21"+
		"\5\21\u00e7\n\21\3\21\3\21\5\21\u00eb\n\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\5\23\u00f4\n\23\3\23\3\23\3\24\3\24\5\24\u00fa\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0107\n\25\3\26\3\26"+
		"\3\27\5\27\u010c\n\27\3\27\5\27\u010f\n\27\3\27\3\27\3\27\5\27\u0114\n"+
		"\27\3\27\3\27\3\27\7\27\u0119\n\27\f\27\16\27\u011c\13\27\3\27\3\27\3"+
		"\30\3\30\3\30\7\30\u0123\n\30\f\30\16\30\u0126\13\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\5\32\u012f\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u013b\n\32\3\33\3\33\3\33\3\34\3\34\5\34\u0142\n"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u014a\n\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \7 \u0157\n \f \16 \u015a\13 \3!\3!\3!\7"+
		"!\u015f\n!\f!\16!\u0162\13!\3\"\3\"\3\"\3\"\5\"\u0168\n\"\3#\3#\3#\5#"+
		"\u016d\n#\3#\3#\3#\3#\5#\u0173\n#\3#\3#\5#\u0177\n#\3$\3$\3$\5$\u017c"+
		"\n$\3%\3%\3%\3%\3%\7%\u0183\n%\f%\16%\u0186\13%\3&\3&\3&\3&\3&\7&\u018d"+
		"\n&\f&\16&\u0190\13&\3\'\3\'\3\'\3\'\3\'\7\'\u0197\n\'\f\'\16\'\u019a"+
		"\13\'\3(\3(\3(\3(\3(\7(\u01a1\n(\f(\16(\u01a4\13(\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\5-\u01b9\n-\3-\3-\3-\3-\5-\u01bf"+
		"\n-\3.\3.\3.\5.\u01c4\n.\3.\3.\3.\3.\5.\u01ca\n.\3/\3/\3/\3/\3/\3/\5/"+
		"\u01d2\n/\3\60\3\60\3\60\3\60\3\60\5\60\u01d9\n\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u01e1\n\60\3\60\5\60\u01e4\n\60\3\61\3\61\3\61\3\61\3"+
		"\61\7\61\u01eb\n\61\f\61\16\61\u01ee\13\61\3\62\3\62\3\62\3\62\3\62\7"+
		"\62\u01f5\n\62\f\62\16\62\u01f8\13\62\3\63\3\63\3\63\3\64\3\64\3\64\5"+
		"\64\u0200\n\64\3\65\3\65\5\65\u0204\n\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\7\66\u020c\n\66\f\66\16\66\u020f\13\66\3\66\3\66\5\66\u0213\n\66\3\67"+
		"\3\67\3\67\7\67\u0218\n\67\f\67\16\67\u021b\13\67\3\67\3\67\5\67\u021f"+
		"\n\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\58"+
		"\u0232\n8\38\38\38\68\u0237\n8\r8\168\u0238\38\38\38\58\u023e\n8\39\3"+
		"9\39\39\39\39\69\u0246\n9\r9\169\u0247\39\39\39\59\u024d\n9\39\59\u0250"+
		"\n9\3:\3:\3:\6:\u0255\n:\r:\16:\u0256\3:\3:\3:\5:\u025c\n:\3;\3;\3;\3"+
		";\3;\3;\3;\3;\6;\u0266\n;\r;\16;\u0267\3;\3;\3;\5;\u026d\n;\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\7<\u0278\n<\f<\16<\u027b\13<\3<\3<\5<\u027f\n<\7<\u0281"+
		"\n<\f<\16<\u0284\13<\3<\3<\3<\7<\u0289\n<\f<\16<\u028c\13<\3<\3<\5<\u0290"+
		"\n<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\5A\u02a4\nA"+
		"\3A\2\2B\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\2\6\4\2\23\23\33\33\4\2\31"+
		"\31\33\33\5\2\31\31\33\33\37\37\f\2\4\6\t\t\13\13\16\16\22\22\24\24\30"+
		"\30\35\36  \"$\2\u02d5\2\u0082\3\2\2\2\4\u0085\3\2\2\2\6\u008f\3\2\2\2"+
		"\b\u0092\3\2\2\2\n\u0097\3\2\2\2\f\u00a3\3\2\2\2\16\u00b5\3\2\2\2\20\u00c0"+
		"\3\2\2\2\22\u00c3\3\2\2\2\24\u00ca\3\2\2\2\26\u00ce\3\2\2\2\30\u00d2\3"+
		"\2\2\2\32\u00d4\3\2\2\2\34\u00d6\3\2\2\2\36\u00df\3\2\2\2 \u00e3\3\2\2"+
		"\2\"\u00ee\3\2\2\2$\u00f3\3\2\2\2&\u00f9\3\2\2\2(\u0106\3\2\2\2*\u0108"+
		"\3\2\2\2,\u010b\3\2\2\2.\u011f\3\2\2\2\60\u0127\3\2\2\2\62\u013a\3\2\2"+
		"\2\64\u013c\3\2\2\2\66\u0141\3\2\2\28\u0145\3\2\2\2:\u014d\3\2\2\2<\u0150"+
		"\3\2\2\2>\u0158\3\2\2\2@\u015b\3\2\2\2B\u0167\3\2\2\2D\u0176\3\2\2\2F"+
		"\u017b\3\2\2\2H\u017d\3\2\2\2J\u0187\3\2\2\2L\u0191\3\2\2\2N\u019b\3\2"+
		"\2\2P\u01a5\3\2\2\2R\u01a9\3\2\2\2T\u01ad\3\2\2\2V\u01b1\3\2\2\2X\u01b8"+
		"\3\2\2\2Z\u01c3\3\2\2\2\\\u01d1\3\2\2\2^\u01e3\3\2\2\2`\u01e5\3\2\2\2"+
		"b\u01ef\3\2\2\2d\u01f9\3\2\2\2f\u01ff\3\2\2\2h\u0203\3\2\2\2j\u0205\3"+
		"\2\2\2l\u0214\3\2\2\2n\u0225\3\2\2\2p\u023f\3\2\2\2r\u0251\3\2\2\2t\u025d"+
		"\3\2\2\2v\u026e\3\2\2\2x\u0293\3\2\2\2z\u0296\3\2\2\2|\u0299\3\2\2\2~"+
		"\u029c\3\2\2\2\u0080\u02a3\3\2\2\2\u0082\u0083\5\4\3\2\u0083\u0084\7\2"+
		"\2\3\u0084\3\3\2\2\2\u0085\u0089\5\6\4\2\u0086\u0088\5\n\6\2\u0087\u0086"+
		"\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\5\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\5\b\5\2\u008d\u008c\3\2\2\2"+
		"\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\7\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7%\2\2\u0093\u0094\5> \2\u0094"+
		"\u0095\5\30\r\2\u0095\u0096\7=\2\2\u0096\t\3\2\2\2\u0097\u0098\7\25\2"+
		"\2\u0098\u0099\5\30\r\2\u0099\u009d\7\64\2\2\u009a\u009c\5\f\7\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\65\2\2\u00a1"+
		"\13\3\2\2\2\u00a2\u00a4\5\16\b\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2"+
		"\2\u00a4\u00a6\3\2\2\2\u00a5\u00a7\7\37\2\2\u00a6\u00a5\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\7\2\2\u00a9\u00aa\5\30"+
		"\r\2\u00aa\u00b0\7\64\2\2\u00ab\u00af\5\34\17\2\u00ac\u00af\5 \21\2\u00ad"+
		"\u00af\5,\27\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\65\2\2\u00b4\r\3\2\2"+
		"\2\u00b5\u00b6\t\2\2\2\u00b6\17\3\2\2\2\u00b7\u00c1\t\3\2\2\u00b8\u00ba"+
		"\7\31\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2"+
		"\u00bb\u00c1\7\32\2\2\u00bc\u00be\7\32\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\7\23\2\2\u00c0\u00b7\3\2\2\2"+
		"\u00c0\u00b9\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1\21\3\2\2\2\u00c2\u00c4"+
		"\7?\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c8\5\24\13\2\u00c6\u00c8\5\26\f\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\23\3\2\2\2\u00c9\u00cb\7\60\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\25\3\2\2"+
		"\2\u00ce\u00cf\5\24\13\2\u00cf\u00d0\7:\2\2\u00d0\u00d1\5\24\13\2\u00d1"+
		"\27\3\2\2\2\u00d2\u00d3\7\63\2\2\u00d3\31\3\2\2\2\u00d4\u00d5\t\4\2\2"+
		"\u00d5\33\3\2\2\2\u00d6\u00d7\5\32\16\2\u00d7\u00d8\5\30\r\2\u00d8\u00d9"+
		"\78\2\2\u00d9\u00da\5.\30\2\u00da\u00db\79\2\2\u00db\u00dc\7\64\2\2\u00dc"+
		"\u00dd\5\64\33\2\u00dd\u00de\7\65\2\2\u00de\35\3\2\2\2\u00df\u00e0\7H"+
		"\2\2\u00e0\u00e1\5(\25\2\u00e1\37\3\2\2\2\u00e2\u00e4\5\20\t\2\u00e3\u00e2"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e7\7\37\2\2"+
		"\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea"+
		"\5\"\22\2\u00e9\u00eb\5\36\20\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2"+
		"\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7=\2\2\u00ed!\3\2\2\2\u00ee\u00ef\5"+
		"*\26\2\u00ef\u00f0\5\30\r\2\u00f0#\3\2\2\2\u00f1\u00f4\5*\26\2\u00f2\u00f4"+
		"\7&\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\5\30\r\2\u00f6%\3\2\2\2\u00f7\u00fa\5*\26\2\u00f8\u00fa\7\'\2\2"+
		"\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc"+
		"\5\30\r\2\u00fc\'\3\2\2\2\u00fd\u0107\5\22\n\2\u00fe\u0107\7\62\2\2\u00ff"+
		"\u0107\7!\2\2\u0100\u0107\7\r\2\2\u0101\u0107\7\27\2\2\u0102\u0107\5\30"+
		"\r\2\u0103\u0107\5:\36\2\u0104\u0107\5B\"\2\u0105\u0107\58\35\2\u0106"+
		"\u00fd\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u00ff\3\2\2\2\u0106\u0100\3\2"+
		"\2\2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107)\3\2\2\2\u0108\u0109\t\5\2\2"+
		"\u0109+\3\2\2\2\u010a\u010c\5\20\t\2\u010b\u010a\3\2\2\2\u010b\u010c\3"+
		"\2\2\2\u010c\u010e\3\2\2\2\u010d\u010f\7\37\2\2\u010e\u010d\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5&\24\2\u0111\u0113\78"+
		"\2\2\u0112\u0114\5.\30\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\79\2\2\u0116\u011a\7\64\2\2\u0117\u0119\5\66"+
		"\34\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7\65"+
		"\2\2\u011e-\3\2\2\2\u011f\u0124\5\"\22\2\u0120\u0121\7;\2\2\u0121\u0123"+
		"\5\"\22\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2"+
		"\u0124\u0125\3\2\2\2\u0125/\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7"+
		"\34\2\2\u0128\u0129\5(\25\2\u0129\61\3\2\2\2\u012a\u013b\58\35\2\u012b"+
		"\u013b\5\u0080A\2\u012c\u012e\5$\23\2\u012d\u012f\5\36\20\2\u012e\u012d"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u013b\3\2\2\2\u0130\u0131\5\30\r\2"+
		"\u0131\u0132\5\36\20\2\u0132\u013b\3\2\2\2\u0133\u013b\5<\37\2\u0134\u013b"+
		"\5p9\2\u0135\u013b\5n8\2\u0136\u013b\5t;\2\u0137\u013b\5j\66\2\u0138\u013b"+
		"\5l\67\2\u0139\u013b\5v<\2\u013a\u012a\3\2\2\2\u013a\u012b\3\2\2\2\u013a"+
		"\u012c\3\2\2\2\u013a\u0130\3\2\2\2\u013a\u0133\3\2\2\2\u013a\u0134\3\2"+
		"\2\2\u013a\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\63\3\2\2\2\u013c\u013d\5\62\32"+
		"\2\u013d\u013e\7=\2\2\u013e\65\3\2\2\2\u013f\u0142\5\62\32\2\u0140\u0142"+
		"\5\60\31\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2"+
		"\u0143\u0144\7=\2\2\u0144\67\3\2\2\2\u0145\u0146\5> \2\u0146\u0147\5\30"+
		"\r\2\u0147\u0149\78\2\2\u0148\u014a\5@!\2\u0149\u0148\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\79\2\2\u014c9\3\2\2\2\u014d\u014e"+
		"\7\26\2\2\u014e\u014f\58\35\2\u014f;\3\2\2\2\u0150\u0151\7\n\2\2\u0151"+
		"\u0152\5\30\r\2\u0152=\3\2\2\2\u0153\u0154\5\30\r\2\u0154\u0155\7:\2\2"+
		"\u0155\u0157\3\2\2\2\u0156\u0153\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159?\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u0160\5(\25\2\u015c\u015d\7;\2\2\u015d\u015f\5(\25\2\u015e\u015c\3\2"+
		"\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"A\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0168\5H%\2\u0164\u0168\5J&\2\u0165"+
		"\u0168\5L\'\2\u0166\u0168\5N(\2\u0167\u0163\3\2\2\2\u0167\u0164\3\2\2"+
		"\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168C\3\2\2\2\u0169\u016d"+
		"\5\22\n\2\u016a\u016d\5\30\r\2\u016b\u016d\58\35\2\u016c\u0169\3\2\2\2"+
		"\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u0177\3\2\2\2\u016e\u0172"+
		"\78\2\2\u016f\u0173\5\22\n\2\u0170\u0173\5\30\r\2\u0171\u0173\58\35\2"+
		"\u0172\u016f\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0175\79\2\2\u0175\u0177\3\2\2\2\u0176\u016c\3\2\2\2\u0176"+
		"\u016e\3\2\2\2\u0177E\3\2\2\2\u0178\u017c\5D#\2\u0179\u017c\7\62\2\2\u017a"+
		"\u017c\58\35\2\u017b\u0178\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2"+
		"\2\2\u017cG\3\2\2\2\u017d\u017e\5F$\2\u017e\u017f\7>\2\2\u017f\u0184\5"+
		"F$\2\u0180\u0181\7>\2\2\u0181\u0183\5F$\2\u0182\u0180\3\2\2\2\u0183\u0186"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185I\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u0188\5D#\2\u0188\u0189\7?\2\2\u0189\u018e\5D#\2"+
		"\u018a\u018b\7?\2\2\u018b\u018d\5D#\2\u018c\u018a\3\2\2\2\u018d\u0190"+
		"\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018fK\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0192\5D#\2\u0192\u0193\7@\2\2\u0193\u0198\5D#\2"+
		"\u0194\u0195\7@\2\2\u0195\u0197\5D#\2\u0196\u0194\3\2\2\2\u0197\u019a"+
		"\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199M\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019c\5D#\2\u019c\u019d\7A\2\2\u019d\u01a2\5D#\2"+
		"\u019e\u019f\7A\2\2\u019f\u01a1\5D#\2\u01a0\u019e\3\2\2\2\u01a1\u01a4"+
		"\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3O\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a6\5D#\2\u01a6\u01a7\7J\2\2\u01a7\u01a8\5D#\2"+
		"\u01a8Q\3\2\2\2\u01a9\u01aa\5D#\2\u01aa\u01ab\7I\2\2\u01ab\u01ac\5D#\2"+
		"\u01acS\3\2\2\2\u01ad\u01ae\5D#\2\u01ae\u01af\7U\2\2\u01af\u01b0\5D#\2"+
		"\u01b0U\3\2\2\2\u01b1\u01b2\5D#\2\u01b2\u01b3\7V\2\2\u01b3\u01b4\5D#\2"+
		"\u01b4W\3\2\2\2\u01b5\u01b9\5D#\2\u01b6\u01b9\7!\2\2\u01b7\u01b9\7\r\2"+
		"\2\u01b8\u01b5\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba\u01be\7S\2\2\u01bb\u01bf\5D#\2\u01bc\u01bf\7!\2\2\u01bd"+
		"\u01bf\7\r\2\2\u01be\u01bb\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2"+
		"\2\2\u01bfY\3\2\2\2\u01c0\u01c4\5D#\2\u01c1\u01c4\7!\2\2\u01c2\u01c4\7"+
		"\r\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c9\7T\2\2\u01c6\u01ca\5D#\2\u01c7\u01ca\7!\2\2"+
		"\u01c8\u01ca\7\r\2\2\u01c9\u01c6\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8"+
		"\3\2\2\2\u01ca[\3\2\2\2\u01cb\u01d2\5T+\2\u01cc\u01d2\5V,\2\u01cd\u01d2"+
		"\5P)\2\u01ce\u01d2\5R*\2\u01cf\u01d2\5X-\2\u01d0\u01d2\5Z.\2\u01d1\u01cb"+
		"\3\2\2\2\u01d1\u01cc\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2]\3\2\2\2\u01d3\u01d9\58\35\2"+
		"\u01d4\u01d9\5\30\r\2\u01d5\u01d9\5\\/\2\u01d6\u01d9\7!\2\2\u01d7\u01d9"+
		"\7\r\2\2\u01d8\u01d3\3\2\2\2\u01d8\u01d4\3\2\2\2\u01d8\u01d5\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01e4\3\2\2\2\u01da\u01e0\78"+
		"\2\2\u01db\u01e1\58\35\2\u01dc\u01e1\5\30\r\2\u01dd\u01e1\5\\/\2\u01de"+
		"\u01e1\7!\2\2\u01df\u01e1\7\r\2\2\u01e0\u01db\3\2\2\2\u01e0\u01dc\3\2"+
		"\2\2\u01e0\u01dd\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e4\79\2\2\u01e3\u01d8\3\2\2\2\u01e3\u01da\3\2"+
		"\2\2\u01e4_\3\2\2\2\u01e5\u01e6\5^\60\2\u01e6\u01e7\7P\2\2\u01e7\u01ec"+
		"\5^\60\2\u01e8\u01e9\7P\2\2\u01e9\u01eb\5^\60\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01eda\3\2\2\2"+
		"\u01ee\u01ec\3\2\2\2\u01ef\u01f0\5^\60\2\u01f0\u01f1\7Q\2\2\u01f1\u01f6"+
		"\5^\60\2\u01f2\u01f3\7Q\2\2\u01f3\u01f5\5^\60\2\u01f4\u01f2\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7c\3\2\2\2"+
		"\u01f8\u01f6\3\2\2\2\u01f9\u01fa\7F\2\2\u01fa\u01fb\5^\60\2\u01fbe\3\2"+
		"\2\2\u01fc\u0200\5`\61\2\u01fd\u0200\5b\62\2\u01fe\u0200\5d\63\2\u01ff"+
		"\u01fc\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200g\3\2\2\2"+
		"\u0201\u0204\5^\60\2\u0202\u0204\5f\64\2\u0203\u0201\3\2\2\2\u0203\u0202"+
		"\3\2\2\2\u0204i\3\2\2\2\u0205\u0206\7(\2\2\u0206\u0207\78\2\2\u0207\u0208"+
		"\5h\65\2\u0208\u0212\79\2\2\u0209\u020d\7\64\2\2\u020a\u020c\5\66\34\2"+
		"\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e"+
		"\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0213\7\65\2\2"+
		"\u0211\u0213\5\66\34\2\u0212\u0209\3\2\2\2\u0212\u0211\3\2\2\2\u0213k"+
		"\3\2\2\2\u0214\u021e\7/\2\2\u0215\u0219\7\64\2\2\u0216\u0218\5\66\34\2"+
		"\u0217\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021f\7\65\2\2"+
		"\u021d\u021f\5\66\34\2\u021e\u0215\3\2\2\2\u021e\u021d\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0221\7(\2\2\u0221\u0222\78\2\2\u0222\u0223\5h\65\2\u0223"+
		"\u0224\79\2\2\u0224m\3\2\2\2\u0225\u0226\7\17\2\2\u0226\u0227\78\2\2\u0227"+
		"\u0228\5\"\22\2\u0228\u0229\5\36\20\2\u0229\u022a\7=\2\2\u022a\u022b\5"+
		"h\65\2\u022b\u0231\7=\2\2\u022c\u022d\5\30\r\2\u022d\u022e\5\36\20\2\u022e"+
		"\u0232\3\2\2\2\u022f\u0232\58\35\2\u0230\u0232\5\u0080A\2\u0231\u022c"+
		"\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u023d\79\2\2\u0234\u0236\7\64\2\2\u0235\u0237\5\66\34\2\u0236\u0235\3"+
		"\2\2\2\u0237\u0238\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u023b\7\65\2\2\u023b\u023e\3\2\2\2\u023c\u023e\5"+
		"\66\34\2\u023d\u0234\3\2\2\2\u023d\u023c\3\2\2\2\u023eo\3\2\2\2\u023f"+
		"\u0240\7\21\2\2\u0240\u0241\78\2\2\u0241\u0242\5h\65\2\u0242\u024c\79"+
		"\2\2\u0243\u0245\7\64\2\2\u0244\u0246\5\66\34\2\u0245\u0244\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2"+
		"\2\2\u0249\u024a\7\65\2\2\u024a\u024d\3\2\2\2\u024b\u024d\5\66\34\2\u024c"+
		"\u0243\3\2\2\2\u024c\u024b\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u0250\5r"+
		":\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250q\3\2\2\2\u0251\u025b"+
		"\7\f\2\2\u0252\u0254\7\64\2\2\u0253\u0255\5\66\34\2\u0254\u0253\3\2\2"+
		"\2\u0255\u0256\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258"+
		"\3\2\2\2\u0258\u0259\7\65\2\2\u0259\u025c\3\2\2\2\u025a\u025c\5\66\34"+
		"\2\u025b\u0252\3\2\2\2\u025b\u025a\3\2\2\2\u025cs\3\2\2\2\u025d\u025e"+
		"\7\20\2\2\u025e\u025f\78\2\2\u025f\u0260\5\"\22\2\u0260\u0261\7)\2\2\u0261"+
		"\u0262\5\30\r\2\u0262\u026c\79\2\2\u0263\u0265\7\64\2\2\u0264\u0266\5"+
		"\66\34\2\u0265\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0265\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\7\65\2\2\u026a\u026d\3"+
		"\2\2\2\u026b\u026d\5\66\34\2\u026c\u0263\3\2\2\2\u026c\u026b\3\2\2\2\u026d"+
		"u\3\2\2\2\u026e\u026f\7*\2\2\u026f\u0270\78\2\2\u0270\u0271\5D#\2\u0271"+
		"\u0272\79\2\2\u0272\u0282\7\64\2\2\u0273\u0274\7+\2\2\u0274\u0275\5(\25"+
		"\2\u0275\u0279\7<\2\2\u0276\u0278\5\66\34\2\u0277\u0276\3\2\2\2\u0278"+
		"\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027e\3\2"+
		"\2\2\u027b\u0279\3\2\2\2\u027c\u027d\7.\2\2\u027d\u027f\7=\2\2\u027e\u027c"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u0273\3\2\2\2\u0281"+
		"\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u028f\3\2"+
		"\2\2\u0284\u0282\3\2\2\2\u0285\u0286\7,\2\2\u0286\u028a\7<\2\2\u0287\u0289"+
		"\5\66\34\2\u0288\u0287\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2"+
		"\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u028e"+
		"\7.\2\2\u028e\u0290\7=\2\2\u028f\u0285\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0292\7\65\2\2\u0292w\3\2\2\2\u0293\u0294\5\30\r"+
		"\2\u0294\u0295\7N\2\2\u0295y\3\2\2\2\u0296\u0297\7N\2\2\u0297\u0298\5"+
		"\30\r\2\u0298{\3\2\2\2\u0299\u029a\5\30\r\2\u029a\u029b\7O\2\2\u029b}"+
		"\3\2\2\2\u029c\u029d\7O\2\2\u029d\u029e\5\30\r\2\u029e\177\3\2\2\2\u029f"+
		"\u02a4\5x=\2\u02a0\u02a4\5z>\2\u02a1\u02a4\5|?\2\u02a2\u02a4\5~@\2\u02a3"+
		"\u029f\3\2\2\2\u02a3\u02a0\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a2\3\2"+
		"\2\2\u02a4\u0081\3\2\2\2I\u0089\u008f\u009d\u00a3\u00a6\u00ae\u00b0\u00b9"+
		"\u00bd\u00c0\u00c3\u00c7\u00cc\u00e3\u00e6\u00ea\u00f3\u00f9\u0106\u010b"+
		"\u010e\u0113\u011a\u0124\u012e\u013a\u0141\u0149\u0158\u0160\u0167\u016c"+
		"\u0172\u0176\u017b\u0184\u018e\u0198\u01a2\u01b8\u01be\u01c3\u01c9\u01d1"+
		"\u01d8\u01e0\u01e3\u01ec\u01f6\u01ff\u0203\u020d\u0212\u0219\u021e\u0231"+
		"\u0238\u023d\u0247\u024c\u024f\u0256\u025b\u0267\u026c\u0279\u027e\u0282"+
		"\u028a\u028f\u02a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}