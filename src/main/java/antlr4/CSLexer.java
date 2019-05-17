package antlr4;

// Generated from CSLexer.g4 by ANTLR 4.7.2
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
		TRUE=31, UINT=32, ULONG=33, USHORT=34, USING=35, VAR=36, VOID=37, LOWERCASE=38, 
		UPPERCASE=39, DIGIT=40, UNDERSCORE=41, STRING_LITERAL=42, OPEN_BRACE=43, 
		CLOSE_BRACE=44, OPEN_BRACKET=45, CLOSE_BRACKET=46, OPEN_PARENS=47, CLOSE_PARENS=48, 
		DOT=49, COMMA=50, COLON=51, SEMICOLON=52, PLUS=53, MINUS=54, STAR=55, 
		SLASH=56, PERCENT=57, AMP=58, BITWISE_OR=59, CARET=60, BANG=61, TILDE=62, 
		ASSIGNMENT=63, LT=64, GT=65, INTERR=66, DOUBLE_COLON=67, OP_COALESCING=68, 
		OP_INC=69, OP_DEC=70, OP_AND=71, OP_OR=72, OP_PTR=73, OP_EQ=74, OP_NE=75, 
		OP_LE=76, OP_GE=77, OP_ADD_ASSIGNMENT=78, OP_SUB_ASSIGNMENT=79, OP_MULT_ASSIGNMENT=80, 
		OP_DIV_ASSIGNMENT=81, OP_MOD_ASSIGNMENT=82, OP_AND_ASSIGNMENT=83, OP_OR_ASSIGNMENT=84, 
		OP_XOR_ASSIGNMENT=85, OP_LEFT_SHIFT=86, OP_LEFT_SHIFT_ASSIGNMENT=87;
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
			"ULONG", "USHORT", "USING", "VAR", "VOID", "LOWERCASE", "UPPERCASE", 
			"DIGIT", "UNDERSCORE", "STRING_LITERAL", "OPEN_BRACE", "CLOSE_BRACE", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PARENS", "CLOSE_PARENS", "DOT", 
			"COMMA", "COLON", "SEMICOLON", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", 
			"AMP", "BITWISE_OR", "CARET", "BANG", "TILDE", "ASSIGNMENT", "LT", "GT", 
			"INTERR", "DOUBLE_COLON", "OP_COALESCING", "OP_INC", "OP_DEC", "OP_AND", 
			"OP_OR", "OP_PTR", "OP_EQ", "OP_NE", "OP_LE", "OP_GE", "OP_ADD_ASSIGNMENT", 
			"OP_SUB_ASSIGNMENT", "OP_MULT_ASSIGNMENT", "OP_DIV_ASSIGNMENT", "OP_MOD_ASSIGNMENT", 
			"OP_AND_ASSIGNMENT", "OP_OR_ASSIGNMENT", "OP_XOR_ASSIGNMENT", "OP_LEFT_SHIFT", 
			"OP_LEFT_SHIFT_ASSIGNMENT", "Character", "NewLine", "Whitespace"
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
			"'using'", "'var'", "'void'", null, null, null, "'_'", null, "'{'", "'}'", 
			"'['", "']'", "'('", "')'", "'.'", "','", "':'", "';'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", "'~'", "'='", "'<'", 
			"'>'", "'?'", "'::'", "'??'", "'++'", "'--'", "'&&'", "'||'", "'->'", 
			"'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'&='", "'|='", "'^='", "'<<'", "'<<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACES", "BOOL", "BYTE", "CHAR", "CLASS", "CONST", "DECIMAL", 
			"DELETE", "DOUBLE", "ELSE", "FALSE", "FLOAT", "FOR", "FOREACH", "IF", 
			"INT", "INTERNAL", "LONG", "NAMESPACE", "NEW", "NULL", "OBJECT", "PRIVATE", 
			"PROTECTED", "PUBLIC", "RETURN", "SBYTE", "SHORT", "STATIC", "STRING", 
			"TRUE", "UINT", "ULONG", "USHORT", "USING", "VAR", "VOID", "LOWERCASE", 
			"UPPERCASE", "DIGIT", "UNDERSCORE", "STRING_LITERAL", "OPEN_BRACE", "CLOSE_BRACE", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PARENS", "CLOSE_PARENS", "DOT", 
			"COMMA", "COLON", "SEMICOLON", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", 
			"AMP", "BITWISE_OR", "CARET", "BANG", "TILDE", "ASSIGNMENT", "LT", "GT", 
			"INTERR", "DOUBLE_COLON", "OP_COALESCING", "OP_INC", "OP_DEC", "OP_AND", 
			"OP_OR", "OP_PTR", "OP_EQ", "OP_NE", "OP_LE", "OP_GE", "OP_ADD_ASSIGNMENT", 
			"OP_SUB_ASSIGNMENT", "OP_MULT_ASSIGNMENT", "OP_DIV_ASSIGNMENT", "OP_MOD_ASSIGNMENT", 
			"OP_AND_ASSIGNMENT", "OP_OR_ASSIGNMENT", "OP_XOR_ASSIGNMENT", "OP_LEFT_SHIFT", 
			"OP_LEFT_SHIFT_ASSIGNMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Y\u022c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\6\2\u00ba\n\2\r\2\16"+
		"\2\u00bb\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3\'\6\'\u019e\n\'\r\'\16\'\u019f\3(\6(\u01a3\n(\r(\16(\u01a4"+
		"\3)\3)\3*\3*\3+\3+\7+\u01ad\n+\f+\16+\u01b0\13+\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@"+
		"\3@\3A\3A\3B\3B\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I"+
		"\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P"+
		"\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X"+
		"\3X\3X\3Y\3Y\3Z\3Z\3Z\5Z\u0229\nZ\3[\3[\2\2\\\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9"+
		"V\u00abW\u00adX\u00afY\u00b1\2\u00b3\2\u00b5\2\3\2\7\3\2c|\3\2C\\\3\2"+
		"\62;\4\2\f\f\17\17\4\2\13\13\"\"\2\u022e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\3\u00b9\3\2\2\2\5\u00bf\3\2\2\2\7\u00c4"+
		"\3\2\2\2\t\u00c9\3\2\2\2\13\u00ce\3\2\2\2\r\u00d4\3\2\2\2\17\u00da\3\2"+
		"\2\2\21\u00e2\3\2\2\2\23\u00e9\3\2\2\2\25\u00f0\3\2\2\2\27\u00f5\3\2\2"+
		"\2\31\u00fb\3\2\2\2\33\u0101\3\2\2\2\35\u0105\3\2\2\2\37\u010d\3\2\2\2"+
		"!\u0110\3\2\2\2#\u0114\3\2\2\2%\u011d\3\2\2\2\'\u0122\3\2\2\2)\u012c\3"+
		"\2\2\2+\u0130\3\2\2\2-\u0135\3\2\2\2/\u013c\3\2\2\2\61\u0144\3\2\2\2\63"+
		"\u014e\3\2\2\2\65\u0155\3\2\2\2\67\u015c\3\2\2\29\u0162\3\2\2\2;\u0168"+
		"\3\2\2\2=\u016f\3\2\2\2?\u0176\3\2\2\2A\u017b\3\2\2\2C\u0180\3\2\2\2E"+
		"\u0186\3\2\2\2G\u018d\3\2\2\2I\u0193\3\2\2\2K\u0197\3\2\2\2M\u019d\3\2"+
		"\2\2O\u01a2\3\2\2\2Q\u01a6\3\2\2\2S\u01a8\3\2\2\2U\u01aa\3\2\2\2W\u01b3"+
		"\3\2\2\2Y\u01b5\3\2\2\2[\u01b7\3\2\2\2]\u01b9\3\2\2\2_\u01bb\3\2\2\2a"+
		"\u01bd\3\2\2\2c\u01bf\3\2\2\2e\u01c1\3\2\2\2g\u01c3\3\2\2\2i\u01c5\3\2"+
		"\2\2k\u01c7\3\2\2\2m\u01c9\3\2\2\2o\u01cb\3\2\2\2q\u01cd\3\2\2\2s\u01cf"+
		"\3\2\2\2u\u01d1\3\2\2\2w\u01d3\3\2\2\2y\u01d5\3\2\2\2{\u01d7\3\2\2\2}"+
		"\u01d9\3\2\2\2\177\u01db\3\2\2\2\u0081\u01dd\3\2\2\2\u0083\u01df\3\2\2"+
		"\2\u0085\u01e1\3\2\2\2\u0087\u01e3\3\2\2\2\u0089\u01e6\3\2\2\2\u008b\u01e9"+
		"\3\2\2\2\u008d\u01ec\3\2\2\2\u008f\u01ef\3\2\2\2\u0091\u01f2\3\2\2\2\u0093"+
		"\u01f5\3\2\2\2\u0095\u01f8\3\2\2\2\u0097\u01fb\3\2\2\2\u0099\u01fe\3\2"+
		"\2\2\u009b\u0201\3\2\2\2\u009d\u0204\3\2\2\2\u009f\u0207\3\2\2\2\u00a1"+
		"\u020a\3\2\2\2\u00a3\u020d\3\2\2\2\u00a5\u0210\3\2\2\2\u00a7\u0213\3\2"+
		"\2\2\u00a9\u0216\3\2\2\2\u00ab\u0219\3\2\2\2\u00ad\u021c\3\2\2\2\u00af"+
		"\u021f\3\2\2\2\u00b1\u0223\3\2\2\2\u00b3\u0228\3\2\2\2\u00b5\u022a\3\2"+
		"\2\2\u00b7\u00ba\5\u00b5[\2\u00b8\u00ba\5\u00b3Z\2\u00b9\u00b7\3\2\2\2"+
		"\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\2\2\2\u00be\4\3\2\2\2\u00bf"+
		"\u00c0\7d\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7n\2\2"+
		"\u00c3\6\3\2\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7{\2\2\u00c6\u00c7\7v"+
		"\2\2\u00c7\u00c8\7g\2\2\u00c8\b\3\2\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb"+
		"\7j\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7t\2\2\u00cd\n\3\2\2\2\u00ce\u00cf"+
		"\7e\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7u\2\2\u00d2"+
		"\u00d3\7u\2\2\u00d3\f\3\2\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7q\2\2\u00d6"+
		"\u00d7\7p\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7v\2\2\u00d9\16\3\2\2\2\u00da"+
		"\u00db\7f\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7k\2\2"+
		"\u00de\u00df\7o\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1\20\3\2"+
		"\2\2\u00e2\u00e3\7f\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6"+
		"\7g\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7g\2\2\u00e8\22\3\2\2\2\u00e9\u00ea"+
		"\7f\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7d\2\2\u00ed"+
		"\u00ee\7n\2\2\u00ee\u00ef\7g\2\2\u00ef\24\3\2\2\2\u00f0\u00f1\7g\2\2\u00f1"+
		"\u00f2\7n\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7g\2\2\u00f4\26\3\2\2\2\u00f5"+
		"\u00f6\7h\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7u\2\2"+
		"\u00f9\u00fa\7g\2\2\u00fa\30\3\2\2\2\u00fb\u00fc\7h\2\2\u00fc\u00fd\7"+
		"n\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7v\2\2\u0100\32"+
		"\3\2\2\2\u0101\u0102\7h\2\2\u0102\u0103\7q\2\2\u0103\u0104\7t\2\2\u0104"+
		"\34\3\2\2\2\u0105\u0106\7h\2\2\u0106\u0107\7q\2\2\u0107\u0108\7t\2\2\u0108"+
		"\u0109\7g\2\2\u0109\u010a\7c\2\2\u010a\u010b\7e\2\2\u010b\u010c\7j\2\2"+
		"\u010c\36\3\2\2\2\u010d\u010e\7k\2\2\u010e\u010f\7h\2\2\u010f \3\2\2\2"+
		"\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113\7v\2\2\u0113\"\3\2"+
		"\2\2\u0114\u0115\7k\2\2\u0115\u0116\7p\2\2\u0116\u0117\7v\2\2\u0117\u0118"+
		"\7g\2\2\u0118\u0119\7t\2\2\u0119\u011a\7p\2\2\u011a\u011b\7c\2\2\u011b"+
		"\u011c\7n\2\2\u011c$\3\2\2\2\u011d\u011e\7n\2\2\u011e\u011f\7q\2\2\u011f"+
		"\u0120\7p\2\2\u0120\u0121\7i\2\2\u0121&\3\2\2\2\u0122\u0123\7p\2\2\u0123"+
		"\u0124\7c\2\2\u0124\u0125\7o\2\2\u0125\u0126\7g\2\2\u0126\u0127\7u\2\2"+
		"\u0127\u0128\7r\2\2\u0128\u0129\7c\2\2\u0129\u012a\7e\2\2\u012a\u012b"+
		"\7g\2\2\u012b(\3\2\2\2\u012c\u012d\7p\2\2\u012d\u012e\7g\2\2\u012e\u012f"+
		"\7y\2\2\u012f*\3\2\2\2\u0130\u0131\7p\2\2\u0131\u0132\7w\2\2\u0132\u0133"+
		"\7n\2\2\u0133\u0134\7n\2\2\u0134,\3\2\2\2\u0135\u0136\7q\2\2\u0136\u0137"+
		"\7d\2\2\u0137\u0138\7l\2\2\u0138\u0139\7g\2\2\u0139\u013a\7e\2\2\u013a"+
		"\u013b\7v\2\2\u013b.\3\2\2\2\u013c\u013d\7r\2\2\u013d\u013e\7t\2\2\u013e"+
		"\u013f\7k\2\2\u013f\u0140\7x\2\2\u0140\u0141\7c\2\2\u0141\u0142\7v\2\2"+
		"\u0142\u0143\7g\2\2\u0143\60\3\2\2\2\u0144\u0145\7r\2\2\u0145\u0146\7"+
		"t\2\2\u0146\u0147\7q\2\2\u0147\u0148\7v\2\2\u0148\u0149\7g\2\2\u0149\u014a"+
		"\7e\2\2\u014a\u014b\7v\2\2\u014b\u014c\7g\2\2\u014c\u014d\7f\2\2\u014d"+
		"\62\3\2\2\2\u014e\u014f\7r\2\2\u014f\u0150\7w\2\2\u0150\u0151\7d\2\2\u0151"+
		"\u0152\7n\2\2\u0152\u0153\7k\2\2\u0153\u0154\7e\2\2\u0154\64\3\2\2\2\u0155"+
		"\u0156\7t\2\2\u0156\u0157\7g\2\2\u0157\u0158\7v\2\2\u0158\u0159\7w\2\2"+
		"\u0159\u015a\7t\2\2\u015a\u015b\7p\2\2\u015b\66\3\2\2\2\u015c\u015d\7"+
		"u\2\2\u015d\u015e\7d\2\2\u015e\u015f\7{\2\2\u015f\u0160\7v\2\2\u0160\u0161"+
		"\7g\2\2\u01618\3\2\2\2\u0162\u0163\7u\2\2\u0163\u0164\7j\2\2\u0164\u0165"+
		"\7q\2\2\u0165\u0166\7t\2\2\u0166\u0167\7v\2\2\u0167:\3\2\2\2\u0168\u0169"+
		"\7u\2\2\u0169\u016a\7v\2\2\u016a\u016b\7c\2\2\u016b\u016c\7v\2\2\u016c"+
		"\u016d\7k\2\2\u016d\u016e\7e\2\2\u016e<\3\2\2\2\u016f\u0170\7u\2\2\u0170"+
		"\u0171\7v\2\2\u0171\u0172\7t\2\2\u0172\u0173\7k\2\2\u0173\u0174\7p\2\2"+
		"\u0174\u0175\7i\2\2\u0175>\3\2\2\2\u0176\u0177\7v\2\2\u0177\u0178\7t\2"+
		"\2\u0178\u0179\7w\2\2\u0179\u017a\7g\2\2\u017a@\3\2\2\2\u017b\u017c\7"+
		"w\2\2\u017c\u017d\7k\2\2\u017d\u017e\7p\2\2\u017e\u017f\7v\2\2\u017fB"+
		"\3\2\2\2\u0180\u0181\7w\2\2\u0181\u0182\7n\2\2\u0182\u0183\7q\2\2\u0183"+
		"\u0184\7p\2\2\u0184\u0185\7i\2\2\u0185D\3\2\2\2\u0186\u0187\7w\2\2\u0187"+
		"\u0188\7u\2\2\u0188\u0189\7j\2\2\u0189\u018a\7q\2\2\u018a\u018b\7t\2\2"+
		"\u018b\u018c\7v\2\2\u018cF\3\2\2\2\u018d\u018e\7w\2\2\u018e\u018f\7u\2"+
		"\2\u018f\u0190\7k\2\2\u0190\u0191\7p\2\2\u0191\u0192\7i\2\2\u0192H\3\2"+
		"\2\2\u0193\u0194\7x\2\2\u0194\u0195\7c\2\2\u0195\u0196\7t\2\2\u0196J\3"+
		"\2\2\2\u0197\u0198\7x\2\2\u0198\u0199\7q\2\2\u0199\u019a\7k\2\2\u019a"+
		"\u019b\7f\2\2\u019bL\3\2\2\2\u019c\u019e\t\2\2\2\u019d\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0N\3\2\2\2"+
		"\u01a1\u01a3\t\3\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5P\3\2\2\2\u01a6\u01a7\t\4\2\2\u01a7"+
		"R\3\2\2\2\u01a8\u01a9\7a\2\2\u01a9T\3\2\2\2\u01aa\u01ae\7$\2\2\u01ab\u01ad"+
		"\5\u00b1Y\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2"+
		"\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2"+
		"\7$\2\2\u01b2V\3\2\2\2\u01b3\u01b4\7}\2\2\u01b4X\3\2\2\2\u01b5\u01b6\7"+
		"\177\2\2\u01b6Z\3\2\2\2\u01b7\u01b8\7]\2\2\u01b8\\\3\2\2\2\u01b9\u01ba"+
		"\7_\2\2\u01ba^\3\2\2\2\u01bb\u01bc\7*\2\2\u01bc`\3\2\2\2\u01bd\u01be\7"+
		"+\2\2\u01beb\3\2\2\2\u01bf\u01c0\7\60\2\2\u01c0d\3\2\2\2\u01c1\u01c2\7"+
		".\2\2\u01c2f\3\2\2\2\u01c3\u01c4\7<\2\2\u01c4h\3\2\2\2\u01c5\u01c6\7="+
		"\2\2\u01c6j\3\2\2\2\u01c7\u01c8\7-\2\2\u01c8l\3\2\2\2\u01c9\u01ca\7/\2"+
		"\2\u01can\3\2\2\2\u01cb\u01cc\7,\2\2\u01ccp\3\2\2\2\u01cd\u01ce\7\61\2"+
		"\2\u01cer\3\2\2\2\u01cf\u01d0\7\'\2\2\u01d0t\3\2\2\2\u01d1\u01d2\7(\2"+
		"\2\u01d2v\3\2\2\2\u01d3\u01d4\7~\2\2\u01d4x\3\2\2\2\u01d5\u01d6\7`\2\2"+
		"\u01d6z\3\2\2\2\u01d7\u01d8\7#\2\2\u01d8|\3\2\2\2\u01d9\u01da\7\u0080"+
		"\2\2\u01da~\3\2\2\2\u01db\u01dc\7?\2\2\u01dc\u0080\3\2\2\2\u01dd\u01de"+
		"\7>\2\2\u01de\u0082\3\2\2\2\u01df\u01e0\7@\2\2\u01e0\u0084\3\2\2\2\u01e1"+
		"\u01e2\7A\2\2\u01e2\u0086\3\2\2\2\u01e3\u01e4\7<\2\2\u01e4\u01e5\7<\2"+
		"\2\u01e5\u0088\3\2\2\2\u01e6\u01e7\7A\2\2\u01e7\u01e8\7A\2\2\u01e8\u008a"+
		"\3\2\2\2\u01e9\u01ea\7-\2\2\u01ea\u01eb\7-\2\2\u01eb\u008c\3\2\2\2\u01ec"+
		"\u01ed\7/\2\2\u01ed\u01ee\7/\2\2\u01ee\u008e\3\2\2\2\u01ef\u01f0\7(\2"+
		"\2\u01f0\u01f1\7(\2\2\u01f1\u0090\3\2\2\2\u01f2\u01f3\7~\2\2\u01f3\u01f4"+
		"\7~\2\2\u01f4\u0092\3\2\2\2\u01f5\u01f6\7/\2\2\u01f6\u01f7\7@\2\2\u01f7"+
		"\u0094\3\2\2\2\u01f8\u01f9\7?\2\2\u01f9\u01fa\7?\2\2\u01fa\u0096\3\2\2"+
		"\2\u01fb\u01fc\7#\2\2\u01fc\u01fd\7?\2\2\u01fd\u0098\3\2\2\2\u01fe\u01ff"+
		"\7>\2\2\u01ff\u0200\7?\2\2\u0200\u009a\3\2\2\2\u0201\u0202\7@\2\2\u0202"+
		"\u0203\7?\2\2\u0203\u009c\3\2\2\2\u0204\u0205\7-\2\2\u0205\u0206\7?\2"+
		"\2\u0206\u009e\3\2\2\2\u0207\u0208\7/\2\2\u0208\u0209\7?\2\2\u0209\u00a0"+
		"\3\2\2\2\u020a\u020b\7,\2\2\u020b\u020c\7?\2\2\u020c\u00a2\3\2\2\2\u020d"+
		"\u020e\7\61\2\2\u020e\u020f\7?\2\2\u020f\u00a4\3\2\2\2\u0210\u0211\7\'"+
		"\2\2\u0211\u0212\7?\2\2\u0212\u00a6\3\2\2\2\u0213\u0214\7(\2\2\u0214\u0215"+
		"\7?\2\2\u0215\u00a8\3\2\2\2\u0216\u0217\7~\2\2\u0217\u0218\7?\2\2\u0218"+
		"\u00aa\3\2\2\2\u0219\u021a\7`\2\2\u021a\u021b\7?\2\2\u021b\u00ac\3\2\2"+
		"\2\u021c\u021d\7>\2\2\u021d\u021e\7>\2\2\u021e\u00ae\3\2\2\2\u021f\u0220"+
		"\7>\2\2\u0220\u0221\7>\2\2\u0221\u0222\7?\2\2\u0222\u00b0\3\2\2\2\u0223"+
		"\u0224\n\5\2\2\u0224\u00b2\3\2\2\2\u0225\u0226\7\17\2\2\u0226\u0229\7"+
		"\f\2\2\u0227\u0229\t\5\2\2\u0228\u0225\3\2\2\2\u0228\u0227\3\2\2\2\u0229"+
		"\u00b4\3\2\2\2\u022a\u022b\t\6\2\2\u022b\u00b6\3\2\2\2\t\2\u00b9\u00bb"+
		"\u019f\u01a4\u01ae\u0228\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}