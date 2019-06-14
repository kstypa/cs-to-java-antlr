// Generated from CSLexer.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITESPACES", "BOOL", "BYTE", "CHAR", "CLASS", "CONST", "DECIMAL", "DELETE", 
			"DOUBLE", "ELSE", "FALSE", "FLOAT", "FOR", "FOREACH", "IF", "INT", "INTERNAL", 
			"LONG", "NAMESPACE", "NEW", "NULL", "OBJECT", "PRIVATE", "PROTECTED", 
			"PUBLIC", "RETURN", "SBYTE", "SHORT", "STATIC", "STRING", "TRUE", "UINT", 
			"ULONG", "USHORT", "USING", "VAR", "VOID", "WHILE", "IN", "SWITCH", "CASE", 
			"DEFAULT", "CONTINUE", "BREAK", "DO", "DIGIT", "UNDERSCORE", "STRING_LITERAL", 
			"IDENTIFIER", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"OPEN_PARENS", "CLOSE_PARENS", "DOT", "COMMA", "COLON", "SEMICOLON", 
			"PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "AMP", "BITWISE_OR", "CARET", 
			"BANG", "TILDE", "ASSIGNMENT", "LT", "GT", "INTERR", "DOUBLE_COLON", 
			"OP_COALESCING", "OP_INC", "OP_DEC", "OP_AND", "OP_OR", "OP_PTR", "OP_EQ", 
			"OP_NE", "OP_LE", "OP_GE", "OP_ADD_ASSIGNMENT", "OP_SUB_ASSIGNMENT", 
			"OP_MULT_ASSIGNMENT", "OP_DIV_ASSIGNMENT", "OP_MOD_ASSIGNMENT", "OP_AND_ASSIGNMENT", 
			"OP_OR_ASSIGNMENT", "OP_XOR_ASSIGNMENT", "OP_LEFT_SHIFT", "OP_LEFT_SHIFT_ASSIGNMENT", 
			"Character", "NewLine", "Whitespace"
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


	public CSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2`\u0266\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\3\2\3\2\6\2\u00c8\n\2\r\2\16\2\u00c9\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\7\61\u01e0\n\61\f\61\16\61\u01e3\13\61\3\61\3\61"+
		"\3\62\3\62\7\62\u01e9\n\62\f\62\16\62\u01ec\13\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>"+
		"\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I"+
		"\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q"+
		"\3R\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y"+
		"\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3]\3]\3]\3^\3^\3^\3_\3_\3_\3_\3`\3`"+
		"\3a\3a\3a\5a\u0263\na\3b\3b\2\2c\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099"+
		"N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00ad"+
		"X\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bf\2\u00c1"+
		"\2\u00c3\2\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13"+
		"\13\"\"\2\u0267\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\3\u00c7\3\2\2\2\5\u00cd\3\2\2"+
		"\2\7\u00d2\3\2\2\2\t\u00d7\3\2\2\2\13\u00dc\3\2\2\2\r\u00e2\3\2\2\2\17"+
		"\u00e8\3\2\2\2\21\u00f0\3\2\2\2\23\u00f7\3\2\2\2\25\u00fe\3\2\2\2\27\u0103"+
		"\3\2\2\2\31\u0109\3\2\2\2\33\u010f\3\2\2\2\35\u0113\3\2\2\2\37\u011b\3"+
		"\2\2\2!\u011e\3\2\2\2#\u0122\3\2\2\2%\u012b\3\2\2\2\'\u0130\3\2\2\2)\u013a"+
		"\3\2\2\2+\u013e\3\2\2\2-\u0143\3\2\2\2/\u014a\3\2\2\2\61\u0152\3\2\2\2"+
		"\63\u015c\3\2\2\2\65\u0163\3\2\2\2\67\u016a\3\2\2\29\u0170\3\2\2\2;\u0176"+
		"\3\2\2\2=\u017d\3\2\2\2?\u0184\3\2\2\2A\u0189\3\2\2\2C\u018e\3\2\2\2E"+
		"\u0194\3\2\2\2G\u019b\3\2\2\2I\u01a1\3\2\2\2K\u01a5\3\2\2\2M\u01aa\3\2"+
		"\2\2O\u01b0\3\2\2\2Q\u01b3\3\2\2\2S\u01ba\3\2\2\2U\u01bf\3\2\2\2W\u01c7"+
		"\3\2\2\2Y\u01d0\3\2\2\2[\u01d6\3\2\2\2]\u01d9\3\2\2\2_\u01db\3\2\2\2a"+
		"\u01dd\3\2\2\2c\u01e6\3\2\2\2e\u01ed\3\2\2\2g\u01ef\3\2\2\2i\u01f1\3\2"+
		"\2\2k\u01f3\3\2\2\2m\u01f5\3\2\2\2o\u01f7\3\2\2\2q\u01f9\3\2\2\2s\u01fb"+
		"\3\2\2\2u\u01fd\3\2\2\2w\u01ff\3\2\2\2y\u0201\3\2\2\2{\u0203\3\2\2\2}"+
		"\u0205\3\2\2\2\177\u0207\3\2\2\2\u0081\u0209\3\2\2\2\u0083\u020b\3\2\2"+
		"\2\u0085\u020d\3\2\2\2\u0087\u020f\3\2\2\2\u0089\u0211\3\2\2\2\u008b\u0213"+
		"\3\2\2\2\u008d\u0215\3\2\2\2\u008f\u0217\3\2\2\2\u0091\u0219\3\2\2\2\u0093"+
		"\u021b\3\2\2\2\u0095\u021d\3\2\2\2\u0097\u0220\3\2\2\2\u0099\u0223\3\2"+
		"\2\2\u009b\u0226\3\2\2\2\u009d\u0229\3\2\2\2\u009f\u022c\3\2\2\2\u00a1"+
		"\u022f\3\2\2\2\u00a3\u0232\3\2\2\2\u00a5\u0235\3\2\2\2\u00a7\u0238\3\2"+
		"\2\2\u00a9\u023b\3\2\2\2\u00ab\u023e\3\2\2\2\u00ad\u0241\3\2\2\2\u00af"+
		"\u0244\3\2\2\2\u00b1\u0247\3\2\2\2\u00b3\u024a\3\2\2\2\u00b5\u024d\3\2"+
		"\2\2\u00b7\u0250\3\2\2\2\u00b9\u0253\3\2\2\2\u00bb\u0256\3\2\2\2\u00bd"+
		"\u0259\3\2\2\2\u00bf\u025d\3\2\2\2\u00c1\u0262\3\2\2\2\u00c3\u0264\3\2"+
		"\2\2\u00c5\u00c8\5\u00c3b\2\u00c6\u00c8\5\u00c1a\2\u00c7\u00c5\3\2\2\2"+
		"\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\2\2\2\u00cc\4\3\2\2\2\u00cd"+
		"\u00ce\7d\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7n\2\2"+
		"\u00d1\6\3\2\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4\7{\2\2\u00d4\u00d5\7v"+
		"\2\2\u00d5\u00d6\7g\2\2\u00d6\b\3\2\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9"+
		"\7j\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7t\2\2\u00db\n\3\2\2\2\u00dc\u00dd"+
		"\7e\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7u\2\2\u00e0"+
		"\u00e1\7u\2\2\u00e1\f\3\2\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7q\2\2\u00e4"+
		"\u00e5\7p\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7v\2\2\u00e7\16\3\2\2\2\u00e8"+
		"\u00e9\7f\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7k\2\2"+
		"\u00ec\u00ed\7o\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7n\2\2\u00ef\20\3\2"+
		"\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4"+
		"\7g\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7g\2\2\u00f6\22\3\2\2\2\u00f7\u00f8"+
		"\7f\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7d\2\2\u00fb"+
		"\u00fc\7n\2\2\u00fc\u00fd\7g\2\2\u00fd\24\3\2\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\7n\2\2\u0100\u0101\7u\2\2\u0101\u0102\7g\2\2\u0102\26\3\2\2\2\u0103"+
		"\u0104\7h\2\2\u0104\u0105\7c\2\2\u0105\u0106\7n\2\2\u0106\u0107\7u\2\2"+
		"\u0107\u0108\7g\2\2\u0108\30\3\2\2\2\u0109\u010a\7h\2\2\u010a\u010b\7"+
		"n\2\2\u010b\u010c\7q\2\2\u010c\u010d\7c\2\2\u010d\u010e\7v\2\2\u010e\32"+
		"\3\2\2\2\u010f\u0110\7h\2\2\u0110\u0111\7q\2\2\u0111\u0112\7t\2\2\u0112"+
		"\34\3\2\2\2\u0113\u0114\7h\2\2\u0114\u0115\7q\2\2\u0115\u0116\7t\2\2\u0116"+
		"\u0117\7g\2\2\u0117\u0118\7c\2\2\u0118\u0119\7e\2\2\u0119\u011a\7j\2\2"+
		"\u011a\36\3\2\2\2\u011b\u011c\7k\2\2\u011c\u011d\7h\2\2\u011d \3\2\2\2"+
		"\u011e\u011f\7k\2\2\u011f\u0120\7p\2\2\u0120\u0121\7v\2\2\u0121\"\3\2"+
		"\2\2\u0122\u0123\7k\2\2\u0123\u0124\7p\2\2\u0124\u0125\7v\2\2\u0125\u0126"+
		"\7g\2\2\u0126\u0127\7t\2\2\u0127\u0128\7p\2\2\u0128\u0129\7c\2\2\u0129"+
		"\u012a\7n\2\2\u012a$\3\2\2\2\u012b\u012c\7n\2\2\u012c\u012d\7q\2\2\u012d"+
		"\u012e\7p\2\2\u012e\u012f\7i\2\2\u012f&\3\2\2\2\u0130\u0131\7p\2\2\u0131"+
		"\u0132\7c\2\2\u0132\u0133\7o\2\2\u0133\u0134\7g\2\2\u0134\u0135\7u\2\2"+
		"\u0135\u0136\7r\2\2\u0136\u0137\7c\2\2\u0137\u0138\7e\2\2\u0138\u0139"+
		"\7g\2\2\u0139(\3\2\2\2\u013a\u013b\7p\2\2\u013b\u013c\7g\2\2\u013c\u013d"+
		"\7y\2\2\u013d*\3\2\2\2\u013e\u013f\7p\2\2\u013f\u0140\7w\2\2\u0140\u0141"+
		"\7n\2\2\u0141\u0142\7n\2\2\u0142,\3\2\2\2\u0143\u0144\7q\2\2\u0144\u0145"+
		"\7d\2\2\u0145\u0146\7l\2\2\u0146\u0147\7g\2\2\u0147\u0148\7e\2\2\u0148"+
		"\u0149\7v\2\2\u0149.\3\2\2\2\u014a\u014b\7r\2\2\u014b\u014c\7t\2\2\u014c"+
		"\u014d\7k\2\2\u014d\u014e\7x\2\2\u014e\u014f\7c\2\2\u014f\u0150\7v\2\2"+
		"\u0150\u0151\7g\2\2\u0151\60\3\2\2\2\u0152\u0153\7r\2\2\u0153\u0154\7"+
		"t\2\2\u0154\u0155\7q\2\2\u0155\u0156\7v\2\2\u0156\u0157\7g\2\2\u0157\u0158"+
		"\7e\2\2\u0158\u0159\7v\2\2\u0159\u015a\7g\2\2\u015a\u015b\7f\2\2\u015b"+
		"\62\3\2\2\2\u015c\u015d\7r\2\2\u015d\u015e\7w\2\2\u015e\u015f\7d\2\2\u015f"+
		"\u0160\7n\2\2\u0160\u0161\7k\2\2\u0161\u0162\7e\2\2\u0162\64\3\2\2\2\u0163"+
		"\u0164\7t\2\2\u0164\u0165\7g\2\2\u0165\u0166\7v\2\2\u0166\u0167\7w\2\2"+
		"\u0167\u0168\7t\2\2\u0168\u0169\7p\2\2\u0169\66\3\2\2\2\u016a\u016b\7"+
		"u\2\2\u016b\u016c\7d\2\2\u016c\u016d\7{\2\2\u016d\u016e\7v\2\2\u016e\u016f"+
		"\7g\2\2\u016f8\3\2\2\2\u0170\u0171\7u\2\2\u0171\u0172\7j\2\2\u0172\u0173"+
		"\7q\2\2\u0173\u0174\7t\2\2\u0174\u0175\7v\2\2\u0175:\3\2\2\2\u0176\u0177"+
		"\7u\2\2\u0177\u0178\7v\2\2\u0178\u0179\7c\2\2\u0179\u017a\7v\2\2\u017a"+
		"\u017b\7k\2\2\u017b\u017c\7e\2\2\u017c<\3\2\2\2\u017d\u017e\7u\2\2\u017e"+
		"\u017f\7v\2\2\u017f\u0180\7t\2\2\u0180\u0181\7k\2\2\u0181\u0182\7p\2\2"+
		"\u0182\u0183\7i\2\2\u0183>\3\2\2\2\u0184\u0185\7v\2\2\u0185\u0186\7t\2"+
		"\2\u0186\u0187\7w\2\2\u0187\u0188\7g\2\2\u0188@\3\2\2\2\u0189\u018a\7"+
		"w\2\2\u018a\u018b\7k\2\2\u018b\u018c\7p\2\2\u018c\u018d\7v\2\2\u018dB"+
		"\3\2\2\2\u018e\u018f\7w\2\2\u018f\u0190\7n\2\2\u0190\u0191\7q\2\2\u0191"+
		"\u0192\7p\2\2\u0192\u0193\7i\2\2\u0193D\3\2\2\2\u0194\u0195\7w\2\2\u0195"+
		"\u0196\7u\2\2\u0196\u0197\7j\2\2\u0197\u0198\7q\2\2\u0198\u0199\7t\2\2"+
		"\u0199\u019a\7v\2\2\u019aF\3\2\2\2\u019b\u019c\7w\2\2\u019c\u019d\7u\2"+
		"\2\u019d\u019e\7k\2\2\u019e\u019f\7p\2\2\u019f\u01a0\7i\2\2\u01a0H\3\2"+
		"\2\2\u01a1\u01a2\7x\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7t\2\2\u01a4J\3"+
		"\2\2\2\u01a5\u01a6\7x\2\2\u01a6\u01a7\7q\2\2\u01a7\u01a8\7k\2\2\u01a8"+
		"\u01a9\7f\2\2\u01a9L\3\2\2\2\u01aa\u01ab\7y\2\2\u01ab\u01ac\7j\2\2\u01ac"+
		"\u01ad\7k\2\2\u01ad\u01ae\7n\2\2\u01ae\u01af\7g\2\2\u01afN\3\2\2\2\u01b0"+
		"\u01b1\7k\2\2\u01b1\u01b2\7p\2\2\u01b2P\3\2\2\2\u01b3\u01b4\7u\2\2\u01b4"+
		"\u01b5\7y\2\2\u01b5\u01b6\7k\2\2\u01b6\u01b7\7v\2\2\u01b7\u01b8\7e\2\2"+
		"\u01b8\u01b9\7j\2\2\u01b9R\3\2\2\2\u01ba\u01bb\7e\2\2\u01bb\u01bc\7c\2"+
		"\2\u01bc\u01bd\7u\2\2\u01bd\u01be\7g\2\2\u01beT\3\2\2\2\u01bf\u01c0\7"+
		"f\2\2\u01c0\u01c1\7g\2\2\u01c1\u01c2\7h\2\2\u01c2\u01c3\7c\2\2\u01c3\u01c4"+
		"\7w\2\2\u01c4\u01c5\7n\2\2\u01c5\u01c6\7v\2\2\u01c6V\3\2\2\2\u01c7\u01c8"+
		"\7e\2\2\u01c8\u01c9\7q\2\2\u01c9\u01ca\7p\2\2\u01ca\u01cb\7v\2\2\u01cb"+
		"\u01cc\7k\2\2\u01cc\u01cd\7p\2\2\u01cd\u01ce\7w\2\2\u01ce\u01cf\7g\2\2"+
		"\u01cfX\3\2\2\2\u01d0\u01d1\7d\2\2\u01d1\u01d2\7t\2\2\u01d2\u01d3\7g\2"+
		"\2\u01d3\u01d4\7c\2\2\u01d4\u01d5\7m\2\2\u01d5Z\3\2\2\2\u01d6\u01d7\7"+
		"f\2\2\u01d7\u01d8\7q\2\2\u01d8\\\3\2\2\2\u01d9\u01da\t\2\2\2\u01da^\3"+
		"\2\2\2\u01db\u01dc\7a\2\2\u01dc`\3\2\2\2\u01dd\u01e1\7$\2\2\u01de\u01e0"+
		"\5\u00bf`\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2"+
		"\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5"+
		"\7$\2\2\u01e5b\3\2\2\2\u01e6\u01ea\t\3\2\2\u01e7\u01e9\t\4\2\2\u01e8\u01e7"+
		"\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"d\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7}\2\2\u01eef\3\2\2\2\u01ef"+
		"\u01f0\7\177\2\2\u01f0h\3\2\2\2\u01f1\u01f2\7]\2\2\u01f2j\3\2\2\2\u01f3"+
		"\u01f4\7_\2\2\u01f4l\3\2\2\2\u01f5\u01f6\7*\2\2\u01f6n\3\2\2\2\u01f7\u01f8"+
		"\7+\2\2\u01f8p\3\2\2\2\u01f9\u01fa\7\60\2\2\u01far\3\2\2\2\u01fb\u01fc"+
		"\7.\2\2\u01fct\3\2\2\2\u01fd\u01fe\7<\2\2\u01fev\3\2\2\2\u01ff\u0200\7"+
		"=\2\2\u0200x\3\2\2\2\u0201\u0202\7-\2\2\u0202z\3\2\2\2\u0203\u0204\7/"+
		"\2\2\u0204|\3\2\2\2\u0205\u0206\7,\2\2\u0206~\3\2\2\2\u0207\u0208\7\61"+
		"\2\2\u0208\u0080\3\2\2\2\u0209\u020a\7\'\2\2\u020a\u0082\3\2\2\2\u020b"+
		"\u020c\7(\2\2\u020c\u0084\3\2\2\2\u020d\u020e\7~\2\2\u020e\u0086\3\2\2"+
		"\2\u020f\u0210\7`\2\2\u0210\u0088\3\2\2\2\u0211\u0212\7#\2\2\u0212\u008a"+
		"\3\2\2\2\u0213\u0214\7\u0080\2\2\u0214\u008c\3\2\2\2\u0215\u0216\7?\2"+
		"\2\u0216\u008e\3\2\2\2\u0217\u0218\7>\2\2\u0218\u0090\3\2\2\2\u0219\u021a"+
		"\7@\2\2\u021a\u0092\3\2\2\2\u021b\u021c\7A\2\2\u021c\u0094\3\2\2\2\u021d"+
		"\u021e\7<\2\2\u021e\u021f\7<\2\2\u021f\u0096\3\2\2\2\u0220\u0221\7A\2"+
		"\2\u0221\u0222\7A\2\2\u0222\u0098\3\2\2\2\u0223\u0224\7-\2\2\u0224\u0225"+
		"\7-\2\2\u0225\u009a\3\2\2\2\u0226\u0227\7/\2\2\u0227\u0228\7/\2\2\u0228"+
		"\u009c\3\2\2\2\u0229\u022a\7(\2\2\u022a\u022b\7(\2\2\u022b\u009e\3\2\2"+
		"\2\u022c\u022d\7~\2\2\u022d\u022e\7~\2\2\u022e\u00a0\3\2\2\2\u022f\u0230"+
		"\7/\2\2\u0230\u0231\7@\2\2\u0231\u00a2\3\2\2\2\u0232\u0233\7?\2\2\u0233"+
		"\u0234\7?\2\2\u0234\u00a4\3\2\2\2\u0235\u0236\7#\2\2\u0236\u0237\7?\2"+
		"\2\u0237\u00a6\3\2\2\2\u0238\u0239\7>\2\2\u0239\u023a\7?\2\2\u023a\u00a8"+
		"\3\2\2\2\u023b\u023c\7@\2\2\u023c\u023d\7?\2\2\u023d\u00aa\3\2\2\2\u023e"+
		"\u023f\7-\2\2\u023f\u0240\7?\2\2\u0240\u00ac\3\2\2\2\u0241\u0242\7/\2"+
		"\2\u0242\u0243\7?\2\2\u0243\u00ae\3\2\2\2\u0244\u0245\7,\2\2\u0245\u0246"+
		"\7?\2\2\u0246\u00b0\3\2\2\2\u0247\u0248\7\61\2\2\u0248\u0249\7?\2\2\u0249"+
		"\u00b2\3\2\2\2\u024a\u024b\7\'\2\2\u024b\u024c\7?\2\2\u024c\u00b4\3\2"+
		"\2\2\u024d\u024e\7(\2\2\u024e\u024f\7?\2\2\u024f\u00b6\3\2\2\2\u0250\u0251"+
		"\7~\2\2\u0251\u0252\7?\2\2\u0252\u00b8\3\2\2\2\u0253\u0254\7`\2\2\u0254"+
		"\u0255\7?\2\2\u0255\u00ba\3\2\2\2\u0256\u0257\7>\2\2\u0257\u0258\7>\2"+
		"\2\u0258\u00bc\3\2\2\2\u0259\u025a\7>\2\2\u025a\u025b\7>\2\2\u025b\u025c"+
		"\7?\2\2\u025c\u00be\3\2\2\2\u025d\u025e\n\5\2\2\u025e\u00c0\3\2\2\2\u025f"+
		"\u0260\7\17\2\2\u0260\u0263\7\f\2\2\u0261\u0263\t\5\2\2\u0262\u025f\3"+
		"\2\2\2\u0262\u0261\3\2\2\2\u0263\u00c2\3\2\2\2\u0264\u0265\t\6\2\2\u0265"+
		"\u00c4\3\2\2\2\b\2\u00c7\u00c9\u01e1\u01ea\u0262\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}