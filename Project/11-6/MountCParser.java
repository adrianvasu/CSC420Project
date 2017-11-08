// Generated from MountC.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MountCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACE=1, RBRACE=2, LPAREN=3, RPAREN=4, COMMA=5, QUEST=6, COLON=7, SCOLON=8, 
		GETS=9, PLUS=10, MINUS=11, RETURN=12, NUM=13, ID=14, C=15, WS=16;
	public static final int
		RULE_program = 0, RULE_fun_def_list = 1, RULE_fun_def = 2, RULE_id_list = 3, 
		RULE_id_list_tail = 4, RULE_expr_list = 5, RULE_expr_list_tail = 6, RULE_expr = 7, 
		RULE_expr_tail = 8, RULE_term = 9, RULE_term_tail = 10, RULE_arg_list = 11, 
		RULE_arg_list_tail = 12, RULE_op = 13;
	public static final String[] ruleNames = {
		"program", "fun_def_list", "fun_def", "id_list", "id_list_tail", "expr_list", 
		"expr_list_tail", "expr", "expr_tail", "term", "term_tail", "arg_list", 
		"arg_list_tail", "op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "','", "'?'", "':'", "';'", "'='", "'+'", 
		"'-'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LBRACE", "RBRACE", "LPAREN", "RPAREN", "COMMA", "QUEST", "COLON", 
		"SCOLON", "GETS", "PLUS", "MINUS", "RETURN", "NUM", "ID", "C", "WS"
	};
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
	public String getGrammarFileName() { return "MountC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MountCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Fun_def_listContext fun_def_list() {
			return getRuleContext(Fun_def_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			fun_def_list();
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

	public static class Fun_def_listContext extends ParserRuleContext {
		public Fun_defContext fun_def() {
			return getRuleContext(Fun_defContext.class,0);
		}
		public Fun_def_listContext fun_def_list() {
			return getRuleContext(Fun_def_listContext.class,0);
		}
		public Fun_def_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_def_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterFun_def_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitFun_def_list(this);
		}
	}

	public final Fun_def_listContext fun_def_list() throws RecognitionException {
		Fun_def_listContext _localctx = new Fun_def_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fun_def_list);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				fun_def();
				setState(31);
				fun_def_list();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Fun_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MountCParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MountCParser.LPAREN, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MountCParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MountCParser.LBRACE, 0); }
		public TerminalNode RETURN() { return getToken(MountCParser.RETURN, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(MountCParser.SCOLON, 0); }
		public TerminalNode RBRACE() { return getToken(MountCParser.RBRACE, 0); }
		public Fun_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterFun_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitFun_def(this);
		}
	}

	public final Fun_defContext fun_def() throws RecognitionException {
		Fun_defContext _localctx = new Fun_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fun_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ID);
			setState(37);
			match(LPAREN);
			setState(38);
			id_list();
			setState(39);
			match(RPAREN);
			setState(40);
			match(LBRACE);
			setState(41);
			match(RETURN);
			setState(42);
			expr_list();
			setState(43);
			match(SCOLON);
			setState(44);
			match(RBRACE);
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

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MountCParser.ID, 0); }
		public Id_list_tailContext id_list_tail() {
			return getRuleContext(Id_list_tailContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id_list);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(ID);
				setState(47);
				id_list_tail();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Id_list_tailContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MountCParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(MountCParser.ID, 0); }
		public Id_list_tailContext id_list_tail() {
			return getRuleContext(Id_list_tailContext.class,0);
		}
		public Id_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterId_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitId_list_tail(this);
		}
	}

	public final Id_list_tailContext id_list_tail() throws RecognitionException {
		Id_list_tailContext _localctx = new Id_list_tailContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id_list_tail);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(COMMA);
				setState(52);
				match(ID);
				setState(53);
				id_list_tail();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitExpr_list(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			expr(0);
			setState(58);
			expr_list_tail();
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

	public static class Expr_list_tailContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MountCParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterExpr_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitExpr_list_tail(this);
		}
	}

	public final Expr_list_tailContext expr_list_tail() throws RecognitionException {
		Expr_list_tailContext _localctx = new Expr_list_tailContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr_list_tail);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(COMMA);
				setState(61);
				expr(0);
				setState(62);
				expr_list_tail();
				}
				break;
			case RPAREN:
			case SCOLON:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_tailContext expr_tail() {
			return getRuleContext(Expr_tailContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MountCParser.LPAREN, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MountCParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QUEST() { return getToken(MountCParser.QUEST, 0); }
		public TerminalNode COLON() { return getToken(MountCParser.COLON, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case ID:
				{
				setState(68);
				term();
				setState(69);
				expr_tail();
				}
				break;
			case LPAREN:
				{
				setState(71);
				match(LPAREN);
				setState(72);
				expr_list();
				setState(73);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(77);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(78);
					match(QUEST);
					setState(79);
					expr(0);
					setState(80);
					match(COLON);
					setState(81);
					expr(4);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Expr_tailContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterExpr_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitExpr_tail(this);
		}
	}

	public final Expr_tailContext expr_tail() throws RecognitionException {
		Expr_tailContext _localctx = new Expr_tailContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_tail);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				op();
				setState(89);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdTermContext extends TermContext {
		public TerminalNode ID() { return getToken(MountCParser.ID, 0); }
		public Term_tailContext term_tail() {
			return getRuleContext(Term_tailContext.class,0);
		}
		public IdTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterIdTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitIdTerm(this);
		}
	}
	public static class NumTermContext extends TermContext {
		public TerminalNode NUM() { return getToken(MountCParser.NUM, 0); }
		public NumTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterNumTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitNumTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new NumTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(NUM);
				}
				break;
			case ID:
				_localctx = new IdTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(ID);
				setState(96);
				term_tail();
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

	public static class Term_tailContext extends ParserRuleContext {
		public Term_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_tail; }
	 
		public Term_tailContext() { }
		public void copyFrom(Term_tailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EpsilonContext extends Term_tailContext {
		public EpsilonContext(Term_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitEpsilon(this);
		}
	}
	public static class FunCallContext extends Term_tailContext {
		public TerminalNode LPAREN() { return getToken(MountCParser.LPAREN, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MountCParser.RPAREN, 0); }
		public FunCallContext(Term_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitFunCall(this);
		}
	}
	public static class VarAssignContext extends Term_tailContext {
		public TerminalNode GETS() { return getToken(MountCParser.GETS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarAssignContext(Term_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitVarAssign(this);
		}
	}

	public final Term_tailContext term_tail() throws RecognitionException {
		Term_tailContext _localctx = new Term_tailContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term_tail);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new FunCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(LPAREN);
				setState(100);
				arg_list();
				setState(101);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new VarAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(GETS);
				setState(104);
				expr(0);
				}
				break;
			case 3:
				_localctx = new EpsilonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Arg_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Arg_list_tailContext arg_list_tail() {
			return getRuleContext(Arg_list_tailContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitArg_list(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arg_list);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case NUM:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				expr(0);
				setState(109);
				arg_list_tail();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Arg_list_tailContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MountCParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Arg_list_tailContext arg_list_tail() {
			return getRuleContext(Arg_list_tailContext.class,0);
		}
		public Arg_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterArg_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitArg_list_tail(this);
		}
	}

	public final Arg_list_tailContext arg_list_tail() throws RecognitionException {
		Arg_list_tailContext _localctx = new Arg_list_tailContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arg_list_tail);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(COMMA);
				setState(115);
				expr(0);
				setState(116);
				arg_list_tail();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MountCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MountCParser.MINUS, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22~\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\5\3%\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\64\n\5\3\6\3\6"+
		"\3\6\3\6\5\6:\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bD\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\tN\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tV\n\t\f\t\16"+
		"\tY\13\t\3\n\3\n\3\n\3\n\5\n_\n\n\3\13\3\13\3\13\5\13d\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\fm\n\f\3\r\3\r\3\r\3\r\5\rs\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\5\16z\n\16\3\17\3\17\3\17\2\3\20\20\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\2\3\3\2\f\r\2{\2\36\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b\63\3\2\2"+
		"\2\n9\3\2\2\2\f;\3\2\2\2\16C\3\2\2\2\20M\3\2\2\2\22^\3\2\2\2\24c\3\2\2"+
		"\2\26l\3\2\2\2\30r\3\2\2\2\32y\3\2\2\2\34{\3\2\2\2\36\37\5\4\3\2\37\3"+
		"\3\2\2\2 !\5\6\4\2!\"\5\4\3\2\"%\3\2\2\2#%\3\2\2\2$ \3\2\2\2$#\3\2\2\2"+
		"%\5\3\2\2\2&\'\7\20\2\2\'(\7\5\2\2()\5\b\5\2)*\7\6\2\2*+\7\3\2\2+,\7\16"+
		"\2\2,-\5\f\7\2-.\7\n\2\2./\7\4\2\2/\7\3\2\2\2\60\61\7\20\2\2\61\64\5\n"+
		"\6\2\62\64\3\2\2\2\63\60\3\2\2\2\63\62\3\2\2\2\64\t\3\2\2\2\65\66\7\7"+
		"\2\2\66\67\7\20\2\2\67:\5\n\6\28:\3\2\2\29\65\3\2\2\298\3\2\2\2:\13\3"+
		"\2\2\2;<\5\20\t\2<=\5\16\b\2=\r\3\2\2\2>?\7\7\2\2?@\5\20\t\2@A\5\16\b"+
		"\2AD\3\2\2\2BD\3\2\2\2C>\3\2\2\2CB\3\2\2\2D\17\3\2\2\2EF\b\t\1\2FG\5\24"+
		"\13\2GH\5\22\n\2HN\3\2\2\2IJ\7\5\2\2JK\5\f\7\2KL\7\6\2\2LN\3\2\2\2ME\3"+
		"\2\2\2MI\3\2\2\2NW\3\2\2\2OP\f\5\2\2PQ\7\b\2\2QR\5\20\t\2RS\7\t\2\2ST"+
		"\5\20\t\6TV\3\2\2\2UO\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\21\3\2\2"+
		"\2YW\3\2\2\2Z[\5\34\17\2[\\\5\20\t\2\\_\3\2\2\2]_\3\2\2\2^Z\3\2\2\2^]"+
		"\3\2\2\2_\23\3\2\2\2`d\7\17\2\2ab\7\20\2\2bd\5\26\f\2c`\3\2\2\2ca\3\2"+
		"\2\2d\25\3\2\2\2ef\7\5\2\2fg\5\30\r\2gh\7\6\2\2hm\3\2\2\2ij\7\13\2\2j"+
		"m\5\20\t\2km\3\2\2\2le\3\2\2\2li\3\2\2\2lk\3\2\2\2m\27\3\2\2\2no\5\20"+
		"\t\2op\5\32\16\2ps\3\2\2\2qs\3\2\2\2rn\3\2\2\2rq\3\2\2\2s\31\3\2\2\2t"+
		"u\7\7\2\2uv\5\20\t\2vw\5\32\16\2wz\3\2\2\2xz\3\2\2\2yt\3\2\2\2yx\3\2\2"+
		"\2z\33\3\2\2\2{|\t\2\2\2|\35\3\2\2\2\r$\639CMW^clry";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}