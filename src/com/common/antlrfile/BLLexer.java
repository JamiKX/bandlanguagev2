package com.common.antlrfile;// Generated from BL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Show=1, Execute=2, Get=3, Find=4, Remove=5, Qiu=6, Set=7, Count=8, CarryOut=9, 
		SortAscending=10, SortDescending=11, Group=12, Equals=13, MoreThan=14, 
		LessThan=15, NoEquals=16, NoMoreThan=17, NoLessThan=18, InputPart=19, 
		OutputPart=20, Element=21, Amount=22, Data=23, Max=24, Min=25, Average=26, 
		Today=27, Ge=28, Old=29, De=30, Among=31, In=32, Jiang=33, According=34, 
		At=35, Comma=36, Dot=37, Split=38, Mark=39, Number=40, String=41, Ws=42, 
		Comment=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Show", "Execute", "Get", "Find", "Remove", "Qiu", "Set", "Count", "CarryOut", 
			"SortAscending", "SortDescending", "Group", "Equals", "MoreThan", "LessThan", 
			"NoEquals", "NoMoreThan", "NoLessThan", "InputPart", "OutputPart", "Element", 
			"Amount", "Data", "Max", "Min", "Average", "Today", "Ge", "Old", "De", 
			"Among", "In", "Jiang", "According", "At", "Comma", "Dot", "Split", "Mark", 
			"Number", "String", "Ws", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u663E\u793A'", "'\u6267\u884C'", "'\u5F97\u5230'", "'\u627E\u51FA'", 
			"'\u53BB\u6389'", "'\u6C42'", "'\u8BBE\u5B9A'", "'\u7EDF\u8BA1'", "'\u8FDB\u884C'", 
			"'\u5347\u5E8F\u6392\u5E8F'", "'\u964D\u5E8F\u6392\u5E8F'", "'\u8FDB\u884C\u5206\u7EC4'", 
			null, null, null, null, null, null, "'\u8F93\u5165\u90E8\u4EF6'", "'\u8F93\u51FA\u90E8\u4EF6'", 
			null, "'\u6570\u91CF'", "'\u6570\u636E'", "'\u6700\u5927\u503C'", "'\u6700\u5C0F\u503C'", 
			"'\u5E73\u5747\u503C'", "'\u4ECA\u5929'", "'\u4E2A'", "'\u8001\u7684'", 
			"'\u7684'", "'\u5176\u4E2D'", "'\u4E2D'", "'\u5C06'", null, "'\u5728'", 
			null, null, "'\u3001'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Show", "Execute", "Get", "Find", "Remove", "Qiu", "Set", "Count", 
			"CarryOut", "SortAscending", "SortDescending", "Group", "Equals", "MoreThan", 
			"LessThan", "NoEquals", "NoMoreThan", "NoLessThan", "InputPart", "OutputPart", 
			"Element", "Amount", "Data", "Max", "Min", "Average", "Today", "Ge", 
			"Old", "De", "Among", "In", "Jiang", "According", "At", "Comma", "Dot", 
			"Split", "Mark", "Number", "String", "Ws", "Comment"
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


	public BLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u010b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0086\n\16\3\17"+
		"\3\17\3\17\5\17\u008b\n\17\3\20\3\20\3\20\5\20\u0090\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0097\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u009e\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00a5\n\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00b5\n\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3#\3#\5#\u00de\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\6"+
		")\u00eb\n)\r)\16)\u00ec\3*\5*\u00f0\n*\3*\6*\u00f3\n*\r*\16*\u00f4\3*"+
		"\5*\u00f8\n*\3+\6+\u00fb\n+\r+\16+\u00fc\3+\3+\3,\3,\3,\3,\7,\u0105\n"+
		",\f,\16,\u0108\13,\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\t\4\2"+
		"..\uff0e\uff0e\4\2\60\60\u3004\u3004\4\2AA\uff21\uff21\3\2\62;\b\2&&\62"+
		";C\\aac|\u4e02\u9fa7\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0118\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\3Y\3\2\2\2\5\\\3\2\2\2\7_\3\2\2\2\tb\3\2\2\2\13e\3\2\2\2"+
		"\rh\3\2\2\2\17j\3\2\2\2\21m\3\2\2\2\23p\3\2\2\2\25s\3\2\2\2\27x\3\2\2"+
		"\2\31}\3\2\2\2\33\u0085\3\2\2\2\35\u008a\3\2\2\2\37\u008f\3\2\2\2!\u0096"+
		"\3\2\2\2#\u009d\3\2\2\2%\u00a4\3\2\2\2\'\u00a6\3\2\2\2)\u00ab\3\2\2\2"+
		"+\u00b4\3\2\2\2-\u00b6\3\2\2\2/\u00b9\3\2\2\2\61\u00bc\3\2\2\2\63\u00c0"+
		"\3\2\2\2\65\u00c4\3\2\2\2\67\u00c8\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2"+
		"\2=\u00d0\3\2\2\2?\u00d2\3\2\2\2A\u00d5\3\2\2\2C\u00d7\3\2\2\2E\u00dd"+
		"\3\2\2\2G\u00df\3\2\2\2I\u00e1\3\2\2\2K\u00e3\3\2\2\2M\u00e5\3\2\2\2O"+
		"\u00e7\3\2\2\2Q\u00ea\3\2\2\2S\u00ef\3\2\2\2U\u00fa\3\2\2\2W\u0100\3\2"+
		"\2\2YZ\7\u6640\2\2Z[\7\u793c\2\2[\4\3\2\2\2\\]\7\u6269\2\2]^\7\u884e\2"+
		"\2^\6\3\2\2\2_`\7\u5f99\2\2`a\7\u5232\2\2a\b\3\2\2\2bc\7\u6280\2\2cd\7"+
		"\u51fc\2\2d\n\3\2\2\2ef\7\u53bd\2\2fg\7\u638b\2\2g\f\3\2\2\2hi\7\u6c44"+
		"\2\2i\16\3\2\2\2jk\7\u8bc0\2\2kl\7\u5b9c\2\2l\20\3\2\2\2mn\7\u7ee1\2\2"+
		"no\7\u8ba3\2\2o\22\3\2\2\2pq\7\u8fdd\2\2qr\7\u884e\2\2r\24\3\2\2\2st\7"+
		"\u5349\2\2tu\7\u5e91\2\2uv\7\u6394\2\2vw\7\u5e91\2\2w\26\3\2\2\2xy\7\u964f"+
		"\2\2yz\7\u5e91\2\2z{\7\u6394\2\2{|\7\u5e91\2\2|\30\3\2\2\2}~\7\u8fdd\2"+
		"\2~\177\7\u884e\2\2\177\u0080\7\u5208\2\2\u0080\u0081\7\u7ec6\2\2\u0081"+
		"\32\3\2\2\2\u0082\u0083\7\u7b4b\2\2\u0083\u0086\7\u4e90\2\2\u0084\u0086"+
		"\7?\2\2\u0085\u0082\3\2\2\2\u0085\u0084\3\2\2\2\u0086\34\3\2\2\2\u0087"+
		"\u0088\7\u5929\2\2\u0088\u008b\7\u4e90\2\2\u0089\u008b\7@\2\2\u008a\u0087"+
		"\3\2\2\2\u008a\u0089\3\2\2\2\u008b\36\3\2\2\2\u008c\u008d\7\u5c11\2\2"+
		"\u008d\u0090\7\u4e90\2\2\u008e\u0090\7>\2\2\u008f\u008c\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090 \3\2\2\2\u0091\u0092\7\u4e0f\2\2\u0092\u0093\7\u7b4b"+
		"\2\2\u0093\u0097\7\u4e90\2\2\u0094\u0095\7#\2\2\u0095\u0097\7?\2\2\u0096"+
		"\u0091\3\2\2\2\u0096\u0094\3\2\2\2\u0097\"\3\2\2\2\u0098\u0099\7\u4e0f"+
		"\2\2\u0099\u009a\7\u5929\2\2\u009a\u009e\7\u4e90\2\2\u009b\u009c\7>\2"+
		"\2\u009c\u009e\7?\2\2\u009d\u0098\3\2\2\2\u009d\u009b\3\2\2\2\u009e$\3"+
		"\2\2\2\u009f\u00a0\7\u4e0f\2\2\u00a0\u00a1\7\u5c11\2\2\u00a1\u00a5\7\u4e90"+
		"\2\2\u00a2\u00a3\7@\2\2\u00a3\u00a5\7?\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7\u8f95\2\2\u00a7\u00a8\7\u5167\2"+
		"\2\u00a8\u00a9\7\u90ea\2\2\u00a9\u00aa\7\u4ef8\2\2\u00aa(\3\2\2\2\u00ab"+
		"\u00ac\7\u8f95\2\2\u00ac\u00ad\7\u51fc\2\2\u00ad\u00ae\7\u90ea\2\2\u00ae"+
		"\u00af\7\u4ef8\2\2\u00af*\3\2\2\2\u00b0\u00b1\7\u5145\2\2\u00b1\u00b5"+
		"\7\u7d22\2\2\u00b2\u00b3\7\u8bb2\2\2\u00b3\u00b5\7\u5f57\2\2\u00b4\u00b0"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7\u6572\2\2\u00b7"+
		"\u00b8\7\u91d1\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7\u6572\2\2\u00ba\u00bb"+
		"\7\u6370\2\2\u00bb\60\3\2\2\2\u00bc\u00bd\7\u6702\2\2\u00bd\u00be\7\u5929"+
		"\2\2\u00be\u00bf\7\u503e\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\7\u6702\2\2"+
		"\u00c1\u00c2\7\u5c11\2\2\u00c2\u00c3\7\u503e\2\2\u00c3\64\3\2\2\2\u00c4"+
		"\u00c5\7\u5e75\2\2\u00c5\u00c6\7\u5749\2\2\u00c6\u00c7\7\u503e\2\2\u00c7"+
		"\66\3\2\2\2\u00c8\u00c9\7\u4ecc\2\2\u00c9\u00ca\7\u592b\2\2\u00ca8\3\2"+
		"\2\2\u00cb\u00cc\7\u4e2c\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7\u8003\2\2\u00ce"+
		"\u00cf\7\u7686\2\2\u00cf<\3\2\2\2\u00d0\u00d1\7\u7686\2\2\u00d1>\3\2\2"+
		"\2\u00d2\u00d3\7\u5178\2\2\u00d3\u00d4\7\u4e2f\2\2\u00d4@\3\2\2\2\u00d5"+
		"\u00d6\7\u4e2f\2\2\u00d6B\3\2\2\2\u00d7\u00d8\7\u5c08\2\2\u00d8D\3\2\2"+
		"\2\u00d9\u00da\7\u683b\2\2\u00da\u00de\7\u6370\2\2\u00db\u00dc\7\u630b"+
		"\2\2\u00dc\u00de\7\u7169\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"F\3\2\2\2\u00df\u00e0\7\u572a\2\2\u00e0H\3\2\2\2\u00e1\u00e2\t\2\2\2\u00e2"+
		"J\3\2\2\2\u00e3\u00e4\t\3\2\2\u00e4L\3\2\2\2\u00e5\u00e6\7\u3003\2\2\u00e6"+
		"N\3\2\2\2\u00e7\u00e8\t\4\2\2\u00e8P\3\2\2\2\u00e9\u00eb\t\5\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00edR\3\2\2\2\u00ee\u00f0\7\u201a\2\2\u00ef\u00ee\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3\t\6\2\2\u00f2\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00f8\7\u201b\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8T\3\2\2\2\u00f9\u00fb\t\7\2\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u00ff\b+\2\2\u00ffV\3\2\2\2\u0100\u0101\7\61\2\2\u0101\u0102"+
		"\7\61\2\2\u0102\u0106\3\2\2\2\u0103\u0105\n\b\2\2\u0104\u0103\3\2\2\2"+
		"\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\b,\3\2\u010aX\3\2\2\2\22\2\u0085"+
		"\u008a\u008f\u0096\u009d\u00a4\u00b4\u00dd\u00ec\u00ef\u00f2\u00f4\u00f7"+
		"\u00fc\u0106\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}