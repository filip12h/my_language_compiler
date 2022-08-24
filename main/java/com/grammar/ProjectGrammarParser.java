// Generated from ProjectGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProjectGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ASSIGN=25, NEG=26, INT=27, BOOLEAN=28, GR=29, LO=30, GE=31, LE=32, EQ=33, 
		MUL=34, DIV=35, PLUS=36, MINUS=37, NUMBER=38, BOOL=39, CONST=40, VARIABLE=41, 
		NEWLINE=42, WS=43, BLOCKCOMMENT=44, LINECOMMENT=45;
	public static final int
		RULE_init = 0, RULE_stat = 1, RULE_block = 2, RULE_declaration = 3, RULE_retexpr = 4, 
		RULE_functionbody = 5, RULE_statement = 6, RULE_parameterlist = 7, RULE_parameterVar = 8, 
		RULE_parameter = 9, RULE_arrayslistFuncDecl = 10, RULE_arrayslist = 11, 
		RULE_ifstatement = 12, RULE_ifblock = 13, RULE_elseblock = 14, RULE_whilestatement = 15, 
		RULE_cyclebody = 16, RULE_expr = 17, RULE_assignexpression = 18, RULE_mathexpression = 19, 
		RULE_logicexpression = 20, RULE_mathoperand = 21, RULE_logicoperand = 22, 
		RULE_operand = 23, RULE_dimensions = 24, RULE_function = 25, RULE_arguments = 26, 
		RULE_writeintcontext = 27, RULE_writestrcontext = 28, RULE_charoperand = 29, 
		RULE_charoperandinlogic = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "stat", "block", "declaration", "retexpr", "functionbody", "statement", 
			"parameterlist", "parameterVar", "parameter", "arrayslistFuncDecl", "arrayslist", 
			"ifstatement", "ifblock", "elseblock", "whilestatement", "cyclebody", 
			"expr", "assignexpression", "mathexpression", "logicexpression", "mathoperand", 
			"logicoperand", "operand", "dimensions", "function", "arguments", "writeintcontext", 
			"writestrcontext", "charoperand", "charoperandinlogic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'writeint'", "'('", "')'", "';'", "'writestr'", "'writechar'", 
			"'writeline();'", "'{'", "'return'", "'}'", "','", "'char'", "'[]'", 
			"'['", "']'", "'if'", "'else'", "'while'", "'readint()'", "'readline()'", 
			"'readchar()'", "'(char)'", "'and'", "'or'", "'<-'", "'!'", "'int'", 
			"'bool'", "'>'", "'<'", "'>='", "'<='", "'='", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ASSIGN", "NEG", "INT", "BOOLEAN", "GR", "LO", "GE", "LE", "EQ", 
			"MUL", "DIV", "PLUS", "MINUS", "NUMBER", "BOOL", "CONST", "VARIABLE", 
			"NEWLINE", "WS", "BLOCKCOMMENT", "LINECOMMENT"
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
	public String getGrammarFileName() { return "ProjectGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProjectGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProjectGrammarParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__21) | (1L << NEG) | (1L << INT) | (1L << BOOLEAN) | (1L << MINUS) | (1L << NUMBER) | (1L << BOOL) | (1L << CONST) | (1L << VARIABLE) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(62);
				stat();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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

	public static class StatContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ProjectGrammarParser.NEWLINE, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__4:
			case T__5:
			case T__6:
			case T__11:
			case T__15:
			case T__17:
			case T__21:
			case NEG:
			case INT:
			case BOOLEAN:
			case MINUS:
			case NUMBER:
			case BOOL:
			case CONST:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				block();
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(71);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(NEWLINE);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OutCharContext extends BlockContext {
		public CharoperandContext charoperand() {
			return getRuleContext(CharoperandContext.class,0);
		}
		public OutCharContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterOutChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitOutChar(this);
		}
	}
	public static class OutIntContext extends BlockContext {
		public WriteintcontextContext writeintcontext() {
			return getRuleContext(WriteintcontextContext.class,0);
		}
		public OutIntContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterOutInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitOutInt(this);
		}
	}
	public static class OutStrContext extends BlockContext {
		public WritestrcontextContext writestrcontext() {
			return getRuleContext(WritestrcontextContext.class,0);
		}
		public OutStrContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterOutStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitOutStr(this);
		}
	}
	public static class OutLineContext extends BlockContext {
		public OutLineContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterOutLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitOutLine(this);
		}
	}
	public static class DeclContext extends BlockContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitDecl(this);
		}
	}
	public static class StatmContext extends BlockContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatmContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterStatm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitStatm(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case INT:
			case BOOLEAN:
				_localctx = new DeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				declaration();
				}
				break;
			case T__1:
			case T__15:
			case T__17:
			case T__21:
			case NEG:
			case MINUS:
			case NUMBER:
			case BOOL:
			case CONST:
			case VARIABLE:
				_localctx = new StatmContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				statement();
				}
				break;
			case T__0:
				_localctx = new OutIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(T__0);
				setState(80);
				match(T__1);
				setState(81);
				writeintcontext();
				setState(82);
				match(T__2);
				setState(83);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new OutStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(T__4);
				setState(86);
				match(T__1);
				setState(87);
				writestrcontext();
				setState(88);
				match(T__2);
				setState(89);
				match(T__3);
				}
				break;
			case T__5:
				_localctx = new OutCharContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				match(T__5);
				setState(92);
				match(T__1);
				setState(93);
				charoperand();
				setState(94);
				match(T__2);
				setState(95);
				match(T__3);
				}
				break;
			case T__6:
				_localctx = new OutLineContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				match(T__6);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclarationContext extends DeclarationContext {
		public ParameterVarContext parameterVar() {
			return getRuleContext(ParameterVarContext.class,0);
		}
		public VarDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitVarDeclaration(this);
		}
	}
	public static class FunctionDeclarationContext extends DeclarationContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public RetexprContext retexpr() {
			return getRuleContext(RetexprContext.class,0);
		}
		public List<ArrayslistFuncDeclContext> arrayslistFuncDecl() {
			return getRuleContexts(ArrayslistFuncDeclContext.class);
		}
		public ArrayslistFuncDeclContext arrayslistFuncDecl(int i) {
			return getRuleContext(ArrayslistFuncDeclContext.class,i);
		}
		public ParameterlistContext parameterlist() {
			return getRuleContext(ParameterlistContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ProjectGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ProjectGrammarParser.NEWLINE, i);
		}
		public FunctionDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				parameter();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(101);
					arrayslistFuncDecl();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(T__1);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT || _la==BOOLEAN) {
					{
					setState(108);
					parameterlist();
					}
				}

				setState(111);
				match(T__2);
				setState(112);
				match(T__7);
				setState(113);
				functionbody();
				setState(114);
				match(T__8);
				setState(115);
				retexpr();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(116);
					match(NEWLINE);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				parameterVar();
				setState(125);
				match(T__3);
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

	public static class RetexprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterRetexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitRetexpr(this);
		}
	}

	public final RetexprContext retexpr() throws RecognitionException {
		RetexprContext _localctx = new RetexprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_retexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			expr();
			setState(130);
			match(T__3);
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

	public static class FunctionbodyContext extends ParserRuleContext {
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
	 
		public FunctionbodyContext() { }
		public void copyFrom(FunctionbodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncBodyContext extends FunctionbodyContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FuncBodyContext(FunctionbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitFuncBody(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionbody);
		int _la;
		try {
			_localctx = new FuncBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__21) | (1L << NEG) | (1L << INT) | (1L << BOOLEAN) | (1L << MINUS) | (1L << NUMBER) | (1L << BOOL) | (1L << CONST) | (1L << VARIABLE) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(132);
				stat();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitIfStatement(this);
		}
	}
	public static class ExpressionContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitExpression(this);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitWhileStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				ifstatement();
				}
				break;
			case T__17:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				whilestatement();
				}
				break;
			case T__1:
			case T__21:
			case NEG:
			case MINUS:
			case NUMBER:
			case BOOL:
			case CONST:
			case VARIABLE:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				expr();
				setState(141);
				match(T__3);
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

	public static class ParameterlistContext extends ParserRuleContext {
		public ParameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterlist; }
	 
		public ParameterlistContext() { }
		public void copyFrom(ParameterlistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamListContext extends ParameterlistContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParamListContext(ParameterlistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitParamList(this);
		}
	}

	public final ParameterlistContext parameterlist() throws RecognitionException {
		ParameterlistContext _localctx = new ParameterlistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterlist);
		int _la;
		try {
			_localctx = new ParamListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			parameter();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(146);
				match(T__10);
				setState(147);
				parameter();
				}
				}
				setState(152);
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

	public static class ParameterVarContext extends ParserRuleContext {
		public ParameterVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterVar; }
	 
		public ParameterVarContext() { }
		public void copyFrom(ParameterVarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationIntContext extends ParameterVarContext {
		public TerminalNode INT() { return getToken(ProjectGrammarParser.INT, 0); }
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public List<ArrayslistContext> arrayslist() {
			return getRuleContexts(ArrayslistContext.class);
		}
		public ArrayslistContext arrayslist(int i) {
			return getRuleContext(ArrayslistContext.class,i);
		}
		public VariableDeclarationIntContext(ParameterVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterVariableDeclarationInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitVariableDeclarationInt(this);
		}
	}
	public static class VariableDeclarationCharContext extends ParameterVarContext {
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public List<ArrayslistContext> arrayslist() {
			return getRuleContexts(ArrayslistContext.class);
		}
		public ArrayslistContext arrayslist(int i) {
			return getRuleContext(ArrayslistContext.class,i);
		}
		public VariableDeclarationCharContext(ParameterVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterVariableDeclarationChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitVariableDeclarationChar(this);
		}
	}
	public static class VariableDeclarationBoolContext extends ParameterVarContext {
		public TerminalNode BOOLEAN() { return getToken(ProjectGrammarParser.BOOLEAN, 0); }
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public List<ArrayslistContext> arrayslist() {
			return getRuleContexts(ArrayslistContext.class);
		}
		public ArrayslistContext arrayslist(int i) {
			return getRuleContext(ArrayslistContext.class,i);
		}
		public VariableDeclarationBoolContext(ParameterVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterVariableDeclarationBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitVariableDeclarationBool(this);
		}
	}

	public final ParameterVarContext parameterVar() throws RecognitionException {
		ParameterVarContext _localctx = new ParameterVarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterVar);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new VariableDeclarationIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(INT);
				setState(154);
				match(VARIABLE);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(155);
					arrayslist();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
				_localctx = new VariableDeclarationBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(BOOLEAN);
				setState(162);
				match(VARIABLE);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(163);
					arrayslist();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				_localctx = new VariableDeclarationCharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(T__11);
				setState(170);
				match(VARIABLE);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(171);
					arrayslist();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableInFuncDeclarationBoolContext extends ParameterContext {
		public TerminalNode BOOLEAN() { return getToken(ProjectGrammarParser.BOOLEAN, 0); }
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public List<ArrayslistFuncDeclContext> arrayslistFuncDecl() {
			return getRuleContexts(ArrayslistFuncDeclContext.class);
		}
		public ArrayslistFuncDeclContext arrayslistFuncDecl(int i) {
			return getRuleContext(ArrayslistFuncDeclContext.class,i);
		}
		public VariableInFuncDeclarationBoolContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterVariableInFuncDeclarationBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitVariableInFuncDeclarationBool(this);
		}
	}
	public static class VariableInFuncDeclarationIntContext extends ParameterContext {
		public TerminalNode INT() { return getToken(ProjectGrammarParser.INT, 0); }
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public List<ArrayslistFuncDeclContext> arrayslistFuncDecl() {
			return getRuleContexts(ArrayslistFuncDeclContext.class);
		}
		public ArrayslistFuncDeclContext arrayslistFuncDecl(int i) {
			return getRuleContext(ArrayslistFuncDeclContext.class,i);
		}
		public VariableInFuncDeclarationIntContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterVariableInFuncDeclarationInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitVariableInFuncDeclarationInt(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		try {
			int _alt;
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new VariableInFuncDeclarationIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(INT);
				setState(180);
				match(VARIABLE);
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(181);
						arrayslistFuncDecl();
						}
						} 
					}
					setState(186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case BOOLEAN:
				_localctx = new VariableInFuncDeclarationBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(BOOLEAN);
				setState(188);
				match(VARIABLE);
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(189);
						arrayslistFuncDecl();
						}
						} 
					}
					setState(194);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class ArrayslistFuncDeclContext extends ParserRuleContext {
		public ArrayslistFuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayslistFuncDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterArrayslistFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitArrayslistFuncDecl(this);
		}
	}

	public final ArrayslistFuncDeclContext arrayslistFuncDecl() throws RecognitionException {
		ArrayslistFuncDeclContext _localctx = new ArrayslistFuncDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayslistFuncDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__12);
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

	public static class ArrayslistContext extends ParserRuleContext {
		public ArrayslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayslist; }
	 
		public ArrayslistContext() { }
		public void copyFrom(ArrayslistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrContext extends ArrayslistContext {
		public MathexpressionContext mathexpression() {
			return getRuleContext(MathexpressionContext.class,0);
		}
		public ArrContext(ArrayslistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitArr(this);
		}
	}

	public final ArrayslistContext arrayslist() throws RecognitionException {
		ArrayslistContext _localctx = new ArrayslistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayslist);
		try {
			_localctx = new ArrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__13);
			setState(200);
			mathexpression(0);
			setState(201);
			match(T__14);
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

	public static class IfstatementContext extends ParserRuleContext {
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
	 
		public IfstatementContext() { }
		public void copyFrom(IfstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfCtxContext extends IfstatementContext {
		public LogicexpressionContext logicexpression() {
			return getRuleContext(LogicexpressionContext.class,0);
		}
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public ElseblockContext elseblock() {
			return getRuleContext(ElseblockContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ProjectGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ProjectGrammarParser.NEWLINE, i);
		}
		public IfCtxContext(IfstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterIfCtx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitIfCtx(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifstatement);
		int _la;
		try {
			_localctx = new IfCtxContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__15);
			setState(204);
			match(T__1);
			setState(205);
			logicexpression(0);
			setState(206);
			match(T__2);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(207);
				match(NEWLINE);
				}
			}

			setState(210);
			match(T__7);
			setState(211);
			ifblock();
			setState(212);
			match(T__9);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(213);
				match(NEWLINE);
				}
			}

			setState(216);
			match(T__16);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(217);
				match(NEWLINE);
				}
			}

			setState(220);
			match(T__7);
			setState(221);
			elseblock();
			setState(222);
			match(T__9);
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

	public static class IfblockContext extends ParserRuleContext {
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
	 
		public IfblockContext() { }
		public void copyFrom(IfblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementsContext extends IfblockContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfStatementsContext(IfblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterIfStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitIfStatements(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifblock);
		int _la;
		try {
			_localctx = new IfStatementsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__21) | (1L << NEG) | (1L << INT) | (1L << BOOLEAN) | (1L << MINUS) | (1L << NUMBER) | (1L << BOOL) | (1L << CONST) | (1L << VARIABLE) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(224);
				stat();
				}
				}
				setState(229);
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

	public static class ElseblockContext extends ParserRuleContext {
		public ElseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseblock; }
	 
		public ElseblockContext() { }
		public void copyFrom(ElseblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseStatementsContext extends ElseblockContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ElseStatementsContext(ElseblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterElseStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitElseStatements(this);
		}
	}

	public final ElseblockContext elseblock() throws RecognitionException {
		ElseblockContext _localctx = new ElseblockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseblock);
		int _la;
		try {
			_localctx = new ElseStatementsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__21) | (1L << NEG) | (1L << INT) | (1L << BOOLEAN) | (1L << MINUS) | (1L << NUMBER) | (1L << BOOL) | (1L << CONST) | (1L << VARIABLE) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(230);
				stat();
				}
				}
				setState(235);
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

	public static class WhilestatementContext extends ParserRuleContext {
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
	 
		public WhilestatementContext() { }
		public void copyFrom(WhilestatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileCtxContext extends WhilestatementContext {
		public LogicexpressionContext logicexpression() {
			return getRuleContext(LogicexpressionContext.class,0);
		}
		public CyclebodyContext cyclebody() {
			return getRuleContext(CyclebodyContext.class,0);
		}
		public WhileCtxContext(WhilestatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterWhileCtx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitWhileCtx(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whilestatement);
		try {
			_localctx = new WhileCtxContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__17);
			setState(237);
			match(T__1);
			setState(238);
			logicexpression(0);
			setState(239);
			match(T__2);
			setState(240);
			match(T__7);
			setState(241);
			cyclebody();
			setState(242);
			match(T__9);
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

	public static class CyclebodyContext extends ParserRuleContext {
		public CyclebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cyclebody; }
	 
		public CyclebodyContext() { }
		public void copyFrom(CyclebodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CycBdContext extends CyclebodyContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ProjectGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ProjectGrammarParser.NEWLINE, i);
		}
		public CycBdContext(CyclebodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterCycBd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitCycBd(this);
		}
	}

	public final CyclebodyContext cyclebody() throws RecognitionException {
		CyclebodyContext _localctx = new CyclebodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cyclebody);
		int _la;
		try {
			_localctx = new CycBdContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__21) | (1L << NEG) | (1L << INT) | (1L << BOOLEAN) | (1L << MINUS) | (1L << NUMBER) | (1L << BOOL) | (1L << CONST) | (1L << VARIABLE) | (1L << NEWLINE))) != 0)) {
				{
				setState(246);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__4:
				case T__5:
				case T__6:
				case T__11:
				case T__15:
				case T__17:
				case T__21:
				case NEG:
				case INT:
				case BOOLEAN:
				case MINUS:
				case NUMBER:
				case BOOL:
				case CONST:
				case VARIABLE:
					{
					setState(244);
					block();
					}
					break;
				case NEWLINE:
					{
					setState(245);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(250);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignExpContext extends ExprContext {
		public AssignexpressionContext assignexpression() {
			return getRuleContext(AssignexpressionContext.class,0);
		}
		public AssignExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterAssignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitAssignExp(this);
		}
	}
	public static class LogicExpContext extends ExprContext {
		public LogicexpressionContext logicexpression() {
			return getRuleContext(LogicexpressionContext.class,0);
		}
		public LogicExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterLogicExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitLogicExp(this);
		}
	}
	public static class MathExpContext extends ExprContext {
		public MathexpressionContext mathexpression() {
			return getRuleContext(MathexpressionContext.class,0);
		}
		public MathExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterMathExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitMathExp(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new AssignExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				assignexpression();
				}
				break;
			case 2:
				_localctx = new MathExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				mathexpression(0);
				}
				break;
			case 3:
				_localctx = new LogicExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				logicexpression(0);
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

	public static class AssignexpressionContext extends ParserRuleContext {
		public AssignexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignexpression; }
	 
		public AssignexpressionContext() { }
		public void copyFrom(AssignexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignExpCtxLogContext extends AssignexpressionContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ProjectGrammarParser.ASSIGN, 0); }
		public LogicexpressionContext logicexpression() {
			return getRuleContext(LogicexpressionContext.class,0);
		}
		public AssignExpCtxLogContext(AssignexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterAssignExpCtxLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitAssignExpCtxLog(this);
		}
	}
	public static class AssignExpCtxInpIntContext extends AssignexpressionContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ProjectGrammarParser.ASSIGN, 0); }
		public AssignExpCtxInpIntContext(AssignexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterAssignExpCtxInpInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitAssignExpCtxInpInt(this);
		}
	}
	public static class AssignExpCtxFuncContext extends AssignexpressionContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ProjectGrammarParser.ASSIGN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public AssignExpCtxFuncContext(AssignexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterAssignExpCtxFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitAssignExpCtxFunc(this);
		}
	}
	public static class AssignMathContext extends AssignexpressionContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ProjectGrammarParser.ASSIGN, 0); }
		public MathexpressionContext mathexpression() {
			return getRuleContext(MathexpressionContext.class,0);
		}
		public AssignMathContext(AssignexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterAssignMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitAssignMath(this);
		}
	}
	public static class AssignExpCtxInpCharContext extends AssignexpressionContext {
		public CharoperandContext charoperand() {
			return getRuleContext(CharoperandContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ProjectGrammarParser.ASSIGN, 0); }
		public AssignExpCtxInpCharContext(AssignexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterAssignExpCtxInpChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitAssignExpCtxInpChar(this);
		}
	}
	public static class AssignExpCtxInpLineContext extends AssignexpressionContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ProjectGrammarParser.ASSIGN, 0); }
		public AssignExpCtxInpLineContext(AssignexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterAssignExpCtxInpLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitAssignExpCtxInpLine(this);
		}
	}

	public final AssignexpressionContext assignexpression() throws RecognitionException {
		AssignexpressionContext _localctx = new AssignexpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignexpression);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new AssignMathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				operand();
				setState(257);
				match(ASSIGN);
				setState(258);
				mathexpression(0);
				}
				break;
			case 2:
				_localctx = new AssignExpCtxLogContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				operand();
				setState(261);
				match(ASSIGN);
				setState(262);
				logicexpression(0);
				}
				break;
			case 3:
				_localctx = new AssignExpCtxInpIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				operand();
				setState(265);
				match(ASSIGN);
				setState(266);
				match(T__18);
				}
				break;
			case 4:
				_localctx = new AssignExpCtxInpLineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				operand();
				setState(269);
				match(ASSIGN);
				setState(270);
				match(T__19);
				}
				break;
			case 5:
				_localctx = new AssignExpCtxInpCharContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				charoperand();
				setState(273);
				match(ASSIGN);
				setState(274);
				match(T__20);
				}
				break;
			case 6:
				_localctx = new AssignExpCtxFuncContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(276);
				operand();
				setState(277);
				match(ASSIGN);
				setState(278);
				function();
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

	public static class MathexpressionContext extends ParserRuleContext {
		public MathexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathexpression; }
	 
		public MathexpressionContext() { }
		public void copyFrom(MathexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MathAtomContext extends MathexpressionContext {
		public MathoperandContext mathoperand() {
			return getRuleContext(MathoperandContext.class,0);
		}
		public MathAtomContext(MathexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterMathAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitMathAtom(this);
		}
	}
	public static class MathOpContext extends MathexpressionContext {
		public Token op;
		public List<MathexpressionContext> mathexpression() {
			return getRuleContexts(MathexpressionContext.class);
		}
		public MathexpressionContext mathexpression(int i) {
			return getRuleContext(MathexpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ProjectGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ProjectGrammarParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(ProjectGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ProjectGrammarParser.MINUS, 0); }
		public MathOpContext(MathexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterMathOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitMathOp(this);
		}
	}

	public final MathexpressionContext mathexpression() throws RecognitionException {
		return mathexpression(0);
	}

	private MathexpressionContext mathexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathexpressionContext _localctx = new MathexpressionContext(_ctx, _parentState);
		MathexpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_mathexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MathAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(283);
			mathoperand();
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new MathOpContext(new MathexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathexpression);
						setState(285);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(286);
						((MathOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MathOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(287);
						mathexpression(4);
						}
						break;
					case 2:
						{
						_localctx = new MathOpContext(new MathexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathexpression);
						setState(288);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(289);
						((MathOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((MathOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(290);
						mathexpression(3);
						}
						break;
					}
					} 
				}
				setState(295);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicexpressionContext extends ParserRuleContext {
		public LogicexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicexpression; }
	 
		public LogicexpressionContext() { }
		public void copyFrom(LogicexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpOrContext extends LogicexpressionContext {
		public List<LogicexpressionContext> logicexpression() {
			return getRuleContexts(LogicexpressionContext.class);
		}
		public LogicexpressionContext logicexpression(int i) {
			return getRuleContext(LogicexpressionContext.class,i);
		}
		public OpOrContext(LogicexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterOpOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitOpOr(this);
		}
	}
	public static class OpGLEContext extends LogicexpressionContext {
		public Token rel;
		public List<LogicoperandContext> logicoperand() {
			return getRuleContexts(LogicoperandContext.class);
		}
		public LogicoperandContext logicoperand(int i) {
			return getRuleContext(LogicoperandContext.class,i);
		}
		public TerminalNode GR() { return getToken(ProjectGrammarParser.GR, 0); }
		public TerminalNode LO() { return getToken(ProjectGrammarParser.LO, 0); }
		public TerminalNode GE() { return getToken(ProjectGrammarParser.GE, 0); }
		public TerminalNode LE() { return getToken(ProjectGrammarParser.LE, 0); }
		public TerminalNode EQ() { return getToken(ProjectGrammarParser.EQ, 0); }
		public OpGLEContext(LogicexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterOpGLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitOpGLE(this);
		}
	}
	public static class OpNegContext extends LogicexpressionContext {
		public TerminalNode NEG() { return getToken(ProjectGrammarParser.NEG, 0); }
		public LogicoperandContext logicoperand() {
			return getRuleContext(LogicoperandContext.class,0);
		}
		public OpNegContext(LogicexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterOpNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitOpNeg(this);
		}
	}
	public static class OperLogContext extends LogicexpressionContext {
		public LogicoperandContext logicoperand() {
			return getRuleContext(LogicoperandContext.class,0);
		}
		public OperLogContext(LogicexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterOperLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitOperLog(this);
		}
	}
	public static class OpAndContext extends LogicexpressionContext {
		public List<LogicexpressionContext> logicexpression() {
			return getRuleContexts(LogicexpressionContext.class);
		}
		public LogicexpressionContext logicexpression(int i) {
			return getRuleContext(LogicexpressionContext.class,i);
		}
		public OpAndContext(LogicexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterOpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitOpAnd(this);
		}
	}
	public static class CharOpGLEContext extends LogicexpressionContext {
		public Token rel;
		public List<CharoperandinlogicContext> charoperandinlogic() {
			return getRuleContexts(CharoperandinlogicContext.class);
		}
		public CharoperandinlogicContext charoperandinlogic(int i) {
			return getRuleContext(CharoperandinlogicContext.class,i);
		}
		public TerminalNode GR() { return getToken(ProjectGrammarParser.GR, 0); }
		public TerminalNode LO() { return getToken(ProjectGrammarParser.LO, 0); }
		public TerminalNode GE() { return getToken(ProjectGrammarParser.GE, 0); }
		public TerminalNode LE() { return getToken(ProjectGrammarParser.LE, 0); }
		public TerminalNode EQ() { return getToken(ProjectGrammarParser.EQ, 0); }
		public CharOpGLEContext(LogicexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterCharOpGLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitCharOpGLE(this);
		}
	}

	public final LogicexpressionContext logicexpression() throws RecognitionException {
		return logicexpression(0);
	}

	private LogicexpressionContext logicexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicexpressionContext _localctx = new LogicexpressionContext(_ctx, _parentState);
		LogicexpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_logicexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new CharOpGLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(297);
				match(T__21);
				setState(298);
				charoperandinlogic();
				setState(299);
				((CharOpGLEContext)_localctx).rel = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GR) | (1L << LO) | (1L << GE) | (1L << LE) | (1L << EQ))) != 0)) ) {
					((CharOpGLEContext)_localctx).rel = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(300);
				charoperandinlogic();
				}
				break;
			case 2:
				{
				_localctx = new OpGLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				logicoperand();
				setState(303);
				((OpGLEContext)_localctx).rel = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GR) | (1L << LO) | (1L << GE) | (1L << LE) | (1L << EQ))) != 0)) ) {
					((OpGLEContext)_localctx).rel = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(304);
				logicoperand();
				}
				break;
			case 3:
				{
				_localctx = new OpNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(NEG);
				setState(307);
				logicoperand();
				}
				break;
			case 4:
				{
				_localctx = new OperLogContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308);
				logicoperand();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new OpAndContext(new LogicexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicexpression);
						setState(311);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(312);
						match(T__22);
						}
						setState(313);
						logicexpression(5);
						}
						break;
					case 2:
						{
						_localctx = new OpOrContext(new LogicexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicexpression);
						setState(314);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(315);
						match(T__23);
						}
						setState(316);
						logicexpression(4);
						}
						break;
					}
					} 
				}
				setState(321);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MathoperandContext extends ParserRuleContext {
		public MathoperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathoperand; }
	 
		public MathoperandContext() { }
		public void copyFrom(MathoperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntArrayOperandContext extends MathoperandContext {
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public List<DimensionsContext> dimensions() {
			return getRuleContexts(DimensionsContext.class);
		}
		public DimensionsContext dimensions(int i) {
			return getRuleContext(DimensionsContext.class,i);
		}
		public IntArrayOperandContext(MathoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterIntArrayOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitIntArrayOperand(this);
		}
	}
	public static class IntOpInParenContext extends MathoperandContext {
		public MathexpressionContext mathexpression() {
			return getRuleContext(MathexpressionContext.class,0);
		}
		public IntOpInParenContext(MathoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterIntOpInParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitIntOpInParen(this);
		}
	}
	public static class IntNegContext extends MathoperandContext {
		public TerminalNode MINUS() { return getToken(ProjectGrammarParser.MINUS, 0); }
		public MathoperandContext mathoperand() {
			return getRuleContext(MathoperandContext.class,0);
		}
		public IntNegContext(MathoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterIntNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitIntNeg(this);
		}
	}
	public static class IntVarContext extends MathoperandContext {
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public IntVarContext(MathoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterIntVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitIntVar(this);
		}
	}
	public static class IntContext extends MathoperandContext {
		public TerminalNode NUMBER() { return getToken(ProjectGrammarParser.NUMBER, 0); }
		public IntContext(MathoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitInt(this);
		}
	}

	public final MathoperandContext mathoperand() throws RecognitionException {
		MathoperandContext _localctx = new MathoperandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mathoperand);
		try {
			int _alt;
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new IntVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(VARIABLE);
				}
				break;
			case 2:
				_localctx = new IntArrayOperandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(VARIABLE);
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(324);
						dimensions();
						}
						} 
					}
					setState(329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new IntNegContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(MINUS);
				setState(331);
				mathoperand();
				}
				break;
			case 4:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				match(NUMBER);
				}
				break;
			case 5:
				_localctx = new IntOpInParenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				match(T__1);
				setState(334);
				mathexpression(0);
				setState(335);
				match(T__2);
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

	public static class LogicoperandContext extends ParserRuleContext {
		public LogicoperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicoperand; }
	 
		public LogicoperandContext() { }
		public void copyFrom(LogicoperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MathExpInLogicContext extends LogicoperandContext {
		public MathexpressionContext mathexpression() {
			return getRuleContext(MathexpressionContext.class,0);
		}
		public MathExpInLogicContext(LogicoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterMathExpInLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitMathExpInLogic(this);
		}
	}
	public static class BoolConstContext extends LogicoperandContext {
		public TerminalNode BOOL() { return getToken(ProjectGrammarParser.BOOL, 0); }
		public BoolConstContext(LogicoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterBoolConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitBoolConst(this);
		}
	}
	public static class BoolArrayOperandContext extends LogicoperandContext {
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public List<DimensionsContext> dimensions() {
			return getRuleContexts(DimensionsContext.class);
		}
		public DimensionsContext dimensions(int i) {
			return getRuleContext(DimensionsContext.class,i);
		}
		public BoolArrayOperandContext(LogicoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterBoolArrayOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitBoolArrayOperand(this);
		}
	}
	public static class BoolOpInParenContext extends LogicoperandContext {
		public LogicexpressionContext logicexpression() {
			return getRuleContext(LogicexpressionContext.class,0);
		}
		public BoolOpInParenContext(LogicoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterBoolOpInParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitBoolOpInParen(this);
		}
	}
	public static class BoolVarContext extends LogicoperandContext {
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public BoolVarContext(LogicoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterBoolVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitBoolVar(this);
		}
	}

	public final LogicoperandContext logicoperand() throws RecognitionException {
		LogicoperandContext _localctx = new LogicoperandContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicoperand);
		try {
			int _alt;
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new MathExpInLogicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				mathexpression(0);
				}
				break;
			case 2:
				_localctx = new BoolVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(VARIABLE);
				}
				break;
			case 3:
				_localctx = new BoolArrayOperandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(VARIABLE);
				setState(343); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(342);
						dimensions();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(345); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				_localctx = new BoolConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				match(BOOL);
				}
				break;
			case 5:
				_localctx = new BoolOpInParenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(348);
				match(T__1);
				setState(349);
				logicexpression(0);
				setState(350);
				match(T__2);
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
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarMaybeArrayContext extends OperandContext {
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public List<DimensionsContext> dimensions() {
			return getRuleContexts(DimensionsContext.class);
		}
		public DimensionsContext dimensions(int i) {
			return getRuleContext(DimensionsContext.class,i);
		}
		public VarMaybeArrayContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterVarMaybeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitVarMaybeArray(this);
		}
	}
	public static class ExpInParenContext extends OperandContext {
		public MathexpressionContext mathexpression() {
			return getRuleContext(MathexpressionContext.class,0);
		}
		public LogicexpressionContext logicexpression() {
			return getRuleContext(LogicexpressionContext.class,0);
		}
		public ExpInParenContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterExpInParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitExpInParen(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operand);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				_localctx = new VarMaybeArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(VARIABLE);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(355);
					dimensions();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
				_localctx = new ExpInParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(T__1);
				setState(364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(362);
					mathexpression(0);
					}
					break;
				case 2:
					{
					setState(363);
					logicexpression(0);
					}
					break;
				}
				setState(366);
				match(T__2);
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

	public static class DimensionsContext extends ParserRuleContext {
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
	 
		public DimensionsContext() { }
		public void copyFrom(DimensionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDimensionsContext extends DimensionsContext {
		public MathexpressionContext mathexpression() {
			return getRuleContext(MathexpressionContext.class,0);
		}
		public ArrayDimensionsContext(DimensionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterArrayDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitArrayDimensions(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dimensions);
		try {
			_localctx = new ArrayDimensionsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__13);
			setState(371);
			mathexpression(0);
			setState(372);
			match(T__14);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncContext extends FunctionContext {
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FuncContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitFunc(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new FuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(VARIABLE);
				setState(375);
				match(T__1);
				setState(376);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new FuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(VARIABLE);
				setState(378);
				match(T__1);
				setState(379);
				arguments();
				setState(380);
				match(T__2);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	 
		public ArgumentsContext() { }
		public void copyFrom(ArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgsContext extends ArgumentsContext {
		public List<TerminalNode> VARIABLE() { return getTokens(ProjectGrammarParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(ProjectGrammarParser.VARIABLE, i);
		}
		public ArgsContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitArgs(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arguments);
		int _la;
		try {
			_localctx = new ArgsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(VARIABLE);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(385);
				match(T__10);
				setState(386);
				match(VARIABLE);
				}
				}
				setState(391);
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

	public static class WriteintcontextContext extends ParserRuleContext {
		public WriteintcontextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeintcontext; }
	 
		public WriteintcontextContext() { }
		public void copyFrom(WriteintcontextContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogEContext extends WriteintcontextContext {
		public LogicexpressionContext logicexpression() {
			return getRuleContext(LogicexpressionContext.class,0);
		}
		public LogEContext(WriteintcontextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterLogE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitLogE(this);
		}
	}
	public static class MathEContext extends WriteintcontextContext {
		public MathexpressionContext mathexpression() {
			return getRuleContext(MathexpressionContext.class,0);
		}
		public MathEContext(WriteintcontextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterMathE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitMathE(this);
		}
	}

	public final WriteintcontextContext writeintcontext() throws RecognitionException {
		WriteintcontextContext _localctx = new WriteintcontextContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_writeintcontext);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new MathEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				mathexpression(0);
				}
				break;
			case 2:
				_localctx = new LogEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				logicexpression(0);
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

	public static class WritestrcontextContext extends ParserRuleContext {
		public WritestrcontextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writestrcontext; }
	 
		public WritestrcontextContext() { }
		public void copyFrom(WritestrcontextContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrEContext extends WritestrcontextContext {
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public StrEContext(WritestrcontextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterStrE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitStrE(this);
		}
	}

	public final WritestrcontextContext writestrcontext() throws RecognitionException {
		WritestrcontextContext _localctx = new WritestrcontextContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_writestrcontext);
		try {
			_localctx = new StrEContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(VARIABLE);
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

	public static class CharoperandContext extends ParserRuleContext {
		public CharoperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charoperand; }
	 
		public CharoperandContext() { }
		public void copyFrom(CharoperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharVarMaybeArrayContext extends CharoperandContext {
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public List<DimensionsContext> dimensions() {
			return getRuleContexts(DimensionsContext.class);
		}
		public DimensionsContext dimensions(int i) {
			return getRuleContext(DimensionsContext.class,i);
		}
		public CharVarMaybeArrayContext(CharoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterCharVarMaybeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitCharVarMaybeArray(this);
		}
	}
	public static class CharConstContext extends CharoperandContext {
		public TerminalNode CONST() { return getToken(ProjectGrammarParser.CONST, 0); }
		public CharConstContext(CharoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterCharConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitCharConst(this);
		}
	}

	public final CharoperandContext charoperand() throws RecognitionException {
		CharoperandContext _localctx = new CharoperandContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_charoperand);
		int _la;
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new CharConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(CONST);
				}
				break;
			case VARIABLE:
				_localctx = new CharVarMaybeArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(VARIABLE);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(400);
					dimensions();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class CharoperandinlogicContext extends ParserRuleContext {
		public CharoperandinlogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charoperandinlogic; }
	 
		public CharoperandinlogicContext() { }
		public void copyFrom(CharoperandinlogicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharConstInLogicContext extends CharoperandinlogicContext {
		public TerminalNode CONST() { return getToken(ProjectGrammarParser.CONST, 0); }
		public CharConstInLogicContext(CharoperandinlogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterCharConstInLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitCharConstInLogic(this);
		}
	}
	public static class CharVarMaybeArrayInLogicContext extends CharoperandinlogicContext {
		public TerminalNode VARIABLE() { return getToken(ProjectGrammarParser.VARIABLE, 0); }
		public List<DimensionsContext> dimensions() {
			return getRuleContexts(DimensionsContext.class);
		}
		public DimensionsContext dimensions(int i) {
			return getRuleContext(DimensionsContext.class,i);
		}
		public CharVarMaybeArrayInLogicContext(CharoperandinlogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterCharVarMaybeArrayInLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitCharVarMaybeArrayInLogic(this);
		}
	}

	public final CharoperandinlogicContext charoperandinlogic() throws RecognitionException {
		CharoperandinlogicContext _localctx = new CharoperandinlogicContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_charoperandinlogic);
		try {
			int _alt;
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new CharConstInLogicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(CONST);
				}
				break;
			case VARIABLE:
				_localctx = new CharVarMaybeArrayInLogicContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(VARIABLE);
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(410);
						dimensions();
						}
						} 
					}
					setState(415);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return mathexpression_sempred((MathexpressionContext)_localctx, predIndex);
		case 20:
			return logicexpression_sempred((LogicexpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathexpression_sempred(MathexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicexpression_sempred(LogicexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u01a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\3\3\3\5\3K\n\3\3\3\5\3N\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4e\n\4\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\5\3\5\5\5p\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5x\n\5\f\5\16\5{\13\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082"+
		"\n\5\3\6\3\6\3\6\3\7\7\7\u0088\n\7\f\7\16\7\u008b\13\7\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0092\n\b\3\t\3\t\3\t\7\t\u0097\n\t\f\t\16\t\u009a\13\t\3\n\3"+
		"\n\3\n\7\n\u009f\n\n\f\n\16\n\u00a2\13\n\3\n\3\n\3\n\7\n\u00a7\n\n\f\n"+
		"\16\n\u00aa\13\n\3\n\3\n\3\n\7\n\u00af\n\n\f\n\16\n\u00b2\13\n\5\n\u00b4"+
		"\n\n\3\13\3\13\3\13\7\13\u00b9\n\13\f\13\16\13\u00bc\13\13\3\13\3\13\3"+
		"\13\7\13\u00c1\n\13\f\13\16\13\u00c4\13\13\5\13\u00c6\n\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d3\n\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00d9\n\16\3\16\3\16\5\16\u00dd\n\16\3\16\3\16\3\16\3\16\3\17"+
		"\7\17\u00e4\n\17\f\17\16\17\u00e7\13\17\3\20\7\20\u00ea\n\20\f\20\16\20"+
		"\u00ed\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u00f9"+
		"\n\22\f\22\16\22\u00fc\13\22\3\23\3\23\3\23\5\23\u0101\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011b\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0126\n\25\f\25\16\25\u0129\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0138\n\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0140\n\26\f\26\16\26\u0143"+
		"\13\26\3\27\3\27\3\27\7\27\u0148\n\27\f\27\16\27\u014b\13\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0154\n\27\3\30\3\30\3\30\3\30\6\30\u015a"+
		"\n\30\r\30\16\30\u015b\3\30\3\30\3\30\3\30\3\30\5\30\u0163\n\30\3\31\3"+
		"\31\7\31\u0167\n\31\f\31\16\31\u016a\13\31\3\31\3\31\3\31\5\31\u016f\n"+
		"\31\3\31\3\31\5\31\u0173\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0181\n\33\3\34\3\34\3\34\7\34\u0186\n\34\f"+
		"\34\16\34\u0189\13\34\3\35\3\35\5\35\u018d\n\35\3\36\3\36\3\37\3\37\3"+
		"\37\7\37\u0194\n\37\f\37\16\37\u0197\13\37\5\37\u0199\n\37\3 \3 \3 \7"+
		" \u019e\n \f \16 \u01a1\13 \5 \u01a3\n \3 \2\4(*!\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\5\3\2$%\3\2&\'\3\2\37#\2"+
		"\u01c6\2C\3\2\2\2\4M\3\2\2\2\6d\3\2\2\2\b\u0081\3\2\2\2\n\u0083\3\2\2"+
		"\2\f\u0089\3\2\2\2\16\u0091\3\2\2\2\20\u0093\3\2\2\2\22\u00b3\3\2\2\2"+
		"\24\u00c5\3\2\2\2\26\u00c7\3\2\2\2\30\u00c9\3\2\2\2\32\u00cd\3\2\2\2\34"+
		"\u00e5\3\2\2\2\36\u00eb\3\2\2\2 \u00ee\3\2\2\2\"\u00fa\3\2\2\2$\u0100"+
		"\3\2\2\2&\u011a\3\2\2\2(\u011c\3\2\2\2*\u0137\3\2\2\2,\u0153\3\2\2\2."+
		"\u0162\3\2\2\2\60\u0172\3\2\2\2\62\u0174\3\2\2\2\64\u0180\3\2\2\2\66\u0182"+
		"\3\2\2\28\u018c\3\2\2\2:\u018e\3\2\2\2<\u0198\3\2\2\2>\u01a2\3\2\2\2@"+
		"B\5\4\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2"+
		"FG\7\2\2\3G\3\3\2\2\2HJ\5\6\4\2IK\7,\2\2JI\3\2\2\2JK\3\2\2\2KN\3\2\2\2"+
		"LN\7,\2\2MH\3\2\2\2ML\3\2\2\2N\5\3\2\2\2Oe\5\b\5\2Pe\5\16\b\2QR\7\3\2"+
		"\2RS\7\4\2\2ST\58\35\2TU\7\5\2\2UV\7\6\2\2Ve\3\2\2\2WX\7\7\2\2XY\7\4\2"+
		"\2YZ\5:\36\2Z[\7\5\2\2[\\\7\6\2\2\\e\3\2\2\2]^\7\b\2\2^_\7\4\2\2_`\5<"+
		"\37\2`a\7\5\2\2ab\7\6\2\2be\3\2\2\2ce\7\t\2\2dO\3\2\2\2dP\3\2\2\2dQ\3"+
		"\2\2\2dW\3\2\2\2d]\3\2\2\2dc\3\2\2\2e\7\3\2\2\2fj\5\24\13\2gi\5\26\f\2"+
		"hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mo\7\4\2\2"+
		"np\5\20\t\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\5\2\2rs\7\n\2\2st\5\f\7"+
		"\2tu\7\13\2\2uy\5\n\6\2vx\7,\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2"+
		"\2z|\3\2\2\2{y\3\2\2\2|}\7\f\2\2}\u0082\3\2\2\2~\177\5\22\n\2\177\u0080"+
		"\7\6\2\2\u0080\u0082\3\2\2\2\u0081f\3\2\2\2\u0081~\3\2\2\2\u0082\t\3\2"+
		"\2\2\u0083\u0084\5$\23\2\u0084\u0085\7\6\2\2\u0085\13\3\2\2\2\u0086\u0088"+
		"\5\4\3\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\r\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0092\5\32\16"+
		"\2\u008d\u0092\5 \21\2\u008e\u008f\5$\23\2\u008f\u0090\7\6\2\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0092"+
		"\17\3\2\2\2\u0093\u0098\5\24\13\2\u0094\u0095\7\r\2\2\u0095\u0097\5\24"+
		"\13\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\21\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\35\2"+
		"\2\u009c\u00a0\7+\2\2\u009d\u009f\5\30\r\2\u009e\u009d\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00b4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\7\36\2\2\u00a4\u00a8\7+\2\2\u00a5\u00a7\5\30"+
		"\r\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00b4\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\16"+
		"\2\2\u00ac\u00b0\7+\2\2\u00ad\u00af\5\30\r\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b3\u009b\3\2\2\2\u00b3\u00a3\3\2\2\2\u00b3"+
		"\u00ab\3\2\2\2\u00b4\23\3\2\2\2\u00b5\u00b6\7\35\2\2\u00b6\u00ba\7+\2"+
		"\2\u00b7\u00b9\5\26\f\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c6\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00be\7\36\2\2\u00be\u00c2\7+\2\2\u00bf\u00c1\5\26\f\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00b5\3\2\2\2\u00c5"+
		"\u00bd\3\2\2\2\u00c6\25\3\2\2\2\u00c7\u00c8\7\17\2\2\u00c8\27\3\2\2\2"+
		"\u00c9\u00ca\7\20\2\2\u00ca\u00cb\5(\25\2\u00cb\u00cc\7\21\2\2\u00cc\31"+
		"\3\2\2\2\u00cd\u00ce\7\22\2\2\u00ce\u00cf\7\4\2\2\u00cf\u00d0\5*\26\2"+
		"\u00d0\u00d2\7\5\2\2\u00d1\u00d3\7,\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\n\2\2\u00d5\u00d6\5\34\17\2"+
		"\u00d6\u00d8\7\f\2\2\u00d7\u00d9\7,\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\7\23\2\2\u00db\u00dd\7,\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\n"+
		"\2\2\u00df\u00e0\5\36\20\2\u00e0\u00e1\7\f\2\2\u00e1\33\3\2\2\2\u00e2"+
		"\u00e4\5\4\3\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\35\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea"+
		"\5\4\3\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\37\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\24\2"+
		"\2\u00ef\u00f0\7\4\2\2\u00f0\u00f1\5*\26\2\u00f1\u00f2\7\5\2\2\u00f2\u00f3"+
		"\7\n\2\2\u00f3\u00f4\5\"\22\2\u00f4\u00f5\7\f\2\2\u00f5!\3\2\2\2\u00f6"+
		"\u00f9\5\6\4\2\u00f7\u00f9\7,\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"#\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0101\5&\24\2\u00fe\u0101\5(\25\2"+
		"\u00ff\u0101\5*\26\2\u0100\u00fd\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101%\3\2\2\2\u0102\u0103\5\60\31\2\u0103\u0104\7\33\2\2\u0104"+
		"\u0105\5(\25\2\u0105\u011b\3\2\2\2\u0106\u0107\5\60\31\2\u0107\u0108\7"+
		"\33\2\2\u0108\u0109\5*\26\2\u0109\u011b\3\2\2\2\u010a\u010b\5\60\31\2"+
		"\u010b\u010c\7\33\2\2\u010c\u010d\7\25\2\2\u010d\u011b\3\2\2\2\u010e\u010f"+
		"\5\60\31\2\u010f\u0110\7\33\2\2\u0110\u0111\7\26\2\2\u0111\u011b\3\2\2"+
		"\2\u0112\u0113\5<\37\2\u0113\u0114\7\33\2\2\u0114\u0115\7\27\2\2\u0115"+
		"\u011b\3\2\2\2\u0116\u0117\5\60\31\2\u0117\u0118\7\33\2\2\u0118\u0119"+
		"\5\64\33\2\u0119\u011b\3\2\2\2\u011a\u0102\3\2\2\2\u011a\u0106\3\2\2\2"+
		"\u011a\u010a\3\2\2\2\u011a\u010e\3\2\2\2\u011a\u0112\3\2\2\2\u011a\u0116"+
		"\3\2\2\2\u011b\'\3\2\2\2\u011c\u011d\b\25\1\2\u011d\u011e\5,\27\2\u011e"+
		"\u0127\3\2\2\2\u011f\u0120\f\5\2\2\u0120\u0121\t\2\2\2\u0121\u0126\5("+
		"\25\6\u0122\u0123\f\4\2\2\u0123\u0124\t\3\2\2\u0124\u0126\5(\25\5\u0125"+
		"\u011f\3\2\2\2\u0125\u0122\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128)\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b"+
		"\b\26\1\2\u012b\u012c\7\30\2\2\u012c\u012d\5> \2\u012d\u012e\t\4\2\2\u012e"+
		"\u012f\5> \2\u012f\u0138\3\2\2\2\u0130\u0131\5.\30\2\u0131\u0132\t\4\2"+
		"\2\u0132\u0133\5.\30\2\u0133\u0138\3\2\2\2\u0134\u0135\7\34\2\2\u0135"+
		"\u0138\5.\30\2\u0136\u0138\5.\30\2\u0137\u012a\3\2\2\2\u0137\u0130\3\2"+
		"\2\2\u0137\u0134\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u0141\3\2\2\2\u0139"+
		"\u013a\f\6\2\2\u013a\u013b\7\31\2\2\u013b\u0140\5*\26\7\u013c\u013d\f"+
		"\5\2\2\u013d\u013e\7\32\2\2\u013e\u0140\5*\26\6\u013f\u0139\3\2\2\2\u013f"+
		"\u013c\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142+\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0154\7+\2\2\u0145\u0149"+
		"\7+\2\2\u0146\u0148\5\62\32\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2"+
		"\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0154\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014d\7\'\2\2\u014d\u0154\5,\27\2\u014e\u0154\7(\2\2\u014f"+
		"\u0150\7\4\2\2\u0150\u0151\5(\25\2\u0151\u0152\7\5\2\2\u0152\u0154\3\2"+
		"\2\2\u0153\u0144\3\2\2\2\u0153\u0145\3\2\2\2\u0153\u014c\3\2\2\2\u0153"+
		"\u014e\3\2\2\2\u0153\u014f\3\2\2\2\u0154-\3\2\2\2\u0155\u0163\5(\25\2"+
		"\u0156\u0163\7+\2\2\u0157\u0159\7+\2\2\u0158\u015a\5\62\32\2\u0159\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u0163\3\2\2\2\u015d\u0163\7)\2\2\u015e\u015f\7\4\2\2\u015f\u0160\5*\26"+
		"\2\u0160\u0161\7\5\2\2\u0161\u0163\3\2\2\2\u0162\u0155\3\2\2\2\u0162\u0156"+
		"\3\2\2\2\u0162\u0157\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0163"+
		"/\3\2\2\2\u0164\u0168\7+\2\2\u0165\u0167\5\62\32\2\u0166\u0165\3\2\2\2"+
		"\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0173"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016e\7\4\2\2\u016c\u016f\5(\25\2\u016d"+
		"\u016f\5*\26\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0171\7\5\2\2\u0171\u0173\3\2\2\2\u0172\u0164\3\2\2\2\u0172"+
		"\u016b\3\2\2\2\u0173\61\3\2\2\2\u0174\u0175\7\20\2\2\u0175\u0176\5(\25"+
		"\2\u0176\u0177\7\21\2\2\u0177\63\3\2\2\2\u0178\u0179\7+\2\2\u0179\u017a"+
		"\7\4\2\2\u017a\u0181\7\5\2\2\u017b\u017c\7+\2\2\u017c\u017d\7\4\2\2\u017d"+
		"\u017e\5\66\34\2\u017e\u017f\7\5\2\2\u017f\u0181\3\2\2\2\u0180\u0178\3"+
		"\2\2\2\u0180\u017b\3\2\2\2\u0181\65\3\2\2\2\u0182\u0187\7+\2\2\u0183\u0184"+
		"\7\r\2\2\u0184\u0186\7+\2\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\67\3\2\2\2\u0189\u0187\3\2\2"+
		"\2\u018a\u018d\5(\25\2\u018b\u018d\5*\26\2\u018c\u018a\3\2\2\2\u018c\u018b"+
		"\3\2\2\2\u018d9\3\2\2\2\u018e\u018f\7+\2\2\u018f;\3\2\2\2\u0190\u0199"+
		"\7*\2\2\u0191\u0195\7+\2\2\u0192\u0194\5\62\32\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198\u0190\3\2\2\2\u0198\u0191\3\2\2\2\u0199"+
		"=\3\2\2\2\u019a\u01a3\7*\2\2\u019b\u019f\7+\2\2\u019c\u019e\5\62\32\2"+
		"\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0"+
		"\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u019a\3\2\2\2\u01a2"+
		"\u019b\3\2\2\2\u01a3?\3\2\2\2\60CJMdjoy\u0081\u0089\u0091\u0098\u00a0"+
		"\u00a8\u00b0\u00b3\u00ba\u00c2\u00c5\u00d2\u00d8\u00dc\u00e5\u00eb\u00f8"+
		"\u00fa\u0100\u011a\u0125\u0127\u0137\u013f\u0141\u0149\u0153\u015b\u0162"+
		"\u0168\u016e\u0172\u0180\u0187\u018c\u0195\u0198\u019f\u01a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}