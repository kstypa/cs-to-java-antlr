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
		IN=39, SWITCH=40, CASE=41, DEFAULT=42, CONTINUE=43, BREAK=44, DO=45, LOWERCASE=46, 
		UPPERCASE=47, DIGIT=48, UNDERSCORE=49, STRING_LITERAL=50, IDENTIFIER=51, 
		OPEN_BRACE=52, CLOSE_BRACE=53, OPEN_BRACKET=54, CLOSE_BRACKET=55, OPEN_PARENS=56, 
		CLOSE_PARENS=57, DOT=58, COMMA=59, COLON=60, SEMICOLON=61, PLUS=62, MINUS=63, 
		STAR=64, SLASH=65, PERCENT=66, AMP=67, BITWISE_OR=68, CARET=69, BANG=70, 
		TILDE=71, ASSIGNMENT=72, LT=73, GT=74, INTERR=75, DOUBLE_COLON=76, OP_COALESCING=77, 
		OP_INC=78, OP_DEC=79, OP_AND=80, OP_OR=81, OP_PTR=82, OP_EQ=83, OP_NE=84, 
		OP_LE=85, OP_GE=86, OP_ADD_ASSIGNMENT=87, OP_SUB_ASSIGNMENT=88, OP_MULT_ASSIGNMENT=89, 
		OP_DIV_ASSIGNMENT=90, OP_MOD_ASSIGNMENT=91, OP_AND_ASSIGNMENT=92, OP_OR_ASSIGNMENT=93, 
		OP_XOR_ASSIGNMENT=94, OP_LEFT_SHIFT=95, OP_LEFT_SHIFT_ASSIGNMENT=96;
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
			"DEFAULT", "CONTINUE", "BREAK", "DO", "LOWERCASE", "UPPERCASE", "DIGIT", 
			"UNDERSCORE", "STRING_LITERAL", "IDENTIFIER", "OPEN_BRACE", "CLOSE_BRACE", 
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
			"'using'", "'var'", "'void'", "'while'", "'in'", "'switch'", "'case'", 
			"'default'", "'continue'", "'break'", "'do'", null, null, null, "'_'", 
			null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'.'", "','", "':'", 
			"';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", 
			"'~'", "'='", "'<'", "'>'", "'?'", "'::'", "'??'", "'++'", "'--'", "'&&'", 
			"'||'", "'->'", "'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'&='", "'|='", "'^='", "'<<'", "'<<='"
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
			"SWITCH", "CASE", "DEFAULT", "CONTINUE", "BREAK", "DO", "LOWERCASE", 
			"UPPERCASE", "DIGIT", "UNDERSCORE", "STRING_LITERAL", "IDENTIFIER", "OPEN_BRACE", 
			"CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PARENS", "CLOSE_PARENS", 
			"DOT", "COMMA", "COLON", "SEMICOLON", "PLUS", "MINUS", "STAR", "SLASH", 
			"PERCENT", "AMP", "BITWISE_OR", "CARET", "BANG", "TILDE", "ASSIGNMENT", 
			"LT", "GT", "INTERR", "DOUBLE_COLON", "OP_COALESCING", "OP_INC", "OP_DEC", 
			"OP_AND", "OP_OR", "OP_PTR", "OP_EQ", "OP_NE", "OP_LE", "OP_GE", "OP_ADD_ASSIGNMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2b\u026e\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\6\2\u00cc\n\2\r\2\16\2\u00cd\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\7\63\u01e8\n\63"+
		"\f\63\16\63\u01eb\13\63\3\63\3\63\3\64\3\64\7\64\u01f1\n\64\f\64\16\64"+
		"\u01f4\13\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<"+
		"\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G"+
		"\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\3Q"+
		"\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X"+
		"\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3]\3]\3]\3^\3^\3^\3_\3_\3_\3`"+
		"\3`\3`\3a\3a\3a\3a\3b\3b\3c\3c\3c\5c\u026b\nc\3d\3d\2\2e\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9"+
		"^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3\2\u00c5\2\u00c7\2\3\2\t\3\2c|\3\2"+
		"C\\\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"\2\u026f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\3\u00cb\3\2\2"+
		"\2\5\u00d1\3\2\2\2\7\u00d6\3\2\2\2\t\u00db\3\2\2\2\13\u00e0\3\2\2\2\r"+
		"\u00e6\3\2\2\2\17\u00ec\3\2\2\2\21\u00f4\3\2\2\2\23\u00fb\3\2\2\2\25\u0102"+
		"\3\2\2\2\27\u0107\3\2\2\2\31\u010d\3\2\2\2\33\u0113\3\2\2\2\35\u0117\3"+
		"\2\2\2\37\u011f\3\2\2\2!\u0122\3\2\2\2#\u0126\3\2\2\2%\u012f\3\2\2\2\'"+
		"\u0134\3\2\2\2)\u013e\3\2\2\2+\u0142\3\2\2\2-\u0147\3\2\2\2/\u014e\3\2"+
		"\2\2\61\u0156\3\2\2\2\63\u0160\3\2\2\2\65\u0167\3\2\2\2\67\u016e\3\2\2"+
		"\29\u0174\3\2\2\2;\u017a\3\2\2\2=\u0181\3\2\2\2?\u0188\3\2\2\2A\u018d"+
		"\3\2\2\2C\u0192\3\2\2\2E\u0198\3\2\2\2G\u019f\3\2\2\2I\u01a5\3\2\2\2K"+
		"\u01a9\3\2\2\2M\u01ae\3\2\2\2O\u01b4\3\2\2\2Q\u01b7\3\2\2\2S\u01be\3\2"+
		"\2\2U\u01c3\3\2\2\2W\u01cb\3\2\2\2Y\u01d4\3\2\2\2[\u01da\3\2\2\2]\u01dd"+
		"\3\2\2\2_\u01df\3\2\2\2a\u01e1\3\2\2\2c\u01e3\3\2\2\2e\u01e5\3\2\2\2g"+
		"\u01ee\3\2\2\2i\u01f5\3\2\2\2k\u01f7\3\2\2\2m\u01f9\3\2\2\2o\u01fb\3\2"+
		"\2\2q\u01fd\3\2\2\2s\u01ff\3\2\2\2u\u0201\3\2\2\2w\u0203\3\2\2\2y\u0205"+
		"\3\2\2\2{\u0207\3\2\2\2}\u0209\3\2\2\2\177\u020b\3\2\2\2\u0081\u020d\3"+
		"\2\2\2\u0083\u020f\3\2\2\2\u0085\u0211\3\2\2\2\u0087\u0213\3\2\2\2\u0089"+
		"\u0215\3\2\2\2\u008b\u0217\3\2\2\2\u008d\u0219\3\2\2\2\u008f\u021b\3\2"+
		"\2\2\u0091\u021d\3\2\2\2\u0093\u021f\3\2\2\2\u0095\u0221\3\2\2\2\u0097"+
		"\u0223\3\2\2\2\u0099\u0225\3\2\2\2\u009b\u0228\3\2\2\2\u009d\u022b\3\2"+
		"\2\2\u009f\u022e\3\2\2\2\u00a1\u0231\3\2\2\2\u00a3\u0234\3\2\2\2\u00a5"+
		"\u0237\3\2\2\2\u00a7\u023a\3\2\2\2\u00a9\u023d\3\2\2\2\u00ab\u0240\3\2"+
		"\2\2\u00ad\u0243\3\2\2\2\u00af\u0246\3\2\2\2\u00b1\u0249\3\2\2\2\u00b3"+
		"\u024c\3\2\2\2\u00b5\u024f\3\2\2\2\u00b7\u0252\3\2\2\2\u00b9\u0255\3\2"+
		"\2\2\u00bb\u0258\3\2\2\2\u00bd\u025b\3\2\2\2\u00bf\u025e\3\2\2\2\u00c1"+
		"\u0261\3\2\2\2\u00c3\u0265\3\2\2\2\u00c5\u026a\3\2\2\2\u00c7\u026c\3\2"+
		"\2\2\u00c9\u00cc\5\u00c7d\2\u00ca\u00cc\5\u00c5c\2\u00cb\u00c9\3\2\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\2\2\2\u00d0\4\3\2\2\2\u00d1"+
		"\u00d2\7d\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7n\2\2"+
		"\u00d5\6\3\2\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8\7{\2\2\u00d8\u00d9\7v"+
		"\2\2\u00d9\u00da\7g\2\2\u00da\b\3\2\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd"+
		"\7j\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7t\2\2\u00df\n\3\2\2\2\u00e0\u00e1"+
		"\7e\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7u\2\2\u00e4"+
		"\u00e5\7u\2\2\u00e5\f\3\2\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7q\2\2\u00e8"+
		"\u00e9\7p\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7v\2\2\u00eb\16\3\2\2\2\u00ec"+
		"\u00ed\7f\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7k\2\2"+
		"\u00f0\u00f1\7o\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7n\2\2\u00f3\20\3\2"+
		"\2\2\u00f4\u00f5\7f\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8"+
		"\7g\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7g\2\2\u00fa\22\3\2\2\2\u00fb\u00fc"+
		"\7f\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7d\2\2\u00ff"+
		"\u0100\7n\2\2\u0100\u0101\7g\2\2\u0101\24\3\2\2\2\u0102\u0103\7g\2\2\u0103"+
		"\u0104\7n\2\2\u0104\u0105\7u\2\2\u0105\u0106\7g\2\2\u0106\26\3\2\2\2\u0107"+
		"\u0108\7h\2\2\u0108\u0109\7c\2\2\u0109\u010a\7n\2\2\u010a\u010b\7u\2\2"+
		"\u010b\u010c\7g\2\2\u010c\30\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f\7"+
		"n\2\2\u010f\u0110\7q\2\2\u0110\u0111\7c\2\2\u0111\u0112\7v\2\2\u0112\32"+
		"\3\2\2\2\u0113\u0114\7h\2\2\u0114\u0115\7q\2\2\u0115\u0116\7t\2\2\u0116"+
		"\34\3\2\2\2\u0117\u0118\7h\2\2\u0118\u0119\7q\2\2\u0119\u011a\7t\2\2\u011a"+
		"\u011b\7g\2\2\u011b\u011c\7c\2\2\u011c\u011d\7e\2\2\u011d\u011e\7j\2\2"+
		"\u011e\36\3\2\2\2\u011f\u0120\7k\2\2\u0120\u0121\7h\2\2\u0121 \3\2\2\2"+
		"\u0122\u0123\7k\2\2\u0123\u0124\7p\2\2\u0124\u0125\7v\2\2\u0125\"\3\2"+
		"\2\2\u0126\u0127\7k\2\2\u0127\u0128\7p\2\2\u0128\u0129\7v\2\2\u0129\u012a"+
		"\7g\2\2\u012a\u012b\7t\2\2\u012b\u012c\7p\2\2\u012c\u012d\7c\2\2\u012d"+
		"\u012e\7n\2\2\u012e$\3\2\2\2\u012f\u0130\7n\2\2\u0130\u0131\7q\2\2\u0131"+
		"\u0132\7p\2\2\u0132\u0133\7i\2\2\u0133&\3\2\2\2\u0134\u0135\7p\2\2\u0135"+
		"\u0136\7c\2\2\u0136\u0137\7o\2\2\u0137\u0138\7g\2\2\u0138\u0139\7u\2\2"+
		"\u0139\u013a\7r\2\2\u013a\u013b\7c\2\2\u013b\u013c\7e\2\2\u013c\u013d"+
		"\7g\2\2\u013d(\3\2\2\2\u013e\u013f\7p\2\2\u013f\u0140\7g\2\2\u0140\u0141"+
		"\7y\2\2\u0141*\3\2\2\2\u0142\u0143\7p\2\2\u0143\u0144\7w\2\2\u0144\u0145"+
		"\7n\2\2\u0145\u0146\7n\2\2\u0146,\3\2\2\2\u0147\u0148\7q\2\2\u0148\u0149"+
		"\7d\2\2\u0149\u014a\7l\2\2\u014a\u014b\7g\2\2\u014b\u014c\7e\2\2\u014c"+
		"\u014d\7v\2\2\u014d.\3\2\2\2\u014e\u014f\7r\2\2\u014f\u0150\7t\2\2\u0150"+
		"\u0151\7k\2\2\u0151\u0152\7x\2\2\u0152\u0153\7c\2\2\u0153\u0154\7v\2\2"+
		"\u0154\u0155\7g\2\2\u0155\60\3\2\2\2\u0156\u0157\7r\2\2\u0157\u0158\7"+
		"t\2\2\u0158\u0159\7q\2\2\u0159\u015a\7v\2\2\u015a\u015b\7g\2\2\u015b\u015c"+
		"\7e\2\2\u015c\u015d\7v\2\2\u015d\u015e\7g\2\2\u015e\u015f\7f\2\2\u015f"+
		"\62\3\2\2\2\u0160\u0161\7r\2\2\u0161\u0162\7w\2\2\u0162\u0163\7d\2\2\u0163"+
		"\u0164\7n\2\2\u0164\u0165\7k\2\2\u0165\u0166\7e\2\2\u0166\64\3\2\2\2\u0167"+
		"\u0168\7t\2\2\u0168\u0169\7g\2\2\u0169\u016a\7v\2\2\u016a\u016b\7w\2\2"+
		"\u016b\u016c\7t\2\2\u016c\u016d\7p\2\2\u016d\66\3\2\2\2\u016e\u016f\7"+
		"u\2\2\u016f\u0170\7d\2\2\u0170\u0171\7{\2\2\u0171\u0172\7v\2\2\u0172\u0173"+
		"\7g\2\2\u01738\3\2\2\2\u0174\u0175\7u\2\2\u0175\u0176\7j\2\2\u0176\u0177"+
		"\7q\2\2\u0177\u0178\7t\2\2\u0178\u0179\7v\2\2\u0179:\3\2\2\2\u017a\u017b"+
		"\7u\2\2\u017b\u017c\7v\2\2\u017c\u017d\7c\2\2\u017d\u017e\7v\2\2\u017e"+
		"\u017f\7k\2\2\u017f\u0180\7e\2\2\u0180<\3\2\2\2\u0181\u0182\7u\2\2\u0182"+
		"\u0183\7v\2\2\u0183\u0184\7t\2\2\u0184\u0185\7k\2\2\u0185\u0186\7p\2\2"+
		"\u0186\u0187\7i\2\2\u0187>\3\2\2\2\u0188\u0189\7v\2\2\u0189\u018a\7t\2"+
		"\2\u018a\u018b\7w\2\2\u018b\u018c\7g\2\2\u018c@\3\2\2\2\u018d\u018e\7"+
		"w\2\2\u018e\u018f\7k\2\2\u018f\u0190\7p\2\2\u0190\u0191\7v\2\2\u0191B"+
		"\3\2\2\2\u0192\u0193\7w\2\2\u0193\u0194\7n\2\2\u0194\u0195\7q\2\2\u0195"+
		"\u0196\7p\2\2\u0196\u0197\7i\2\2\u0197D\3\2\2\2\u0198\u0199\7w\2\2\u0199"+
		"\u019a\7u\2\2\u019a\u019b\7j\2\2\u019b\u019c\7q\2\2\u019c\u019d\7t\2\2"+
		"\u019d\u019e\7v\2\2\u019eF\3\2\2\2\u019f\u01a0\7w\2\2\u01a0\u01a1\7u\2"+
		"\2\u01a1\u01a2\7k\2\2\u01a2\u01a3\7p\2\2\u01a3\u01a4\7i\2\2\u01a4H\3\2"+
		"\2\2\u01a5\u01a6\7x\2\2\u01a6\u01a7\7c\2\2\u01a7\u01a8\7t\2\2\u01a8J\3"+
		"\2\2\2\u01a9\u01aa\7x\2\2\u01aa\u01ab\7q\2\2\u01ab\u01ac\7k\2\2\u01ac"+
		"\u01ad\7f\2\2\u01adL\3\2\2\2\u01ae\u01af\7y\2\2\u01af\u01b0\7j\2\2\u01b0"+
		"\u01b1\7k\2\2\u01b1\u01b2\7n\2\2\u01b2\u01b3\7g\2\2\u01b3N\3\2\2\2\u01b4"+
		"\u01b5\7k\2\2\u01b5\u01b6\7p\2\2\u01b6P\3\2\2\2\u01b7\u01b8\7u\2\2\u01b8"+
		"\u01b9\7y\2\2\u01b9\u01ba\7k\2\2\u01ba\u01bb\7v\2\2\u01bb\u01bc\7e\2\2"+
		"\u01bc\u01bd\7j\2\2\u01bdR\3\2\2\2\u01be\u01bf\7e\2\2\u01bf\u01c0\7c\2"+
		"\2\u01c0\u01c1\7u\2\2\u01c1\u01c2\7g\2\2\u01c2T\3\2\2\2\u01c3\u01c4\7"+
		"f\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7h\2\2\u01c6\u01c7\7c\2\2\u01c7\u01c8"+
		"\7w\2\2\u01c8\u01c9\7n\2\2\u01c9\u01ca\7v\2\2\u01caV\3\2\2\2\u01cb\u01cc"+
		"\7e\2\2\u01cc\u01cd\7q\2\2\u01cd\u01ce\7p\2\2\u01ce\u01cf\7v\2\2\u01cf"+
		"\u01d0\7k\2\2\u01d0\u01d1\7p\2\2\u01d1\u01d2\7w\2\2\u01d2\u01d3\7g\2\2"+
		"\u01d3X\3\2\2\2\u01d4\u01d5\7d\2\2\u01d5\u01d6\7t\2\2\u01d6\u01d7\7g\2"+
		"\2\u01d7\u01d8\7c\2\2\u01d8\u01d9\7m\2\2\u01d9Z\3\2\2\2\u01da\u01db\7"+
		"f\2\2\u01db\u01dc\7q\2\2\u01dc\\\3\2\2\2\u01dd\u01de\t\2\2\2\u01de^\3"+
		"\2\2\2\u01df\u01e0\t\3\2\2\u01e0`\3\2\2\2\u01e1\u01e2\t\4\2\2\u01e2b\3"+
		"\2\2\2\u01e3\u01e4\7a\2\2\u01e4d\3\2\2\2\u01e5\u01e9\7$\2\2\u01e6\u01e8"+
		"\5\u00c3b\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2"+
		"\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed"+
		"\7$\2\2\u01edf\3\2\2\2\u01ee\u01f2\t\5\2\2\u01ef\u01f1\t\6\2\2\u01f0\u01ef"+
		"\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"h\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\7}\2\2\u01f6j\3\2\2\2\u01f7"+
		"\u01f8\7\177\2\2\u01f8l\3\2\2\2\u01f9\u01fa\7]\2\2\u01fan\3\2\2\2\u01fb"+
		"\u01fc\7_\2\2\u01fcp\3\2\2\2\u01fd\u01fe\7*\2\2\u01fer\3\2\2\2\u01ff\u0200"+
		"\7+\2\2\u0200t\3\2\2\2\u0201\u0202\7\60\2\2\u0202v\3\2\2\2\u0203\u0204"+
		"\7.\2\2\u0204x\3\2\2\2\u0205\u0206\7<\2\2\u0206z\3\2\2\2\u0207\u0208\7"+
		"=\2\2\u0208|\3\2\2\2\u0209\u020a\7-\2\2\u020a~\3\2\2\2\u020b\u020c\7/"+
		"\2\2\u020c\u0080\3\2\2\2\u020d\u020e\7,\2\2\u020e\u0082\3\2\2\2\u020f"+
		"\u0210\7\61\2\2\u0210\u0084\3\2\2\2\u0211\u0212\7\'\2\2\u0212\u0086\3"+
		"\2\2\2\u0213\u0214\7(\2\2\u0214\u0088\3\2\2\2\u0215\u0216\7~\2\2\u0216"+
		"\u008a\3\2\2\2\u0217\u0218\7`\2\2\u0218\u008c\3\2\2\2\u0219\u021a\7#\2"+
		"\2\u021a\u008e\3\2\2\2\u021b\u021c\7\u0080\2\2\u021c\u0090\3\2\2\2\u021d"+
		"\u021e\7?\2\2\u021e\u0092\3\2\2\2\u021f\u0220\7>\2\2\u0220\u0094\3\2\2"+
		"\2\u0221\u0222\7@\2\2\u0222\u0096\3\2\2\2\u0223\u0224\7A\2\2\u0224\u0098"+
		"\3\2\2\2\u0225\u0226\7<\2\2\u0226\u0227\7<\2\2\u0227\u009a\3\2\2\2\u0228"+
		"\u0229\7A\2\2\u0229\u022a\7A\2\2\u022a\u009c\3\2\2\2\u022b\u022c\7-\2"+
		"\2\u022c\u022d\7-\2\2\u022d\u009e\3\2\2\2\u022e\u022f\7/\2\2\u022f\u0230"+
		"\7/\2\2\u0230\u00a0\3\2\2\2\u0231\u0232\7(\2\2\u0232\u0233\7(\2\2\u0233"+
		"\u00a2\3\2\2\2\u0234\u0235\7~\2\2\u0235\u0236\7~\2\2\u0236\u00a4\3\2\2"+
		"\2\u0237\u0238\7/\2\2\u0238\u0239\7@\2\2\u0239\u00a6\3\2\2\2\u023a\u023b"+
		"\7?\2\2\u023b\u023c\7?\2\2\u023c\u00a8\3\2\2\2\u023d\u023e\7#\2\2\u023e"+
		"\u023f\7?\2\2\u023f\u00aa\3\2\2\2\u0240\u0241\7>\2\2\u0241\u0242\7?\2"+
		"\2\u0242\u00ac\3\2\2\2\u0243\u0244\7@\2\2\u0244\u0245\7?\2\2\u0245\u00ae"+
		"\3\2\2\2\u0246\u0247\7-\2\2\u0247\u0248\7?\2\2\u0248\u00b0\3\2\2\2\u0249"+
		"\u024a\7/\2\2\u024a\u024b\7?\2\2\u024b\u00b2\3\2\2\2\u024c\u024d\7,\2"+
		"\2\u024d\u024e\7?\2\2\u024e\u00b4\3\2\2\2\u024f\u0250\7\61\2\2\u0250\u0251"+
		"\7?\2\2\u0251\u00b6\3\2\2\2\u0252\u0253\7\'\2\2\u0253\u0254\7?\2\2\u0254"+
		"\u00b8\3\2\2\2\u0255\u0256\7(\2\2\u0256\u0257\7?\2\2\u0257\u00ba\3\2\2"+
		"\2\u0258\u0259\7~\2\2\u0259\u025a\7?\2\2\u025a\u00bc\3\2\2\2\u025b\u025c"+
		"\7`\2\2\u025c\u025d\7?\2\2\u025d\u00be\3\2\2\2\u025e\u025f\7>\2\2\u025f"+
		"\u0260\7>\2\2\u0260\u00c0\3\2\2\2\u0261\u0262\7>\2\2\u0262\u0263\7>\2"+
		"\2\u0263\u0264\7?\2\2\u0264\u00c2\3\2\2\2\u0265\u0266\n\7\2\2\u0266\u00c4"+
		"\3\2\2\2\u0267\u0268\7\17\2\2\u0268\u026b\7\f\2\2\u0269\u026b\t\7\2\2"+
		"\u026a\u0267\3\2\2\2\u026a\u0269\3\2\2\2\u026b\u00c6\3\2\2\2\u026c\u026d"+
		"\t\b\2\2\u026d\u00c8\3\2\2\2\b\2\u00cb\u00cd\u01e9\u01f2\u026a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}