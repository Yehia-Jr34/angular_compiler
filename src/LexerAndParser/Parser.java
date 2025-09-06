// Generated from D:/F.I.T.E/Fifth Year/S2/Compiler/Last_Angular_Compiler/src/LexerAndParser/Parser.g4 by ANTLR 4.13.2
package LexerAndParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OpenParen=1, CloseParen=2, OpenBracket=3, CloseBracket=4, OpenBrace=5, 
		CloseBrace=6, LessThan=7, MoreThan=8, Divide=9, Comma=10, SemiColon=11, 
		Colon=12, Dot=13, Assign=14, Arrow=15, Import=16, From=17, Export=18, 
		Class=19, Constructor=20, Return=21, If=22, Else=23, For=24, While=25, 
		Do=26, Break=27, Continue=28, Public=29, Private=30, Protected=31, Var=32, 
		Let=33, Const=34, Number=35, String=36, Boolean=37, Any=38, Console=39, 
		Log=40, NgFor=41, NgIf=42, Store=43, State=44, Actions=45, Reducer=46, 
		Selectors=47, Select=48, Selector=49, Template=50, Of=51, Dispatch=52, 
		On=53, MultiplyAssign=54, DivideAssign=55, ModulusAssign=56, PlusAssign=57, 
		MinusAssign=58, IdentityEquals=59, IdentityNotEquals=60, Equals_=61, NotEquals=62, 
		LessThanEquals=63, GreaterThanEquals=64, BitAnd=65, BitXOr=66, BitOr=67, 
		Multiply=68, Plus=69, Minus=70, Modulus=71, And=72, Or=73, PlusPlus=74, 
		MinusMinus=75, NullLiteral=76, BooleanLiteral=77, StringLiteral=78, DecimalLiteral=79, 
		Identifier=80, WS=81, LineComment=82, BlockComment=83;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_block = 2, RULE_loops = 3, RULE_decl = 4, 
		RULE_import_ = 5, RULE_variableTypeDecl = 6, RULE_dataTypes = 7, RULE_arrayLiteral = 8, 
		RULE_arrayList = 9, RULE_arrayElement = 10, RULE_objectLiteral = 11, RULE_objectBody = 12, 
		RULE_objectKeyValue = 13, RULE_variableDecl = 14, RULE_declTypes = 15, 
		RULE_variableFunctionArguments = 16, RULE_variableFunctionSingleArgument = 17, 
		RULE_anyLiteral = 18, RULE_functionDecl = 19, RULE_normalFunctionDecleration = 20, 
		RULE_arrowFunctionDecleration = 21, RULE_functionBody = 22, RULE_functionParameters = 23, 
		RULE_if = 24, RULE_for = 25, RULE_forParameters = 26, RULE_while = 27, 
		RULE_do = 28, RULE_initialize = 29, RULE_expr = 30, RULE_return = 31, 
		RULE_arithmeticExpr = 32, RULE_identifier_ = 33, RULE_arrayIndex = 34, 
		RULE_operartor = 35, RULE_componentDecorator = 36, RULE_compoenentObject = 37, 
		RULE_constructor = 38, RULE_html = 39, RULE_text = 40, RULE_identifierPath = 41, 
		RULE_interpolationValue = 42, RULE_htmlContent = 43, RULE_htmlElement = 44, 
		RULE_htmlTag = 45, RULE_openTag = 46, RULE_selfClosingTag = 47, RULE_closeTag = 48, 
		RULE_structuralDirectives = 49, RULE_forDirective = 50, RULE_ifDirective = 51, 
		RULE_attribute = 52, RULE_attributeName = 53, RULE_attributeValue = 54, 
		RULE_boundAttribute = 55, RULE_eventName = 56, RULE_eventBinding = 57, 
		RULE_functionCall = 58, RULE_injectableFunctionParameters = 59, RULE_injectableVariableFunctionSingleArgument = 60, 
		RULE_accessModifires = 61, RULE_consoleLog = 62, RULE_storeDecl = 63, 
		RULE_storeBody = 64, RULE_stateSection = 65, RULE_storeStateField = 66, 
		RULE_actionsSection = 67, RULE_actionDecl = 68, RULE_reducerSection = 69, 
		RULE_reducerRule = 70, RULE_selectorsSection = 71, RULE_selectorDecl = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "block", "loops", "decl", "import_", "variableTypeDecl", 
			"dataTypes", "arrayLiteral", "arrayList", "arrayElement", "objectLiteral", 
			"objectBody", "objectKeyValue", "variableDecl", "declTypes", "variableFunctionArguments", 
			"variableFunctionSingleArgument", "anyLiteral", "functionDecl", "normalFunctionDecleration", 
			"arrowFunctionDecleration", "functionBody", "functionParameters", "if", 
			"for", "forParameters", "while", "do", "initialize", "expr", "return", 
			"arithmeticExpr", "identifier_", "arrayIndex", "operartor", "componentDecorator", 
			"compoenentObject", "constructor", "html", "text", "identifierPath", 
			"interpolationValue", "htmlContent", "htmlElement", "htmlTag", "openTag", 
			"selfClosingTag", "closeTag", "structuralDirectives", "forDirective", 
			"ifDirective", "attribute", "attributeName", "attributeValue", "boundAttribute", 
			"eventName", "eventBinding", "functionCall", "injectableFunctionParameters", 
			"injectableVariableFunctionSingleArgument", "accessModifires", "consoleLog", 
			"storeDecl", "storeBody", "stateSection", "storeStateField", "actionsSection", 
			"actionDecl", "reducerSection", "reducerRule", "selectorsSection", "selectorDecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", null, null, null, "','", 
			"';'", "':'", "'.'", "'='", "'=>'", "'import'", "'from'", "'export'", 
			"'class'", "'constructor'", "'return'", "'if'", "'else'", "'for'", "'while'", 
			"'do'", "'break'", "'continue'", "'public'", "'private'", "'protected'", 
			"'var'", "'let'", "'const'", "'number'", "'string'", "'boolean'", "'any'", 
			"'console'", "'log'", "'*ngFor'", "'*ngIf'", "'store'", "'state'", "'actions'", 
			"'reducer'", "'selectors'", "'select'", "'selector'", "'template'", "'of'", 
			"'dispatch'", "'on'", "'*='", "'/='", "'%='", "'+='", "'-='", "'==='", 
			"'!=='", "'=='", "'!='", "'<='", "'>='", "'&'", "'^'", "'|'", "'*'", 
			"'+'", "'-'", "'%'", "'&&'", "'||'", "'++'", "'--'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OpenParen", "CloseParen", "OpenBracket", "CloseBracket", "OpenBrace", 
			"CloseBrace", "LessThan", "MoreThan", "Divide", "Comma", "SemiColon", 
			"Colon", "Dot", "Assign", "Arrow", "Import", "From", "Export", "Class", 
			"Constructor", "Return", "If", "Else", "For", "While", "Do", "Break", 
			"Continue", "Public", "Private", "Protected", "Var", "Let", "Const", 
			"Number", "String", "Boolean", "Any", "Console", "Log", "NgFor", "NgIf", 
			"Store", "State", "Actions", "Reducer", "Selectors", "Select", "Selector", 
			"Template", "Of", "Dispatch", "On", "MultiplyAssign", "DivideAssign", 
			"ModulusAssign", "PlusAssign", "MinusAssign", "IdentityEquals", "IdentityNotEquals", 
			"Equals_", "NotEquals", "LessThanEquals", "GreaterThanEquals", "BitAnd", 
			"BitXOr", "BitOr", "Multiply", "Plus", "Minus", "Modulus", "And", "Or", 
			"PlusPlus", "MinusMinus", "NullLiteral", "BooleanLiteral", "StringLiteral", 
			"DecimalLiteral", "Identifier", "WS", "LineComment", "BlockComment"
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
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ComponentDecoratorContext componentDecorator() {
			return getRuleContext(ComponentDecoratorContext.class,0);
		}
		public TerminalNode Class() { return getToken(Parser.Class, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(Parser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(Parser.CloseBrace, 0); }
		public TerminalNode EOF() { return getToken(Parser.EOF, 0); }
		public List<Import_Context> import_() {
			return getRuleContexts(Import_Context.class);
		}
		public Import_Context import_(int i) {
			return getRuleContext(Import_Context.class,i);
		}
		public List<StoreDeclContext> storeDecl() {
			return getRuleContexts(StoreDeclContext.class);
		}
		public StoreDeclContext storeDecl(int i) {
			return getRuleContext(StoreDeclContext.class,i);
		}
		public TerminalNode Export() { return getToken(Parser.Export, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(146);
				import_();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Store) {
				{
				{
				setState(152);
				storeDecl();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			componentDecorator();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(159);
				match(Export);
				}
			}

			setState(162);
			match(Class);
			setState(163);
			identifier_();
			setState(164);
			match(OpenBrace);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785654952099882L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) {
				{
				{
				setState(165);
				statement();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(CloseBrace);
			setState(172);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class StatementStmtContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ConsoleLogContext consoleLog() {
			return getRuleContext(ConsoleLogContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(Parser.SemiColon, 0); }
		public StatementStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStatementStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStatementStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStatementStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			_localctx = new StatementStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(174);
				block();
				}
				break;
			case 2:
				{
				setState(175);
				decl();
				}
				break;
			case 3:
				{
				setState(176);
				expr(0);
				}
				break;
			case 4:
				{
				setState(177);
				loops();
				}
				break;
			case 5:
				{
				setState(178);
				if_();
				}
				break;
			case 6:
				{
				setState(179);
				constructor();
				}
				break;
			case 7:
				{
				setState(180);
				consoleLog();
				}
				break;
			}
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(183);
				match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtContext extends BlockContext {
		public TerminalNode OpenBrace() { return getToken(Parser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(Parser.CloseBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStmtContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			_localctx = new BlockStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(OpenBrace);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785654952099882L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) {
				{
				{
				setState(187);
				statement();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopsContext extends ParserRuleContext {
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public DoContext do_() {
			return getRuleContext(DoContext.class,0);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLoops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLoops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case For:
				{
				setState(195);
				for_();
				}
				break;
			case While:
				{
				setState(196);
				while_();
				}
				break;
			case Do:
				{
				setState(197);
				do_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableTypeDeclaContext extends DeclContext {
		public VariableTypeDeclContext variableTypeDecl() {
			return getRuleContext(VariableTypeDeclContext.class,0);
		}
		public VariableTypeDeclaContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterVariableTypeDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitVariableTypeDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariableTypeDecla(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalFunctionContext extends DeclContext {
		public NormalFunctionDeclerationContext normalFunctionDecleration() {
			return getRuleContext(NormalFunctionDeclerationContext.class,0);
		}
		public NormalFunctionContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNormalFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNormalFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNormalFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaContext extends DeclContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public VariableDeclaContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterVariableDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitVariableDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariableDecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new VariableDeclaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				variableDecl();
				}
				break;
			case 2:
				_localctx = new VariableTypeDeclaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				variableTypeDecl();
				}
				break;
			case 3:
				_localctx = new NormalFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				normalFunctionDecleration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Import_Context extends ParserRuleContext {
		public Import_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_; }
	 
		public Import_Context() { }
		public void copyFrom(Import_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportContext extends Import_Context {
		public TerminalNode Import() { return getToken(Parser.Import, 0); }
		public TerminalNode From() { return getToken(Parser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(Parser.StringLiteral, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode SemiColon() { return getToken(Parser.SemiColon, 0); }
		public TerminalNode OpenBrace() { return getToken(Parser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(Parser.CloseBrace, 0); }
		public ImportContext(Import_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_Context import_() throws RecognitionException {
		Import_Context _localctx = new Import_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_import_);
		int _la;
		try {
			_localctx = new ImportContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(Import);
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				{
				{
				setState(206);
				match(OpenBrace);
				setState(207);
				identifier_();
				setState(208);
				match(CloseBrace);
				}
				}
				break;
			case Identifier:
				{
				setState(210);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(213);
			match(From);
			setState(214);
			match(StringLiteral);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(215);
				match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableTypeDeclContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Colon() { return getToken(Parser.Colon, 0); }
		public DataTypesContext dataTypes() {
			return getRuleContext(DataTypesContext.class,0);
		}
		public TerminalNode Assign() { return getToken(Parser.Assign, 0); }
		public AnyLiteralContext anyLiteral() {
			return getRuleContext(AnyLiteralContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(Parser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(Parser.CloseBracket, 0); }
		public VariableTypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableTypeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterVariableTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitVariableTypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariableTypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeDeclContext variableTypeDecl() throws RecognitionException {
		VariableTypeDeclContext _localctx = new VariableTypeDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableTypeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			identifier_();
			setState(219);
			match(Colon);
			setState(220);
			dataTypes();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBracket) {
				{
				setState(221);
				match(OpenBracket);
				setState(222);
				match(CloseBracket);
				}
			}

			setState(225);
			match(Assign);
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(226);
				anyLiteral();
				}
				break;
			case 2:
				{
				setState(227);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypesContext extends ParserRuleContext {
		public DataTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypes; }
	 
		public DataTypesContext() { }
		public void copyFrom(DataTypesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataTypesStmtContext extends DataTypesContext {
		public TerminalNode Number() { return getToken(Parser.Number, 0); }
		public TerminalNode String() { return getToken(Parser.String, 0); }
		public TerminalNode Boolean() { return getToken(Parser.Boolean, 0); }
		public TerminalNode Any() { return getToken(Parser.Any, 0); }
		public DataTypesStmtContext(DataTypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDataTypesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDataTypesStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDataTypesStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypesContext dataTypes() throws RecognitionException {
		DataTypesContext _localctx = new DataTypesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dataTypes);
		int _la;
		try {
			_localctx = new DataTypesStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	 
		public ArrayLiteralContext() { }
		public void copyFrom(ArrayLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralStmtContext extends ArrayLiteralContext {
		public TerminalNode OpenBracket() { return getToken(Parser.OpenBracket, 0); }
		public ArrayListContext arrayList() {
			return getRuleContext(ArrayListContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(Parser.CloseBracket, 0); }
		public ArrayLiteralStmtContext(ArrayLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayLiteralStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayLiteralStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayLiteralStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayLiteral);
		try {
			_localctx = new ArrayLiteralStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(OpenBracket);
			setState(233);
			arrayList();
			setState(234);
			match(CloseBracket);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayListContext extends ParserRuleContext {
		public ArrayListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayList; }
	 
		public ArrayListContext() { }
		public void copyFrom(ArrayListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayListStmtContext extends ArrayListContext {
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Parser.Comma, i);
		}
		public ArrayListStmtContext(ArrayListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayListStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayListStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayListStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayListContext arrayList() throws RecognitionException {
		ArrayListContext _localctx = new ArrayListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayList);
		int _la;
		try {
			_localctx = new ArrayListStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785075008831530L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0)) {
				{
				setState(236);
				arrayElement();
				}
			}

			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(239);
					match(Comma);
					}
					}
					setState(242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				setState(244);
				arrayElement();
				}
				}
				setState(249);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementContext extends ParserRuleContext {
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
	 
		public ArrayElementContext() { }
		public void copyFrom(ArrayElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ArrayElementContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public IdentifierContext(ArrayElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyLiteralStmtContext extends ArrayElementContext {
		public AnyLiteralContext anyLiteral() {
			return getRuleContext(AnyLiteralContext.class,0);
		}
		public AnyLiteralStmtContext(ArrayElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAnyLiteralStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAnyLiteralStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAnyLiteralStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExperContext extends ArrayElementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExperContext(ArrayElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayElement);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new AnyLiteralStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				anyLiteral();
				}
				break;
			case 2:
				_localctx = new ExperContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				expr(0);
				}
				break;
			case 3:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				identifier_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	 
		public ObjectLiteralContext() { }
		public void copyFrom(ObjectLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLitStmtContext extends ObjectLiteralContext {
		public TerminalNode OpenBrace() { return getToken(Parser.OpenBrace, 0); }
		public ObjectBodyContext objectBody() {
			return getRuleContext(ObjectBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(Parser.CloseBrace, 0); }
		public ObjectLitStmtContext(ObjectLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectLitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectLitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectLitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectLiteral);
		try {
			_localctx = new ObjectLitStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(OpenBrace);
			setState(256);
			objectBody();
			setState(257);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectBodyContext extends ParserRuleContext {
		public ObjectBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectBody; }
	 
		public ObjectBodyContext() { }
		public void copyFrom(ObjectBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectBodyStmtContext extends ObjectBodyContext {
		public List<ObjectKeyValueContext> objectKeyValue() {
			return getRuleContexts(ObjectKeyValueContext.class);
		}
		public ObjectKeyValueContext objectKeyValue(int i) {
			return getRuleContext(ObjectKeyValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Parser.Comma, i);
		}
		public ObjectBodyStmtContext(ObjectBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectBodyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectBodyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectBodyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectBodyContext objectBody() throws RecognitionException {
		ObjectBodyContext _localctx = new ObjectBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objectBody);
		int _la;
		try {
			_localctx = new ObjectBodyStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) {
				{
				setState(259);
				objectKeyValue();
				}
			}

			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(262);
				match(Comma);
				setState(263);
				objectKeyValue();
				}
				}
				setState(268);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectKeyValueContext extends ParserRuleContext {
		public ObjectKeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectKeyValue; }
	 
		public ObjectKeyValueContext() { }
		public void copyFrom(ObjectKeyValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectKeyValueStmtContext extends ObjectKeyValueContext {
		public TerminalNode Colon() { return getToken(Parser.Colon, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Parser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(Parser.StringLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(Parser.DecimalLiteral, 0); }
		public ObjectKeyValueStmtContext(ObjectKeyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectKeyValueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectKeyValueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectKeyValueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectKeyValueContext objectKeyValue() throws RecognitionException {
		ObjectKeyValueContext _localctx = new ObjectKeyValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_objectKeyValue);
		int _la;
		try {
			_localctx = new ObjectKeyValueStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(270);
			match(Colon);
			setState(271);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclContext extends ParserRuleContext {
		public DeclTypesContext declTypes() {
			return getRuleContext(DeclTypesContext.class,0);
		}
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Assign() { return getToken(Parser.Assign, 0); }
		public AnyLiteralContext anyLiteral() {
			return getRuleContext(AnyLiteralContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			declTypes();
			setState(274);
			identifier_();
			setState(275);
			match(Assign);
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(276);
				anyLiteral();
				}
				break;
			case 2:
				{
				setState(277);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclTypesContext extends ParserRuleContext {
		public DeclTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declTypes; }
	 
		public DeclTypesContext() { }
		public void copyFrom(DeclTypesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecltypeContext extends DeclTypesContext {
		public TerminalNode Var() { return getToken(Parser.Var, 0); }
		public TerminalNode Let() { return getToken(Parser.Let, 0); }
		public TerminalNode Const() { return getToken(Parser.Const, 0); }
		public DecltypeContext(DeclTypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDecltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDecltype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDecltype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclTypesContext declTypes() throws RecognitionException {
		DeclTypesContext _localctx = new DeclTypesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declTypes);
		int _la;
		try {
			_localctx = new DecltypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableFunctionArgumentsContext extends ParserRuleContext {
		public VariableFunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableFunctionArguments; }
	 
		public VariableFunctionArgumentsContext() { }
		public void copyFrom(VariableFunctionArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariablefuncargContext extends VariableFunctionArgumentsContext {
		public List<VariableFunctionSingleArgumentContext> variableFunctionSingleArgument() {
			return getRuleContexts(VariableFunctionSingleArgumentContext.class);
		}
		public VariableFunctionSingleArgumentContext variableFunctionSingleArgument(int i) {
			return getRuleContext(VariableFunctionSingleArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Parser.Comma, i);
		}
		public VariablefuncargContext(VariableFunctionArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterVariablefuncarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitVariablefuncarg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariablefuncarg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableFunctionArgumentsContext variableFunctionArguments() throws RecognitionException {
		VariableFunctionArgumentsContext _localctx = new VariableFunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableFunctionArguments);
		int _la;
		try {
			_localctx = new VariablefuncargContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(282);
				variableFunctionSingleArgument();
				}
			}

			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(286); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(285);
					match(Comma);
					}
					}
					setState(288); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				setState(290);
				variableFunctionSingleArgument();
				}
				}
				setState(295);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableFunctionSingleArgumentContext extends ParserRuleContext {
		public VariableFunctionSingleArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableFunctionSingleArgument; }
	 
		public VariableFunctionSingleArgumentContext() { }
		public void copyFrom(VariableFunctionSingleArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarsingargContext extends VariableFunctionSingleArgumentContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Colon() { return getToken(Parser.Colon, 0); }
		public DataTypesContext dataTypes() {
			return getRuleContext(DataTypesContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(Parser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(Parser.CloseBracket, 0); }
		public VarsingargContext(VariableFunctionSingleArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterVarsingarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitVarsingarg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVarsingarg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableFunctionSingleArgumentContext variableFunctionSingleArgument() throws RecognitionException {
		VariableFunctionSingleArgumentContext _localctx = new VariableFunctionSingleArgumentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableFunctionSingleArgument);
		int _la;
		try {
			_localctx = new VarsingargContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			identifier_();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(297);
				match(Colon);
				setState(298);
				dataTypes();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket) {
					{
					setState(299);
					match(OpenBracket);
					setState(300);
					match(CloseBracket);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class AnyLiteralContext extends ParserRuleContext {
		public AnyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyLiteral; }
	 
		public AnyLiteralContext() { }
		public void copyFrom(AnyLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectlitContext extends AnyLiteralContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectlitContext(AnyLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectlit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectlit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectlit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanletContext extends AnyLiteralContext {
		public TerminalNode BooleanLiteral() { return getToken(Parser.BooleanLiteral, 0); }
		public BooleanletContext(AnyLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterBooleanlet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitBooleanlet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBooleanlet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraylitContext extends AnyLiteralContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArraylitContext(AnyLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArraylit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArraylit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArraylit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullletContext extends AnyLiteralContext {
		public TerminalNode NullLiteral() { return getToken(Parser.NullLiteral, 0); }
		public NullletContext(AnyLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNulllet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNulllet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNulllet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimallitContext extends AnyLiteralContext {
		public TerminalNode DecimalLiteral() { return getToken(Parser.DecimalLiteral, 0); }
		public DecimallitContext(AnyLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDecimallit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDecimallit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDecimallit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringlitContext extends AnyLiteralContext {
		public TerminalNode StringLiteral() { return getToken(Parser.StringLiteral, 0); }
		public StringlitContext(AnyLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStringlit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStringlit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStringlit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyLiteralContext anyLiteral() throws RecognitionException {
		AnyLiteralContext _localctx = new AnyLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_anyLiteral);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				_localctx = new ArraylitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				_localctx = new ObjectlitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				objectLiteral();
				}
				break;
			case StringLiteral:
				_localctx = new StringlitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				_localctx = new BooleanletContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				match(BooleanLiteral);
				}
				break;
			case DecimalLiteral:
				_localctx = new DecimallitContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				match(DecimalLiteral);
				}
				break;
			case NullLiteral:
				_localctx = new NullletContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				match(NullLiteral);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
	 
		public FunctionDeclContext() { }
		public void copyFrom(FunctionDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowfuncdeclaContext extends FunctionDeclContext {
		public ArrowFunctionDeclerationContext arrowFunctionDecleration() {
			return getRuleContext(ArrowFunctionDeclerationContext.class,0);
		}
		public ArrowfuncdeclaContext(FunctionDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrowfuncdecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrowfuncdecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrowfuncdecla(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalfuncdeclContext extends FunctionDeclContext {
		public NormalFunctionDeclerationContext normalFunctionDecleration() {
			return getRuleContext(NormalFunctionDeclerationContext.class,0);
		}
		public NormalfuncdeclContext(FunctionDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNormalfuncdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNormalfuncdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNormalfuncdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionDecl);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new NormalfuncdeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				normalFunctionDecleration();
				}
				break;
			case OpenParen:
				_localctx = new ArrowfuncdeclaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				arrowFunctionDecleration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NormalFunctionDeclerationContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public NormalFunctionDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalFunctionDecleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNormalFunctionDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNormalFunctionDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNormalFunctionDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFunctionDeclerationContext normalFunctionDecleration() throws RecognitionException {
		NormalFunctionDeclerationContext _localctx = new NormalFunctionDeclerationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_normalFunctionDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			identifier_();
			setState(318);
			functionParameters();
			setState(319);
			functionBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionDeclerationContext extends ParserRuleContext {
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(Parser.Arrow, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ArrowFunctionDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionDecleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrowFunctionDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrowFunctionDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrowFunctionDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionDeclerationContext arrowFunctionDecleration() throws RecognitionException {
		ArrowFunctionDeclerationContext _localctx = new ArrowFunctionDeclerationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrowFunctionDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			functionParameters();
			setState(322);
			match(Arrow);
			setState(323);
			functionBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionBody);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParametersContext extends ParserRuleContext {
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
	 
		public FunctionParametersContext() { }
		public void copyFrom(FunctionParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncparaContext extends FunctionParametersContext {
		public TerminalNode OpenParen() { return getToken(Parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(Parser.CloseParen, 0); }
		public List<VariableFunctionSingleArgumentContext> variableFunctionSingleArgument() {
			return getRuleContexts(VariableFunctionSingleArgumentContext.class);
		}
		public VariableFunctionSingleArgumentContext variableFunctionSingleArgument(int i) {
			return getRuleContext(VariableFunctionSingleArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Parser.Comma, i);
		}
		public FuncparaContext(FunctionParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFuncpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFuncpara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFuncpara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionParameters);
		int _la;
		try {
			_localctx = new FuncparaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(OpenParen);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(330);
				variableFunctionSingleArgument();
				}
			}

			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(333);
					match(Comma);
					}
					}
					setState(336); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				setState(338);
				variableFunctionSingleArgument();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(344);
			match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
	 
		public IfContext() { }
		public void copyFrom(IfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends IfContext {
		public TerminalNode If() { return getToken(Parser.If, 0); }
		public TerminalNode OpenParen() { return getToken(Parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(Parser.CloseParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Else() { return getTokens(Parser.Else); }
		public TerminalNode Else(int i) {
			return getToken(Parser.Else, i);
		}
		public IfStmtContext(IfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if);
		int _la;
		try {
			int _alt;
			_localctx = new IfStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(If);
			setState(347);
			match(OpenParen);
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(348);
				expr(0);
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4785075008831530L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0) );
			setState(353);
			match(CloseParen);
			setState(354);
			statement();
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(355);
					match(Else);
					setState(356);
					statement();
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
	 
		public ForContext() { }
		public void copyFrom(ForContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ForContext {
		public TerminalNode For() { return getToken(Parser.For, 0); }
		public TerminalNode OpenParen() { return getToken(Parser.OpenParen, 0); }
		public ForParametersContext forParameters() {
			return getRuleContext(ForParametersContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(Parser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStmtContext(ForContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for);
		try {
			_localctx = new ForStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(For);
			setState(363);
			match(OpenParen);
			setState(364);
			forParameters();
			setState(365);
			match(CloseParen);
			setState(366);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForParametersContext extends ParserRuleContext {
		public ForParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forParameters; }
	 
		public ForParametersContext() { }
		public void copyFrom(ForParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForparaContext extends ForParametersContext {
		public List<TerminalNode> SemiColon() { return getTokens(Parser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(Parser.SemiColon, i);
		}
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForparaContext(ForParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterForpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitForpara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitForpara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForParametersContext forParameters() throws RecognitionException {
		ForParametersContext _localctx = new ForParametersContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forParameters);
		int _la;
		try {
			_localctx = new ForparaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) {
				{
				setState(368);
				variableDecl();
				}
			}

			setState(371);
			match(SemiColon);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785075008831530L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) {
				{
				setState(372);
				expr(0);
				}
			}

			setState(375);
			match(SemiColon);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785075008831530L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) {
				{
				setState(376);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
	 
		public WhileContext() { }
		public void copyFrom(WhileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends WhileContext {
		public TerminalNode While() { return getToken(Parser.While, 0); }
		public TerminalNode OpenParen() { return getToken(Parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(Parser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WhileStmtContext(WhileContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_while);
		int _la;
		try {
			_localctx = new WhileStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(While);
			setState(380);
			match(OpenParen);
			setState(382); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(381);
				expr(0);
				}
				}
				setState(384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4785075008831530L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0) );
			setState(386);
			match(CloseParen);
			setState(387);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoContext extends ParserRuleContext {
		public DoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do; }
	 
		public DoContext() { }
		public void copyFrom(DoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoStmtContext extends DoContext {
		public TerminalNode Do() { return getToken(Parser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public DoStmtContext(DoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDoStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoContext do_() throws RecognitionException {
		DoContext _localctx = new DoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_do);
		try {
			_localctx = new DoStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(Do);
			setState(390);
			block();
			setState(391);
			while_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializeContext extends ParserRuleContext {
		public InitializeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialize; }
	 
		public InitializeContext() { }
		public void copyFrom(InitializeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends InitializeContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Assign() { return getToken(Parser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AnyLiteralContext anyLiteral() {
			return getRuleContext(AnyLiteralContext.class,0);
		}
		public IntContext(InitializeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializeContext initialize() throws RecognitionException {
		InitializeContext _localctx = new InitializeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initialize);
		try {
			_localctx = new IntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			identifier_();
			setState(394);
			match(Assign);
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(395);
				expr(0);
				}
				break;
			case 2:
				{
				setState(396);
				anyLiteral();
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class RetContext extends ExprContext {
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public RetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntializeContext extends ExprContext {
		public InitializeContext initialize() {
			return getRuleContext(InitializeContext.class,0);
		}
		public IntializeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIntialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIntialize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIntialize(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrliteralContext extends ExprContext {
		public TerminalNode StringLiteral() { return getToken(Parser.StringLiteral, 0); }
		public StrliteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStrliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStrliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStrliteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArthexpContext extends ExprContext {
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public ArthexpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArthexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArthexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArthexp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends ExprContext {
		public TerminalNode Break() { return getToken(Parser.Break, 0); }
		public BreakContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueContext extends ExprContext {
		public TerminalNode Continue() { return getToken(Parser.Continue, 0); }
		public ContinueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusminusContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(Parser.MinusMinus, 0); }
		public MinusminusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMinusminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMinusminus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMinusminus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjliteralExprContext extends ExprContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjliteralExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjliteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjliteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjliteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunccallExprContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunccallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFunccallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFunccallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFunccallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrliteralExprContext extends ExprContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrliteralExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrliteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrliteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrliteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrfundecContext extends ExprContext {
		public ArrowFunctionDeclerationContext arrowFunctionDecleration() {
			return getRuleContext(ArrowFunctionDeclerationContext.class,0);
		}
		public ArrfundecContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrfundec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrfundec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrfundec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentiContext extends ExprContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public IdentiContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIdenti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIdenti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIdenti(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusplusContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(Parser.PlusPlus, 0); }
		public PlusplusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPlusplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPlusplus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPlusplus(this);
			else return visitor.visitChildren(this);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				_localctx = new FunccallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(400);
				functionCall();
				}
				break;
			case 2:
				{
				_localctx = new ArrliteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(401);
				arrayLiteral();
				}
				break;
			case 3:
				{
				_localctx = new ObjliteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(402);
				objectLiteral();
				}
				break;
			case 4:
				{
				_localctx = new ArrfundecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(403);
				arrowFunctionDecleration();
				}
				break;
			case 5:
				{
				_localctx = new StrliteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(404);
				match(StringLiteral);
				}
				break;
			case 6:
				{
				_localctx = new ArthexpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(405);
				arithmeticExpr(0);
				}
				break;
			case 7:
				{
				_localctx = new IntializeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(406);
				initialize();
				}
				break;
			case 8:
				{
				_localctx = new RetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(407);
				return_();
				}
				break;
			case 9:
				{
				_localctx = new BreakContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(408);
				match(Break);
				}
				break;
			case 10:
				{
				_localctx = new ContinueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(409);
				match(Continue);
				}
				break;
			case 11:
				{
				_localctx = new IdentiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(410);
				identifier_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(417);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new PlusplusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(413);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(414);
						match(PlusPlus);
						}
						break;
					case 2:
						{
						_localctx = new MinusminusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(415);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(416);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
	 
		public ReturnContext() { }
		public void copyFrom(ReturnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ReturnContext {
		public TerminalNode Return() { return getToken(Parser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ReturnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_return);
		try {
			_localctx = new ReturnStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(Return);
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(423);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExprContext extends ParserRuleContext {
		public ArithmeticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpr; }
	 
		public ArithmeticExprContext() { }
		public void copyFrom(ArithmeticExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdenContext extends ArithmeticExprContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public IdenContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIden(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIden(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecllitContext extends ArithmeticExprContext {
		public TerminalNode DecimalLiteral() { return getToken(Parser.DecimalLiteral, 0); }
		public DecllitContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDecllit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDecllit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDecllit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrlitContext extends ArithmeticExprContext {
		public TerminalNode StringLiteral() { return getToken(Parser.StringLiteral, 0); }
		public StrlitContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStrlit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStrlit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStrlit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArthimaticexprContext extends ArithmeticExprContext {
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public OperartorContext operartor() {
			return getRuleContext(OperartorContext.class,0);
		}
		public ArthimaticexprContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArthimaticexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArthimaticexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArthimaticexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExprContext arithmeticExpr() throws RecognitionException {
		return arithmeticExpr(0);
	}

	private ArithmeticExprContext arithmeticExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExprContext _localctx = new ArithmeticExprContext(_ctx, _parentState);
		ArithmeticExprContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_arithmeticExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecimalLiteral:
				{
				_localctx = new DecllitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(427);
				match(DecimalLiteral);
				}
				break;
			case StringLiteral:
				{
				_localctx = new StrlitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(428);
				match(StringLiteral);
				}
				break;
			case Identifier:
				{
				_localctx = new IdenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(429);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArthimaticexprContext(new ArithmeticExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpr);
					setState(432);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(433);
					operartor();
					setState(434);
					arithmeticExpr(5);
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Identifier_Context extends ParserRuleContext {
		public Identifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_; }
	 
		public Identifier_Context() { }
		public void copyFrom(Identifier_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Identifier__Context extends Identifier_Context {
		public TerminalNode Identifier() { return getToken(Parser.Identifier, 0); }
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public Identifier__Context(Identifier_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIdentifier__(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIdentifier__(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIdentifier__(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_Context identifier_() throws RecognitionException {
		Identifier_Context _localctx = new Identifier_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_identifier_);
		try {
			_localctx = new Identifier__Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(Identifier);
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(442);
				arrayIndex();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayIndexContext extends ParserRuleContext {
		public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndex; }
	 
		public ArrayIndexContext() { }
		public void copyFrom(ArrayIndexContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayIndexStmtContext extends ArrayIndexContext {
		public TerminalNode OpenBracket() { return getToken(Parser.OpenBracket, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(Parser.CloseBracket, 0); }
		public ArrayIndexStmtContext(ArrayIndexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayIndexStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayIndexStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayIndexStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arrayIndex);
		try {
			_localctx = new ArrayIndexStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(OpenBracket);
			setState(446);
			expr(0);
			setState(447);
			match(CloseBracket);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperartorContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(Parser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(Parser.Divide, 0); }
		public TerminalNode Plus() { return getToken(Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(Parser.Minus, 0); }
		public TerminalNode MultiplyAssign() { return getToken(Parser.MultiplyAssign, 0); }
		public TerminalNode DivideAssign() { return getToken(Parser.DivideAssign, 0); }
		public TerminalNode ModulusAssign() { return getToken(Parser.ModulusAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(Parser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(Parser.MinusAssign, 0); }
		public TerminalNode And() { return getToken(Parser.And, 0); }
		public TerminalNode Or() { return getToken(Parser.Or, 0); }
		public TerminalNode Equals_() { return getToken(Parser.Equals_, 0); }
		public TerminalNode NotEquals() { return getToken(Parser.NotEquals, 0); }
		public TerminalNode IdentityEquals() { return getToken(Parser.IdentityEquals, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(Parser.IdentityNotEquals, 0); }
		public TerminalNode LessThan() { return getToken(Parser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(Parser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(Parser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(Parser.GreaterThanEquals, 0); }
		public TerminalNode BitAnd() { return getToken(Parser.BitAnd, 0); }
		public TerminalNode BitXOr() { return getToken(Parser.BitXOr, 0); }
		public TerminalNode BitOr() { return getToken(Parser.BitOr, 0); }
		public TerminalNode Assign() { return getToken(Parser.Assign, 0); }
		public TerminalNode Modulus() { return getToken(Parser.Modulus, 0); }
		public TerminalNode Dot() { return getToken(Parser.Dot, 0); }
		public OperartorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operartor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterOperartor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitOperartor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOperartor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperartorContext operartor() throws RecognitionException {
		OperartorContext _localctx = new OperartorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operartor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -18014398509456512L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1023L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDecoratorContext extends ParserRuleContext {
		public ComponentDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDecorator; }
	 
		public ComponentDecoratorContext() { }
		public void copyFrom(ComponentDecoratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDecoratorStmtContext extends ComponentDecoratorContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode OpenParen() { return getToken(Parser.OpenParen, 0); }
		public CompoenentObjectContext compoenentObject() {
			return getRuleContext(CompoenentObjectContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(Parser.CloseParen, 0); }
		public ComponentDecoratorStmtContext(ComponentDecoratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterComponentDecoratorStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitComponentDecoratorStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitComponentDecoratorStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDecoratorContext componentDecorator() throws RecognitionException {
		ComponentDecoratorContext _localctx = new ComponentDecoratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_componentDecorator);
		try {
			_localctx = new ComponentDecoratorStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			identifier_();
			setState(452);
			match(OpenParen);
			setState(453);
			compoenentObject();
			setState(454);
			match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompoenentObjectContext extends ParserRuleContext {
		public CompoenentObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoenentObject; }
	 
		public CompoenentObjectContext() { }
		public void copyFrom(CompoenentObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentobjContext extends CompoenentObjectContext {
		public TerminalNode OpenBrace() { return getToken(Parser.OpenBrace, 0); }
		public TerminalNode Selector() { return getToken(Parser.Selector, 0); }
		public List<TerminalNode> Colon() { return getTokens(Parser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(Parser.Colon, i);
		}
		public TerminalNode StringLiteral() { return getToken(Parser.StringLiteral, 0); }
		public TerminalNode Comma() { return getToken(Parser.Comma, 0); }
		public TerminalNode Template() { return getToken(Parser.Template, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(Parser.CloseBrace, 0); }
		public ComponentobjContext(CompoenentObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterComponentobj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitComponentobj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitComponentobj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoenentObjectContext compoenentObject() throws RecognitionException {
		CompoenentObjectContext _localctx = new CompoenentObjectContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_compoenentObject);
		try {
			_localctx = new ComponentobjContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(OpenBrace);
			setState(457);
			match(Selector);
			setState(458);
			match(Colon);
			setState(459);
			match(StringLiteral);
			setState(460);
			match(Comma);
			setState(461);
			match(Template);
			setState(462);
			match(Colon);
			setState(463);
			html();
			setState(464);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
	 
		public ConstructorContext() { }
		public void copyFrom(ConstructorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorStmtContext extends ConstructorContext {
		public TerminalNode Constructor() { return getToken(Parser.Constructor, 0); }
		public InjectableFunctionParametersContext injectableFunctionParameters() {
			return getRuleContext(InjectableFunctionParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorStmtContext(ConstructorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterConstructorStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitConstructorStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitConstructorStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constructor);
		try {
			_localctx = new ConstructorStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(Constructor);
			setState(467);
			injectableFunctionParameters();
			setState(468);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ParserRuleContext {
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
	 
		public HtmlContext() { }
		public void copyFrom(HtmlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlcontContext extends HtmlContext {
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public HtmlcontContext(HtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterHtmlcont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitHtmlcont(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitHtmlcont(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_html);
		int _la;
		try {
			_localctx = new HtmlcontContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenBrace || _la==LessThan || _la==Identifier) {
				{
				{
				setState(470);
				htmlContent();
				}
				}
				setState(475);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
	 
		public TextContext() { }
		public void copyFrom(TextContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextStmtContext extends TextContext {
		public TerminalNode Identifier() { return getToken(Parser.Identifier, 0); }
		public TextStmtContext(TextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTextStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTextStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTextStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_text);
		try {
			_localctx = new TextStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierPathContext extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(Parser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(Parser.Dot, i);
		}
		public IdentifierPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIdentifierPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIdentifierPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIdentifierPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierPathContext identifierPath() throws RecognitionException {
		IdentifierPathContext _localctx = new IdentifierPathContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_identifierPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			identifier_();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(479);
				match(Dot);
				setState(480);
				identifier_();
				}
				}
				setState(485);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationValueContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public InterpolationValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterInterpolationValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitInterpolationValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInterpolationValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationValueContext interpolationValue() throws RecognitionException {
		InterpolationValueContext _localctx = new InterpolationValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_interpolationValue);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				identifierPath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				identifier_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public List<TerminalNode> OpenBrace() { return getTokens(Parser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(Parser.OpenBrace, i);
		}
		public InterpolationValueContext interpolationValue() {
			return getRuleContext(InterpolationValueContext.class,0);
		}
		public List<TerminalNode> CloseBrace() { return getTokens(Parser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(Parser.CloseBrace, i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_htmlContent);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LessThan:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				htmlElement();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				text();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(492);
				match(OpenBrace);
				setState(493);
				match(OpenBrace);
				setState(494);
				interpolationValue();
				setState(495);
				match(CloseBrace);
				setState(496);
				match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_htmlElement);
		try {
			int _alt;
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				selfClosingTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				openTag();
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(502);
						htmlContent();
						}
						} 
					}
					setState(507);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(508);
				closeTag();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagContext extends ParserRuleContext {
		public HtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTag; }
	 
		public HtmlTagContext() { }
		public void copyFrom(HtmlTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagStmtContext extends HtmlTagContext {
		public TerminalNode Identifier() { return getToken(Parser.Identifier, 0); }
		public HtmlTagStmtContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterHtmlTagStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitHtmlTagStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitHtmlTagStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagContext htmlTag() throws RecognitionException {
		HtmlTagContext _localctx = new HtmlTagContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_htmlTag);
		try {
			_localctx = new HtmlTagStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagContext extends ParserRuleContext {
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
	 
		public OpenTagContext() { }
		public void copyFrom(OpenTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagStmtContext extends OpenTagContext {
		public TerminalNode LessThan() { return getToken(Parser.LessThan, 0); }
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public TerminalNode MoreThan() { return getToken(Parser.MoreThan, 0); }
		public StructuralDirectivesContext structuralDirectives() {
			return getRuleContext(StructuralDirectivesContext.class,0);
		}
		public List<BoundAttributeContext> boundAttribute() {
			return getRuleContexts(BoundAttributeContext.class);
		}
		public BoundAttributeContext boundAttribute(int i) {
			return getRuleContext(BoundAttributeContext.class,i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public OpenTagStmtContext(OpenTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterOpenTagStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitOpenTagStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOpenTagStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_openTag);
		int _la;
		try {
			_localctx = new OpenTagStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(LessThan);
			setState(515);
			htmlTag();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NgFor || _la==NgIf) {
				{
				setState(516);
				structuralDirectives();
				}
			}

			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenParen || _la==OpenBracket || _la==Identifier) {
				{
				setState(522);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
					{
					setState(519);
					boundAttribute();
					}
					break;
				case Identifier:
					{
					setState(520);
					attribute();
					}
					break;
				case OpenParen:
					{
					setState(521);
					eventBinding();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
			match(MoreThan);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(Parser.LessThan, 0); }
		public TerminalNode Identifier() { return getToken(Parser.Identifier, 0); }
		public TerminalNode Divide() { return getToken(Parser.Divide, 0); }
		public TerminalNode MoreThan() { return getToken(Parser.MoreThan, 0); }
		public List<BoundAttributeContext> boundAttribute() {
			return getRuleContexts(BoundAttributeContext.class);
		}
		public BoundAttributeContext boundAttribute(int i) {
			return getRuleContext(BoundAttributeContext.class,i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(LessThan);
			setState(530);
			match(Identifier);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenParen || _la==OpenBracket || _la==Identifier) {
				{
				setState(534);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
					{
					setState(531);
					boundAttribute();
					}
					break;
				case Identifier:
					{
					setState(532);
					attribute();
					}
					break;
				case OpenParen:
					{
					setState(533);
					eventBinding();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(539);
			match(Divide);
			setState(540);
			match(MoreThan);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagContext extends ParserRuleContext {
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
	 
		public CloseTagContext() { }
		public void copyFrom(CloseTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagStmtContext extends CloseTagContext {
		public TerminalNode LessThan() { return getToken(Parser.LessThan, 0); }
		public TerminalNode Divide() { return getToken(Parser.Divide, 0); }
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public TerminalNode MoreThan() { return getToken(Parser.MoreThan, 0); }
		public CloseTagStmtContext(CloseTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCloseTagStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCloseTagStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCloseTagStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_closeTag);
		try {
			_localctx = new CloseTagStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(LessThan);
			setState(543);
			match(Divide);
			setState(544);
			htmlTag();
			setState(545);
			match(MoreThan);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructuralDirectivesContext extends ParserRuleContext {
		public StructuralDirectivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuralDirectives; }
	 
		public StructuralDirectivesContext() { }
		public void copyFrom(StructuralDirectivesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgifContext extends StructuralDirectivesContext {
		public IfDirectiveContext ifDirective() {
			return getRuleContext(IfDirectiveContext.class,0);
		}
		public NgifContext(StructuralDirectivesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNgif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNgif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNgif(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgforContext extends StructuralDirectivesContext {
		public ForDirectiveContext forDirective() {
			return getRuleContext(ForDirectiveContext.class,0);
		}
		public NgforContext(StructuralDirectivesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNgfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNgfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNgfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuralDirectivesContext structuralDirectives() throws RecognitionException {
		StructuralDirectivesContext _localctx = new StructuralDirectivesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_structuralDirectives);
		try {
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NgFor:
				_localctx = new NgforContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				forDirective();
				}
				break;
			case NgIf:
				_localctx = new NgifContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				ifDirective();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForDirectiveContext extends ParserRuleContext {
		public TerminalNode NgFor() { return getToken(Parser.NgFor, 0); }
		public TerminalNode Assign() { return getToken(Parser.Assign, 0); }
		public TerminalNode Let() { return getToken(Parser.Let, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode Of() { return getToken(Parser.Of, 0); }
		public ForDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterForDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitForDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitForDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDirectiveContext forDirective() throws RecognitionException {
		ForDirectiveContext _localctx = new ForDirectiveContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_forDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(NgFor);
			setState(552);
			match(Assign);
			setState(553);
			match(Let);
			setState(554);
			identifier_();
			setState(555);
			match(Of);
			setState(556);
			identifier_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfDirectiveContext extends ParserRuleContext {
		public TerminalNode NgIf() { return getToken(Parser.NgIf, 0); }
		public TerminalNode Assign() { return getToken(Parser.Assign, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public AnyLiteralContext anyLiteral() {
			return getRuleContext(AnyLiteralContext.class,0);
		}
		public IfDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIfDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIfDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIfDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDirectiveContext ifDirective() throws RecognitionException {
		IfDirectiveContext _localctx = new IfDirectiveContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_ifDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(NgIf);
			setState(559);
			match(Assign);
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(560);
				identifier_();
				}
				break;
			case OpenBracket:
			case OpenBrace:
			case NullLiteral:
			case BooleanLiteral:
			case StringLiteral:
			case DecimalLiteral:
				{
				setState(561);
				anyLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode Assign() { return getToken(Parser.Assign, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			attributeName();
			setState(565);
			match(Assign);
			setState(566);
			attributeValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Parser.Identifier, 0); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(Parser.StringLiteral, 0); }
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_attributeValue);
		try {
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				match(StringLiteral);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				identifierPath();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoundAttributeContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(Parser.OpenBracket, 0); }
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(Parser.CloseBracket, 0); }
		public TerminalNode Assign() { return getToken(Parser.Assign, 0); }
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public BoundAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterBoundAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitBoundAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBoundAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundAttributeContext boundAttribute() throws RecognitionException {
		BoundAttributeContext _localctx = new BoundAttributeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_boundAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(OpenBracket);
			setState(575);
			attributeName();
			setState(576);
			match(CloseBracket);
			setState(577);
			match(Assign);
			setState(578);
			identifierPath();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EventNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Parser.Identifier, 0); }
		public EventNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterEventName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitEventName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitEventName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventNameContext eventName() throws RecognitionException {
		EventNameContext _localctx = new EventNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_eventName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EventBindingContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(Parser.OpenParen, 0); }
		public EventNameContext eventName() {
			return getRuleContext(EventNameContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(Parser.CloseParen, 0); }
		public TerminalNode Assign() { return getToken(Parser.Assign, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public EventBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventBindingContext eventBinding() throws RecognitionException {
		EventBindingContext _localctx = new EventBindingContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_eventBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(OpenParen);
			setState(583);
			eventName();
			setState(584);
			match(CloseParen);
			setState(585);
			match(Assign);
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(586);
				functionCall();
				}
				break;
			case 2:
				{
				setState(587);
				identifierPath();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(Parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(Parser.CloseParen, 0); }
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public TerminalNode Select() { return getToken(Parser.Select, 0); }
		public TerminalNode Dispatch() { return getToken(Parser.Dispatch, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Parser.Comma, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(590);
				identifierPath();
				}
				break;
			case Select:
				{
				setState(591);
				match(Select);
				}
				break;
			case Dispatch:
				{
				setState(592);
				match(Dispatch);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(595);
			match(OpenParen);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785075008831530L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) {
				{
				setState(596);
				expr(0);
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(597);
					match(Comma);
					setState(598);
					expr(0);
					}
					}
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(606);
			match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InjectableFunctionParametersContext extends ParserRuleContext {
		public InjectableFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableFunctionParameters; }
	 
		public InjectableFunctionParametersContext() { }
		public void copyFrom(InjectableFunctionParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InjecFuncParaContext extends InjectableFunctionParametersContext {
		public TerminalNode OpenParen() { return getToken(Parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(Parser.CloseParen, 0); }
		public List<InjectableVariableFunctionSingleArgumentContext> injectableVariableFunctionSingleArgument() {
			return getRuleContexts(InjectableVariableFunctionSingleArgumentContext.class);
		}
		public InjectableVariableFunctionSingleArgumentContext injectableVariableFunctionSingleArgument(int i) {
			return getRuleContext(InjectableVariableFunctionSingleArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Parser.Comma, i);
		}
		public InjecFuncParaContext(InjectableFunctionParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterInjecFuncPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitInjecFuncPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInjecFuncPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableFunctionParametersContext injectableFunctionParameters() throws RecognitionException {
		InjectableFunctionParametersContext _localctx = new InjectableFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_injectableFunctionParameters);
		int _la;
		try {
			_localctx = new InjecFuncParaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(OpenParen);
			{
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) {
				{
				setState(609);
				injectableVariableFunctionSingleArgument();
				}
			}

			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(613); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(612);
					match(Comma);
					}
					}
					setState(615); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				setState(617);
				injectableVariableFunctionSingleArgument();
				}
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(623);
			match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InjectableVariableFunctionSingleArgumentContext extends ParserRuleContext {
		public InjectableVariableFunctionSingleArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableVariableFunctionSingleArgument; }
	 
		public InjectableVariableFunctionSingleArgumentContext() { }
		public void copyFrom(InjectableVariableFunctionSingleArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InjecVarFuncSiArgContext extends InjectableVariableFunctionSingleArgumentContext {
		public AccessModifiresContext accessModifires() {
			return getRuleContext(AccessModifiresContext.class,0);
		}
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Colon() { return getToken(Parser.Colon, 0); }
		public DataTypesContext dataTypes() {
			return getRuleContext(DataTypesContext.class,0);
		}
		public InjecVarFuncSiArgContext(InjectableVariableFunctionSingleArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterInjecVarFuncSiArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitInjecVarFuncSiArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInjecVarFuncSiArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableVariableFunctionSingleArgumentContext injectableVariableFunctionSingleArgument() throws RecognitionException {
		InjectableVariableFunctionSingleArgumentContext _localctx = new InjectableVariableFunctionSingleArgumentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_injectableVariableFunctionSingleArgument);
		try {
			_localctx = new InjecVarFuncSiArgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			accessModifires();
			setState(626);
			identifier_();
			setState(627);
			match(Colon);
			setState(628);
			dataTypes();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifiresContext extends ParserRuleContext {
		public AccessModifiresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifires; }
	 
		public AccessModifiresContext() { }
		public void copyFrom(AccessModifiresContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProtoctedContext extends AccessModifiresContext {
		public TerminalNode Protected() { return getToken(Parser.Protected, 0); }
		public ProtoctedContext(AccessModifiresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterProtocted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitProtocted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitProtocted(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrivateContext extends AccessModifiresContext {
		public TerminalNode Private() { return getToken(Parser.Private, 0); }
		public PrivateContext(AccessModifiresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPrivate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPrivate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrivate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PublicContext extends AccessModifiresContext {
		public TerminalNode Public() { return getToken(Parser.Public, 0); }
		public PublicContext(AccessModifiresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPublic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPublic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPublic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifiresContext accessModifires() throws RecognitionException {
		AccessModifiresContext _localctx = new AccessModifiresContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_accessModifires);
		try {
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Public:
				_localctx = new PublicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				match(Public);
				}
				break;
			case Private:
				_localctx = new PrivateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(Private);
				}
				break;
			case Protected:
				_localctx = new ProtoctedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				match(Protected);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConsoleLogContext extends ParserRuleContext {
		public ConsoleLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consoleLog; }
	 
		public ConsoleLogContext() { }
		public void copyFrom(ConsoleLogContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConsoleLogStmtContext extends ConsoleLogContext {
		public TerminalNode Console() { return getToken(Parser.Console, 0); }
		public TerminalNode Dot() { return getToken(Parser.Dot, 0); }
		public TerminalNode Log() { return getToken(Parser.Log, 0); }
		public TerminalNode OpenParen() { return getToken(Parser.OpenParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(Parser.CloseParen, 0); }
		public ConsoleLogStmtContext(ConsoleLogContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterConsoleLogStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitConsoleLogStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitConsoleLogStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsoleLogContext consoleLog() throws RecognitionException {
		ConsoleLogContext _localctx = new ConsoleLogContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_consoleLog);
		try {
			_localctx = new ConsoleLogStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(Console);
			setState(636);
			match(Dot);
			setState(637);
			match(Log);
			setState(638);
			match(OpenParen);
			setState(639);
			expr(0);
			setState(640);
			match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StoreDeclContext extends ParserRuleContext {
		public TerminalNode Store() { return getToken(Parser.Store, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(Parser.OpenBrace, 0); }
		public StoreBodyContext storeBody() {
			return getRuleContext(StoreBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(Parser.CloseBrace, 0); }
		public StoreDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStoreDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStoreDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStoreDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreDeclContext storeDecl() throws RecognitionException {
		StoreDeclContext _localctx = new StoreDeclContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_storeDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(Store);
			setState(643);
			identifier_();
			setState(644);
			match(OpenBrace);
			setState(645);
			storeBody();
			setState(646);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StoreBodyContext extends ParserRuleContext {
		public StateSectionContext stateSection() {
			return getRuleContext(StateSectionContext.class,0);
		}
		public ActionsSectionContext actionsSection() {
			return getRuleContext(ActionsSectionContext.class,0);
		}
		public ReducerSectionContext reducerSection() {
			return getRuleContext(ReducerSectionContext.class,0);
		}
		public SelectorsSectionContext selectorsSection() {
			return getRuleContext(SelectorsSectionContext.class,0);
		}
		public StoreBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStoreBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStoreBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStoreBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreBodyContext storeBody() throws RecognitionException {
		StoreBodyContext _localctx = new StoreBodyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_storeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			stateSection();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Actions) {
				{
				setState(649);
				actionsSection();
				}
			}

			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Reducer) {
				{
				setState(652);
				reducerSection();
				}
			}

			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Selectors) {
				{
				setState(655);
				selectorsSection();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateSectionContext extends ParserRuleContext {
		public TerminalNode State() { return getToken(Parser.State, 0); }
		public TerminalNode OpenBrace() { return getToken(Parser.OpenBrace, 0); }
		public List<StoreStateFieldContext> storeStateField() {
			return getRuleContexts(StoreStateFieldContext.class);
		}
		public StoreStateFieldContext storeStateField(int i) {
			return getRuleContext(StoreStateFieldContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(Parser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Parser.Comma, i);
		}
		public StateSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStateSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStateSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStateSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateSectionContext stateSection() throws RecognitionException {
		StateSectionContext _localctx = new StateSectionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_stateSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(State);
			setState(659);
			match(OpenBrace);
			setState(660);
			storeStateField();
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(661);
				match(Comma);
				setState(662);
				storeStateField();
				}
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(668);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StoreStateFieldContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Colon() { return getToken(Parser.Colon, 0); }
		public TerminalNode Assign() { return getToken(Parser.Assign, 0); }
		public AnyLiteralContext anyLiteral() {
			return getRuleContext(AnyLiteralContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StoreStateFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeStateField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStoreStateField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStoreStateField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStoreStateField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreStateFieldContext storeStateField() throws RecognitionException {
		StoreStateFieldContext _localctx = new StoreStateFieldContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_storeStateField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			identifier_();
			setState(671);
			_la = _input.LA(1);
			if ( !(_la==Colon || _la==Assign) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(672);
				anyLiteral();
				}
				break;
			case 2:
				{
				setState(673);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActionsSectionContext extends ParserRuleContext {
		public TerminalNode Actions() { return getToken(Parser.Actions, 0); }
		public TerminalNode OpenBrace() { return getToken(Parser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(Parser.CloseBrace, 0); }
		public List<ActionDeclContext> actionDecl() {
			return getRuleContexts(ActionDeclContext.class);
		}
		public ActionDeclContext actionDecl(int i) {
			return getRuleContext(ActionDeclContext.class,i);
		}
		public ActionsSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionsSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterActionsSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitActionsSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitActionsSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionsSectionContext actionsSection() throws RecognitionException {
		ActionsSectionContext _localctx = new ActionsSectionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_actionsSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(Actions);
			setState(677);
			match(OpenBrace);
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(678);
				actionDecl();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActionDeclContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Assign() { return getToken(Parser.Assign, 0); }
		public ArrowFunctionDeclerationContext arrowFunctionDecleration() {
			return getRuleContext(ArrowFunctionDeclerationContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(Parser.SemiColon, 0); }
		public ActionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterActionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitActionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitActionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionDeclContext actionDecl() throws RecognitionException {
		ActionDeclContext _localctx = new ActionDeclContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_actionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			identifier_();
			setState(687);
			match(Assign);
			setState(688);
			arrowFunctionDecleration();
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(689);
				match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReducerSectionContext extends ParserRuleContext {
		public TerminalNode Reducer() { return getToken(Parser.Reducer, 0); }
		public TerminalNode OpenBrace() { return getToken(Parser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(Parser.CloseBrace, 0); }
		public List<ReducerRuleContext> reducerRule() {
			return getRuleContexts(ReducerRuleContext.class);
		}
		public ReducerRuleContext reducerRule(int i) {
			return getRuleContext(ReducerRuleContext.class,i);
		}
		public ReducerSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reducerSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterReducerSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitReducerSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitReducerSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReducerSectionContext reducerSection() throws RecognitionException {
		ReducerSectionContext _localctx = new ReducerSectionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_reducerSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(Reducer);
			setState(693);
			match(OpenBrace);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(694);
				reducerRule();
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(700);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReducerRuleContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Colon() { return getToken(Parser.Colon, 0); }
		public ArrowFunctionDeclerationContext arrowFunctionDecleration() {
			return getRuleContext(ArrowFunctionDeclerationContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(Parser.SemiColon, 0); }
		public ReducerRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reducerRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterReducerRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitReducerRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitReducerRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReducerRuleContext reducerRule() throws RecognitionException {
		ReducerRuleContext _localctx = new ReducerRuleContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_reducerRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			identifier_();
			setState(703);
			match(Colon);
			setState(704);
			arrowFunctionDecleration();
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(705);
				match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorsSectionContext extends ParserRuleContext {
		public TerminalNode Selectors() { return getToken(Parser.Selectors, 0); }
		public TerminalNode OpenBrace() { return getToken(Parser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(Parser.CloseBrace, 0); }
		public List<SelectorDeclContext> selectorDecl() {
			return getRuleContexts(SelectorDeclContext.class);
		}
		public SelectorDeclContext selectorDecl(int i) {
			return getRuleContext(SelectorDeclContext.class,i);
		}
		public SelectorsSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorsSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSelectorsSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSelectorsSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSelectorsSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorsSectionContext selectorsSection() throws RecognitionException {
		SelectorsSectionContext _localctx = new SelectorsSectionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_selectorsSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(Selectors);
			setState(709);
			match(OpenBrace);
			setState(711); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(710);
				selectorDecl();
				}
				}
				setState(713); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(715);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorDeclContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Assign() { return getToken(Parser.Assign, 0); }
		public ArrowFunctionDeclerationContext arrowFunctionDecleration() {
			return getRuleContext(ArrowFunctionDeclerationContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(Parser.SemiColon, 0); }
		public SelectorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSelectorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSelectorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSelectorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorDeclContext selectorDecl() throws RecognitionException {
		SelectorDeclContext _localctx = new SelectorDeclContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_selectorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			identifier_();
			setState(718);
			match(Assign);
			setState(719);
			arrowFunctionDecleration();
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(720);
				match(SemiColon);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 32:
			return arithmeticExpr_sempred((ArithmeticExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean arithmeticExpr_sempred(ArithmeticExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001S\u02d4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0005\u0000\u0094\b\u0000"+
		"\n\u0000\f\u0000\u0097\t\u0000\u0001\u0000\u0005\u0000\u009a\b\u0000\n"+
		"\u0000\f\u0000\u009d\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00a1"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00a7"+
		"\b\u0000\n\u0000\f\u0000\u00aa\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00b6\b\u0001\u0001\u0001\u0003\u0001\u00b9\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u00bd\b\u0002\n\u0002\f\u0002"+
		"\u00c0\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00c7\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00cc\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00d4\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00d9\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00e0\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00e5\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0003\t\u00ee\b\t\u0001\t\u0004\t\u00f1\b\t\u000b\t"+
		"\f\t\u00f2\u0001\t\u0005\t\u00f6\b\t\n\t\f\t\u00f9\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u00fe\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0003\f\u0105\b\f\u0001\f\u0001\f\u0005\f\u0109\b\f\n\f\f\f\u010c"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0117\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0003\u0010\u011c\b\u0010\u0001\u0010\u0004\u0010\u011f\b"+
		"\u0010\u000b\u0010\f\u0010\u0120\u0001\u0010\u0005\u0010\u0124\b\u0010"+
		"\n\u0010\f\u0010\u0127\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u012e\b\u0011\u0003\u0011\u0130\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0138\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u013c\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0148"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u014c\b\u0017\u0001\u0017"+
		"\u0004\u0017\u014f\b\u0017\u000b\u0017\f\u0017\u0150\u0001\u0017\u0005"+
		"\u0017\u0154\b\u0017\n\u0017\f\u0017\u0157\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u015e\b\u0018\u000b\u0018"+
		"\f\u0018\u015f\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0166\b\u0018\n\u0018\f\u0018\u0169\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0003\u001a\u0172"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0176\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u017a\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0004\u001b\u017f\b\u001b\u000b\u001b\f\u001b\u0180\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u018e\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u019c\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u01a2\b\u001e\n\u001e\f\u001e\u01a5\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u01a9\b\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u01af\b"+
		" \u0001 \u0001 \u0001 \u0001 \u0005 \u01b5\b \n \f \u01b8\t \u0001!\u0001"+
		"!\u0003!\u01bc\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0005"+
		"\'\u01d8\b\'\n\'\f\'\u01db\t\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0005"+
		")\u01e2\b)\n)\f)\u01e5\t)\u0001*\u0001*\u0003*\u01e9\b*\u0001+\u0001+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u01f3\b+\u0001,\u0001"+
		",\u0001,\u0005,\u01f8\b,\n,\f,\u01fb\t,\u0001,\u0001,\u0003,\u01ff\b,"+
		"\u0001-\u0001-\u0001.\u0001.\u0001.\u0003.\u0206\b.\u0001.\u0001.\u0001"+
		".\u0005.\u020b\b.\n.\f.\u020e\t.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0005/\u0217\b/\n/\f/\u021a\t/\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00011\u00011\u00031\u0226\b1\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00033\u0233"+
		"\b3\u00014\u00014\u00014\u00014\u00015\u00015\u00016\u00016\u00036\u023d"+
		"\b6\u00017\u00017\u00017\u00017\u00017\u00017\u00018\u00018\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00039\u024d\b9\u0001:\u0001:\u0001:\u0003"+
		":\u0252\b:\u0001:\u0001:\u0001:\u0001:\u0005:\u0258\b:\n:\f:\u025b\t:"+
		"\u0003:\u025d\b:\u0001:\u0001:\u0001;\u0001;\u0003;\u0263\b;\u0001;\u0004"+
		";\u0266\b;\u000b;\f;\u0267\u0001;\u0005;\u026b\b;\n;\f;\u026e\t;\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0003"+
		"=\u027a\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0003@\u028b\b@\u0001@\u0003"+
		"@\u028e\b@\u0001@\u0003@\u0291\b@\u0001A\u0001A\u0001A\u0001A\u0001A\u0005"+
		"A\u0298\bA\nA\fA\u029b\tA\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0003"+
		"B\u02a3\bB\u0001C\u0001C\u0001C\u0005C\u02a8\bC\nC\fC\u02ab\tC\u0001C"+
		"\u0001C\u0001D\u0001D\u0001D\u0001D\u0003D\u02b3\bD\u0001E\u0001E\u0001"+
		"E\u0005E\u02b8\bE\nE\fE\u02bb\tE\u0001E\u0001E\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u02c3\bF\u0001G\u0001G\u0001G\u0004G\u02c8\bG\u000bG\fG\u02c9"+
		"\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0003H\u02d2\bH\u0001H\u0000"+
		"\u0002<@I\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0000\u0005"+
		"\u0001\u0000#&\u0001\u0000NP\u0001\u0000 \"\u0003\u0000\u0007\t\r\u000e"+
		"6I\u0002\u0000\f\f\u000e\u000e\u02f3\u0000\u0095\u0001\u0000\u0000\u0000"+
		"\u0002\u00b5\u0001\u0000\u0000\u0000\u0004\u00ba\u0001\u0000\u0000\u0000"+
		"\u0006\u00c6\u0001\u0000\u0000\u0000\b\u00cb\u0001\u0000\u0000\u0000\n"+
		"\u00cd\u0001\u0000\u0000\u0000\f\u00da\u0001\u0000\u0000\u0000\u000e\u00e6"+
		"\u0001\u0000\u0000\u0000\u0010\u00e8\u0001\u0000\u0000\u0000\u0012\u00ed"+
		"\u0001\u0000\u0000\u0000\u0014\u00fd\u0001\u0000\u0000\u0000\u0016\u00ff"+
		"\u0001\u0000\u0000\u0000\u0018\u0104\u0001\u0000\u0000\u0000\u001a\u010d"+
		"\u0001\u0000\u0000\u0000\u001c\u0111\u0001\u0000\u0000\u0000\u001e\u0118"+
		"\u0001\u0000\u0000\u0000 \u011b\u0001\u0000\u0000\u0000\"\u0128\u0001"+
		"\u0000\u0000\u0000$\u0137\u0001\u0000\u0000\u0000&\u013b\u0001\u0000\u0000"+
		"\u0000(\u013d\u0001\u0000\u0000\u0000*\u0141\u0001\u0000\u0000\u0000,"+
		"\u0147\u0001\u0000\u0000\u0000.\u0149\u0001\u0000\u0000\u00000\u015a\u0001"+
		"\u0000\u0000\u00002\u016a\u0001\u0000\u0000\u00004\u0171\u0001\u0000\u0000"+
		"\u00006\u017b\u0001\u0000\u0000\u00008\u0185\u0001\u0000\u0000\u0000:"+
		"\u0189\u0001\u0000\u0000\u0000<\u019b\u0001\u0000\u0000\u0000>\u01a6\u0001"+
		"\u0000\u0000\u0000@\u01ae\u0001\u0000\u0000\u0000B\u01b9\u0001\u0000\u0000"+
		"\u0000D\u01bd\u0001\u0000\u0000\u0000F\u01c1\u0001\u0000\u0000\u0000H"+
		"\u01c3\u0001\u0000\u0000\u0000J\u01c8\u0001\u0000\u0000\u0000L\u01d2\u0001"+
		"\u0000\u0000\u0000N\u01d9\u0001\u0000\u0000\u0000P\u01dc\u0001\u0000\u0000"+
		"\u0000R\u01de\u0001\u0000\u0000\u0000T\u01e8\u0001\u0000\u0000\u0000V"+
		"\u01f2\u0001\u0000\u0000\u0000X\u01fe\u0001\u0000\u0000\u0000Z\u0200\u0001"+
		"\u0000\u0000\u0000\\\u0202\u0001\u0000\u0000\u0000^\u0211\u0001\u0000"+
		"\u0000\u0000`\u021e\u0001\u0000\u0000\u0000b\u0225\u0001\u0000\u0000\u0000"+
		"d\u0227\u0001\u0000\u0000\u0000f\u022e\u0001\u0000\u0000\u0000h\u0234"+
		"\u0001\u0000\u0000\u0000j\u0238\u0001\u0000\u0000\u0000l\u023c\u0001\u0000"+
		"\u0000\u0000n\u023e\u0001\u0000\u0000\u0000p\u0244\u0001\u0000\u0000\u0000"+
		"r\u0246\u0001\u0000\u0000\u0000t\u0251\u0001\u0000\u0000\u0000v\u0260"+
		"\u0001\u0000\u0000\u0000x\u0271\u0001\u0000\u0000\u0000z\u0279\u0001\u0000"+
		"\u0000\u0000|\u027b\u0001\u0000\u0000\u0000~\u0282\u0001\u0000\u0000\u0000"+
		"\u0080\u0288\u0001\u0000\u0000\u0000\u0082\u0292\u0001\u0000\u0000\u0000"+
		"\u0084\u029e\u0001\u0000\u0000\u0000\u0086\u02a4\u0001\u0000\u0000\u0000"+
		"\u0088\u02ae\u0001\u0000\u0000\u0000\u008a\u02b4\u0001\u0000\u0000\u0000"+
		"\u008c\u02be\u0001\u0000\u0000\u0000\u008e\u02c4\u0001\u0000\u0000\u0000"+
		"\u0090\u02cd\u0001\u0000\u0000\u0000\u0092\u0094\u0003\n\u0005\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u009b\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u009a\u0003~?\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0003H$\u0000\u009f\u00a1\u0005\u0012\u0000"+
		"\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0013\u0000"+
		"\u0000\u00a3\u00a4\u0003B!\u0000\u00a4\u00a8\u0005\u0005\u0000\u0000\u00a5"+
		"\u00a7\u0003\u0002\u0001\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0006\u0000\u0000\u00ac"+
		"\u00ad\u0005\u0000\u0000\u0001\u00ad\u0001\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b6\u0003\u0004\u0002\u0000\u00af\u00b6\u0003\b\u0004\u0000\u00b0\u00b6"+
		"\u0003<\u001e\u0000\u00b1\u00b6\u0003\u0006\u0003\u0000\u00b2\u00b6\u0003"+
		"0\u0018\u0000\u00b3\u00b6\u0003L&\u0000\u00b4\u00b6\u0003|>\u0000\u00b5"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b9\u0005\u000b\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u0003\u0001\u0000\u0000\u0000\u00ba"+
		"\u00be\u0005\u0005\u0000\u0000\u00bb\u00bd\u0003\u0002\u0001\u0000\u00bc"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005\u0006\u0000\u0000\u00c2\u0005\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c7\u00032\u0019\u0000\u00c4\u00c7\u00036\u001b\u0000\u00c5\u00c7\u0003"+
		"8\u001c\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u0007\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cc\u0003\u001c\u000e\u0000\u00c9\u00cc\u0003\f\u0006"+
		"\u0000\u00ca\u00cc\u0003(\u0014\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\t\u0001\u0000\u0000\u0000\u00cd\u00d3\u0005\u0010\u0000\u0000\u00ce"+
		"\u00cf\u0005\u0005\u0000\u0000\u00cf\u00d0\u0003B!\u0000\u00d0\u00d1\u0005"+
		"\u0006\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d4\u0003"+
		"B!\u0000\u00d3\u00ce\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0011\u0000"+
		"\u0000\u00d6\u00d8\u0005N\u0000\u0000\u00d7\u00d9\u0005\u000b\u0000\u0000"+
		"\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d9\u000b\u0001\u0000\u0000\u0000\u00da\u00db\u0003B!\u0000\u00db\u00dc"+
		"\u0005\f\u0000\u0000\u00dc\u00df\u0003\u000e\u0007\u0000\u00dd\u00de\u0005"+
		"\u0003\u0000\u0000\u00de\u00e0\u0005\u0004\u0000\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e4\u0005\u000e\u0000\u0000\u00e2\u00e5\u0003"+
		"$\u0012\u0000\u00e3\u00e5\u0003<\u001e\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\r\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0007\u0000\u0000\u0000\u00e7\u000f\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005\u0003\u0000\u0000\u00e9\u00ea\u0003\u0012\t\u0000\u00ea"+
		"\u00eb\u0005\u0004\u0000\u0000\u00eb\u0011\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ee\u0003\u0014\n\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f7\u0001\u0000\u0000\u0000\u00ef\u00f1"+
		"\u0005\n\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0003"+
		"\u0014\n\u0000\u00f5\u00f0\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u0013\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fe\u0003$\u0012\u0000\u00fb\u00fe\u0003<\u001e\u0000"+
		"\u00fc\u00fe\u0003B!\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u0015"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0005\u0000\u0000\u0100\u0101"+
		"\u0003\u0018\f\u0000\u0101\u0102\u0005\u0006\u0000\u0000\u0102\u0017\u0001"+
		"\u0000\u0000\u0000\u0103\u0105\u0003\u001a\r\u0000\u0104\u0103\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u010a\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0005\n\u0000\u0000\u0107\u0109\u0003\u001a\r"+
		"\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u0019\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0007\u0001\u0000\u0000\u010e\u010f\u0005\f\u0000\u0000"+
		"\u010f\u0110\u0003<\u001e\u0000\u0110\u001b\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0003\u001e\u000f\u0000\u0112\u0113\u0003B!\u0000\u0113\u0116\u0005"+
		"\u000e\u0000\u0000\u0114\u0117\u0003$\u0012\u0000\u0115\u0117\u0003<\u001e"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u001d\u0001\u0000\u0000\u0000\u0118\u0119\u0007\u0002\u0000"+
		"\u0000\u0119\u001f\u0001\u0000\u0000\u0000\u011a\u011c\u0003\"\u0011\u0000"+
		"\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u0125\u0001\u0000\u0000\u0000\u011d\u011f\u0005\n\u0000\u0000\u011e"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0003\"\u0011\u0000\u0123\u011e"+
		"\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126!\u0001"+
		"\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u012f\u0003"+
		"B!\u0000\u0129\u012a\u0005\f\u0000\u0000\u012a\u012d\u0003\u000e\u0007"+
		"\u0000\u012b\u012c\u0005\u0003\u0000\u0000\u012c\u012e\u0005\u0004\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u0129\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130#\u0001\u0000\u0000\u0000"+
		"\u0131\u0138\u0003\u0010\b\u0000\u0132\u0138\u0003\u0016\u000b\u0000\u0133"+
		"\u0138\u0005N\u0000\u0000\u0134\u0138\u0005M\u0000\u0000\u0135\u0138\u0005"+
		"O\u0000\u0000\u0136\u0138\u0005L\u0000\u0000\u0137\u0131\u0001\u0000\u0000"+
		"\u0000\u0137\u0132\u0001\u0000\u0000\u0000\u0137\u0133\u0001\u0000\u0000"+
		"\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138%\u0001\u0000\u0000\u0000"+
		"\u0139\u013c\u0003(\u0014\u0000\u013a\u013c\u0003*\u0015\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c\'\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0003B!\u0000\u013e\u013f\u0003.\u0017"+
		"\u0000\u013f\u0140\u0003,\u0016\u0000\u0140)\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0003.\u0017\u0000\u0142\u0143\u0005\u000f\u0000\u0000\u0143\u0144"+
		"\u0003,\u0016\u0000\u0144+\u0001\u0000\u0000\u0000\u0145\u0148\u0003\u0004"+
		"\u0002\u0000\u0146\u0148\u0003<\u001e\u0000\u0147\u0145\u0001\u0000\u0000"+
		"\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148-\u0001\u0000\u0000\u0000"+
		"\u0149\u014b\u0005\u0001\u0000\u0000\u014a\u014c\u0003\"\u0011\u0000\u014b"+
		"\u014a\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"\u0155\u0001\u0000\u0000\u0000\u014d\u014f\u0005\n\u0000\u0000\u014e\u014d"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152\u0154\u0003\"\u0011\u0000\u0153\u014e\u0001"+
		"\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0001"+
		"\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u0159\u0005"+
		"\u0002\u0000\u0000\u0159/\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u0016"+
		"\u0000\u0000\u015b\u015d\u0005\u0001\u0000\u0000\u015c\u015e\u0003<\u001e"+
		"\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u0002\u0000"+
		"\u0000\u0162\u0167\u0003\u0002\u0001\u0000\u0163\u0164\u0005\u0017\u0000"+
		"\u0000\u0164\u0166\u0003\u0002\u0001\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u01681\u0001\u0000\u0000\u0000"+
		"\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016b\u0005\u0018\u0000\u0000"+
		"\u016b\u016c\u0005\u0001\u0000\u0000\u016c\u016d\u00034\u001a\u0000\u016d"+
		"\u016e\u0005\u0002\u0000\u0000\u016e\u016f\u0003\u0004\u0002\u0000\u016f"+
		"3\u0001\u0000\u0000\u0000\u0170\u0172\u0003\u001c\u000e\u0000\u0171\u0170"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0001\u0000\u0000\u0000\u0173\u0175\u0005\u000b\u0000\u0000\u0174\u0176"+
		"\u0003<\u001e\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0175\u0176\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0179\u0005"+
		"\u000b\u0000\u0000\u0178\u017a\u0003<\u001e\u0000\u0179\u0178\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a5\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0005\u0019\u0000\u0000\u017c\u017e\u0005\u0001\u0000"+
		"\u0000\u017d\u017f\u0003<\u001e\u0000\u017e\u017d\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0005\u0002\u0000\u0000\u0183\u0184\u0003\u0004\u0002\u0000"+
		"\u01847\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u001a\u0000\u0000\u0186"+
		"\u0187\u0003\u0004\u0002\u0000\u0187\u0188\u00036\u001b\u0000\u01889\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0003B!\u0000\u018a\u018d\u0005\u000e\u0000"+
		"\u0000\u018b\u018e\u0003<\u001e\u0000\u018c\u018e\u0003$\u0012\u0000\u018d"+
		"\u018b\u0001\u0000\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e"+
		";\u0001\u0000\u0000\u0000\u018f\u0190\u0006\u001e\uffff\uffff\u0000\u0190"+
		"\u019c\u0003t:\u0000\u0191\u019c\u0003\u0010\b\u0000\u0192\u019c\u0003"+
		"\u0016\u000b\u0000\u0193\u019c\u0003*\u0015\u0000\u0194\u019c\u0005N\u0000"+
		"\u0000\u0195\u019c\u0003@ \u0000\u0196\u019c\u0003:\u001d\u0000\u0197"+
		"\u019c\u0003>\u001f\u0000\u0198\u019c\u0005\u001b\u0000\u0000\u0199\u019c"+
		"\u0005\u001c\u0000\u0000\u019a\u019c\u0003B!\u0000\u019b\u018f\u0001\u0000"+
		"\u0000\u0000\u019b\u0191\u0001\u0000\u0000\u0000\u019b\u0192\u0001\u0000"+
		"\u0000\u0000\u019b\u0193\u0001\u0000\u0000\u0000\u019b\u0194\u0001\u0000"+
		"\u0000\u0000\u019b\u0195\u0001\u0000\u0000\u0000\u019b\u0196\u0001\u0000"+
		"\u0000\u0000\u019b\u0197\u0001\u0000\u0000\u0000\u019b\u0198\u0001\u0000"+
		"\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019a\u0001\u0000"+
		"\u0000\u0000\u019c\u01a3\u0001\u0000\u0000\u0000\u019d\u019e\n\u0007\u0000"+
		"\u0000\u019e\u01a2\u0005J\u0000\u0000\u019f\u01a0\n\u0006\u0000\u0000"+
		"\u01a0\u01a2\u0005K\u0000\u0000\u01a1\u019d\u0001\u0000\u0000\u0000\u01a1"+
		"\u019f\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4"+
		"=\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a8"+
		"\u0005\u0015\u0000\u0000\u01a7\u01a9\u0003<\u001e\u0000\u01a8\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9?\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0006 \uffff\uffff\u0000\u01ab\u01af\u0005O\u0000"+
		"\u0000\u01ac\u01af\u0005N\u0000\u0000\u01ad\u01af\u0003B!\u0000\u01ae"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae"+
		"\u01ad\u0001\u0000\u0000\u0000\u01af\u01b6\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b1\n\u0004\u0000\u0000\u01b1\u01b2\u0003F#\u0000\u01b2\u01b3\u0003"+
		"@ \u0005\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7A\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bb\u0005P\u0000\u0000\u01ba"+
		"\u01bc\u0003D\"\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bcC\u0001\u0000\u0000\u0000\u01bd\u01be\u0005"+
		"\u0003\u0000\u0000\u01be\u01bf\u0003<\u001e\u0000\u01bf\u01c0\u0005\u0004"+
		"\u0000\u0000\u01c0E\u0001\u0000\u0000\u0000\u01c1\u01c2\u0007\u0003\u0000"+
		"\u0000\u01c2G\u0001\u0000\u0000\u0000\u01c3\u01c4\u0003B!\u0000\u01c4"+
		"\u01c5\u0005\u0001\u0000\u0000\u01c5\u01c6\u0003J%\u0000\u01c6\u01c7\u0005"+
		"\u0002\u0000\u0000\u01c7I\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005\u0005"+
		"\u0000\u0000\u01c9\u01ca\u00051\u0000\u0000\u01ca\u01cb\u0005\f\u0000"+
		"\u0000\u01cb\u01cc\u0005N\u0000\u0000\u01cc\u01cd\u0005\n\u0000\u0000"+
		"\u01cd\u01ce\u00052\u0000\u0000\u01ce\u01cf\u0005\f\u0000\u0000\u01cf"+
		"\u01d0\u0003N\'\u0000\u01d0\u01d1\u0005\u0006\u0000\u0000\u01d1K\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0005\u0014\u0000\u0000\u01d3\u01d4\u0003"+
		"v;\u0000\u01d4\u01d5\u0003\u0004\u0002\u0000\u01d5M\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d8\u0003V+\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d8"+
		"\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0001\u0000\u0000\u0000\u01daO\u0001\u0000\u0000\u0000\u01db\u01d9"+
		"\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005P\u0000\u0000\u01ddQ\u0001\u0000"+
		"\u0000\u0000\u01de\u01e3\u0003B!\u0000\u01df\u01e0\u0005\r\u0000\u0000"+
		"\u01e0\u01e2\u0003B!\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e4S\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e9\u0003R)\u0000\u01e7\u01e9\u0003B!\u0000"+
		"\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e9U\u0001\u0000\u0000\u0000\u01ea\u01f3\u0003X,\u0000\u01eb\u01f3"+
		"\u0003P(\u0000\u01ec\u01ed\u0005\u0005\u0000\u0000\u01ed\u01ee\u0005\u0005"+
		"\u0000\u0000\u01ee\u01ef\u0003T*\u0000\u01ef\u01f0\u0005\u0006\u0000\u0000"+
		"\u01f0\u01f1\u0005\u0006\u0000\u0000\u01f1\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f2\u01ea\u0001\u0000\u0000\u0000\u01f2\u01eb\u0001\u0000\u0000\u0000"+
		"\u01f2\u01ec\u0001\u0000\u0000\u0000\u01f3W\u0001\u0000\u0000\u0000\u01f4"+
		"\u01ff\u0003^/\u0000\u01f5\u01f9\u0003\\.\u0000\u01f6\u01f8\u0003V+\u0000"+
		"\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000"+
		"\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fc\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0003`0\u0000\u01fd\u01ff\u0001\u0000\u0000\u0000\u01fe\u01f4"+
		"\u0001\u0000\u0000\u0000\u01fe\u01f5\u0001\u0000\u0000\u0000\u01ffY\u0001"+
		"\u0000\u0000\u0000\u0200\u0201\u0005P\u0000\u0000\u0201[\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0005\u0007\u0000\u0000\u0203\u0205\u0003Z-\u0000\u0204"+
		"\u0206\u0003b1\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001"+
		"\u0000\u0000\u0000\u0206\u020c\u0001\u0000\u0000\u0000\u0207\u020b\u0003"+
		"n7\u0000\u0208\u020b\u0003h4\u0000\u0209\u020b\u0003r9\u0000\u020a\u0207"+
		"\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u0209"+
		"\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c\u020a"+
		"\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020f"+
		"\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0210"+
		"\u0005\b\u0000\u0000\u0210]\u0001\u0000\u0000\u0000\u0211\u0212\u0005"+
		"\u0007\u0000\u0000\u0212\u0218\u0005P\u0000\u0000\u0213\u0217\u0003n7"+
		"\u0000\u0214\u0217\u0003h4\u0000\u0215\u0217\u0003r9\u0000\u0216\u0213"+
		"\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0216\u0215"+
		"\u0001\u0000\u0000\u0000\u0217\u021a\u0001\u0000\u0000\u0000\u0218\u0216"+
		"\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021b"+
		"\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\u0005\t\u0000\u0000\u021c\u021d\u0005\b\u0000\u0000\u021d_\u0001\u0000"+
		"\u0000\u0000\u021e\u021f\u0005\u0007\u0000\u0000\u021f\u0220\u0005\t\u0000"+
		"\u0000\u0220\u0221\u0003Z-\u0000\u0221\u0222\u0005\b\u0000\u0000\u0222"+
		"a\u0001\u0000\u0000\u0000\u0223\u0226\u0003d2\u0000\u0224\u0226\u0003"+
		"f3\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0224\u0001\u0000\u0000"+
		"\u0000\u0226c\u0001\u0000\u0000\u0000\u0227\u0228\u0005)\u0000\u0000\u0228"+
		"\u0229\u0005\u000e\u0000\u0000\u0229\u022a\u0005!\u0000\u0000\u022a\u022b"+
		"\u0003B!\u0000\u022b\u022c\u00053\u0000\u0000\u022c\u022d\u0003B!\u0000"+
		"\u022de\u0001\u0000\u0000\u0000\u022e\u022f\u0005*\u0000\u0000\u022f\u0232"+
		"\u0005\u000e\u0000\u0000\u0230\u0233\u0003B!\u0000\u0231\u0233\u0003$"+
		"\u0012\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0231\u0001\u0000"+
		"\u0000\u0000\u0233g\u0001\u0000\u0000\u0000\u0234\u0235\u0003j5\u0000"+
		"\u0235\u0236\u0005\u000e\u0000\u0000\u0236\u0237\u0003l6\u0000\u0237i"+
		"\u0001\u0000\u0000\u0000\u0238\u0239\u0005P\u0000\u0000\u0239k\u0001\u0000"+
		"\u0000\u0000\u023a\u023d\u0005N\u0000\u0000\u023b\u023d\u0003R)\u0000"+
		"\u023c\u023a\u0001\u0000\u0000\u0000\u023c\u023b\u0001\u0000\u0000\u0000"+
		"\u023dm\u0001\u0000\u0000\u0000\u023e\u023f\u0005\u0003\u0000\u0000\u023f"+
		"\u0240\u0003j5\u0000\u0240\u0241\u0005\u0004\u0000\u0000\u0241\u0242\u0005"+
		"\u000e\u0000\u0000\u0242\u0243\u0003R)\u0000\u0243o\u0001\u0000\u0000"+
		"\u0000\u0244\u0245\u0005P\u0000\u0000\u0245q\u0001\u0000\u0000\u0000\u0246"+
		"\u0247\u0005\u0001\u0000\u0000\u0247\u0248\u0003p8\u0000\u0248\u0249\u0005"+
		"\u0002\u0000\u0000\u0249\u024c\u0005\u000e\u0000\u0000\u024a\u024d\u0003"+
		"t:\u0000\u024b\u024d\u0003R)\u0000\u024c\u024a\u0001\u0000\u0000\u0000"+
		"\u024c\u024b\u0001\u0000\u0000\u0000\u024ds\u0001\u0000\u0000\u0000\u024e"+
		"\u0252\u0003R)\u0000\u024f\u0252\u00050\u0000\u0000\u0250\u0252\u0005"+
		"4\u0000\u0000\u0251\u024e\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000"+
		"\u0000\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000"+
		"\u0000\u0000\u0253\u025c\u0005\u0001\u0000\u0000\u0254\u0259\u0003<\u001e"+
		"\u0000\u0255\u0256\u0005\n\u0000\u0000\u0256\u0258\u0003<\u001e\u0000"+
		"\u0257\u0255\u0001\u0000\u0000\u0000\u0258\u025b\u0001\u0000\u0000\u0000"+
		"\u0259\u0257\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000"+
		"\u025a\u025d\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000"+
		"\u025c\u0254\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0005\u0002\u0000\u0000"+
		"\u025fu\u0001\u0000\u0000\u0000\u0260\u0262\u0005\u0001\u0000\u0000\u0261"+
		"\u0263\u0003x<\u0000\u0262\u0261\u0001\u0000\u0000\u0000\u0262\u0263\u0001"+
		"\u0000\u0000\u0000\u0263\u026c\u0001\u0000\u0000\u0000\u0264\u0266\u0005"+
		"\n\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000"+
		"\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000"+
		"\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026b\u0003x<\u0000"+
		"\u026a\u0265\u0001\u0000\u0000\u0000\u026b\u026e\u0001\u0000\u0000\u0000"+
		"\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000"+
		"\u026d\u026f\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000"+
		"\u026f\u0270\u0005\u0002\u0000\u0000\u0270w\u0001\u0000\u0000\u0000\u0271"+
		"\u0272\u0003z=\u0000\u0272\u0273\u0003B!\u0000\u0273\u0274\u0005\f\u0000"+
		"\u0000\u0274\u0275\u0003\u000e\u0007\u0000\u0275y\u0001\u0000\u0000\u0000"+
		"\u0276\u027a\u0005\u001d\u0000\u0000\u0277\u027a\u0005\u001e\u0000\u0000"+
		"\u0278\u027a\u0005\u001f\u0000\u0000\u0279\u0276\u0001\u0000\u0000\u0000"+
		"\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000"+
		"\u027a{\u0001\u0000\u0000\u0000\u027b\u027c\u0005\'\u0000\u0000\u027c"+
		"\u027d\u0005\r\u0000\u0000\u027d\u027e\u0005(\u0000\u0000\u027e\u027f"+
		"\u0005\u0001\u0000\u0000\u027f\u0280\u0003<\u001e\u0000\u0280\u0281\u0005"+
		"\u0002\u0000\u0000\u0281}\u0001\u0000\u0000\u0000\u0282\u0283\u0005+\u0000"+
		"\u0000\u0283\u0284\u0003B!\u0000\u0284\u0285\u0005\u0005\u0000\u0000\u0285"+
		"\u0286\u0003\u0080@\u0000\u0286\u0287\u0005\u0006\u0000\u0000\u0287\u007f"+
		"\u0001\u0000\u0000\u0000\u0288\u028a\u0003\u0082A\u0000\u0289\u028b\u0003"+
		"\u0086C\u0000\u028a\u0289\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000"+
		"\u0000\u0000\u028b\u028d\u0001\u0000\u0000\u0000\u028c\u028e\u0003\u008a"+
		"E\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000"+
		"\u0000\u028e\u0290\u0001\u0000\u0000\u0000\u028f\u0291\u0003\u008eG\u0000"+
		"\u0290\u028f\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000"+
		"\u0291\u0081\u0001\u0000\u0000\u0000\u0292\u0293\u0005,\u0000\u0000\u0293"+
		"\u0294\u0005\u0005\u0000\u0000\u0294\u0299\u0003\u0084B\u0000\u0295\u0296"+
		"\u0005\n\u0000\u0000\u0296\u0298\u0003\u0084B\u0000\u0297\u0295\u0001"+
		"\u0000\u0000\u0000\u0298\u029b\u0001\u0000\u0000\u0000\u0299\u0297\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029c\u0001"+
		"\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029c\u029d\u0005"+
		"\u0006\u0000\u0000\u029d\u0083\u0001\u0000\u0000\u0000\u029e\u029f\u0003"+
		"B!\u0000\u029f\u02a2\u0007\u0004\u0000\u0000\u02a0\u02a3\u0003$\u0012"+
		"\u0000\u02a1\u02a3\u0003<\u001e\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a1\u0001\u0000\u0000\u0000\u02a3\u0085\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a5\u0005-\u0000\u0000\u02a5\u02a9\u0005\u0005\u0000\u0000\u02a6"+
		"\u02a8\u0003\u0088D\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a8\u02ab"+
		"\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa"+
		"\u0001\u0000\u0000\u0000\u02aa\u02ac\u0001\u0000\u0000\u0000\u02ab\u02a9"+
		"\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005\u0006\u0000\u0000\u02ad\u0087"+
		"\u0001\u0000\u0000\u0000\u02ae\u02af\u0003B!\u0000\u02af\u02b0\u0005\u000e"+
		"\u0000\u0000\u02b0\u02b2\u0003*\u0015\u0000\u02b1\u02b3\u0005\u000b\u0000"+
		"\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b3\u0089\u0001\u0000\u0000\u0000\u02b4\u02b5\u0005.\u0000\u0000"+
		"\u02b5\u02b9\u0005\u0005\u0000\u0000\u02b6\u02b8\u0003\u008cF\u0000\u02b7"+
		"\u02b6\u0001\u0000\u0000\u0000\u02b8\u02bb\u0001\u0000\u0000\u0000\u02b9"+
		"\u02b7\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bc\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bc"+
		"\u02bd\u0005\u0006\u0000\u0000\u02bd\u008b\u0001\u0000\u0000\u0000\u02be"+
		"\u02bf\u0003B!\u0000\u02bf\u02c0\u0005\f\u0000\u0000\u02c0\u02c2\u0003"+
		"*\u0015\u0000\u02c1\u02c3\u0005\u000b\u0000\u0000\u02c2\u02c1\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u008d\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c5\u0005/\u0000\u0000\u02c5\u02c7\u0005\u0005\u0000"+
		"\u0000\u02c6\u02c8\u0003\u0090H\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000"+
		"\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000"+
		"\u02cb\u02cc\u0005\u0006\u0000\u0000\u02cc\u008f\u0001\u0000\u0000\u0000"+
		"\u02cd\u02ce\u0003B!\u0000\u02ce\u02cf\u0005\u000e\u0000\u0000\u02cf\u02d1"+
		"\u0003*\u0015\u0000\u02d0\u02d2\u0005\u000b\u0000\u0000\u02d1\u02d0\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u0091\u0001"+
		"\u0000\u0000\u0000N\u0095\u009b\u00a0\u00a8\u00b5\u00b8\u00be\u00c6\u00cb"+
		"\u00d3\u00d8\u00df\u00e4\u00ed\u00f2\u00f7\u00fd\u0104\u010a\u0116\u011b"+
		"\u0120\u0125\u012d\u012f\u0137\u013b\u0147\u014b\u0150\u0155\u015f\u0167"+
		"\u0171\u0175\u0179\u0180\u018d\u019b\u01a1\u01a3\u01a8\u01ae\u01b6\u01bb"+
		"\u01d9\u01e3\u01e8\u01f2\u01f9\u01fe\u0205\u020a\u020c\u0216\u0218\u0225"+
		"\u0232\u023c\u024c\u0251\u0259\u025c\u0262\u0267\u026c\u0279\u028a\u028d"+
		"\u0290\u0299\u02a2\u02a9\u02b2\u02b9\u02c2\u02c9\u02d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}