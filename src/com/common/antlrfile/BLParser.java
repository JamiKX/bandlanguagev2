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
		At=35, Comma=36, Dot=37, Split=38, Number=39, String=40, Ws=41, Comment=42;
	public static final int
		RULE_script = 0, RULE_stmt = 1, RULE_simpleStmt = 2, RULE_predicate_adverbial_attribute_object_stmt = 3, 
		RULE_predicate_attribute_object_stmt = 4, RULE_subject_predicate_object_stmt = 5, 
		RULE_predicate_object_stmt = 6, RULE_complexStmt = 7, RULE_runToolStmt = 8, 
		RULE_setStmt = 9, RULE_sortStmt = 10, RULE_groupStmt = 11, RULE_subject = 12, 
		RULE_object = 13, RULE_predicate = 14, RULE_attribute = 15, RULE_adverbial = 16, 
		RULE_place_adverbial = 17, RULE_time_adverbial = 18, RULE_common_adverbial = 19, 
		RULE_noun = 20, RULE_verb = 21, RULE_adjective = 22, RULE_numerals = 23, 
		RULE_quantifiers = 24, RULE_time = 25, RULE_compare = 26, RULE_sort = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "stmt", "simpleStmt", "predicate_adverbial_attribute_object_stmt", 
			"predicate_attribute_object_stmt", "subject_predicate_object_stmt", "predicate_object_stmt", 
			"complexStmt", "runToolStmt", "setStmt", "sortStmt", "groupStmt", "subject", 
			"object", "predicate", "attribute", "adverbial", "place_adverbial", "time_adverbial", 
			"common_adverbial", "noun", "verb", "adjective", "numerals", "quantifiers", 
			"time", "compare", "sort"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u663E\u793A'", "'\u6267\u884C'", "'\u5F97\u5230'", "'\u627E\u51FA'", 
			"'\u53BB\u6389'", "'\u6C42'", "'\u8BBE\u5B9A'", "'\u7EDF\u8BA1'", "'\u8FDB\u884C'", 
			"'\u5347\u5E8F\u6392\u5E8F'", "'\u964D\u5E8F\u6392\u5E8F'", "'\u8FDB\u884C\u5206\u7EC4'", 
			null, null, null, null, null, null, "'\u8F93\u5165\u90E8\u4EF6'", "'\u8F93\u51FA\u90E8\u4EF6'", 
			"'\u5143\u7D20'", "'\u6570\u91CF'", "'\u6570\u636E'", "'\u6700\u5927\u503C'", 
			"'\u6700\u5C0F\u503C'", "'\u5E73\u5747\u503C'", "'\u4ECA\u5929'", "'\u4E2A'", 
			"'\u8001\u7684'", "'\u7684'", "'\u5176\u4E2D'", "'\u4E2D'", "'\u5C06'", 
			null, "'\u5728'", null, null, "'\u3001'"
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
			"Split", "Number", "String", "Ws", "Comment"
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
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				stmt();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Dot) {
					{
					setState(57);
					match(Dot);
					}
				}

				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Show) | (1L << Execute) | (1L << Get) | (1L << Find) | (1L << Remove) | (1L << Qiu) | (1L << Set) | (1L << Count) | (1L << CarryOut) | (1L << SortAscending) | (1L << SortDescending) | (1L << Group) | (1L << Equals) | (1L << MoreThan) | (1L << LessThan) | (1L << NoEquals) | (1L << NoMoreThan) | (1L << NoLessThan) | (1L << Jiang) | (1L << According) | (1L << String))) != 0) );
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
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				simpleStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
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
		enterRule(_localctx, 4, RULE_simpleStmt);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				subject_predicate_object_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				predicate_attribute_object_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				predicate_adverbial_attribute_object_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				predicate_object_stmt();
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
		enterRule(_localctx, 6, RULE_predicate_adverbial_attribute_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			predicate();
			setState(75);
			adverbial();
			setState(76);
			attribute();
			setState(77);
			object(0);
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
		enterRule(_localctx, 8, RULE_predicate_attribute_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			predicate();
			setState(80);
			attribute();
			setState(81);
			object(0);
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
		enterRule(_localctx, 10, RULE_subject_predicate_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			subject();
			setState(84);
			predicate();
			setState(85);
			object(0);
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
		enterRule(_localctx, 12, RULE_predicate_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			predicate();
			setState(88);
			object(0);
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
		enterRule(_localctx, 14, RULE_complexStmt);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				runToolStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				setStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				sortStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
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
		public List<Subject_predicate_object_stmtContext> subject_predicate_object_stmt() {
			return getRuleContexts(Subject_predicate_object_stmtContext.class);
		}
		public Subject_predicate_object_stmtContext subject_predicate_object_stmt(int i) {
			return getRuleContext(Subject_predicate_object_stmtContext.class,i);
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
		enterRule(_localctx, 16, RULE_runToolStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			predicate_object_stmt();
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(97);
				match(Comma);
				setState(98);
				match(Among);
				setState(101); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(99);
						match(Comma);
						setState(100);
						subject_predicate_object_stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(103); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(107);
				match(Comma);
				setState(108);
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
		enterRule(_localctx, 18, RULE_setStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(Set);
			setState(112);
			match(String);
			setState(113);
			match(Equals);
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(114);
				stmt();
				}
				break;
			case 2:
				{
				setState(115);
				match(String);
				}
				break;
			case 3:
				{
				setState(116);
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
		enterRule(_localctx, 20, RULE_sortStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(According);
			setState(120);
			match(String);
			setState(121);
			match(Jiang);
			setState(122);
			match(String);
			setState(123);
			match(CarryOut);
			setState(124);
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
		enterRule(_localctx, 22, RULE_groupStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(Jiang);
			setState(127);
			match(String);
			setState(128);
			match(According);
			setState(129);
			match(String);
			setState(130);
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
		enterRule(_localctx, 24, RULE_subject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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
		public TerminalNode String() { return getToken(BLParser.String, 0); }
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode Split() { return getToken(BLParser.Split, 0); }
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
		return object(0);
	}

	private ObjectContext object(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObjectContext _localctx = new ObjectContext(_ctx, _parentState);
		ObjectContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_object, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				{
				setState(135);
				match(String);
				}
				break;
			case InputPart:
			case OutputPart:
			case Element:
			case Amount:
			case Data:
			case Max:
			case Min:
			case Average:
			case Today:
			case Number:
				{
				setState(136);
				noun();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ObjectContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_object);
					setState(139);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(140);
					match(Split);
					setState(143);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case String:
						{
						setState(141);
						match(String);
						}
						break;
					case InputPart:
					case OutputPart:
					case Element:
					case Amount:
					case Data:
					case Max:
					case Min:
					case Average:
					case Today:
					case Number:
						{
						setState(142);
						noun();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 28, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
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
		public List<TerminalNode> De() { return getTokens(BLParser.De); }
		public TerminalNode De(int i) {
			return getToken(BLParser.De, i);
		}
		public List<TerminalNode> String() { return getTokens(BLParser.String); }
		public TerminalNode String(int i) {
			return getToken(BLParser.String, i);
		}
		public List<SimpleStmtContext> simpleStmt() {
			return getRuleContexts(SimpleStmtContext.class);
		}
		public SimpleStmtContext simpleStmt(int i) {
			return getRuleContext(SimpleStmtContext.class,i);
		}
		public List<AdjectiveContext> adjective() {
			return getRuleContexts(AdjectiveContext.class);
		}
		public AdjectiveContext adjective(int i) {
			return getRuleContext(AdjectiveContext.class,i);
		}
		public List<NounContext> noun() {
			return getRuleContexts(NounContext.class);
		}
		public NounContext noun(int i) {
			return getRuleContext(NounContext.class,i);
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
		enterRule(_localctx, 30, RULE_attribute);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(156);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(152);
						match(String);
						}
						break;
					case 2:
						{
						setState(153);
						simpleStmt();
						}
						break;
					case 3:
						{
						setState(154);
						adjective();
						}
						break;
					case 4:
						{
						setState(155);
						noun();
						}
						break;
					}
					setState(158);
					match(De);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(161); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 32, RULE_adverbial);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				place_adverbial();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				time_adverbial();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
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
		enterRule(_localctx, 34, RULE_place_adverbial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(At);
			setState(169);
			match(String);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==In) {
				{
				setState(170);
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
		enterRule(_localctx, 36, RULE_time_adverbial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(At);
			setState(174);
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
		enterRule(_localctx, 38, RULE_common_adverbial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(String);
			setState(177);
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
		public TerminalNode Element() { return getToken(BLParser.Element, 0); }
		public TerminalNode Amount() { return getToken(BLParser.Amount, 0); }
		public TerminalNode Data() { return getToken(BLParser.Data, 0); }
		public TerminalNode Max() { return getToken(BLParser.Max, 0); }
		public TerminalNode Min() { return getToken(BLParser.Min, 0); }
		public TerminalNode Average() { return getToken(BLParser.Average, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode Number() { return getToken(BLParser.Number, 0); }
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
		enterRule(_localctx, 40, RULE_noun);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case InputPart:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(InputPart);
				}
				break;
			case OutputPart:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(OutputPart);
				}
				break;
			case Element:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(Element);
				}
				break;
			case Amount:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(Amount);
				}
				break;
			case Data:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(Data);
				}
				break;
			case Max:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				match(Max);
				}
				break;
			case Min:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				match(Min);
				}
				break;
			case Average:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				match(Average);
				}
				break;
			case Today:
				enterOuterAlt(_localctx, 9);
				{
				setState(187);
				time();
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 10);
				{
				setState(188);
				match(Number);
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
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_verb);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Show:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(Show);
				}
				break;
			case Execute:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(Execute);
				}
				break;
			case Get:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(Get);
				}
				break;
			case Find:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(Find);
				}
				break;
			case Remove:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(Remove);
				}
				break;
			case Qiu:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(Qiu);
				}
				break;
			case Set:
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				match(Set);
				}
				break;
			case Count:
				enterOuterAlt(_localctx, 8);
				{
				setState(198);
				match(Count);
				}
				break;
			case CarryOut:
				enterOuterAlt(_localctx, 9);
				{
				setState(199);
				match(CarryOut);
				}
				break;
			case Equals:
			case MoreThan:
			case LessThan:
			case NoEquals:
			case NoMoreThan:
			case NoLessThan:
				enterOuterAlt(_localctx, 10);
				{
				setState(200);
				compare();
				}
				break;
			case SortAscending:
			case SortDescending:
				enterOuterAlt(_localctx, 11);
				{
				setState(201);
				sort();
				}
				break;
			case Group:
				enterOuterAlt(_localctx, 12);
				{
				setState(202);
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
		enterRule(_localctx, 44, RULE_adjective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		enterRule(_localctx, 46, RULE_numerals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
		enterRule(_localctx, 48, RULE_quantifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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
		enterRule(_localctx, 50, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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

	public static class CompareContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(BLParser.Equals, 0); }
		public TerminalNode NoEquals() { return getToken(BLParser.NoEquals, 0); }
		public TerminalNode MoreThan() { return getToken(BLParser.MoreThan, 0); }
		public TerminalNode NoMoreThan() { return getToken(BLParser.NoMoreThan, 0); }
		public TerminalNode LessThan() { return getToken(BLParser.LessThan, 0); }
		public TerminalNode NoLessThan() { return getToken(BLParser.NoLessThan, 0); }
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
		enterRule(_localctx, 52, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		enterRule(_localctx, 54, RULE_sort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return object_sempred((ObjectContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean object_sempred(ObjectContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\5\2=\n\2\6\2?\n\2\r\2"+
		"\16\2@\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\ta\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\6\nh\n\n\r\n\16\ni\5\nl\n\n\3\n\3\n\5\np\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13x\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\5\17\u008c\n\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0092\n\17\7\17\u0094\n\17\f\17\16\17\u0097\13\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\5\21\u009f\n\21\3\21\6\21\u00a2\n\21\r\21\16\21"+
		"\u00a3\3\22\3\22\3\22\5\22\u00a9\n\22\3\23\3\23\3\23\5\23\u00ae\n\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u00c0\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u00ce\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\2\3\34\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668\2\4\3\2\17\24\3\2\f\r\2\u00eb\2>\3\2\2\2\4D"+
		"\3\2\2\2\6J\3\2\2\2\bL\3\2\2\2\nQ\3\2\2\2\fU\3\2\2\2\16Y\3\2\2\2\20`\3"+
		"\2\2\2\22b\3\2\2\2\24q\3\2\2\2\26y\3\2\2\2\30\u0080\3\2\2\2\32\u0086\3"+
		"\2\2\2\34\u008b\3\2\2\2\36\u0098\3\2\2\2 \u00a1\3\2\2\2\"\u00a8\3\2\2"+
		"\2$\u00aa\3\2\2\2&\u00af\3\2\2\2(\u00b2\3\2\2\2*\u00bf\3\2\2\2,\u00cd"+
		"\3\2\2\2.\u00cf\3\2\2\2\60\u00d1\3\2\2\2\62\u00d3\3\2\2\2\64\u00d5\3\2"+
		"\2\2\66\u00d7\3\2\2\28\u00d9\3\2\2\2:<\5\4\3\2;=\7\'\2\2<;\3\2\2\2<=\3"+
		"\2\2\2=?\3\2\2\2>:\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\3\3\2\2\2BE"+
		"\5\6\4\2CE\5\20\t\2DB\3\2\2\2DC\3\2\2\2E\5\3\2\2\2FK\5\f\7\2GK\5\n\6\2"+
		"HK\5\b\5\2IK\5\16\b\2JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\7\3\2\2"+
		"\2LM\5\36\20\2MN\5\"\22\2NO\5 \21\2OP\5\34\17\2P\t\3\2\2\2QR\5\36\20\2"+
		"RS\5 \21\2ST\5\34\17\2T\13\3\2\2\2UV\5\32\16\2VW\5\36\20\2WX\5\34\17\2"+
		"X\r\3\2\2\2YZ\5\36\20\2Z[\5\34\17\2[\17\3\2\2\2\\a\5\22\n\2]a\5\24\13"+
		"\2^a\5\26\f\2_a\5\30\r\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\21"+
		"\3\2\2\2bk\5\16\b\2cd\7&\2\2dg\7!\2\2ef\7&\2\2fh\5\f\7\2ge\3\2\2\2hi\3"+
		"\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2kc\3\2\2\2kl\3\2\2\2lo\3\2\2\2mn\7"+
		"&\2\2np\5\16\b\2om\3\2\2\2op\3\2\2\2p\23\3\2\2\2qr\7\t\2\2rs\7*\2\2sw"+
		"\7\17\2\2tx\5\4\3\2ux\7*\2\2vx\7)\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\25"+
		"\3\2\2\2yz\7$\2\2z{\7*\2\2{|\7#\2\2|}\7*\2\2}~\7\13\2\2~\177\58\35\2\177"+
		"\27\3\2\2\2\u0080\u0081\7#\2\2\u0081\u0082\7*\2\2\u0082\u0083\7$\2\2\u0083"+
		"\u0084\7*\2\2\u0084\u0085\7\16\2\2\u0085\31\3\2\2\2\u0086\u0087\7*\2\2"+
		"\u0087\33\3\2\2\2\u0088\u0089\b\17\1\2\u0089\u008c\7*\2\2\u008a\u008c"+
		"\5*\26\2\u008b\u0088\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u0095\3\2\2\2\u008d"+
		"\u008e\f\3\2\2\u008e\u0091\7(\2\2\u008f\u0092\7*\2\2\u0090\u0092\5*\26"+
		"\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u008d"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\35\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\5,\27\2\u0099\37\3\2\2\2\u009a"+
		"\u009f\7*\2\2\u009b\u009f\5\6\4\2\u009c\u009f\5.\30\2\u009d\u009f\5*\26"+
		"\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\7 \2\2\u00a1\u009e\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4!\3\2\2\2"+
		"\u00a5\u00a9\5$\23\2\u00a6\u00a9\5&\24\2\u00a7\u00a9\5(\25\2\u00a8\u00a5"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9#\3\2\2\2\u00aa"+
		"\u00ab\7%\2\2\u00ab\u00ad\7*\2\2\u00ac\u00ae\7\"\2\2\u00ad\u00ac\3\2\2"+
		"\2\u00ad\u00ae\3\2\2\2\u00ae%\3\2\2\2\u00af\u00b0\7%\2\2\u00b0\u00b1\5"+
		"\64\33\2\u00b1\'\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3\u00b4\7\"\2\2\u00b4"+
		")\3\2\2\2\u00b5\u00c0\7\25\2\2\u00b6\u00c0\7\26\2\2\u00b7\u00c0\7\27\2"+
		"\2\u00b8\u00c0\7\30\2\2\u00b9\u00c0\7\31\2\2\u00ba\u00c0\7\32\2\2\u00bb"+
		"\u00c0\7\33\2\2\u00bc\u00c0\7\34\2\2\u00bd\u00c0\5\64\33\2\u00be\u00c0"+
		"\7)\2\2\u00bf\u00b5\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf"+
		"\u00b8\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2"+
		"\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"+\3\2\2\2\u00c1\u00ce\7\3\2\2\u00c2\u00ce\7\4\2\2\u00c3\u00ce\7\5\2\2"+
		"\u00c4\u00ce\7\6\2\2\u00c5\u00ce\7\7\2\2\u00c6\u00ce\7\b\2\2\u00c7\u00ce"+
		"\7\t\2\2\u00c8\u00ce\7\n\2\2\u00c9\u00ce\7\13\2\2\u00ca\u00ce\5\66\34"+
		"\2\u00cb\u00ce\58\35\2\u00cc\u00ce\7\16\2\2\u00cd\u00c1\3\2\2\2\u00cd"+
		"\u00c2\3\2\2\2\u00cd\u00c3\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c5\3\2"+
		"\2\2\u00cd\u00c6\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd"+
		"\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2"+
		"\2\2\u00ce-\3\2\2\2\u00cf\u00d0\7\37\2\2\u00d0/\3\2\2\2\u00d1\u00d2\7"+
		")\2\2\u00d2\61\3\2\2\2\u00d3\u00d4\7\36\2\2\u00d4\63\3\2\2\2\u00d5\u00d6"+
		"\7\35\2\2\u00d6\65\3\2\2\2\u00d7\u00d8\t\2\2\2\u00d8\67\3\2\2\2\u00d9"+
		"\u00da\t\3\2\2\u00da9\3\2\2\2\24<@DJ`ikow\u008b\u0091\u0095\u009e\u00a3"+
		"\u00a8\u00ad\u00bf\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}