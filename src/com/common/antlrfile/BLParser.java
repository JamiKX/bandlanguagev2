package com.common.antlrfile;// Generated from BL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BLParser extends Parser {
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
	public static final int
		RULE_script = 0, RULE_stmt = 1, RULE_complexStmt = 2, RULE_simpleStmt = 3, 
		RULE_runToolStmt = 4, RULE_setStmt = 5, RULE_sortStmt = 6, RULE_groupStmt = 7, 
		RULE_predicate_adverbial_attribute_object_stmt = 8, RULE_predicate_attribute_object_stmt = 9, 
		RULE_subject_predicate_object_stmt = 10, RULE_predicate_object_stmt = 11, 
		RULE_compare_stmt = 12, RULE_compare = 13, RULE_subject = 14, RULE_object = 15, 
		RULE_object_split = 16, RULE_object_single = 17, RULE_predicate = 18, 
		RULE_attribute = 19, RULE_adverbial = 20, RULE_place_adverbial = 21, RULE_time_adverbial = 22, 
		RULE_common_adverbial = 23, RULE_noun = 24, RULE_verb = 25, RULE_adjective = 26, 
		RULE_numerals = 27, RULE_quantifiers = 28, RULE_time = 29, RULE_compareWord = 30, 
		RULE_sort = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "stmt", "complexStmt", "simpleStmt", "runToolStmt", "setStmt", 
			"sortStmt", "groupStmt", "predicate_adverbial_attribute_object_stmt", 
			"predicate_attribute_object_stmt", "subject_predicate_object_stmt", "predicate_object_stmt", 
			"compare_stmt", "compare", "subject", "object", "object_split", "object_single", 
			"predicate", "attribute", "adverbial", "place_adverbial", "time_adverbial", 
			"common_adverbial", "noun", "verb", "adjective", "numerals", "quantifiers", 
			"time", "compareWord", "sort"
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

	@Override
	public String getGrammarFileName() { return "BL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ScriptContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(BLParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(BLParser.Dot, i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				stmt();
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Dot) {
					{
					setState(65);
					match(Dot);
					}
				}

				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Show) | (1L << Execute) | (1L << Get) | (1L << Find) | (1L << Remove) | (1L << Qiu) | (1L << Set) | (1L << Count) | (1L << CarryOut) | (1L << SortAscending) | (1L << SortDescending) | (1L << Group) | (1L << InputPart) | (1L << OutputPart) | (1L << Amount) | (1L << Data) | (1L << Max) | (1L << Min) | (1L << Average) | (1L << Today) | (1L << Jiang) | (1L << According) | (1L << Number) | (1L << String))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public ComplexStmtContext complexStmt() {
			return getRuleContext(ComplexStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				simpleStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				complexStmt();
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

	public static class ComplexStmtContext extends ParserRuleContext {
		public RunToolStmtContext runToolStmt() {
			return getRuleContext(RunToolStmtContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public SortStmtContext sortStmt() {
			return getRuleContext(SortStmtContext.class,0);
		}
		public GroupStmtContext groupStmt() {
			return getRuleContext(GroupStmtContext.class,0);
		}
		public ComplexStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitComplexStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexStmtContext complexStmt() throws RecognitionException {
		ComplexStmtContext _localctx = new ComplexStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_complexStmt);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				runToolStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				setStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				sortStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				groupStmt();
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

	public static class SimpleStmtContext extends ParserRuleContext {
		public Subject_predicate_object_stmtContext subject_predicate_object_stmt() {
			return getRuleContext(Subject_predicate_object_stmtContext.class,0);
		}
		public Predicate_attribute_object_stmtContext predicate_attribute_object_stmt() {
			return getRuleContext(Predicate_attribute_object_stmtContext.class,0);
		}
		public Predicate_adverbial_attribute_object_stmtContext predicate_adverbial_attribute_object_stmt() {
			return getRuleContext(Predicate_adverbial_attribute_object_stmtContext.class,0);
		}
		public Predicate_object_stmtContext predicate_object_stmt() {
			return getRuleContext(Predicate_object_stmtContext.class,0);
		}
		public Compare_stmtContext compare_stmt() {
			return getRuleContext(Compare_stmtContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitSimpleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleStmt);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				subject_predicate_object_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				predicate_attribute_object_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				predicate_adverbial_attribute_object_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				predicate_object_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				compare_stmt();
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

	public static class RunToolStmtContext extends ParserRuleContext {
		public List<Predicate_object_stmtContext> predicate_object_stmt() {
			return getRuleContexts(Predicate_object_stmtContext.class);
		}
		public Predicate_object_stmtContext predicate_object_stmt(int i) {
			return getRuleContext(Predicate_object_stmtContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BLParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BLParser.Comma, i);
		}
		public TerminalNode Among() { return getToken(BLParser.Among, 0); }
		public List<CompareContext> compare() {
			return getRuleContexts(CompareContext.class);
		}
		public CompareContext compare(int i) {
			return getRuleContext(CompareContext.class,i);
		}
		public RunToolStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runToolStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitRunToolStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunToolStmtContext runToolStmt() throws RecognitionException {
		RunToolStmtContext _localctx = new RunToolStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_runToolStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			predicate_object_stmt();
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(90);
				match(Comma);
				setState(91);
				match(Among);
				setState(94); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(92);
						match(Comma);
						setState(93);
						compare();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(96); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(100);
				match(Comma);
				setState(101);
				predicate_object_stmt();
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

	public static class SetStmtContext extends ParserRuleContext {
		public TerminalNode Set() { return getToken(BLParser.Set, 0); }
		public List<TerminalNode> String() { return getTokens(BLParser.String); }
		public TerminalNode String(int i) {
			return getToken(BLParser.String, i);
		}
		public TerminalNode Equals() { return getToken(BLParser.Equals, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode Number() { return getToken(BLParser.Number, 0); }
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitSetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(Set);
			setState(105);
			match(String);
			setState(106);
			match(Equals);
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(107);
				stmt();
				}
				break;
			case 2:
				{
				setState(108);
				match(String);
				}
				break;
			case 3:
				{
				setState(109);
				match(Number);
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

	public static class SortStmtContext extends ParserRuleContext {
		public TerminalNode According() { return getToken(BLParser.According, 0); }
		public List<TerminalNode> String() { return getTokens(BLParser.String); }
		public TerminalNode String(int i) {
			return getToken(BLParser.String, i);
		}
		public TerminalNode Jiang() { return getToken(BLParser.Jiang, 0); }
		public TerminalNode CarryOut() { return getToken(BLParser.CarryOut, 0); }
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public SortStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitSortStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortStmtContext sortStmt() throws RecognitionException {
		SortStmtContext _localctx = new SortStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sortStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(According);
			setState(113);
			match(String);
			setState(114);
			match(Jiang);
			setState(115);
			match(String);
			setState(116);
			match(CarryOut);
			setState(117);
			sort();
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

	public static class GroupStmtContext extends ParserRuleContext {
		public TerminalNode Jiang() { return getToken(BLParser.Jiang, 0); }
		public List<TerminalNode> String() { return getTokens(BLParser.String); }
		public TerminalNode String(int i) {
			return getToken(BLParser.String, i);
		}
		public TerminalNode According() { return getToken(BLParser.According, 0); }
		public TerminalNode Group() { return getToken(BLParser.Group, 0); }
		public GroupStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitGroupStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupStmtContext groupStmt() throws RecognitionException {
		GroupStmtContext _localctx = new GroupStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_groupStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(Jiang);
			setState(120);
			match(String);
			setState(121);
			match(According);
			setState(122);
			match(String);
			setState(123);
			match(Group);
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

	public static class Predicate_adverbial_attribute_object_stmtContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public AdverbialContext adverbial() {
			return getRuleContext(AdverbialContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Predicate_adverbial_attribute_object_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate_adverbial_attribute_object_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitPredicate_adverbial_attribute_object_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predicate_adverbial_attribute_object_stmtContext predicate_adverbial_attribute_object_stmt() throws RecognitionException {
		Predicate_adverbial_attribute_object_stmtContext _localctx = new Predicate_adverbial_attribute_object_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_predicate_adverbial_attribute_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			predicate();
			setState(126);
			adverbial();
			setState(127);
			attribute();
			setState(128);
			object();
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

	public static class Predicate_attribute_object_stmtContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Predicate_attribute_object_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate_attribute_object_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitPredicate_attribute_object_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predicate_attribute_object_stmtContext predicate_attribute_object_stmt() throws RecognitionException {
		Predicate_attribute_object_stmtContext _localctx = new Predicate_attribute_object_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predicate_attribute_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			predicate();
			setState(131);
			attribute();
			setState(132);
			object();
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

	public static class Subject_predicate_object_stmtContext extends ParserRuleContext {
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Subject_predicate_object_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject_predicate_object_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitSubject_predicate_object_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subject_predicate_object_stmtContext subject_predicate_object_stmt() throws RecognitionException {
		Subject_predicate_object_stmtContext _localctx = new Subject_predicate_object_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_subject_predicate_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			subject();
			setState(135);
			predicate();
			setState(136);
			object();
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

	public static class Predicate_object_stmtContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Predicate_object_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate_object_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitPredicate_object_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predicate_object_stmtContext predicate_object_stmt() throws RecognitionException {
		Predicate_object_stmtContext _localctx = new Predicate_object_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_predicate_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			predicate();
			setState(139);
			object();
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

	public static class Compare_stmtContext extends ParserRuleContext {
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode Mark() { return getToken(BLParser.Mark, 0); }
		public Compare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitCompare_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_stmtContext compare_stmt() throws RecognitionException {
		Compare_stmtContext _localctx = new Compare_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compare_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			compare();
			setState(142);
			match(Mark);
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

	public static class CompareContext extends ParserRuleContext {
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public CompareWordContext compareWord() {
			return getRuleContext(CompareWordContext.class,0);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			object();
			setState(145);
			compareWord();
			setState(146);
			object();
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

	public static class SubjectContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(BLParser.String, 0); }
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_subject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(String);
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

	public static class ObjectContext extends ParserRuleContext {
		public List<Object_singleContext> object_single() {
			return getRuleContexts(Object_singleContext.class);
		}
		public Object_singleContext object_single(int i) {
			return getRuleContext(Object_singleContext.class,i);
		}
		public List<Object_splitContext> object_split() {
			return getRuleContexts(Object_splitContext.class);
		}
		public Object_splitContext object_split(int i) {
			return getRuleContext(Object_splitContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			object_single();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Split) {
				{
				{
				setState(151);
				object_split();
				setState(152);
				object_single();
				}
				}
				setState(158);
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

	public static class Object_splitContext extends ParserRuleContext {
		public TerminalNode Split() { return getToken(BLParser.Split, 0); }
		public Object_splitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_split; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitObject_split(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_splitContext object_split() throws RecognitionException {
		Object_splitContext _localctx = new Object_splitContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_object_split);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(Split);
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

	public static class Object_singleContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(BLParser.String, 0); }
		public List<NounContext> noun() {
			return getRuleContexts(NounContext.class);
		}
		public NounContext noun(int i) {
			return getRuleContext(NounContext.class,i);
		}
		public List<TerminalNode> De() { return getTokens(BLParser.De); }
		public TerminalNode De(int i) {
			return getToken(BLParser.De, i);
		}
		public Object_singleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_single; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitObject_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_singleContext object_single() throws RecognitionException {
		Object_singleContext _localctx = new Object_singleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_object_single);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				{
				setState(161);
				match(String);
				}
				break;
			case InputPart:
			case OutputPart:
			case Amount:
			case Data:
			case Max:
			case Min:
			case Average:
			case Today:
			case Number:
				{
				setState(162);
				noun();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==De) {
				{
				{
				setState(165);
				match(De);
				setState(166);
				noun();
				}
				}
				setState(171);
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

	public static class PredicateContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			verb();
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

	public static class AttributeContext extends ParserRuleContext {
		public Compare_stmtContext compare_stmt() {
			return getRuleContext(Compare_stmtContext.class,0);
		}
		public TerminalNode De() { return getToken(BLParser.De, 0); }
		public AdjectiveContext adjective() {
			return getRuleContext(AdjectiveContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attribute);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case InputPart:
			case OutputPart:
			case Amount:
			case Data:
			case Max:
			case Min:
			case Average:
			case Today:
			case Number:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				compare_stmt();
				setState(175);
				match(De);
				}
				break;
			case Old:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				adjective();
				setState(178);
				match(De);
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

	public static class AdverbialContext extends ParserRuleContext {
		public Place_adverbialContext place_adverbial() {
			return getRuleContext(Place_adverbialContext.class,0);
		}
		public Time_adverbialContext time_adverbial() {
			return getRuleContext(Time_adverbialContext.class,0);
		}
		public Common_adverbialContext common_adverbial() {
			return getRuleContext(Common_adverbialContext.class,0);
		}
		public AdverbialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adverbial; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitAdverbial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdverbialContext adverbial() throws RecognitionException {
		AdverbialContext _localctx = new AdverbialContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_adverbial);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				place_adverbial();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				time_adverbial();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				common_adverbial();
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

	public static class Place_adverbialContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(BLParser.At, 0); }
		public TerminalNode String() { return getToken(BLParser.String, 0); }
		public TerminalNode In() { return getToken(BLParser.In, 0); }
		public Place_adverbialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_place_adverbial; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitPlace_adverbial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Place_adverbialContext place_adverbial() throws RecognitionException {
		Place_adverbialContext _localctx = new Place_adverbialContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_place_adverbial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(At);
			setState(188);
			match(String);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==In) {
				{
				setState(189);
				match(In);
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

	public static class Time_adverbialContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(BLParser.At, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public Time_adverbialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_adverbial; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitTime_adverbial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_adverbialContext time_adverbial() throws RecognitionException {
		Time_adverbialContext _localctx = new Time_adverbialContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_time_adverbial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(At);
			setState(193);
			time();
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

	public static class Common_adverbialContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(BLParser.String, 0); }
		public TerminalNode In() { return getToken(BLParser.In, 0); }
		public Common_adverbialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_adverbial; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitCommon_adverbial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_adverbialContext common_adverbial() throws RecognitionException {
		Common_adverbialContext _localctx = new Common_adverbialContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_common_adverbial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(String);
			setState(196);
			match(In);
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

	public static class NounContext extends ParserRuleContext {
		public TerminalNode InputPart() { return getToken(BLParser.InputPart, 0); }
		public TerminalNode OutputPart() { return getToken(BLParser.OutputPart, 0); }
		public TerminalNode Amount() { return getToken(BLParser.Amount, 0); }
		public TerminalNode Data() { return getToken(BLParser.Data, 0); }
		public TerminalNode Max() { return getToken(BLParser.Max, 0); }
		public TerminalNode Min() { return getToken(BLParser.Min, 0); }
		public TerminalNode Average() { return getToken(BLParser.Average, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public NumeralsContext numerals() {
			return getRuleContext(NumeralsContext.class,0);
		}
		public NounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitNoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_noun);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case InputPart:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(InputPart);
				}
				break;
			case OutputPart:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(OutputPart);
				}
				break;
			case Amount:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(Amount);
				}
				break;
			case Data:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(Data);
				}
				break;
			case Max:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(Max);
				}
				break;
			case Min:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(Min);
				}
				break;
			case Average:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				match(Average);
				}
				break;
			case Today:
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				time();
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 9);
				{
				setState(206);
				numerals();
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

	public static class VerbContext extends ParserRuleContext {
		public TerminalNode Show() { return getToken(BLParser.Show, 0); }
		public TerminalNode Execute() { return getToken(BLParser.Execute, 0); }
		public TerminalNode Get() { return getToken(BLParser.Get, 0); }
		public TerminalNode Find() { return getToken(BLParser.Find, 0); }
		public TerminalNode Remove() { return getToken(BLParser.Remove, 0); }
		public TerminalNode Qiu() { return getToken(BLParser.Qiu, 0); }
		public TerminalNode Set() { return getToken(BLParser.Set, 0); }
		public TerminalNode Count() { return getToken(BLParser.Count, 0); }
		public TerminalNode CarryOut() { return getToken(BLParser.CarryOut, 0); }
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public TerminalNode Group() { return getToken(BLParser.Group, 0); }
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_verb);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Show:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(Show);
				}
				break;
			case Execute:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(Execute);
				}
				break;
			case Get:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(Get);
				}
				break;
			case Find:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(Find);
				}
				break;
			case Remove:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				match(Remove);
				}
				break;
			case Qiu:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				match(Qiu);
				}
				break;
			case Set:
				enterOuterAlt(_localctx, 7);
				{
				setState(215);
				match(Set);
				}
				break;
			case Count:
				enterOuterAlt(_localctx, 8);
				{
				setState(216);
				match(Count);
				}
				break;
			case CarryOut:
				enterOuterAlt(_localctx, 9);
				{
				setState(217);
				match(CarryOut);
				}
				break;
			case SortAscending:
			case SortDescending:
				enterOuterAlt(_localctx, 10);
				{
				setState(218);
				sort();
				}
				break;
			case Group:
				enterOuterAlt(_localctx, 11);
				{
				setState(219);
				match(Group);
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

	public static class AdjectiveContext extends ParserRuleContext {
		public TerminalNode Old() { return getToken(BLParser.Old, 0); }
		public AdjectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitAdjective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdjectiveContext adjective() throws RecognitionException {
		AdjectiveContext _localctx = new AdjectiveContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_adjective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(Old);
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

	public static class NumeralsContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(BLParser.Number, 0); }
		public NumeralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitNumerals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeralsContext numerals() throws RecognitionException {
		NumeralsContext _localctx = new NumeralsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numerals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(Number);
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

	public static class QuantifiersContext extends ParserRuleContext {
		public TerminalNode Ge() { return getToken(BLParser.Ge, 0); }
		public QuantifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitQuantifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifiersContext quantifiers() throws RecognitionException {
		QuantifiersContext _localctx = new QuantifiersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_quantifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(Ge);
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

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode Today() { return getToken(BLParser.Today, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(Today);
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

	public static class CompareWordContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(BLParser.Equals, 0); }
		public TerminalNode NoEquals() { return getToken(BLParser.NoEquals, 0); }
		public TerminalNode MoreThan() { return getToken(BLParser.MoreThan, 0); }
		public TerminalNode NoMoreThan() { return getToken(BLParser.NoMoreThan, 0); }
		public TerminalNode LessThan() { return getToken(BLParser.LessThan, 0); }
		public TerminalNode NoLessThan() { return getToken(BLParser.NoLessThan, 0); }
		public CompareWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareWord; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitCompareWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareWordContext compareWord() throws RecognitionException {
		CompareWordContext _localctx = new CompareWordContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_compareWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals) | (1L << MoreThan) | (1L << LessThan) | (1L << NoEquals) | (1L << NoMoreThan) | (1L << NoLessThan))) != 0)) ) {
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

	public static class SortContext extends ParserRuleContext {
		public TerminalNode SortDescending() { return getToken(BLParser.SortDescending, 0); }
		public TerminalNode SortAscending() { return getToken(BLParser.SortAscending, 0); }
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BLVisitor ) return ((BLVisitor<? extends T>)visitor).visitSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(_la==SortAscending || _la==SortDescending) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\5\2E\n\2\6\2G\n\2\r\2\16\2H\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\3"+
		"\4\5\4S\n\4\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\6\6a\n\6"+
		"\r\6\16\6b\5\6e\n\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u009d\n\21\f\21\16"+
		"\21\u00a0\13\21\3\22\3\22\3\23\3\23\5\23\u00a6\n\23\3\23\3\23\7\23\u00aa"+
		"\n\23\f\23\16\23\u00ad\13\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u00b7\n\25\3\26\3\26\3\26\5\26\u00bc\n\26\3\27\3\27\3\27\5\27\u00c1"+
		"\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u00d2\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u00df\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 "+
		"\3 \3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@\2\4\3\2\17\24\3\2\f\r\2\u00f4\2F\3\2\2\2\4L\3\2\2\2\6R"+
		"\3\2\2\2\bY\3\2\2\2\n[\3\2\2\2\fj\3\2\2\2\16r\3\2\2\2\20y\3\2\2\2\22\177"+
		"\3\2\2\2\24\u0084\3\2\2\2\26\u0088\3\2\2\2\30\u008c\3\2\2\2\32\u008f\3"+
		"\2\2\2\34\u0092\3\2\2\2\36\u0096\3\2\2\2 \u0098\3\2\2\2\"\u00a1\3\2\2"+
		"\2$\u00a5\3\2\2\2&\u00ae\3\2\2\2(\u00b6\3\2\2\2*\u00bb\3\2\2\2,\u00bd"+
		"\3\2\2\2.\u00c2\3\2\2\2\60\u00c5\3\2\2\2\62\u00d1\3\2\2\2\64\u00de\3\2"+
		"\2\2\66\u00e0\3\2\2\28\u00e2\3\2\2\2:\u00e4\3\2\2\2<\u00e6\3\2\2\2>\u00e8"+
		"\3\2\2\2@\u00ea\3\2\2\2BD\5\4\3\2CE\7\'\2\2DC\3\2\2\2DE\3\2\2\2EG\3\2"+
		"\2\2FB\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\3\3\2\2\2JM\5\b\5\2KM\5"+
		"\6\4\2LJ\3\2\2\2LK\3\2\2\2M\5\3\2\2\2NS\5\n\6\2OS\5\f\7\2PS\5\16\b\2Q"+
		"S\5\20\t\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\7\3\2\2\2TZ\5\26\f"+
		"\2UZ\5\24\13\2VZ\5\22\n\2WZ\5\30\r\2XZ\5\32\16\2YT\3\2\2\2YU\3\2\2\2Y"+
		"V\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\t\3\2\2\2[d\5\30\r\2\\]\7&\2\2]`\7!\2\2"+
		"^_\7&\2\2_a\5\34\17\2`^\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2"+
		"\2d\\\3\2\2\2de\3\2\2\2eh\3\2\2\2fg\7&\2\2gi\5\30\r\2hf\3\2\2\2hi\3\2"+
		"\2\2i\13\3\2\2\2jk\7\t\2\2kl\7+\2\2lp\7\17\2\2mq\5\4\3\2nq\7+\2\2oq\7"+
		"*\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\r\3\2\2\2rs\7$\2\2st\7+\2\2tu\7#"+
		"\2\2uv\7+\2\2vw\7\13\2\2wx\5@!\2x\17\3\2\2\2yz\7#\2\2z{\7+\2\2{|\7$\2"+
		"\2|}\7+\2\2}~\7\16\2\2~\21\3\2\2\2\177\u0080\5&\24\2\u0080\u0081\5*\26"+
		"\2\u0081\u0082\5(\25\2\u0082\u0083\5 \21\2\u0083\23\3\2\2\2\u0084\u0085"+
		"\5&\24\2\u0085\u0086\5(\25\2\u0086\u0087\5 \21\2\u0087\25\3\2\2\2\u0088"+
		"\u0089\5\36\20\2\u0089\u008a\5&\24\2\u008a\u008b\5 \21\2\u008b\27\3\2"+
		"\2\2\u008c\u008d\5&\24\2\u008d\u008e\5 \21\2\u008e\31\3\2\2\2\u008f\u0090"+
		"\5\34\17\2\u0090\u0091\7)\2\2\u0091\33\3\2\2\2\u0092\u0093\5 \21\2\u0093"+
		"\u0094\5> \2\u0094\u0095\5 \21\2\u0095\35\3\2\2\2\u0096\u0097\7+\2\2\u0097"+
		"\37\3\2\2\2\u0098\u009e\5$\23\2\u0099\u009a\5\"\22\2\u009a\u009b\5$\23"+
		"\2\u009b\u009d\3\2\2\2\u009c\u0099\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f!\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\7(\2\2\u00a2#\3\2\2\2\u00a3\u00a6\7+\2\2\u00a4\u00a6\5\62\32\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00ab\3\2\2\2\u00a7\u00a8"+
		"\7 \2\2\u00a8\u00aa\5\62\32\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac%\3\2\2\2\u00ad\u00ab\3"+
		"\2\2\2\u00ae\u00af\5\64\33\2\u00af\'\3\2\2\2\u00b0\u00b1\5\32\16\2\u00b1"+
		"\u00b2\7 \2\2\u00b2\u00b7\3\2\2\2\u00b3\u00b4\5\66\34\2\u00b4\u00b5\7"+
		" \2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7"+
		")\3\2\2\2\u00b8\u00bc\5,\27\2\u00b9\u00bc\5.\30\2\u00ba\u00bc\5\60\31"+
		"\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc+"+
		"\3\2\2\2\u00bd\u00be\7%\2\2\u00be\u00c0\7+\2\2\u00bf\u00c1\7\"\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1-\3\2\2\2\u00c2\u00c3\7%\2\2\u00c3"+
		"\u00c4\5<\37\2\u00c4/\3\2\2\2\u00c5\u00c6\7+\2\2\u00c6\u00c7\7\"\2\2\u00c7"+
		"\61\3\2\2\2\u00c8\u00d2\7\25\2\2\u00c9\u00d2\7\26\2\2\u00ca\u00d2\7\30"+
		"\2\2\u00cb\u00d2\7\31\2\2\u00cc\u00d2\7\32\2\2\u00cd\u00d2\7\33\2\2\u00ce"+
		"\u00d2\7\34\2\2\u00cf\u00d2\5<\37\2\u00d0\u00d2\58\35\2\u00d1\u00c8\3"+
		"\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1"+
		"\u00cc\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d0\3\2\2\2\u00d2\63\3\2\2\2\u00d3\u00df\7\3\2\2\u00d4\u00df"+
		"\7\4\2\2\u00d5\u00df\7\5\2\2\u00d6\u00df\7\6\2\2\u00d7\u00df\7\7\2\2\u00d8"+
		"\u00df\7\b\2\2\u00d9\u00df\7\t\2\2\u00da\u00df\7\n\2\2\u00db\u00df\7\13"+
		"\2\2\u00dc\u00df\5@!\2\u00dd\u00df\7\16\2\2\u00de\u00d3\3\2\2\2\u00de"+
		"\u00d4\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00d7\3\2"+
		"\2\2\u00de\u00d8\3\2\2\2\u00de\u00d9\3\2\2\2\u00de\u00da\3\2\2\2\u00de"+
		"\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\65\3\2\2"+
		"\2\u00e0\u00e1\7\37\2\2\u00e1\67\3\2\2\2\u00e2\u00e3\7*\2\2\u00e39\3\2"+
		"\2\2\u00e4\u00e5\7\36\2\2\u00e5;\3\2\2\2\u00e6\u00e7\7\35\2\2\u00e7=\3"+
		"\2\2\2\u00e8\u00e9\t\2\2\2\u00e9?\3\2\2\2\u00ea\u00eb\t\3\2\2\u00ebA\3"+
		"\2\2\2\23DHLRYbdhp\u009e\u00a5\u00ab\u00b6\u00bb\u00c0\u00d1\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}