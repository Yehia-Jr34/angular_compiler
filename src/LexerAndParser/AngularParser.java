// Generated from D:/F.I.T.E/Fifth Year/S2/Compiler/Last_Angular_Compiler/src/LexerAndParser/AngularParser.g4 by ANTLR 4.13.2
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
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OpenParen=1, CloseParen=2, OpenBracket=3, CloseBracket=4, OpenBrace=5, 
		CloseBrace=6, LessThan=7, MoreThan=8, Divide=9, Comma=10, SemiColon=11, 
		Colon=12, Dot=13, Assign=14, Arrow=15, DoubleQuote=16, SingleQuote=17, 
		Backtick=18, Import=19, From=20, Export=21, Class=22, Constructor=23, 
		Return=24, If=25, Else=26, For=27, While=28, Do=29, Break=30, Continue=31, 
		Public=32, Private=33, Protected=34, Var=35, Let=36, Const=37, Number=38, 
		String=39, Boolean=40, Any=41, Console=42, Log=43, NgFor=44, NgIf=45, 
		Store=46, State=47, Actions=48, Reducer=49, Selectors=50, Select=51, Selector=52, 
		Template=53, Of=54, Dispatch=55, On=56, Styles=57, Component=58, CssColor=59, 
		CssUnit=60, MultiplyAssign=61, DivideAssign=62, ModulusAssign=63, PlusAssign=64, 
		MinusAssign=65, IdentityEquals=66, IdentityNotEquals=67, Equals_=68, NotEquals=69, 
		LessThanEquals=70, GreaterThanEquals=71, BitAnd=72, BitXOr=73, BitOr=74, 
		Multiply=75, Plus=76, Minus=77, Modulus=78, And=79, Or=80, PlusPlus=81, 
		MinusMinus=82, NullLiteral=83, HexLiteral=84, HexColorLiteral=85, BooleanLiteral=86, 
		StringLiteral=87, DecimalLiteral=88, Identifier=89, WS=90, LineComment=91, 
		BlockComment=92;
	public static final int
		RULE_prog = 0, RULE_importStatement = 1, RULE_storeDecl = 2, RULE_storeBody = 3, 
		RULE_stateSection = 4, RULE_storeStateField = 5, RULE_actionsSection = 6, 
		RULE_actionDecl = 7, RULE_reducerSection = 8, RULE_reducerRule = 9, RULE_selectorsSection = 10, 
		RULE_selectorDecl = 11, RULE_componentDecorator = 12, RULE_compoenentObject = 13, 
		RULE_statement = 14, RULE_block = 15, RULE_loops = 16, RULE_if = 17, RULE_for = 18, 
		RULE_forParameters = 19, RULE_while = 20, RULE_do = 21, RULE_consoleLog = 22, 
		RULE_decl = 23, RULE_variableDecl = 24, RULE_variableTypeDecl = 25, RULE_dataTypes = 26, 
		RULE_initialize = 27, RULE_expr = 28, RULE_return = 29, RULE_arithmeticExpr = 30, 
		RULE_operartor = 31, RULE_identifier_ = 32, RULE_arrayIndex = 33, RULE_anyLiteral = 34, 
		RULE_arrayLiteral = 35, RULE_arrayList = 36, RULE_arrayElement = 37, RULE_objectLiteral = 38, 
		RULE_objectBody = 39, RULE_objectKeyValue = 40, RULE_functionDecl = 41, 
		RULE_normalFunctionDecleration = 42, RULE_arrowFunctionDecleration = 43, 
		RULE_functionBody = 44, RULE_functionParameters = 45, RULE_variableFunctionSingleArgument = 46, 
		RULE_constructor = 47, RULE_injectableFunctionParameters = 48, RULE_injectableVariableFunctionSingleArgument = 49, 
		RULE_accessModifires = 50, RULE_html = 51, RULE_htmlContent = 52, RULE_interpolationValue = 53, 
		RULE_identifierPath = 54, RULE_htmlElement = 55, RULE_htmlTag = 56, RULE_openTag = 57, 
		RULE_selfClosingTag = 58, RULE_closeTag = 59, RULE_structuralDirectives = 60, 
		RULE_forDirective = 61, RULE_ifDirective = 62, RULE_attribute = 63, RULE_attributeName = 64, 
		RULE_attributeValue = 65, RULE_boundAttribute = 66, RULE_eventName = 67, 
		RULE_eventBinding = 68, RULE_functionCall = 69, RULE_styles = 70, RULE_stringArray = 71, 
		RULE_cssValue = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "importStatement", "storeDecl", "storeBody", "stateSection", 
			"storeStateField", "actionsSection", "actionDecl", "reducerSection", 
			"reducerRule", "selectorsSection", "selectorDecl", "componentDecorator", 
			"compoenentObject", "statement", "block", "loops", "if", "for", "forParameters", 
			"while", "do", "consoleLog", "decl", "variableDecl", "variableTypeDecl", 
			"dataTypes", "initialize", "expr", "return", "arithmeticExpr", "operartor", 
			"identifier_", "arrayIndex", "anyLiteral", "arrayLiteral", "arrayList", 
			"arrayElement", "objectLiteral", "objectBody", "objectKeyValue", "functionDecl", 
			"normalFunctionDecleration", "arrowFunctionDecleration", "functionBody", 
			"functionParameters", "variableFunctionSingleArgument", "constructor", 
			"injectableFunctionParameters", "injectableVariableFunctionSingleArgument", 
			"accessModifires", "html", "htmlContent", "interpolationValue", "identifierPath", 
			"htmlElement", "htmlTag", "openTag", "selfClosingTag", "closeTag", "structuralDirectives", 
			"forDirective", "ifDirective", "attribute", "attributeName", "attributeValue", 
			"boundAttribute", "eventName", "eventBinding", "functionCall", "styles", 
			"stringArray", "cssValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", null, null, null, "','", 
			"';'", "':'", "'.'", "'='", "'=>'", "'\"'", "'''", "'`'", "'import'", 
			"'from'", "'export'", "'class'", "'constructor'", "'return'", "'if'", 
			"'else'", "'for'", "'while'", "'do'", "'break'", "'continue'", "'public'", 
			"'private'", "'protected'", "'var'", "'let'", "'const'", "'number'", 
			"'string'", "'boolean'", "'any'", "'console'", "'log'", "'*ngFor'", "'*ngIf'", 
			"'store'", "'state'", "'actions'", "'reducer'", "'selectors'", "'select'", 
			"'selector'", "'template'", "'of'", "'dispatch'", "'on'", "'styles'", 
			"'@Component'", null, null, "'*='", "'/='", "'%='", "'+='", "'-='", "'==='", 
			"'!=='", "'=='", "'!='", "'<='", "'>='", "'&'", "'^'", "'|'", "'*'", 
			"'+'", "'-'", "'%'", "'&&'", "'||'", "'++'", "'--'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OpenParen", "CloseParen", "OpenBracket", "CloseBracket", "OpenBrace", 
			"CloseBrace", "LessThan", "MoreThan", "Divide", "Comma", "SemiColon", 
			"Colon", "Dot", "Assign", "Arrow", "DoubleQuote", "SingleQuote", "Backtick", 
			"Import", "From", "Export", "Class", "Constructor", "Return", "If", "Else", 
			"For", "While", "Do", "Break", "Continue", "Public", "Private", "Protected", 
			"Var", "Let", "Const", "Number", "String", "Boolean", "Any", "Console", 
			"Log", "NgFor", "NgIf", "Store", "State", "Actions", "Reducer", "Selectors", 
			"Select", "Selector", "Template", "Of", "Dispatch", "On", "Styles", "Component", 
			"CssColor", "CssUnit", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
			"PlusAssign", "MinusAssign", "IdentityEquals", "IdentityNotEquals", "Equals_", 
			"NotEquals", "LessThanEquals", "GreaterThanEquals", "BitAnd", "BitXOr", 
			"BitOr", "Multiply", "Plus", "Minus", "Modulus", "And", "Or", "PlusPlus", 
			"MinusMinus", "NullLiteral", "HexLiteral", "HexColorLiteral", "BooleanLiteral", 
			"StringLiteral", "DecimalLiteral", "Identifier", "WS", "LineComment", 
			"BlockComment"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ComponentDecoratorContext componentDecorator() {
			return getRuleContext(ComponentDecoratorContext.class,0);
		}
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<StoreDeclContext> storeDecl() {
			return getRuleContexts(StoreDeclContext.class);
		}
		public StoreDeclContext storeDecl(int i) {
			return getRuleContext(StoreDeclContext.class,i);
		}
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProg(this);
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
				importStatement();
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38285239616798762L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(AngularParser.Import, 0); }
		public TerminalNode From() { return getToken(AngularParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(Import);
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				{
				{
				setState(175);
				match(OpenBrace);
				setState(176);
				identifier_();
				setState(177);
				match(CloseBrace);
				}
				}
				break;
			case Identifier:
				{
				setState(179);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			match(From);
			setState(183);
			match(StringLiteral);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(184);
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
	public static class StoreDeclContext extends ParserRuleContext {
		public TerminalNode Store() { return getToken(AngularParser.Store, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public StoreBodyContext storeBody() {
			return getRuleContext(StoreBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public StoreDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreDeclContext storeDecl() throws RecognitionException {
		StoreDeclContext _localctx = new StoreDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_storeDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(Store);
			setState(188);
			identifier_();
			setState(189);
			match(OpenBrace);
			setState(190);
			storeBody();
			setState(191);
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreBodyContext storeBody() throws RecognitionException {
		StoreBodyContext _localctx = new StoreBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_storeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			stateSection();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Actions) {
				{
				setState(194);
				actionsSection();
				}
			}

			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Reducer) {
				{
				setState(197);
				reducerSection();
				}
			}

			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Selectors) {
				{
				setState(200);
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
		public TerminalNode State() { return getToken(AngularParser.State, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public List<StoreStateFieldContext> storeStateField() {
			return getRuleContexts(StoreStateFieldContext.class);
		}
		public StoreStateFieldContext storeStateField(int i) {
			return getRuleContext(StoreStateFieldContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public StateSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStateSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStateSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStateSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateSectionContext stateSection() throws RecognitionException {
		StateSectionContext _localctx = new StateSectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stateSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(State);
			setState(204);
			match(OpenBrace);
			setState(205);
			storeStateField();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(206);
				match(Comma);
				setState(207);
				storeStateField();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
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
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreStateField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreStateField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreStateField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreStateFieldContext storeStateField() throws RecognitionException {
		StoreStateFieldContext _localctx = new StoreStateFieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_storeStateField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			identifier_();
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==Colon || _la==Assign) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(217);
				anyLiteral();
				}
				break;
			case 2:
				{
				setState(218);
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
		public TerminalNode Actions() { return getToken(AngularParser.Actions, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterActionsSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitActionsSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitActionsSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionsSectionContext actionsSection() throws RecognitionException {
		ActionsSectionContext _localctx = new ActionsSectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_actionsSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(Actions);
			setState(222);
			match(OpenBrace);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(223);
				actionDecl();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
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
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public ArrowFunctionDeclerationContext arrowFunctionDecleration() {
			return getRuleContext(ArrowFunctionDeclerationContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public ActionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterActionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitActionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitActionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionDeclContext actionDecl() throws RecognitionException {
		ActionDeclContext _localctx = new ActionDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_actionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			identifier_();
			setState(232);
			match(Assign);
			setState(233);
			arrowFunctionDecleration();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(234);
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
		public TerminalNode Reducer() { return getToken(AngularParser.Reducer, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReducerSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReducerSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReducerSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReducerSectionContext reducerSection() throws RecognitionException {
		ReducerSectionContext _localctx = new ReducerSectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_reducerSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(Reducer);
			setState(238);
			match(OpenBrace);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(239);
				reducerRule();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ArrowFunctionDeclerationContext arrowFunctionDecleration() {
			return getRuleContext(ArrowFunctionDeclerationContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public ReducerRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reducerRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReducerRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReducerRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReducerRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReducerRuleContext reducerRule() throws RecognitionException {
		ReducerRuleContext _localctx = new ReducerRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reducerRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			identifier_();
			setState(248);
			match(Colon);
			setState(249);
			arrowFunctionDecleration();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(250);
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
		public TerminalNode Selectors() { return getToken(AngularParser.Selectors, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorsSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorsSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorsSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorsSectionContext selectorsSection() throws RecognitionException {
		SelectorsSectionContext _localctx = new SelectorsSectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectorsSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(Selectors);
			setState(254);
			match(OpenBrace);
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(255);
				selectorDecl();
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(260);
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
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public ArrowFunctionDeclerationContext arrowFunctionDecleration() {
			return getRuleContext(ArrowFunctionDeclerationContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public SelectorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorDeclContext selectorDecl() throws RecognitionException {
		SelectorDeclContext _localctx = new SelectorDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			identifier_();
			setState(263);
			match(Assign);
			setState(264);
			arrowFunctionDecleration();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(265);
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
	public static class ComponentDecoratorContext extends ParserRuleContext {
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public CompoenentObjectContext compoenentObject() {
			return getRuleContext(CompoenentObjectContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ComponentDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDecorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDecoratorContext componentDecorator() throws RecognitionException {
		ComponentDecoratorContext _localctx = new ComponentDecoratorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_componentDecorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(Component);
			setState(269);
			match(OpenParen);
			setState(270);
			compoenentObject();
			setState(271);
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
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode Selector() { return getToken(AngularParser.Selector, 0); }
		public List<TerminalNode> Colon() { return getTokens(AngularParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(AngularParser.Colon, i);
		}
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public TerminalNode Template() { return getToken(AngularParser.Template, 0); }
		public List<TerminalNode> Backtick() { return getTokens(AngularParser.Backtick); }
		public TerminalNode Backtick(int i) {
			return getToken(AngularParser.Backtick, i);
		}
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode Styles() { return getToken(AngularParser.Styles, 0); }
		public StylesContext styles() {
			return getRuleContext(StylesContext.class,0);
		}
		public CompoenentObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoenentObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCompoenentObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCompoenentObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCompoenentObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoenentObjectContext compoenentObject() throws RecognitionException {
		CompoenentObjectContext _localctx = new CompoenentObjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compoenentObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(OpenBrace);
			setState(274);
			match(Selector);
			setState(275);
			match(Colon);
			setState(276);
			match(StringLiteral);
			setState(277);
			match(Comma);
			setState(278);
			match(Template);
			setState(279);
			match(Colon);
			setState(280);
			match(Backtick);
			setState(281);
			html();
			setState(282);
			match(Backtick);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(283);
				match(Comma);
				setState(284);
				match(Styles);
				setState(285);
				match(Colon);
				setState(286);
				match(Backtick);
				setState(287);
				styles();
				setState(288);
				match(Backtick);
				}
			}

			setState(292);
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
	public static class StatementContext extends ParserRuleContext {
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
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(294);
				block();
				}
				break;
			case 2:
				{
				setState(295);
				decl();
				}
				break;
			case 3:
				{
				setState(296);
				expr(0);
				}
				break;
			case 4:
				{
				setState(297);
				loops();
				}
				break;
			case 5:
				{
				setState(298);
				if_();
				}
				break;
			case 6:
				{
				setState(299);
				constructor();
				}
				break;
			case 7:
				{
				setState(300);
				consoleLog();
				}
				break;
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(303);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(OpenBrace);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38285239616798762L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
				{
				{
				setState(307);
				statement();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLoops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLoops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case For:
				{
				setState(315);
				for_();
				}
				break;
			case While:
				{
				setState(316);
				while_();
				}
				break;
			case Do:
				{
				setState(317);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(AngularParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Else() { return getToken(AngularParser.Else, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(If);
			setState(321);
			match(OpenParen);
			setState(323); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(322);
				expr(0);
				}
				}
				setState(325); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 38280600070651946L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0) );
			setState(327);
			match(CloseParen);
			setState(328);
			block();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(329);
				match(Else);
				setState(330);
				block();
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(AngularParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ForParametersContext forParameters() {
			return getRuleContext(ForParametersContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(For);
			setState(334);
			match(OpenParen);
			setState(335);
			forParameters();
			setState(336);
			match(CloseParen);
			setState(337);
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
		public List<TerminalNode> SemiColon() { return getTokens(AngularParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(AngularParser.SemiColon, i);
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
		public ForParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForParametersContext forParameters() throws RecognitionException {
		ForParametersContext _localctx = new ForParametersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) {
				{
				setState(339);
				variableDecl();
				}
			}

			setState(342);
			match(SemiColon);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38280600070651946L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
				{
				setState(343);
				expr(0);
				}
			}

			setState(346);
			match(SemiColon);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38280600070651946L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
				{
				setState(347);
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
		public TerminalNode While() { return getToken(AngularParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(While);
			setState(351);
			match(OpenParen);
			setState(352);
			expr(0);
			setState(353);
			match(CloseParen);
			setState(354);
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
		public TerminalNode Do() { return getToken(AngularParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode While() { return getToken(AngularParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public DoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoContext do_() throws RecognitionException {
		DoContext _localctx = new DoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(Do);
			setState(357);
			block();
			setState(358);
			match(While);
			setState(359);
			match(OpenParen);
			setState(360);
			expr(0);
			setState(361);
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
	public static class ConsoleLogContext extends ParserRuleContext {
		public TerminalNode Console() { return getToken(AngularParser.Console, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Log() { return getToken(AngularParser.Log, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ConsoleLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consoleLog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConsoleLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConsoleLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConsoleLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsoleLogContext consoleLog() throws RecognitionException {
		ConsoleLogContext _localctx = new ConsoleLogContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_consoleLog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(Console);
			setState(364);
			match(Dot);
			setState(365);
			match(Log);
			setState(366);
			match(OpenParen);
			setState(367);
			expr(0);
			setState(368);
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
	public static class DeclContext extends ParserRuleContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public VariableTypeDeclContext variableTypeDecl() {
			return getRuleContext(VariableTypeDeclContext.class,0);
		}
		public NormalFunctionDeclerationContext normalFunctionDecleration() {
			return getRuleContext(NormalFunctionDeclerationContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_decl);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				variableDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				variableTypeDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
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
	public static class VariableDeclContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode Var() { return getToken(AngularParser.Var, 0); }
		public TerminalNode Let() { return getToken(AngularParser.Let, 0); }
		public TerminalNode Const() { return getToken(AngularParser.Const, 0); }
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(376);
			identifier_();
			setState(377);
			match(Assign);
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(378);
				anyLiteral();
				}
				break;
			case 2:
				{
				setState(379);
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
	public static class VariableTypeDeclContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public DataTypesContext dataTypes() {
			return getRuleContext(DataTypesContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public AnyLiteralContext anyLiteral() {
			return getRuleContext(AnyLiteralContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public VariableTypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableTypeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableTypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableTypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeDeclContext variableTypeDecl() throws RecognitionException {
		VariableTypeDeclContext _localctx = new VariableTypeDeclContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableTypeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			identifier_();
			setState(383);
			match(Colon);
			setState(384);
			dataTypes();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBracket) {
				{
				setState(385);
				match(OpenBracket);
				setState(386);
				match(CloseBracket);
				}
			}

			setState(389);
			match(Assign);
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(390);
				anyLiteral();
				}
				break;
			case 2:
				{
				setState(391);
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
		public TerminalNode Number() { return getToken(AngularParser.Number, 0); }
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public TerminalNode Boolean() { return getToken(AngularParser.Boolean, 0); }
		public TerminalNode Any() { return getToken(AngularParser.Any, 0); }
		public DataTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDataTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDataTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDataTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypesContext dataTypes() throws RecognitionException {
		DataTypesContext _localctx = new DataTypesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dataTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
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
	public static class InitializeContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AnyLiteralContext anyLiteral() {
			return getRuleContext(AnyLiteralContext.class,0);
		}
		public InitializeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInitialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInitialize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInitialize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializeContext initialize() throws RecognitionException {
		InitializeContext _localctx = new InitializeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_initialize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			identifier_();
			setState(397);
			match(Assign);
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(398);
				expr(0);
				}
				break;
			case 2:
				{
				setState(399);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ArrowFunctionDeclerationContext arrowFunctionDecleration() {
			return getRuleContext(ArrowFunctionDeclerationContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public InitializeContext initialize() {
			return getRuleContext(InitializeContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public TerminalNode Break() { return getToken(AngularParser.Break, 0); }
		public TerminalNode Continue() { return getToken(AngularParser.Continue, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(AngularParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(AngularParser.MinusMinus, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(403);
				functionCall();
				}
				break;
			case 2:
				{
				setState(404);
				arrayLiteral();
				}
				break;
			case 3:
				{
				setState(405);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(406);
				arrowFunctionDecleration();
				}
				break;
			case 5:
				{
				setState(407);
				match(StringLiteral);
				}
				break;
			case 6:
				{
				setState(408);
				arithmeticExpr(0);
				}
				break;
			case 7:
				{
				setState(409);
				initialize();
				}
				break;
			case 8:
				{
				setState(410);
				return_();
				}
				break;
			case 9:
				{
				setState(411);
				match(Break);
				}
				break;
			case 10:
				{
				setState(412);
				match(Continue);
				}
				break;
			case 11:
				{
				setState(413);
				identifier_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(420);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(416);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(417);
						match(PlusPlus);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(418);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(419);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public TerminalNode Return() { return getToken(AngularParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(Return);
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(426);
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
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public OperartorContext operartor() {
			return getRuleContext(OperartorContext.class,0);
		}
		public ArithmeticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArithmeticExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArithmeticExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArithmeticExpr(this);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_arithmeticExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecimalLiteral:
				{
				setState(430);
				match(DecimalLiteral);
				}
				break;
			case StringLiteral:
				{
				setState(431);
				match(StringLiteral);
				}
				break;
			case Identifier:
				{
				setState(432);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpr);
					setState(435);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(436);
					operartor();
					setState(437);
					arithmeticExpr(5);
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
	public static class OperartorContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public TerminalNode Plus() { return getToken(AngularParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(AngularParser.Minus, 0); }
		public TerminalNode MultiplyAssign() { return getToken(AngularParser.MultiplyAssign, 0); }
		public TerminalNode DivideAssign() { return getToken(AngularParser.DivideAssign, 0); }
		public TerminalNode ModulusAssign() { return getToken(AngularParser.ModulusAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(AngularParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(AngularParser.MinusAssign, 0); }
		public TerminalNode And() { return getToken(AngularParser.And, 0); }
		public TerminalNode Or() { return getToken(AngularParser.Or, 0); }
		public TerminalNode Equals_() { return getToken(AngularParser.Equals_, 0); }
		public TerminalNode NotEquals() { return getToken(AngularParser.NotEquals, 0); }
		public TerminalNode IdentityEquals() { return getToken(AngularParser.IdentityEquals, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(AngularParser.IdentityNotEquals, 0); }
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(AngularParser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(AngularParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(AngularParser.GreaterThanEquals, 0); }
		public TerminalNode BitAnd() { return getToken(AngularParser.BitAnd, 0); }
		public TerminalNode BitXOr() { return getToken(AngularParser.BitXOr, 0); }
		public TerminalNode BitOr() { return getToken(AngularParser.BitOr, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode Modulus() { return getToken(AngularParser.Modulus, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public OperartorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operartor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperartor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperartor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperartor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperartorContext operartor() throws RecognitionException {
		OperartorContext _localctx = new OperartorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operartor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -2305843009213668480L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 131071L) != 0)) ) {
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
	public static class Identifier_Context extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public Identifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifier_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifier_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifier_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_Context identifier_() throws RecognitionException {
		Identifier_Context _localctx = new Identifier_Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_identifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(Identifier);
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(447);
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
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(OpenBracket);
			setState(451);
			expr(0);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(452);
				match(Comma);
				setState(453);
				expr(0);
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
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
	public static class AnyLiteralContext extends ParserRuleContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AngularParser.BooleanLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(AngularParser.NullLiteral, 0); }
		public AnyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAnyLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAnyLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAnyLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyLiteralContext anyLiteral() throws RecognitionException {
		AnyLiteralContext _localctx = new AnyLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_anyLiteral);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				objectLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
				match(BooleanLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(465);
				match(DecimalLiteral);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(466);
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public ArrayListContext arrayList() {
			return getRuleContext(ArrayListContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(OpenBracket);
			setState(470);
			arrayList();
			setState(471);
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
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ArrayListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayListContext arrayList() throws RecognitionException {
		ArrayListContext _localctx = new ArrayListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrayList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38280600070651946L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 121L) != 0)) {
				{
				setState(473);
				arrayElement();
				}
			}

			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(476);
				match(Comma);
				setState(477);
				arrayElement();
				}
				}
				setState(482);
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
		public AnyLiteralContext anyLiteral() {
			return getRuleContext(AnyLiteralContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arrayElement);
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				anyLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
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
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public ObjectBodyContext objectBody() {
			return getRuleContext(ObjectBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_objectLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(OpenBrace);
			setState(489);
			objectBody();
			setState(490);
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
		public List<ObjectKeyValueContext> objectKeyValue() {
			return getRuleContexts(ObjectKeyValueContext.class);
		}
		public ObjectKeyValueContext objectKeyValue(int i) {
			return getRuleContext(ObjectKeyValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ObjectBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectBodyContext objectBody() throws RecognitionException {
		ObjectBodyContext _localctx = new ObjectBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_objectBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
				{
				setState(492);
				objectKeyValue();
				}
			}

			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(495);
				match(Comma);
				setState(496);
				objectKeyValue();
				}
				}
				setState(501);
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
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public ObjectKeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectKeyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectKeyValueContext objectKeyValue() throws RecognitionException {
		ObjectKeyValueContext _localctx = new ObjectKeyValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_objectKeyValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(503);
			match(Colon);
			setState(504);
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
	public static class FunctionDeclContext extends ParserRuleContext {
		public NormalFunctionDeclerationContext normalFunctionDecleration() {
			return getRuleContext(NormalFunctionDeclerationContext.class,0);
		}
		public ArrowFunctionDeclerationContext arrowFunctionDecleration() {
			return getRuleContext(ArrowFunctionDeclerationContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_functionDecl);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				normalFunctionDecleration();
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNormalFunctionDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNormalFunctionDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNormalFunctionDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFunctionDeclerationContext normalFunctionDecleration() throws RecognitionException {
		NormalFunctionDeclerationContext _localctx = new NormalFunctionDeclerationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_normalFunctionDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			identifier_();
			setState(511);
			functionParameters();
			setState(512);
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
		public TerminalNode Arrow() { return getToken(AngularParser.Arrow, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ArrowFunctionDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionDecleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionDeclerationContext arrowFunctionDecleration() throws RecognitionException {
		ArrowFunctionDeclerationContext _localctx = new ArrowFunctionDeclerationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrowFunctionDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			functionParameters();
			setState(515);
			match(Arrow);
			setState(516);
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
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
	public static class FunctionParametersContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<VariableFunctionSingleArgumentContext> variableFunctionSingleArgument() {
			return getRuleContexts(VariableFunctionSingleArgumentContext.class);
		}
		public VariableFunctionSingleArgumentContext variableFunctionSingleArgument(int i) {
			return getRuleContext(VariableFunctionSingleArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(OpenParen);
			{
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(521);
				variableFunctionSingleArgument();
				}
			}

			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(524);
				match(Comma);
				setState(525);
				variableFunctionSingleArgument();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(531);
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
	public static class VariableFunctionSingleArgumentContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public DataTypesContext dataTypes() {
			return getRuleContext(DataTypesContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public VariableFunctionSingleArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableFunctionSingleArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableFunctionSingleArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableFunctionSingleArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableFunctionSingleArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableFunctionSingleArgumentContext variableFunctionSingleArgument() throws RecognitionException {
		VariableFunctionSingleArgumentContext _localctx = new VariableFunctionSingleArgumentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variableFunctionSingleArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			identifier_();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(534);
				match(Colon);
				setState(535);
				dataTypes();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket) {
					{
					setState(536);
					match(OpenBracket);
					setState(537);
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
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode Constructor() { return getToken(AngularParser.Constructor, 0); }
		public InjectableFunctionParametersContext injectableFunctionParameters() {
			return getRuleContext(InjectableFunctionParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(Constructor);
			setState(543);
			injectableFunctionParameters();
			setState(544);
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
	public static class InjectableFunctionParametersContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<InjectableVariableFunctionSingleArgumentContext> injectableVariableFunctionSingleArgument() {
			return getRuleContexts(InjectableVariableFunctionSingleArgumentContext.class);
		}
		public InjectableVariableFunctionSingleArgumentContext injectableVariableFunctionSingleArgument(int i) {
			return getRuleContext(InjectableVariableFunctionSingleArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public InjectableFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableFunctionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInjectableFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInjectableFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInjectableFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableFunctionParametersContext injectableFunctionParameters() throws RecognitionException {
		InjectableFunctionParametersContext _localctx = new InjectableFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_injectableFunctionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(OpenParen);
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) {
					{
					setState(547);
					injectableVariableFunctionSingleArgument();
					}
				}

				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(551); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(550);
						match(Comma);
						}
						}
						setState(553); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(555);
					injectableVariableFunctionSingleArgument();
					}
					}
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(563);
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
		public AccessModifiresContext accessModifires() {
			return getRuleContext(AccessModifiresContext.class,0);
		}
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public DataTypesContext dataTypes() {
			return getRuleContext(DataTypesContext.class,0);
		}
		public InjectableVariableFunctionSingleArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableVariableFunctionSingleArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInjectableVariableFunctionSingleArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInjectableVariableFunctionSingleArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInjectableVariableFunctionSingleArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableVariableFunctionSingleArgumentContext injectableVariableFunctionSingleArgument() throws RecognitionException {
		InjectableVariableFunctionSingleArgumentContext _localctx = new InjectableVariableFunctionSingleArgumentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_injectableVariableFunctionSingleArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			accessModifires();
			setState(566);
			identifier_();
			setState(567);
			match(Colon);
			setState(568);
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
		public TerminalNode Public() { return getToken(AngularParser.Public, 0); }
		public TerminalNode Private() { return getToken(AngularParser.Private, 0); }
		public TerminalNode Protected() { return getToken(AngularParser.Protected, 0); }
		public AccessModifiresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifires; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAccessModifires(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAccessModifires(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAccessModifires(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifiresContext accessModifires() throws RecognitionException {
		AccessModifiresContext _localctx = new AccessModifiresContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_accessModifires);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
	public static class HtmlContext extends ParserRuleContext {
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_html);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenBrace || _la==LessThan || _la==Identifier) {
				{
				{
				setState(572);
				htmlContent();
				}
				}
				setState(577);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public List<TerminalNode> OpenBrace() { return getTokens(AngularParser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(AngularParser.OpenBrace, i);
		}
		public InterpolationValueContext interpolationValue() {
			return getRuleContext(InterpolationValueContext.class,0);
		}
		public List<TerminalNode> CloseBrace() { return getTokens(AngularParser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(AngularParser.CloseBrace, i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_htmlContent);
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LessThan:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				htmlElement();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(Identifier);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(580);
				match(OpenBrace);
				setState(581);
				match(OpenBrace);
				setState(582);
				interpolationValue();
				setState(583);
				match(CloseBrace);
				setState(584);
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolationValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolationValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolationValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationValueContext interpolationValue() throws RecognitionException {
		InterpolationValueContext _localctx = new InterpolationValueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_interpolationValue);
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				identifierPath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
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
	public static class IdentifierPathContext extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(AngularParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AngularParser.Dot, i);
		}
		public IdentifierPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierPathContext identifierPath() throws RecognitionException {
		IdentifierPathContext _localctx = new IdentifierPathContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_identifierPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			identifier_();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(593);
				match(Dot);
				setState(594);
				identifier_();
				}
				}
				setState(599);
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_htmlElement);
		try {
			int _alt;
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				selfClosingTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				openTag();
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(602);
						htmlContent();
						}
						} 
					}
					setState(607);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(608);
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
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public HtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagContext htmlTag() throws RecognitionException {
		HtmlTagContext _localctx = new HtmlTagContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_htmlTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
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
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public TerminalNode MoreThan() { return getToken(AngularParser.MoreThan, 0); }
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
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(LessThan);
			setState(615);
			htmlTag();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NgFor || _la==NgIf) {
				{
				setState(616);
				structuralDirectives();
				}
			}

			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenParen || _la==OpenBracket || _la==Identifier) {
				{
				setState(622);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
					{
					setState(619);
					boundAttribute();
					}
					break;
				case Identifier:
					{
					setState(620);
					attribute();
					}
					break;
				case OpenParen:
					{
					setState(621);
					eventBinding();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(627);
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
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public TerminalNode MoreThan() { return getToken(AngularParser.MoreThan, 0); }
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(LessThan);
			setState(630);
			match(Identifier);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenParen || _la==OpenBracket || _la==Identifier) {
				{
				setState(634);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
					{
					setState(631);
					boundAttribute();
					}
					break;
				case Identifier:
					{
					setState(632);
					attribute();
					}
					break;
				case OpenParen:
					{
					setState(633);
					eventBinding();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(639);
			match(Divide);
			setState(640);
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
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public TerminalNode MoreThan() { return getToken(AngularParser.MoreThan, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(LessThan);
			setState(643);
			match(Divide);
			setState(644);
			htmlTag();
			setState(645);
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
		public ForDirectiveContext forDirective() {
			return getRuleContext(ForDirectiveContext.class,0);
		}
		public IfDirectiveContext ifDirective() {
			return getRuleContext(IfDirectiveContext.class,0);
		}
		public StructuralDirectivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuralDirectives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStructuralDirectives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStructuralDirectives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStructuralDirectives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuralDirectivesContext structuralDirectives() throws RecognitionException {
		StructuralDirectivesContext _localctx = new StructuralDirectivesContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_structuralDirectives);
		try {
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NgFor:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				forDirective();
				}
				break;
			case NgIf:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
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
		public TerminalNode NgFor() { return getToken(AngularParser.NgFor, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode Let() { return getToken(AngularParser.Let, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode Of() { return getToken(AngularParser.Of, 0); }
		public ForDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDirectiveContext forDirective() throws RecognitionException {
		ForDirectiveContext _localctx = new ForDirectiveContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_forDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(NgFor);
			setState(652);
			match(Assign);
			setState(653);
			match(Let);
			setState(654);
			identifier_();
			setState(655);
			match(Of);
			setState(656);
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
		public TerminalNode NgIf() { return getToken(AngularParser.NgIf, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDirectiveContext ifDirective() throws RecognitionException {
		IfDirectiveContext _localctx = new IfDirectiveContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ifDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(NgIf);
			setState(659);
			match(Assign);
			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(660);
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
				setState(661);
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
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			attributeName();
			setState(665);
			match(Assign);
			setState(666);
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
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
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
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_attributeValue);
		try {
			setState(672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				match(StringLiteral);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
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
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public BoundAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBoundAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBoundAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBoundAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundAttributeContext boundAttribute() throws RecognitionException {
		BoundAttributeContext _localctx = new BoundAttributeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_boundAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(OpenBracket);
			setState(675);
			attributeName();
			setState(676);
			match(CloseBracket);
			setState(677);
			match(Assign);
			setState(678);
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
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public EventNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEventName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEventName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEventName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventNameContext eventName() throws RecognitionException {
		EventNameContext _localctx = new EventNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_eventName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
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
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public EventNameContext eventName() {
			return getRuleContext(EventNameContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventBindingContext eventBinding() throws RecognitionException {
		EventBindingContext _localctx = new EventBindingContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_eventBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(OpenParen);
			setState(683);
			eventName();
			setState(684);
			match(CloseParen);
			setState(685);
			match(Assign);
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(686);
				functionCall();
				}
				break;
			case 2:
				{
				setState(687);
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
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public TerminalNode Select() { return getToken(AngularParser.Select, 0); }
		public TerminalNode Dispatch() { return getToken(AngularParser.Dispatch, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(690);
				identifierPath();
				}
				break;
			case Select:
				{
				setState(691);
				match(Select);
				}
				break;
			case Dispatch:
				{
				setState(692);
				match(Dispatch);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(695);
			match(OpenParen);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38280600070651946L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
				{
				setState(696);
				expr(0);
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(697);
					match(Comma);
					setState(698);
					expr(0);
					}
					}
					setState(703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(706);
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
	public static class StylesContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public List<StringArrayContext> stringArray() {
			return getRuleContexts(StringArrayContext.class);
		}
		public StringArrayContext stringArray(int i) {
			return getRuleContext(StringArrayContext.class,i);
		}
		public StylesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesContext styles() throws RecognitionException {
		StylesContext _localctx = new StylesContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_styles);
		int _la;
		try {
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StringLiteral || _la==Identifier) {
					{
					{
					setState(709);
					stringArray();
					}
					}
					setState(714);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class StringArrayContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(AngularParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(AngularParser.Colon, i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(AngularParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(AngularParser.SemiColon, i);
		}
		public List<TerminalNode> CssColor() { return getTokens(AngularParser.CssColor); }
		public TerminalNode CssColor(int i) {
			return getToken(AngularParser.CssColor, i);
		}
		public List<TerminalNode> HexColorLiteral() { return getTokens(AngularParser.HexColorLiteral); }
		public TerminalNode HexColorLiteral(int i) {
			return getToken(AngularParser.HexColorLiteral, i);
		}
		public StringArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringArrayContext stringArray() throws RecognitionException {
		StringArrayContext _localctx = new StringArrayContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_stringArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(717);
				match(StringLiteral);
				}
				break;
			case Identifier:
				{
				setState(718);
				htmlTag();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(721);
			match(OpenBrace);
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(722);
				identifier_();
				setState(723);
				match(Colon);
				setState(724);
				_la = _input.LA(1);
				if ( !(_la==CssColor || _la==HexColorLiteral) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(725);
				match(SemiColon);
				}
				}
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(732);
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
	public static class CssValueContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public TerminalNode CssUnit() { return getToken(AngularParser.CssUnit, 0); }
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_cssValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(DecimalLiteral);
			setState(735);
			match(CssUnit);
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
		case 28:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 30:
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
		"\u0004\u0001\\\u02e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0003\u0001\u00b5\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u00ba\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00c4\b\u0003\u0001\u0003"+
		"\u0003\u0003\u00c7\b\u0003\u0001\u0003\u0003\u0003\u00ca\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00d1"+
		"\b\u0004\n\u0004\f\u0004\u00d4\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00dc\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00e1\b\u0006\n\u0006\f\u0006\u00e4"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00ec\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00f1"+
		"\b\b\n\b\f\b\u00f4\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0003\t\u00fc\b\t\u0001\n\u0001\n\u0001\n\u0004\n\u0101\b\n\u000b\n\f"+
		"\n\u0102\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u010b\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0123"+
		"\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u012e\b\u000e\u0001\u000e\u0003"+
		"\u000e\u0131\b\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u0135\b\u000f"+
		"\n\u000f\f\u000f\u0138\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u013f\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0004\u0011\u0144\b\u0011\u000b\u0011\f\u0011\u0145\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u014c\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0003\u0013\u0155\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0159\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u015d\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0176\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u017d"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0184\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0189"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0191\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u019f\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01a5\b\u001c\n\u001c\f\u001c"+
		"\u01a8\t\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u01ac\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01b2\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01b8\b\u001e\n"+
		"\u001e\f\u001e\u01bb\t\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003"+
		" \u01c1\b \u0001!\u0001!\u0001!\u0001!\u0005!\u01c7\b!\n!\f!\u01ca\t!"+
		"\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\""+
		"\u01d4\b\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0003$\u01db\b$\u0001$\u0001"+
		"$\u0005$\u01df\b$\n$\f$\u01e2\t$\u0001%\u0001%\u0001%\u0003%\u01e7\b%"+
		"\u0001&\u0001&\u0001&\u0001&\u0001\'\u0003\'\u01ee\b\'\u0001\'\u0001\'"+
		"\u0005\'\u01f2\b\'\n\'\f\'\u01f5\t\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0003)\u01fd\b)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001-\u0001-\u0003-\u020b\b-\u0001-\u0001-\u0005"+
		"-\u020f\b-\n-\f-\u0212\t-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u021b\b.\u0003.\u021d\b.\u0001/\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00030\u0225\b0\u00010\u00040\u0228\b0\u000b0\f0\u0229\u00010\u0005"+
		"0\u022d\b0\n0\f0\u0230\t0\u00030\u0232\b0\u00010\u00010\u00011\u00011"+
		"\u00011\u00011\u00011\u00012\u00012\u00013\u00053\u023e\b3\n3\f3\u0241"+
		"\t3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u024b"+
		"\b4\u00015\u00015\u00035\u024f\b5\u00016\u00016\u00016\u00056\u0254\b"+
		"6\n6\f6\u0257\t6\u00017\u00017\u00017\u00057\u025c\b7\n7\f7\u025f\t7\u0001"+
		"7\u00017\u00037\u0263\b7\u00018\u00018\u00019\u00019\u00019\u00039\u026a"+
		"\b9\u00019\u00019\u00019\u00059\u026f\b9\n9\f9\u0272\t9\u00019\u00019"+
		"\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u027b\b:\n:\f:\u027e\t:\u0001"+
		":\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0003"+
		"<\u028a\b<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001"+
		">\u0001>\u0001>\u0003>\u0297\b>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001A\u0001A\u0003A\u02a1\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u02b1"+
		"\bD\u0001E\u0001E\u0001E\u0003E\u02b6\bE\u0001E\u0001E\u0001E\u0001E\u0005"+
		"E\u02bc\bE\nE\fE\u02bf\tE\u0003E\u02c1\bE\u0001E\u0001E\u0001F\u0001F"+
		"\u0005F\u02c7\bF\nF\fF\u02ca\tF\u0003F\u02cc\bF\u0001G\u0001G\u0003G\u02d0"+
		"\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0005G\u02d8\bG\nG\fG\u02db"+
		"\tG\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0000\u00028<I\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0000\u0007\u0002\u0000\f\f\u000e\u000e"+
		"\u0001\u0000#%\u0001\u0000&)\u0003\u0000\u0007\t\r\u000e=P\u0001\u0000"+
		"WY\u0001\u0000 \"\u0002\u0000;;UU\u02ff\u0000\u0095\u0001\u0000\u0000"+
		"\u0000\u0002\u00ae\u0001\u0000\u0000\u0000\u0004\u00bb\u0001\u0000\u0000"+
		"\u0000\u0006\u00c1\u0001\u0000\u0000\u0000\b\u00cb\u0001\u0000\u0000\u0000"+
		"\n\u00d7\u0001\u0000\u0000\u0000\f\u00dd\u0001\u0000\u0000\u0000\u000e"+
		"\u00e7\u0001\u0000\u0000\u0000\u0010\u00ed\u0001\u0000\u0000\u0000\u0012"+
		"\u00f7\u0001\u0000\u0000\u0000\u0014\u00fd\u0001\u0000\u0000\u0000\u0016"+
		"\u0106\u0001\u0000\u0000\u0000\u0018\u010c\u0001\u0000\u0000\u0000\u001a"+
		"\u0111\u0001\u0000\u0000\u0000\u001c\u012d\u0001\u0000\u0000\u0000\u001e"+
		"\u0132\u0001\u0000\u0000\u0000 \u013e\u0001\u0000\u0000\u0000\"\u0140"+
		"\u0001\u0000\u0000\u0000$\u014d\u0001\u0000\u0000\u0000&\u0154\u0001\u0000"+
		"\u0000\u0000(\u015e\u0001\u0000\u0000\u0000*\u0164\u0001\u0000\u0000\u0000"+
		",\u016b\u0001\u0000\u0000\u0000.\u0175\u0001\u0000\u0000\u00000\u0177"+
		"\u0001\u0000\u0000\u00002\u017e\u0001\u0000\u0000\u00004\u018a\u0001\u0000"+
		"\u0000\u00006\u018c\u0001\u0000\u0000\u00008\u019e\u0001\u0000\u0000\u0000"+
		":\u01a9\u0001\u0000\u0000\u0000<\u01b1\u0001\u0000\u0000\u0000>\u01bc"+
		"\u0001\u0000\u0000\u0000@\u01be\u0001\u0000\u0000\u0000B\u01c2\u0001\u0000"+
		"\u0000\u0000D\u01d3\u0001\u0000\u0000\u0000F\u01d5\u0001\u0000\u0000\u0000"+
		"H\u01da\u0001\u0000\u0000\u0000J\u01e6\u0001\u0000\u0000\u0000L\u01e8"+
		"\u0001\u0000\u0000\u0000N\u01ed\u0001\u0000\u0000\u0000P\u01f6\u0001\u0000"+
		"\u0000\u0000R\u01fc\u0001\u0000\u0000\u0000T\u01fe\u0001\u0000\u0000\u0000"+
		"V\u0202\u0001\u0000\u0000\u0000X\u0206\u0001\u0000\u0000\u0000Z\u0208"+
		"\u0001\u0000\u0000\u0000\\\u0215\u0001\u0000\u0000\u0000^\u021e\u0001"+
		"\u0000\u0000\u0000`\u0222\u0001\u0000\u0000\u0000b\u0235\u0001\u0000\u0000"+
		"\u0000d\u023a\u0001\u0000\u0000\u0000f\u023f\u0001\u0000\u0000\u0000h"+
		"\u024a\u0001\u0000\u0000\u0000j\u024e\u0001\u0000\u0000\u0000l\u0250\u0001"+
		"\u0000\u0000\u0000n\u0262\u0001\u0000\u0000\u0000p\u0264\u0001\u0000\u0000"+
		"\u0000r\u0266\u0001\u0000\u0000\u0000t\u0275\u0001\u0000\u0000\u0000v"+
		"\u0282\u0001\u0000\u0000\u0000x\u0289\u0001\u0000\u0000\u0000z\u028b\u0001"+
		"\u0000\u0000\u0000|\u0292\u0001\u0000\u0000\u0000~\u0298\u0001\u0000\u0000"+
		"\u0000\u0080\u029c\u0001\u0000\u0000\u0000\u0082\u02a0\u0001\u0000\u0000"+
		"\u0000\u0084\u02a2\u0001\u0000\u0000\u0000\u0086\u02a8\u0001\u0000\u0000"+
		"\u0000\u0088\u02aa\u0001\u0000\u0000\u0000\u008a\u02b5\u0001\u0000\u0000"+
		"\u0000\u008c\u02cb\u0001\u0000\u0000\u0000\u008e\u02cf\u0001\u0000\u0000"+
		"\u0000\u0090\u02de\u0001\u0000\u0000\u0000\u0092\u0094\u0003\u0002\u0001"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u009b\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0098\u009a\u0003\u0004\u0002\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a0\u0003\u0018\f\u0000"+
		"\u009f\u00a1\u0005\u0015\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0016\u0000\u0000\u00a3\u00a4\u0003@ \u0000\u00a4\u00a8"+
		"\u0005\u0005\u0000\u0000\u00a5\u00a7\u0003\u001c\u000e\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0005\u0006\u0000\u0000\u00ac\u00ad\u0005\u0000\u0000\u0001\u00ad\u0001"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b4\u0005\u0013\u0000\u0000\u00af\u00b0"+
		"\u0005\u0005\u0000\u0000\u00b0\u00b1\u0003@ \u0000\u00b1\u00b2\u0005\u0006"+
		"\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b5\u0003@ \u0000"+
		"\u00b4\u00af\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0014\u0000\u0000"+
		"\u00b7\u00b9\u0005W\u0000\u0000\u00b8\u00ba\u0005\u000b\u0000\u0000\u00b9"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u0003\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005.\u0000\u0000\u00bc\u00bd"+
		"\u0003@ \u0000\u00bd\u00be\u0005\u0005\u0000\u0000\u00be\u00bf\u0003\u0006"+
		"\u0003\u0000\u00bf\u00c0\u0005\u0006\u0000\u0000\u00c0\u0005\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c3\u0003\b\u0004\u0000\u00c2\u00c4\u0003\f\u0006"+
		"\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c7\u0003\u0010\b\u0000"+
		"\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00ca\u0003\u0014\n\u0000\u00c9"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u0007\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005/\u0000\u0000\u00cc\u00cd"+
		"\u0005\u0005\u0000\u0000\u00cd\u00d2\u0003\n\u0005\u0000\u00ce\u00cf\u0005"+
		"\n\u0000\u0000\u00cf\u00d1\u0003\n\u0005\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0006"+
		"\u0000\u0000\u00d6\t\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003@ \u0000"+
		"\u00d8\u00db\u0007\u0000\u0000\u0000\u00d9\u00dc\u0003D\"\u0000\u00da"+
		"\u00dc\u00038\u001c\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u000b\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u00050\u0000\u0000\u00de\u00e2\u0005\u0005\u0000\u0000\u00df\u00e1\u0003"+
		"\u000e\u0007\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005\u0006\u0000\u0000\u00e6\r\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0003@ \u0000\u00e8\u00e9\u0005\u000e\u0000\u0000"+
		"\u00e9\u00eb\u0003V+\u0000\u00ea\u00ec\u0005\u000b\u0000\u0000\u00eb\u00ea"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u000f"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u00051\u0000\u0000\u00ee\u00f2\u0005"+
		"\u0005\u0000\u0000\u00ef\u00f1\u0003\u0012\t\u0000\u00f0\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0006"+
		"\u0000\u0000\u00f6\u0011\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003@ \u0000"+
		"\u00f8\u00f9\u0005\f\u0000\u0000\u00f9\u00fb\u0003V+\u0000\u00fa\u00fc"+
		"\u0005\u000b\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fc\u0013\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u00052\u0000\u0000\u00fe\u0100\u0005\u0005\u0000\u0000\u00ff\u0101\u0003"+
		"\u0016\u000b\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"\u0006\u0000\u0000\u0105\u0015\u0001\u0000\u0000\u0000\u0106\u0107\u0003"+
		"@ \u0000\u0107\u0108\u0005\u000e\u0000\u0000\u0108\u010a\u0003V+\u0000"+
		"\u0109\u010b\u0005\u000b\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0017\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0005:\u0000\u0000\u010d\u010e\u0005\u0001\u0000\u0000\u010e"+
		"\u010f\u0003\u001a\r\u0000\u010f\u0110\u0005\u0002\u0000\u0000\u0110\u0019"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0005\u0000\u0000\u0112\u0113"+
		"\u00054\u0000\u0000\u0113\u0114\u0005\f\u0000\u0000\u0114\u0115\u0005"+
		"W\u0000\u0000\u0115\u0116\u0005\n\u0000\u0000\u0116\u0117\u00055\u0000"+
		"\u0000\u0117\u0118\u0005\f\u0000\u0000\u0118\u0119\u0005\u0012\u0000\u0000"+
		"\u0119\u011a\u0003f3\u0000\u011a\u0122\u0005\u0012\u0000\u0000\u011b\u011c"+
		"\u0005\n\u0000\u0000\u011c\u011d\u00059\u0000\u0000\u011d\u011e\u0005"+
		"\f\u0000\u0000\u011e\u011f\u0005\u0012\u0000\u0000\u011f\u0120\u0003\u008c"+
		"F\u0000\u0120\u0121\u0005\u0012\u0000\u0000\u0121\u0123\u0001\u0000\u0000"+
		"\u0000\u0122\u011b\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0006\u0000"+
		"\u0000\u0125\u001b\u0001\u0000\u0000\u0000\u0126\u012e\u0003\u001e\u000f"+
		"\u0000\u0127\u012e\u0003.\u0017\u0000\u0128\u012e\u00038\u001c\u0000\u0129"+
		"\u012e\u0003 \u0010\u0000\u012a\u012e\u0003\"\u0011\u0000\u012b\u012e"+
		"\u0003^/\u0000\u012c\u012e\u0003,\u0016\u0000\u012d\u0126\u0001\u0000"+
		"\u0000\u0000\u012d\u0127\u0001\u0000\u0000\u0000\u012d\u0128\u0001\u0000"+
		"\u0000\u0000\u012d\u0129\u0001\u0000\u0000\u0000\u012d\u012a\u0001\u0000"+
		"\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012c\u0001\u0000"+
		"\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u0131\u0005\u000b"+
		"\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000"+
		"\u0000\u0000\u0131\u001d\u0001\u0000\u0000\u0000\u0132\u0136\u0005\u0005"+
		"\u0000\u0000\u0133\u0135\u0003\u001c\u000e\u0000\u0134\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u0006"+
		"\u0000\u0000\u013a\u001f\u0001\u0000\u0000\u0000\u013b\u013f\u0003$\u0012"+
		"\u0000\u013c\u013f\u0003(\u0014\u0000\u013d\u013f\u0003*\u0015\u0000\u013e"+
		"\u013b\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e"+
		"\u013d\u0001\u0000\u0000\u0000\u013f!\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0005\u0019\u0000\u0000\u0141\u0143\u0005\u0001\u0000\u0000\u0142\u0144"+
		"\u00038\u001c\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0005"+
		"\u0002\u0000\u0000\u0148\u014b\u0003\u001e\u000f\u0000\u0149\u014a\u0005"+
		"\u001a\u0000\u0000\u014a\u014c\u0003\u001e\u000f\u0000\u014b\u0149\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c#\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005\u001b\u0000\u0000\u014e\u014f\u0005\u0001"+
		"\u0000\u0000\u014f\u0150\u0003&\u0013\u0000\u0150\u0151\u0005\u0002\u0000"+
		"\u0000\u0151\u0152\u0003\u001e\u000f\u0000\u0152%\u0001\u0000\u0000\u0000"+
		"\u0153\u0155\u00030\u0018\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"+
		"\u0158\u0005\u000b\u0000\u0000\u0157\u0159\u00038\u001c\u0000\u0158\u0157"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a\u015c\u0005\u000b\u0000\u0000\u015b\u015d"+
		"\u00038\u001c\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015c\u015d\u0001"+
		"\u0000\u0000\u0000\u015d\'\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u001c"+
		"\u0000\u0000\u015f\u0160\u0005\u0001\u0000\u0000\u0160\u0161\u00038\u001c"+
		"\u0000\u0161\u0162\u0005\u0002\u0000\u0000\u0162\u0163\u0003\u001e\u000f"+
		"\u0000\u0163)\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u001d\u0000\u0000"+
		"\u0165\u0166\u0003\u001e\u000f\u0000\u0166\u0167\u0005\u001c\u0000\u0000"+
		"\u0167\u0168\u0005\u0001\u0000\u0000\u0168\u0169\u00038\u001c\u0000\u0169"+
		"\u016a\u0005\u0002\u0000\u0000\u016a+\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0005*\u0000\u0000\u016c\u016d\u0005\r\u0000\u0000\u016d\u016e\u0005"+
		"+\u0000\u0000\u016e\u016f\u0005\u0001\u0000\u0000\u016f\u0170\u00038\u001c"+
		"\u0000\u0170\u0171\u0005\u0002\u0000\u0000\u0171-\u0001\u0000\u0000\u0000"+
		"\u0172\u0176\u00030\u0018\u0000\u0173\u0176\u00032\u0019\u0000\u0174\u0176"+
		"\u0003T*\u0000\u0175\u0172\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176/\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0007\u0001\u0000\u0000\u0178\u0179\u0003@ \u0000\u0179"+
		"\u017c\u0005\u000e\u0000\u0000\u017a\u017d\u0003D\"\u0000\u017b\u017d"+
		"\u00038\u001c\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017b\u0001"+
		"\u0000\u0000\u0000\u017d1\u0001\u0000\u0000\u0000\u017e\u017f\u0003@ "+
		"\u0000\u017f\u0180\u0005\f\u0000\u0000\u0180\u0183\u00034\u001a\u0000"+
		"\u0181\u0182\u0005\u0003\u0000\u0000\u0182\u0184\u0005\u0004\u0000\u0000"+
		"\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0188\u0005\u000e\u0000\u0000"+
		"\u0186\u0189\u0003D\"\u0000\u0187\u0189\u00038\u001c\u0000\u0188\u0186"+
		"\u0001\u0000\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u01893\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u0007\u0002\u0000\u0000\u018b5\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0003@ \u0000\u018d\u0190\u0005\u000e\u0000\u0000"+
		"\u018e\u0191\u00038\u001c\u0000\u018f\u0191\u0003D\"\u0000\u0190\u018e"+
		"\u0001\u0000\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u01917\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0006\u001c\uffff\uffff\u0000\u0193\u019f"+
		"\u0003\u008aE\u0000\u0194\u019f\u0003F#\u0000\u0195\u019f\u0003L&\u0000"+
		"\u0196\u019f\u0003V+\u0000\u0197\u019f\u0005W\u0000\u0000\u0198\u019f"+
		"\u0003<\u001e\u0000\u0199\u019f\u00036\u001b\u0000\u019a\u019f\u0003:"+
		"\u001d\u0000\u019b\u019f\u0005\u001e\u0000\u0000\u019c\u019f\u0005\u001f"+
		"\u0000\u0000\u019d\u019f\u0003@ \u0000\u019e\u0192\u0001\u0000\u0000\u0000"+
		"\u019e\u0194\u0001\u0000\u0000\u0000\u019e\u0195\u0001\u0000\u0000\u0000"+
		"\u019e\u0196\u0001\u0000\u0000\u0000\u019e\u0197\u0001\u0000\u0000\u0000"+
		"\u019e\u0198\u0001\u0000\u0000\u0000\u019e\u0199\u0001\u0000\u0000\u0000"+
		"\u019e\u019a\u0001\u0000\u0000\u0000\u019e\u019b\u0001\u0000\u0000\u0000"+
		"\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019d\u0001\u0000\u0000\u0000"+
		"\u019f\u01a6\u0001\u0000\u0000\u0000\u01a0\u01a1\n\u0007\u0000\u0000\u01a1"+
		"\u01a5\u0005Q\u0000\u0000\u01a2\u01a3\n\u0006\u0000\u0000\u01a3\u01a5"+
		"\u0005R\u0000\u0000\u01a4\u01a0\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a79\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01ab\u0005\u0018"+
		"\u0000\u0000\u01aa\u01ac\u00038\u001c\u0000\u01ab\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac;\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0006\u001e\uffff\uffff\u0000\u01ae\u01b2\u0005X\u0000\u0000"+
		"\u01af\u01b2\u0005W\u0000\u0000\u01b0\u01b2\u0003@ \u0000\u01b1\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b9\u0001\u0000\u0000\u0000\u01b3\u01b4"+
		"\n\u0004\u0000\u0000\u01b4\u01b5\u0003>\u001f\u0000\u01b5\u01b6\u0003"+
		"<\u001e\u0005\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba=\u0001\u0000\u0000"+
		"\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bd\u0007\u0003\u0000"+
		"\u0000\u01bd?\u0001\u0000\u0000\u0000\u01be\u01c0\u0005Y\u0000\u0000\u01bf"+
		"\u01c1\u0003B!\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c1A\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\u0003"+
		"\u0000\u0000\u01c3\u01c8\u00038\u001c\u0000\u01c4\u01c5\u0005\n\u0000"+
		"\u0000\u01c5\u01c7\u00038\u001c\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000"+
		"\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005\u0004\u0000\u0000"+
		"\u01ccC\u0001\u0000\u0000\u0000\u01cd\u01d4\u0003F#\u0000\u01ce\u01d4"+
		"\u0003L&\u0000\u01cf\u01d4\u0005W\u0000\u0000\u01d0\u01d4\u0005V\u0000"+
		"\u0000\u01d1\u01d4\u0005X\u0000\u0000\u01d2\u01d4\u0005S\u0000\u0000\u01d3"+
		"\u01cd\u0001\u0000\u0000\u0000\u01d3\u01ce\u0001\u0000\u0000\u0000\u01d3"+
		"\u01cf\u0001\u0000\u0000\u0000\u01d3\u01d0\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4"+
		"E\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005\u0003\u0000\u0000\u01d6\u01d7"+
		"\u0003H$\u0000\u01d7\u01d8\u0005\u0004\u0000\u0000\u01d8G\u0001\u0000"+
		"\u0000\u0000\u01d9\u01db\u0003J%\u0000\u01da\u01d9\u0001\u0000\u0000\u0000"+
		"\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01e0\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0005\n\u0000\u0000\u01dd\u01df\u0003J%\u0000\u01de\u01dc"+
		"\u0001\u0000\u0000\u0000\u01df\u01e2\u0001\u0000\u0000\u0000\u01e0\u01de"+
		"\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1I\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e7\u0003"+
		"D\"\u0000\u01e4\u01e7\u00038\u001c\u0000\u01e5\u01e7\u0003@ \u0000\u01e6"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7K\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0005\u0005\u0000\u0000\u01e9\u01ea\u0003N\'\u0000\u01ea\u01eb\u0005"+
		"\u0006\u0000\u0000\u01ebM\u0001\u0000\u0000\u0000\u01ec\u01ee\u0003P("+
		"\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ee\u01f3\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005\n\u0000\u0000"+
		"\u01f0\u01f2\u0003P(\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f4O\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f7\u0007\u0004\u0000\u0000\u01f7\u01f8\u0005"+
		"\f\u0000\u0000\u01f8\u01f9\u00038\u001c\u0000\u01f9Q\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fd\u0003T*\u0000\u01fb\u01fd\u0003V+\u0000\u01fc\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fdS\u0001"+
		"\u0000\u0000\u0000\u01fe\u01ff\u0003@ \u0000\u01ff\u0200\u0003Z-\u0000"+
		"\u0200\u0201\u0003X,\u0000\u0201U\u0001\u0000\u0000\u0000\u0202\u0203"+
		"\u0003Z-\u0000\u0203\u0204\u0005\u000f\u0000\u0000\u0204\u0205\u0003X"+
		",\u0000\u0205W\u0001\u0000\u0000\u0000\u0206\u0207\u0003\u001e\u000f\u0000"+
		"\u0207Y\u0001\u0000\u0000\u0000\u0208\u020a\u0005\u0001\u0000\u0000\u0209"+
		"\u020b\u0003\\.\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020a\u020b"+
		"\u0001\u0000\u0000\u0000\u020b\u0210\u0001\u0000\u0000\u0000\u020c\u020d"+
		"\u0005\n\u0000\u0000\u020d\u020f\u0003\\.\u0000\u020e\u020c\u0001\u0000"+
		"\u0000\u0000\u020f\u0212\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000"+
		"\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0213\u0001\u0000"+
		"\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0213\u0214\u0005\u0002"+
		"\u0000\u0000\u0214[\u0001\u0000\u0000\u0000\u0215\u021c\u0003@ \u0000"+
		"\u0216\u0217\u0005\f\u0000\u0000\u0217\u021a\u00034\u001a\u0000\u0218"+
		"\u0219\u0005\u0003\u0000\u0000\u0219\u021b\u0005\u0004\u0000\u0000\u021a"+
		"\u0218\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b"+
		"\u021d\u0001\u0000\u0000\u0000\u021c\u0216\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u0001\u0000\u0000\u0000\u021d]\u0001\u0000\u0000\u0000\u021e\u021f"+
		"\u0005\u0017\u0000\u0000\u021f\u0220\u0003`0\u0000\u0220\u0221\u0003\u001e"+
		"\u000f\u0000\u0221_\u0001\u0000\u0000\u0000\u0222\u0231\u0005\u0001\u0000"+
		"\u0000\u0223\u0225\u0003b1\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0001\u0000\u0000\u0000\u0225\u022e\u0001\u0000\u0000\u0000\u0226"+
		"\u0228\u0005\n\u0000\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0228\u0229"+
		"\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u022a"+
		"\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022d"+
		"\u0003b1\u0000\u022c\u0227\u0001\u0000\u0000\u0000\u022d\u0230\u0001\u0000"+
		"\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000"+
		"\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000"+
		"\u0000\u0000\u0231\u0224\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0005\u0002"+
		"\u0000\u0000\u0234a\u0001\u0000\u0000\u0000\u0235\u0236\u0003d2\u0000"+
		"\u0236\u0237\u0003@ \u0000\u0237\u0238\u0005\f\u0000\u0000\u0238\u0239"+
		"\u00034\u001a\u0000\u0239c\u0001\u0000\u0000\u0000\u023a\u023b\u0007\u0005"+
		"\u0000\u0000\u023be\u0001\u0000\u0000\u0000\u023c\u023e\u0003h4\u0000"+
		"\u023d\u023c\u0001\u0000\u0000\u0000\u023e\u0241\u0001\u0000\u0000\u0000"+
		"\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000"+
		"\u0240g\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0242"+
		"\u024b\u0003n7\u0000\u0243\u024b\u0005Y\u0000\u0000\u0244\u0245\u0005"+
		"\u0005\u0000\u0000\u0245\u0246\u0005\u0005\u0000\u0000\u0246\u0247\u0003"+
		"j5\u0000\u0247\u0248\u0005\u0006\u0000\u0000\u0248\u0249\u0005\u0006\u0000"+
		"\u0000\u0249\u024b\u0001\u0000\u0000\u0000\u024a\u0242\u0001\u0000\u0000"+
		"\u0000\u024a\u0243\u0001\u0000\u0000\u0000\u024a\u0244\u0001\u0000\u0000"+
		"\u0000\u024bi\u0001\u0000\u0000\u0000\u024c\u024f\u0003l6\u0000\u024d"+
		"\u024f\u0003@ \u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024d\u0001"+
		"\u0000\u0000\u0000\u024fk\u0001\u0000\u0000\u0000\u0250\u0255\u0003@ "+
		"\u0000\u0251\u0252\u0005\r\u0000\u0000\u0252\u0254\u0003@ \u0000\u0253"+
		"\u0251\u0001\u0000\u0000\u0000\u0254\u0257\u0001\u0000\u0000\u0000\u0255"+
		"\u0253\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256"+
		"m\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0258\u0263"+
		"\u0003t:\u0000\u0259\u025d\u0003r9\u0000\u025a\u025c\u0003h4\u0000\u025b"+
		"\u025a\u0001\u0000\u0000\u0000\u025c\u025f\u0001\u0000\u0000\u0000\u025d"+
		"\u025b\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e"+
		"\u0260\u0001\u0000\u0000\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u0260"+
		"\u0261\u0003v;\u0000\u0261\u0263\u0001\u0000\u0000\u0000\u0262\u0258\u0001"+
		"\u0000\u0000\u0000\u0262\u0259\u0001\u0000\u0000\u0000\u0263o\u0001\u0000"+
		"\u0000\u0000\u0264\u0265\u0005Y\u0000\u0000\u0265q\u0001\u0000\u0000\u0000"+
		"\u0266\u0267\u0005\u0007\u0000\u0000\u0267\u0269\u0003p8\u0000\u0268\u026a"+
		"\u0003x<\u0000\u0269\u0268\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000"+
		"\u0000\u0000\u026a\u0270\u0001\u0000\u0000\u0000\u026b\u026f\u0003\u0084"+
		"B\u0000\u026c\u026f\u0003~?\u0000\u026d\u026f\u0003\u0088D\u0000\u026e"+
		"\u026b\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026e"+
		"\u026d\u0001\u0000\u0000\u0000\u026f\u0272\u0001\u0000\u0000\u0000\u0270"+
		"\u026e\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271"+
		"\u0273\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0273"+
		"\u0274\u0005\b\u0000\u0000\u0274s\u0001\u0000\u0000\u0000\u0275\u0276"+
		"\u0005\u0007\u0000\u0000\u0276\u027c\u0005Y\u0000\u0000\u0277\u027b\u0003"+
		"\u0084B\u0000\u0278\u027b\u0003~?\u0000\u0279\u027b\u0003\u0088D\u0000"+
		"\u027a\u0277\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000"+
		"\u027a\u0279\u0001\u0000\u0000\u0000\u027b\u027e\u0001\u0000\u0000\u0000"+
		"\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000"+
		"\u027d\u027f\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000"+
		"\u027f\u0280\u0005\t\u0000\u0000\u0280\u0281\u0005\b\u0000\u0000\u0281"+
		"u\u0001\u0000\u0000\u0000\u0282\u0283\u0005\u0007\u0000\u0000\u0283\u0284"+
		"\u0005\t\u0000\u0000\u0284\u0285\u0003p8\u0000\u0285\u0286\u0005\b\u0000"+
		"\u0000\u0286w\u0001\u0000\u0000\u0000\u0287\u028a\u0003z=\u0000\u0288"+
		"\u028a\u0003|>\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u0289\u0288\u0001"+
		"\u0000\u0000\u0000\u028ay\u0001\u0000\u0000\u0000\u028b\u028c\u0005,\u0000"+
		"\u0000\u028c\u028d\u0005\u000e\u0000\u0000\u028d\u028e\u0005$\u0000\u0000"+
		"\u028e\u028f\u0003@ \u0000\u028f\u0290\u00056\u0000\u0000\u0290\u0291"+
		"\u0003@ \u0000\u0291{\u0001\u0000\u0000\u0000\u0292\u0293\u0005-\u0000"+
		"\u0000\u0293\u0296\u0005\u000e\u0000\u0000\u0294\u0297\u0003@ \u0000\u0295"+
		"\u0297\u0003D\"\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0295"+
		"\u0001\u0000\u0000\u0000\u0297}\u0001\u0000\u0000\u0000\u0298\u0299\u0003"+
		"\u0080@\u0000\u0299\u029a\u0005\u000e\u0000\u0000\u029a\u029b\u0003\u0082"+
		"A\u0000\u029b\u007f\u0001\u0000\u0000\u0000\u029c\u029d\u0005Y\u0000\u0000"+
		"\u029d\u0081\u0001\u0000\u0000\u0000\u029e\u02a1\u0005W\u0000\u0000\u029f"+
		"\u02a1\u0003l6\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a0\u029f\u0001"+
		"\u0000\u0000\u0000\u02a1\u0083\u0001\u0000\u0000\u0000\u02a2\u02a3\u0005"+
		"\u0003\u0000\u0000\u02a3\u02a4\u0003\u0080@\u0000\u02a4\u02a5\u0005\u0004"+
		"\u0000\u0000\u02a5\u02a6\u0005\u000e\u0000\u0000\u02a6\u02a7\u0003l6\u0000"+
		"\u02a7\u0085\u0001\u0000\u0000\u0000\u02a8\u02a9\u0005Y\u0000\u0000\u02a9"+
		"\u0087\u0001\u0000\u0000\u0000\u02aa\u02ab\u0005\u0001\u0000\u0000\u02ab"+
		"\u02ac\u0003\u0086C\u0000\u02ac\u02ad\u0005\u0002\u0000\u0000\u02ad\u02b0"+
		"\u0005\u000e\u0000\u0000\u02ae\u02b1\u0003\u008aE\u0000\u02af\u02b1\u0003"+
		"l6\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02af\u0001\u0000\u0000"+
		"\u0000\u02b1\u0089\u0001\u0000\u0000\u0000\u02b2\u02b6\u0003l6\u0000\u02b3"+
		"\u02b6\u00053\u0000\u0000\u02b4\u02b6\u00057\u0000\u0000\u02b5\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b5\u02b4\u0001"+
		"\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02c0\u0005"+
		"\u0001\u0000\u0000\u02b8\u02bd\u00038\u001c\u0000\u02b9\u02ba\u0005\n"+
		"\u0000\u0000\u02ba\u02bc\u00038\u001c\u0000\u02bb\u02b9\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bf\u0001\u0000\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000"+
		"\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02c1\u0001\u0000\u0000"+
		"\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000\u02c0\u02b8\u0001\u0000\u0000"+
		"\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000"+
		"\u0000\u02c2\u02c3\u0005\u0002\u0000\u0000\u02c3\u008b\u0001\u0000\u0000"+
		"\u0000\u02c4\u02cc\u0005W\u0000\u0000\u02c5\u02c7\u0003\u008eG\u0000\u02c6"+
		"\u02c5\u0001\u0000\u0000\u0000\u02c7\u02ca\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9"+
		"\u02cc\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000\u02cb"+
		"\u02c4\u0001\u0000\u0000\u0000\u02cb\u02c8\u0001\u0000\u0000\u0000\u02cc"+
		"\u008d\u0001\u0000\u0000\u0000\u02cd\u02d0\u0005W\u0000\u0000\u02ce\u02d0"+
		"\u0003p8\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000\u02cf\u02ce\u0001\u0000"+
		"\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d9\u0005\u0005"+
		"\u0000\u0000\u02d2\u02d3\u0003@ \u0000\u02d3\u02d4\u0005\f\u0000\u0000"+
		"\u02d4\u02d5\u0007\u0006\u0000\u0000\u02d5\u02d6\u0005\u000b\u0000\u0000"+
		"\u02d6\u02d8\u0001\u0000\u0000\u0000\u02d7\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d8\u02db\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000"+
		"\u02d9\u02da\u0001\u0000\u0000\u0000\u02da\u02dc\u0001\u0000\u0000\u0000"+
		"\u02db\u02d9\u0001\u0000\u0000\u0000\u02dc\u02dd\u0005\u0006\u0000\u0000"+
		"\u02dd\u008f\u0001\u0000\u0000\u0000\u02de\u02df\u0005X\u0000\u0000\u02df"+
		"\u02e0\u0005<\u0000\u0000\u02e0\u0091\u0001\u0000\u0000\u0000M\u0095\u009b"+
		"\u00a0\u00a8\u00b4\u00b9\u00c3\u00c6\u00c9\u00d2\u00db\u00e2\u00eb\u00f2"+
		"\u00fb\u0102\u010a\u0122\u012d\u0130\u0136\u013e\u0145\u014b\u0154\u0158"+
		"\u015c\u0175\u017c\u0183\u0188\u0190\u019e\u01a4\u01a6\u01ab\u01b1\u01b9"+
		"\u01c0\u01c8\u01d3\u01da\u01e0\u01e6\u01ed\u01f3\u01fc\u020a\u0210\u021a"+
		"\u021c\u0224\u0229\u022e\u0231\u023f\u024a\u024e\u0255\u025d\u0262\u0269"+
		"\u026e\u0270\u027a\u027c\u0289\u0296\u02a0\u02b0\u02b5\u02bd\u02c0\u02c8"+
		"\u02cb\u02cf\u02d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}