package com.common.antlrfile;// Generated from common.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class commonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Dot=1, Show=2, Execute=3, Delete=4, Search=5, Str=6, LeaveTool=7, PeopleName=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Dot", "Show", "Execute", "Delete", "Search", "Str", "LeaveTool", "PeopleName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\u93C4\u5267\u305A'", "'\u93B5\u0446\uE511'", "'\u9352\u72BB\u6ACE'", 
			"'\u93CC\u30E6\u58D8'", "'helloworld'", "'\u7487\u5CF0\u4EA3\u5BB8\u30E5\u53FF'", 
			"'\u5BEE\u72B1\u7B01'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Dot", "Show", "Execute", "Delete", "Search", "Str", "LeaveTool", 
			"PeopleName"
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


	public commonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "common.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n>\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\5\2"+
		"\27\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\2\2"+
		">\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\26\3\2\2\2\5\30\3\2\2\2\7\34\3\2\2\2"+
		"\t \3\2\2\2\13$\3\2\2\2\r(\3\2\2\2\17\63\3\2\2\2\21:\3\2\2\2\23\27\7\60"+
		"\2\2\24\25\7\u9288\2\2\25\27\7\uffff\2\2\26\23\3\2\2\2\26\24\3\2\2\2\27"+
		"\4\3\2\2\2\30\31\7\u93c6\2\2\31\32\7\u5269\2\2\32\33\7\u305c\2\2\33\6"+
		"\3\2\2\2\34\35\7\u93b7\2\2\35\36\7\u0448\2\2\36\37\7\ue513\2\2\37\b\3"+
		"\2\2\2 !\7\u9354\2\2!\"\7\u72bd\2\2\"#\7\u6ad0\2\2#\n\3\2\2\2$%\7\u93ce"+
		"\2\2%&\7\u30e8\2\2&\'\7\u58da\2\2\'\f\3\2\2\2()\7j\2\2)*\7g\2\2*+\7n\2"+
		"\2+,\7n\2\2,-\7q\2\2-.\7y\2\2./\7q\2\2/\60\7t\2\2\60\61\7n\2\2\61\62\7"+
		"f\2\2\62\16\3\2\2\2\63\64\7\u7489\2\2\64\65\7\u5cf2\2\2\65\66\7\u4ea5"+
		"\2\2\66\67\7\u5bba\2\2\678\7\u30e7\2\289\7\u5401\2\29\20\3\2\2\2:;\7\u5bf0"+
		"\2\2;<\7\u72b3\2\2<=\7\u7b03\2\2=\22\3\2\2\2\4\2\26\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}