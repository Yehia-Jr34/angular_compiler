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
		RULE_arrayDeclaration = 23, RULE_decl = 24, RULE_variableDecl = 25, RULE_variableTypeDecl = 26, 
		RULE_dataTypes = 27, RULE_initialize = 28, RULE_expr = 29, RULE_return = 30, 
		RULE_arithmeticExpr = 31, RULE_operartor = 32, RULE_identifier_ = 33, 
		RULE_arrayIndex = 34, RULE_anyLiteral = 35, RULE_arrayLiteral = 36, RULE_arrayList = 37, 
		RULE_arrayElement = 38, RULE_objectLiteral = 39, RULE_objectBody = 40, 
		RULE_objectKeyValue = 41, RULE_functionDecl = 42, RULE_normalFunctionDecleration = 43, 
		RULE_arrowFunctionDecleration = 44, RULE_functionBody = 45, RULE_functionParameters = 46, 
		RULE_variableFunctionSingleArgument = 47, RULE_constructor = 48, RULE_injectableFunctionParameters = 49, 
		RULE_injectableVariableFunctionSingleArgument = 50, RULE_accessModifires = 51, 
		RULE_html = 52, RULE_htmlContent = 53, RULE_interpolation = 54, RULE_interpolationValue = 55, 
		RULE_identifierPath = 56, RULE_textContent = 57, RULE_htmlElement = 58, 
		RULE_htmlTag = 59, RULE_openTag = 60, RULE_selfClosingTag = 61, RULE_closeTag = 62, 
		RULE_structuralDirectives = 63, RULE_forDirective = 64, RULE_ifDirective = 65, 
		RULE_attribute = 66, RULE_attributeName = 67, RULE_attributeValue = 68, 
		RULE_boundAttribute = 69, RULE_eventName = 70, RULE_eventBinding = 71, 
		RULE_functionCall = 72, RULE_styles = 73, RULE_cssRule = 74, RULE_cssDeclaration = 75, 
		RULE_propertyValue = 76, RULE_cssBasicColor = 77;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "importStatement", "storeDecl", "storeBody", "stateSection", 
			"storeStateField", "actionsSection", "actionDecl", "reducerSection", 
			"reducerRule", "selectorsSection", "selectorDecl", "componentDecorator", 
			"compoenentObject", "statement", "block", "loops", "if", "for", "forParameters", 
			"while", "do", "consoleLog", "arrayDeclaration", "decl", "variableDecl", 
			"variableTypeDecl", "dataTypes", "initialize", "expr", "return", "arithmeticExpr", 
			"operartor", "identifier_", "arrayIndex", "anyLiteral", "arrayLiteral", 
			"arrayList", "arrayElement", "objectLiteral", "objectBody", "objectKeyValue", 
			"functionDecl", "normalFunctionDecleration", "arrowFunctionDecleration", 
			"functionBody", "functionParameters", "variableFunctionSingleArgument", 
			"constructor", "injectableFunctionParameters", "injectableVariableFunctionSingleArgument", 
			"accessModifires", "html", "htmlContent", "interpolation", "interpolationValue", 
			"identifierPath", "textContent", "htmlElement", "htmlTag", "openTag", 
			"selfClosingTag", "closeTag", "structuralDirectives", "forDirective", 
			"ifDirective", "attribute", "attributeName", "attributeValue", "boundAttribute", 
			"eventName", "eventBinding", "functionCall", "styles", "cssRule", "cssDeclaration", 
			"propertyValue", "cssBasicColor"
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
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(156);
				importStatement();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Store) {
				{
				{
				setState(162);
				storeDecl();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			componentDecorator();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(169);
				match(Export);
				}
			}

			setState(172);
			match(Class);
			setState(173);
			identifier_();
			setState(174);
			match(OpenBrace);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38285239616798762L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
				{
				{
				setState(175);
				statement();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(CloseBrace);
			setState(182);
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
			setState(184);
			match(Import);
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				{
				{
				setState(185);
				match(OpenBrace);
				setState(186);
				identifier_();
				setState(187);
				match(CloseBrace);
				}
				}
				break;
			case Identifier:
				{
				setState(189);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(192);
			match(From);
			setState(193);
			match(StringLiteral);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(194);
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
			setState(197);
			match(Store);
			setState(198);
			identifier_();
			setState(199);
			match(OpenBrace);
			setState(200);
			storeBody();
			setState(201);
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
			setState(203);
			stateSection();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Actions) {
				{
				setState(204);
				actionsSection();
				}
			}

			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Reducer) {
				{
				setState(207);
				reducerSection();
				}
			}

			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Selectors) {
				{
				setState(210);
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
			setState(213);
			match(State);
			setState(214);
			match(OpenBrace);
			setState(215);
			storeStateField();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(216);
				match(Comma);
				setState(217);
				storeStateField();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
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
			setState(225);
			identifier_();
			setState(226);
			_la = _input.LA(1);
			if ( !(_la==Colon || _la==Assign) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(227);
				anyLiteral();
				}
				break;
			case 2:
				{
				setState(228);
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
			setState(231);
			match(Actions);
			setState(232);
			match(OpenBrace);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(233);
				actionDecl();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
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
			setState(241);
			identifier_();
			setState(242);
			match(Assign);
			setState(243);
			arrowFunctionDecleration();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(244);
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
			setState(247);
			match(Reducer);
			setState(248);
			match(OpenBrace);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(249);
				reducerRule();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
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
			setState(257);
			identifier_();
			setState(258);
			match(Colon);
			setState(259);
			arrowFunctionDecleration();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(260);
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
			setState(263);
			match(Selectors);
			setState(264);
			match(OpenBrace);
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(265);
				selectorDecl();
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(270);
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
			setState(272);
			identifier_();
			setState(273);
			match(Assign);
			setState(274);
			arrowFunctionDecleration();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(275);
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
			setState(278);
			match(Component);
			setState(279);
			match(OpenParen);
			setState(280);
			compoenentObject();
			setState(281);
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
			setState(283);
			match(OpenBrace);
			setState(284);
			match(Selector);
			setState(285);
			match(Colon);
			setState(286);
			match(StringLiteral);
			setState(287);
			match(Comma);
			setState(288);
			match(Template);
			setState(289);
			match(Colon);
			setState(290);
			match(Backtick);
			setState(291);
			html();
			setState(292);
			match(Backtick);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(293);
				match(Comma);
				setState(294);
				match(Styles);
				setState(295);
				match(Colon);
				setState(296);
				match(Backtick);
				setState(297);
				styles();
				setState(298);
				match(Backtick);
				}
			}

			setState(302);
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
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
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
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(304);
				block();
				}
				break;
			case 2:
				{
				setState(305);
				decl();
				}
				break;
			case 3:
				{
				setState(306);
				expr(0);
				}
				break;
			case 4:
				{
				setState(307);
				loops();
				}
				break;
			case 5:
				{
				setState(308);
				if_();
				}
				break;
			case 6:
				{
				setState(309);
				constructor();
				}
				break;
			case 7:
				{
				setState(310);
				consoleLog();
				}
				break;
			case 8:
				{
				setState(311);
				arrayDeclaration();
				}
				break;
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(314);
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
			setState(317);
			match(OpenBrace);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38285239616798762L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
				{
				{
				setState(318);
				statement();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
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
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case For:
				{
				setState(326);
				for_();
				}
				break;
			case While:
				{
				setState(327);
				while_();
				}
				break;
			case Do:
				{
				setState(328);
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
			setState(331);
			match(If);
			setState(332);
			match(OpenParen);
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333);
				expr(0);
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 38280600070651946L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0) );
			setState(338);
			match(CloseParen);
			setState(339);
			block();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(340);
				match(Else);
				setState(341);
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
			setState(344);
			match(For);
			setState(345);
			match(OpenParen);
			setState(346);
			forParameters();
			setState(347);
			match(CloseParen);
			setState(348);
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
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) {
				{
				setState(350);
				variableDecl();
				}
			}

			setState(353);
			match(SemiColon);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38280600070651946L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
				{
				setState(354);
				expr(0);
				}
			}

			setState(357);
			match(SemiColon);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38280600070651946L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
				{
				setState(358);
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
			setState(361);
			match(While);
			setState(362);
			match(OpenParen);
			setState(363);
			expr(0);
			setState(364);
			match(CloseParen);
			setState(365);
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
			setState(367);
			match(Do);
			setState(368);
			block();
			setState(369);
			match(While);
			setState(370);
			match(OpenParen);
			setState(371);
			expr(0);
			setState(372);
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
			setState(374);
			match(Console);
			setState(375);
			match(Dot);
			setState(376);
			match(Log);
			setState(377);
			match(OpenParen);
			setState(378);
			expr(0);
			setState(379);
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
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			identifier_();
			setState(382);
			match(Assign);
			setState(383);
			arrayLiteral();
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
		enterRule(_localctx, 48, RULE_decl);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				variableDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				variableTypeDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
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
		enterRule(_localctx, 50, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(391);
			identifier_();
			setState(392);
			match(Assign);
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(393);
				anyLiteral();
				}
				break;
			case 2:
				{
				setState(394);
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
		enterRule(_localctx, 52, RULE_variableTypeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			identifier_();
			setState(398);
			match(Colon);
			setState(399);
			dataTypes();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBracket) {
				{
				setState(400);
				match(OpenBracket);
				setState(401);
				match(CloseBracket);
				}
			}

			setState(404);
			match(Assign);
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(405);
				anyLiteral();
				}
				break;
			case 2:
				{
				setState(406);
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
		enterRule(_localctx, 54, RULE_dataTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
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
		enterRule(_localctx, 56, RULE_initialize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			identifier_();
			setState(412);
			match(Assign);
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(413);
				expr(0);
				}
				break;
			case 2:
				{
				setState(414);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(418);
				functionCall();
				}
				break;
			case 2:
				{
				setState(419);
				arrayLiteral();
				}
				break;
			case 3:
				{
				setState(420);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(421);
				arrowFunctionDecleration();
				}
				break;
			case 5:
				{
				setState(422);
				match(StringLiteral);
				}
				break;
			case 6:
				{
				setState(423);
				arithmeticExpr(0);
				}
				break;
			case 7:
				{
				setState(424);
				initialize();
				}
				break;
			case 8:
				{
				setState(425);
				return_();
				}
				break;
			case 9:
				{
				setState(426);
				match(Break);
				}
				break;
			case 10:
				{
				setState(427);
				match(Continue);
				}
				break;
			case 11:
				{
				setState(428);
				identifier_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(435);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(431);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(432);
						match(PlusPlus);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(433);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(434);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(439);
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
		enterRule(_localctx, 60, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(Return);
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(441);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_arithmeticExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecimalLiteral:
				{
				setState(445);
				match(DecimalLiteral);
				}
				break;
			case StringLiteral:
				{
				setState(446);
				match(StringLiteral);
				}
				break;
			case Identifier:
				{
				setState(447);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(456);
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
					setState(450);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(451);
					operartor();
					setState(452);
					arithmeticExpr(5);
					}
					} 
				}
				setState(458);
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
		enterRule(_localctx, 64, RULE_operartor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
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
		enterRule(_localctx, 66, RULE_identifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(Identifier);
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(462);
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
		enterRule(_localctx, 68, RULE_arrayIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(OpenBracket);
			setState(466);
			expr(0);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(467);
				match(Comma);
				setState(468);
				expr(0);
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
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
		enterRule(_localctx, 70, RULE_anyLiteral);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				objectLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(BooleanLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				match(DecimalLiteral);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(481);
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
		enterRule(_localctx, 72, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(OpenBracket);
			setState(485);
			arrayList();
			setState(486);
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
		enterRule(_localctx, 74, RULE_arrayList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38280600070651946L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 121L) != 0)) {
				{
				setState(488);
				arrayElement();
				}
			}

			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(491);
				match(Comma);
				setState(492);
				arrayElement();
				}
				}
				setState(497);
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
		enterRule(_localctx, 76, RULE_arrayElement);
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				anyLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
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
		enterRule(_localctx, 78, RULE_objectLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(OpenBrace);
			setState(504);
			objectBody();
			setState(505);
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
		enterRule(_localctx, 80, RULE_objectBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
				{
				setState(507);
				objectKeyValue();
				}
			}

			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(510);
				match(Comma);
				setState(511);
				objectKeyValue();
				}
				}
				setState(516);
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
		enterRule(_localctx, 82, RULE_objectKeyValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(518);
			match(Colon);
			setState(519);
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
		enterRule(_localctx, 84, RULE_functionDecl);
		try {
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				normalFunctionDecleration();
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
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
		enterRule(_localctx, 86, RULE_normalFunctionDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			identifier_();
			setState(526);
			functionParameters();
			setState(527);
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
		enterRule(_localctx, 88, RULE_arrowFunctionDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			functionParameters();
			setState(530);
			match(Arrow);
			setState(531);
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
		enterRule(_localctx, 90, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
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
		enterRule(_localctx, 92, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(OpenParen);
			{
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(536);
				variableFunctionSingleArgument();
				}
			}

			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(539);
				match(Comma);
				setState(540);
				variableFunctionSingleArgument();
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(546);
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
		enterRule(_localctx, 94, RULE_variableFunctionSingleArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			identifier_();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(549);
				match(Colon);
				setState(550);
				dataTypes();
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket) {
					{
					setState(551);
					match(OpenBracket);
					setState(552);
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
		enterRule(_localctx, 96, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(Constructor);
			setState(558);
			injectableFunctionParameters();
			setState(559);
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
		enterRule(_localctx, 98, RULE_injectableFunctionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(OpenParen);
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) {
					{
					setState(562);
					injectableVariableFunctionSingleArgument();
					}
				}

				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(565);
						match(Comma);
						}
						}
						setState(568); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(570);
					injectableVariableFunctionSingleArgument();
					}
					}
					setState(575);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(578);
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
		enterRule(_localctx, 100, RULE_injectableVariableFunctionSingleArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			accessModifires();
			setState(581);
			identifier_();
			setState(582);
			match(Colon);
			setState(583);
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
		enterRule(_localctx, 102, RULE_accessModifires);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
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
		enterRule(_localctx, 104, RULE_html);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(587);
					htmlContent();
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public TextContentContext textContent() {
			return getRuleContext(TextContentContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
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
		enterRule(_localctx, 106, RULE_htmlContent);
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				htmlElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				interpolation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				textContent();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(596);
				match(Identifier);
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
	public static class InterpolationContext extends ParserRuleContext {
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
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(OpenBrace);
			setState(600);
			match(OpenBrace);
			setState(601);
			interpolationValue();
			setState(602);
			match(CloseBrace);
			setState(603);
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
		enterRule(_localctx, 110, RULE_interpolationValue);
		try {
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				identifierPath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
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
		enterRule(_localctx, 112, RULE_identifierPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			identifier_();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(610);
				match(Dot);
				setState(611);
				identifier_();
				}
				}
				setState(616);
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
	public static class TextContentContext extends ParserRuleContext {
		public List<TerminalNode> LessThan() { return getTokens(AngularParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(AngularParser.LessThan, i);
		}
		public List<TerminalNode> OpenBrace() { return getTokens(AngularParser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(AngularParser.OpenBrace, i);
		}
		public List<TerminalNode> CloseBrace() { return getTokens(AngularParser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(AngularParser.CloseBrace, i);
		}
		public TextContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTextContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTextContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTextContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContentContext textContent() throws RecognitionException {
		TextContentContext _localctx = new TextContentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_textContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(618); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(617);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(620); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 116, RULE_htmlElement);
		try {
			int _alt;
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				selfClosingTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				openTag();
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(624);
						htmlContent();
						}
						} 
					}
					setState(629);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(630);
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
		enterRule(_localctx, 118, RULE_htmlTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
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
		enterRule(_localctx, 120, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(LessThan);
			setState(637);
			htmlTag();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NgFor || _la==NgIf) {
				{
				setState(638);
				structuralDirectives();
				}
			}

			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenParen || _la==OpenBracket || _la==Identifier) {
				{
				setState(644);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
					{
					setState(641);
					boundAttribute();
					}
					break;
				case Identifier:
					{
					setState(642);
					attribute();
					}
					break;
				case OpenParen:
					{
					setState(643);
					eventBinding();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(649);
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
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
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
		enterRule(_localctx, 122, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(LessThan);
			setState(652);
			htmlTag();
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NgFor || _la==NgIf) {
				{
				setState(653);
				structuralDirectives();
				}
			}

			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenParen || _la==OpenBracket || _la==Identifier) {
				{
				setState(659);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
					{
					setState(656);
					boundAttribute();
					}
					break;
				case Identifier:
					{
					setState(657);
					attribute();
					}
					break;
				case OpenParen:
					{
					setState(658);
					eventBinding();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(664);
			match(Divide);
			setState(665);
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
		enterRule(_localctx, 124, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(LessThan);
			setState(668);
			match(Divide);
			setState(669);
			htmlTag();
			setState(670);
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
		enterRule(_localctx, 126, RULE_structuralDirectives);
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NgFor:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				forDirective();
				}
				break;
			case NgIf:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
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
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
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
		enterRule(_localctx, 128, RULE_forDirective);
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				match(NgFor);
				setState(677);
				match(Assign);
				setState(678);
				match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				match(NgFor);
				setState(680);
				match(Assign);
				setState(681);
				match(Let);
				setState(682);
				identifier_();
				setState(683);
				match(Of);
				setState(684);
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
	public static class IfDirectiveContext extends ParserRuleContext {
		public TerminalNode NgIf() { return getToken(AngularParser.NgIf, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
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
		enterRule(_localctx, 130, RULE_ifDirective);
		try {
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				match(NgIf);
				setState(689);
				match(Assign);
				setState(690);
				match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				match(NgIf);
				setState(692);
				match(Assign);
				setState(695);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(693);
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
					setState(694);
					anyLiteral();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 132, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			attributeName();
			setState(700);
			match(Assign);
			setState(701);
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
		enterRule(_localctx, 134, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
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
		enterRule(_localctx, 136, RULE_attributeValue);
		try {
			setState(707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(StringLiteral);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
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
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
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
		enterRule(_localctx, 138, RULE_boundAttribute);
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				match(OpenBracket);
				setState(710);
				attributeName();
				setState(711);
				match(CloseBracket);
				setState(712);
				match(Assign);
				setState(713);
				match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				match(OpenBracket);
				setState(716);
				attributeName();
				setState(717);
				match(CloseBracket);
				setState(718);
				match(Assign);
				setState(719);
				identifierPath();
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
		enterRule(_localctx, 140, RULE_eventName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
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
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 142, RULE_eventBinding);
		try {
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				match(OpenParen);
				setState(726);
				eventName();
				setState(727);
				match(CloseParen);
				setState(728);
				match(Assign);
				setState(729);
				match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				match(OpenParen);
				setState(732);
				eventName();
				setState(733);
				match(CloseParen);
				setState(734);
				match(Assign);
				setState(735);
				functionCall();
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
		enterRule(_localctx, 144, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(739);
				identifierPath();
				}
				break;
			case Select:
				{
				setState(740);
				match(Select);
				}
				break;
			case Dispatch:
				{
				setState(741);
				match(Dispatch);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(744);
			match(OpenParen);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38280600070651946L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
				{
				setState(745);
				expr(0);
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(746);
					match(Comma);
					setState(747);
					expr(0);
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(755);
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
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
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
		enterRule(_localctx, 146, RULE_styles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				setState(759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(757);
					cssRule();
					}
					break;
				case 2:
					{
					setState(758);
					cssDeclaration();
					}
					break;
				}
				}
				setState(763);
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
	public static class CssRuleContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_cssRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(Identifier);
			setState(765);
			match(OpenBrace);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(766);
				cssDeclaration();
				}
				}
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(772);
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
	public static class CssDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_cssDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(Identifier);
			setState(775);
			match(Colon);
			setState(776);
			propertyValue();
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(777);
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
	public static class PropertyValueContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(AngularParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(AngularParser.StringLiteral, i);
		}
		public List<TerminalNode> DecimalLiteral() { return getTokens(AngularParser.DecimalLiteral); }
		public TerminalNode DecimalLiteral(int i) {
			return getToken(AngularParser.DecimalLiteral, i);
		}
		public List<TerminalNode> HexColorLiteral() { return getTokens(AngularParser.HexColorLiteral); }
		public TerminalNode HexColorLiteral(int i) {
			return getToken(AngularParser.HexColorLiteral, i);
		}
		public List<TerminalNode> CssUnit() { return getTokens(AngularParser.CssUnit); }
		public TerminalNode CssUnit(int i) {
			return getToken(AngularParser.CssUnit, i);
		}
		public List<IdentifierPathContext> identifierPath() {
			return getRuleContexts(IdentifierPathContext.class);
		}
		public IdentifierPathContext identifierPath(int i) {
			return getRuleContext(IdentifierPathContext.class,i);
		}
		public List<CssBasicColorContext> cssBasicColor() {
			return getRuleContexts(CssBasicColorContext.class);
		}
		public CssBasicColorContext cssBasicColor(int i) {
			return getRuleContext(CssBasicColorContext.class,i);
		}
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_propertyValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(786); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(786);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case StringLiteral:
						{
						setState(780);
						match(StringLiteral);
						}
						break;
					case DecimalLiteral:
						{
						setState(781);
						match(DecimalLiteral);
						}
						break;
					case HexColorLiteral:
						{
						setState(782);
						match(HexColorLiteral);
						}
						break;
					case CssUnit:
						{
						setState(783);
						match(CssUnit);
						}
						break;
					case Identifier:
						{
						setState(784);
						identifierPath();
						}
						break;
					case CssColor:
						{
						setState(785);
						cssBasicColor();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(788); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class CssBasicColorContext extends ParserRuleContext {
		public TerminalNode CssColor() { return getToken(AngularParser.CssColor, 0); }
		public CssBasicColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBasicColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssBasicColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssBasicColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssBasicColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBasicColorContext cssBasicColor() throws RecognitionException {
		CssBasicColorContext _localctx = new CssBasicColorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_cssBasicColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(CssColor);
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
		case 29:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 31:
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
		"\u0004\u0001\\\u0319\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0001\u0000\u0005\u0000\u009e\b\u0000"+
		"\n\u0000\f\u0000\u00a1\t\u0000\u0001\u0000\u0005\u0000\u00a4\b\u0000\n"+
		"\u0000\f\u0000\u00a7\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00ab"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00b1"+
		"\b\u0000\n\u0000\f\u0000\u00b4\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u00bf\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u00c4\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00ce\b\u0003\u0001\u0003"+
		"\u0003\u0003\u00d1\b\u0003\u0001\u0003\u0003\u0003\u00d4\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00db"+
		"\b\u0004\n\u0004\f\u0004\u00de\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00e6\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00eb\b\u0006\n\u0006\f\u0006\u00ee"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00f6\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00fb"+
		"\b\b\n\b\f\b\u00fe\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0003\t\u0106\b\t\u0001\n\u0001\n\u0001\n\u0004\n\u010b\b\n\u000b\n\f"+
		"\n\u010c\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0115\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u012d"+
		"\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0139\b\u000e\u0001"+
		"\u000e\u0003\u000e\u013c\b\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u0140"+
		"\b\u000f\n\u000f\f\u000f\u0143\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u014a\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0004\u0011\u014f\b\u0011\u000b\u0011\f\u0011\u0150\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0157\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0003\u0013\u0160\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0164"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0168\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0185\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u018c\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0193\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0198\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01a0\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u01ae\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u01b4\b\u001d\n\u001d\f\u001d\u01b7\t\u001d\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01bb\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01c1\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u01c7\b\u001f\n\u001f\f\u001f\u01ca\t\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0003!\u01d0\b!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0005\"\u01d6\b\"\n\"\f\"\u01d9\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u01e3\b#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0003%\u01ea\b%\u0001%\u0001%\u0005%\u01ee\b%\n%\f%\u01f1\t%\u0001&"+
		"\u0001&\u0001&\u0003&\u01f6\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001("+
		"\u0003(\u01fd\b(\u0001(\u0001(\u0005(\u0201\b(\n(\f(\u0204\t(\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0003*\u020c\b*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0003.\u021a"+
		"\b.\u0001.\u0001.\u0005.\u021e\b.\n.\f.\u0221\t.\u0001.\u0001.\u0001/"+
		"\u0001/\u0001/\u0001/\u0001/\u0003/\u022a\b/\u0003/\u022c\b/\u00010\u0001"+
		"0\u00010\u00010\u00011\u00011\u00031\u0234\b1\u00011\u00041\u0237\b1\u000b"+
		"1\f1\u0238\u00011\u00051\u023c\b1\n1\f1\u023f\t1\u00031\u0241\b1\u0001"+
		"1\u00011\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u00014\u0005"+
		"4\u024d\b4\n4\f4\u0250\t4\u00015\u00015\u00015\u00015\u00035\u0256\b5"+
		"\u00016\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u00037\u0260"+
		"\b7\u00018\u00018\u00018\u00058\u0265\b8\n8\f8\u0268\t8\u00019\u00049"+
		"\u026b\b9\u000b9\f9\u026c\u0001:\u0001:\u0001:\u0005:\u0272\b:\n:\f:\u0275"+
		"\t:\u0001:\u0001:\u0003:\u0279\b:\u0001;\u0001;\u0001<\u0001<\u0001<\u0003"+
		"<\u0280\b<\u0001<\u0001<\u0001<\u0005<\u0285\b<\n<\f<\u0288\t<\u0001<"+
		"\u0001<\u0001=\u0001=\u0001=\u0003=\u028f\b=\u0001=\u0001=\u0001=\u0005"+
		"=\u0294\b=\n=\f=\u0297\t=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001?\u0001?\u0003?\u02a3\b?\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u02af\b@\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0003A\u02b8\bA\u0003A\u02ba\bA\u0001B\u0001"+
		"B\u0001B\u0001B\u0001C\u0001C\u0001D\u0001D\u0003D\u02c4\bD\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0003E\u02d2\bE\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u02e2\bG\u0001H\u0001"+
		"H\u0001H\u0003H\u02e7\bH\u0001H\u0001H\u0001H\u0001H\u0005H\u02ed\bH\n"+
		"H\fH\u02f0\tH\u0003H\u02f2\bH\u0001H\u0001H\u0001I\u0001I\u0005I\u02f8"+
		"\bI\nI\fI\u02fb\tI\u0001J\u0001J\u0001J\u0005J\u0300\bJ\nJ\fJ\u0303\t"+
		"J\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0003K\u030b\bK\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0004L\u0313\bL\u000bL\fL\u0314\u0001M\u0001"+
		"M\u0001M\u0000\u0002:>N\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u0000\u0007\u0002\u0000\f\f\u000e\u000e"+
		"\u0001\u0000#%\u0001\u0000&)\u0003\u0000\u0007\t\r\u000e=P\u0001\u0000"+
		"WY\u0001\u0000 \"\u0001\u0000\u0005\u0007\u033e\u0000\u009f\u0001\u0000"+
		"\u0000\u0000\u0002\u00b8\u0001\u0000\u0000\u0000\u0004\u00c5\u0001\u0000"+
		"\u0000\u0000\u0006\u00cb\u0001\u0000\u0000\u0000\b\u00d5\u0001\u0000\u0000"+
		"\u0000\n\u00e1\u0001\u0000\u0000\u0000\f\u00e7\u0001\u0000\u0000\u0000"+
		"\u000e\u00f1\u0001\u0000\u0000\u0000\u0010\u00f7\u0001\u0000\u0000\u0000"+
		"\u0012\u0101\u0001\u0000\u0000\u0000\u0014\u0107\u0001\u0000\u0000\u0000"+
		"\u0016\u0110\u0001\u0000\u0000\u0000\u0018\u0116\u0001\u0000\u0000\u0000"+
		"\u001a\u011b\u0001\u0000\u0000\u0000\u001c\u0138\u0001\u0000\u0000\u0000"+
		"\u001e\u013d\u0001\u0000\u0000\u0000 \u0149\u0001\u0000\u0000\u0000\""+
		"\u014b\u0001\u0000\u0000\u0000$\u0158\u0001\u0000\u0000\u0000&\u015f\u0001"+
		"\u0000\u0000\u0000(\u0169\u0001\u0000\u0000\u0000*\u016f\u0001\u0000\u0000"+
		"\u0000,\u0176\u0001\u0000\u0000\u0000.\u017d\u0001\u0000\u0000\u00000"+
		"\u0184\u0001\u0000\u0000\u00002\u0186\u0001\u0000\u0000\u00004\u018d\u0001"+
		"\u0000\u0000\u00006\u0199\u0001\u0000\u0000\u00008\u019b\u0001\u0000\u0000"+
		"\u0000:\u01ad\u0001\u0000\u0000\u0000<\u01b8\u0001\u0000\u0000\u0000>"+
		"\u01c0\u0001\u0000\u0000\u0000@\u01cb\u0001\u0000\u0000\u0000B\u01cd\u0001"+
		"\u0000\u0000\u0000D\u01d1\u0001\u0000\u0000\u0000F\u01e2\u0001\u0000\u0000"+
		"\u0000H\u01e4\u0001\u0000\u0000\u0000J\u01e9\u0001\u0000\u0000\u0000L"+
		"\u01f5\u0001\u0000\u0000\u0000N\u01f7\u0001\u0000\u0000\u0000P\u01fc\u0001"+
		"\u0000\u0000\u0000R\u0205\u0001\u0000\u0000\u0000T\u020b\u0001\u0000\u0000"+
		"\u0000V\u020d\u0001\u0000\u0000\u0000X\u0211\u0001\u0000\u0000\u0000Z"+
		"\u0215\u0001\u0000\u0000\u0000\\\u0217\u0001\u0000\u0000\u0000^\u0224"+
		"\u0001\u0000\u0000\u0000`\u022d\u0001\u0000\u0000\u0000b\u0231\u0001\u0000"+
		"\u0000\u0000d\u0244\u0001\u0000\u0000\u0000f\u0249\u0001\u0000\u0000\u0000"+
		"h\u024e\u0001\u0000\u0000\u0000j\u0255\u0001\u0000\u0000\u0000l\u0257"+
		"\u0001\u0000\u0000\u0000n\u025f\u0001\u0000\u0000\u0000p\u0261\u0001\u0000"+
		"\u0000\u0000r\u026a\u0001\u0000\u0000\u0000t\u0278\u0001\u0000\u0000\u0000"+
		"v\u027a\u0001\u0000\u0000\u0000x\u027c\u0001\u0000\u0000\u0000z\u028b"+
		"\u0001\u0000\u0000\u0000|\u029b\u0001\u0000\u0000\u0000~\u02a2\u0001\u0000"+
		"\u0000\u0000\u0080\u02ae\u0001\u0000\u0000\u0000\u0082\u02b9\u0001\u0000"+
		"\u0000\u0000\u0084\u02bb\u0001\u0000\u0000\u0000\u0086\u02bf\u0001\u0000"+
		"\u0000\u0000\u0088\u02c3\u0001\u0000\u0000\u0000\u008a\u02d1\u0001\u0000"+
		"\u0000\u0000\u008c\u02d3\u0001\u0000\u0000\u0000\u008e\u02e1\u0001\u0000"+
		"\u0000\u0000\u0090\u02e6\u0001\u0000\u0000\u0000\u0092\u02f9\u0001\u0000"+
		"\u0000\u0000\u0094\u02fc\u0001\u0000\u0000\u0000\u0096\u0306\u0001\u0000"+
		"\u0000\u0000\u0098\u0312\u0001\u0000\u0000\u0000\u009a\u0316\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\u0003\u0002\u0001\u0000\u009d\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a4\u0003\u0004"+
		"\u0002\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a8\u00aa\u0003\u0018\f\u0000\u00a9\u00ab\u0005\u0015\u0000"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0016\u0000"+
		"\u0000\u00ad\u00ae\u0003B!\u0000\u00ae\u00b2\u0005\u0005\u0000\u0000\u00af"+
		"\u00b1\u0003\u001c\u000e\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0006\u0000\u0000\u00b6"+
		"\u00b7\u0005\u0000\u0000\u0001\u00b7\u0001\u0001\u0000\u0000\u0000\u00b8"+
		"\u00be\u0005\u0013\u0000\u0000\u00b9\u00ba\u0005\u0005\u0000\u0000\u00ba"+
		"\u00bb\u0003B!\u0000\u00bb\u00bc\u0005\u0006\u0000\u0000\u00bc\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bf\u0003B!\u0000\u00be\u00b9\u0001\u0000\u0000"+
		"\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0014\u0000\u0000\u00c1\u00c3\u0005W\u0000\u0000"+
		"\u00c2\u00c4\u0005\u000b\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u0003\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005.\u0000\u0000\u00c6\u00c7\u0003B!\u0000\u00c7\u00c8"+
		"\u0005\u0005\u0000\u0000\u00c8\u00c9\u0003\u0006\u0003\u0000\u00c9\u00ca"+
		"\u0005\u0006\u0000\u0000\u00ca\u0005\u0001\u0000\u0000\u0000\u00cb\u00cd"+
		"\u0003\b\u0004\u0000\u00cc\u00ce\u0003\f\u0006\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d1\u0003\u0010\b\u0000\u00d0\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d4\u0003\u0014\n\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u0007\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0005/\u0000\u0000\u00d6\u00d7\u0005\u0005\u0000\u0000"+
		"\u00d7\u00dc\u0003\n\u0005\u0000\u00d8\u00d9\u0005\n\u0000\u0000\u00d9"+
		"\u00db\u0003\n\u0005\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de"+
		"\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0006\u0000\u0000\u00e0\t\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0003B!\u0000\u00e2\u00e5\u0007\u0000\u0000"+
		"\u0000\u00e3\u00e6\u0003F#\u0000\u00e4\u00e6\u0003:\u001d\u0000\u00e5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u000b\u0001\u0000\u0000\u0000\u00e7\u00e8\u00050\u0000\u0000\u00e8\u00ec"+
		"\u0005\u0005\u0000\u0000\u00e9\u00eb\u0003\u000e\u0007\u0000\u00ea\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0005\u0006\u0000\u0000\u00f0\r\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003"+
		"B!\u0000\u00f2\u00f3\u0005\u000e\u0000\u0000\u00f3\u00f5\u0003X,\u0000"+
		"\u00f4\u00f6\u0005\u000b\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u000f\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u00051\u0000\u0000\u00f8\u00fc\u0005\u0005\u0000\u0000\u00f9"+
		"\u00fb\u0003\u0012\t\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0006\u0000\u0000\u0100\u0011"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0003B!\u0000\u0102\u0103\u0005\f"+
		"\u0000\u0000\u0103\u0105\u0003X,\u0000\u0104\u0106\u0005\u000b\u0000\u0000"+
		"\u0105\u0104\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0013\u0001\u0000\u0000\u0000\u0107\u0108\u00052\u0000\u0000\u0108"+
		"\u010a\u0005\u0005\u0000\u0000\u0109\u010b\u0003\u0016\u000b\u0000\u010a"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u0006\u0000\u0000\u010f"+
		"\u0015\u0001\u0000\u0000\u0000\u0110\u0111\u0003B!\u0000\u0111\u0112\u0005"+
		"\u000e\u0000\u0000\u0112\u0114\u0003X,\u0000\u0113\u0115\u0005\u000b\u0000"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0017\u0001\u0000\u0000\u0000\u0116\u0117\u0005:\u0000\u0000"+
		"\u0117\u0118\u0005\u0001\u0000\u0000\u0118\u0119\u0003\u001a\r\u0000\u0119"+
		"\u011a\u0005\u0002\u0000\u0000\u011a\u0019\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0005\u0005\u0000\u0000\u011c\u011d\u00054\u0000\u0000\u011d\u011e"+
		"\u0005\f\u0000\u0000\u011e\u011f\u0005W\u0000\u0000\u011f\u0120\u0005"+
		"\n\u0000\u0000\u0120\u0121\u00055\u0000\u0000\u0121\u0122\u0005\f\u0000"+
		"\u0000\u0122\u0123\u0005\u0012\u0000\u0000\u0123\u0124\u0003h4\u0000\u0124"+
		"\u012c\u0005\u0012\u0000\u0000\u0125\u0126\u0005\n\u0000\u0000\u0126\u0127"+
		"\u00059\u0000\u0000\u0127\u0128\u0005\f\u0000\u0000\u0128\u0129\u0005"+
		"\u0012\u0000\u0000\u0129\u012a\u0003\u0092I\u0000\u012a\u012b\u0005\u0012"+
		"\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u0125\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0005\u0006\u0000\u0000\u012f\u001b\u0001\u0000"+
		"\u0000\u0000\u0130\u0139\u0003\u001e\u000f\u0000\u0131\u0139\u00030\u0018"+
		"\u0000\u0132\u0139\u0003:\u001d\u0000\u0133\u0139\u0003 \u0010\u0000\u0134"+
		"\u0139\u0003\"\u0011\u0000\u0135\u0139\u0003`0\u0000\u0136\u0139\u0003"+
		",\u0016\u0000\u0137\u0139\u0003.\u0017\u0000\u0138\u0130\u0001\u0000\u0000"+
		"\u0000\u0138\u0131\u0001\u0000\u0000\u0000\u0138\u0132\u0001\u0000\u0000"+
		"\u0000\u0138\u0133\u0001\u0000\u0000\u0000\u0138\u0134\u0001\u0000\u0000"+
		"\u0000\u0138\u0135\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000"+
		"\u0000\u013a\u013c\u0005\u000b\u0000\u0000\u013b\u013a\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u001d\u0001\u0000\u0000"+
		"\u0000\u013d\u0141\u0005\u0005\u0000\u0000\u013e\u0140\u0003\u001c\u000e"+
		"\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0005\u0006\u0000\u0000\u0145\u001f\u0001\u0000\u0000"+
		"\u0000\u0146\u014a\u0003$\u0012\u0000\u0147\u014a\u0003(\u0014\u0000\u0148"+
		"\u014a\u0003*\u0015\u0000\u0149\u0146\u0001\u0000\u0000\u0000\u0149\u0147"+
		"\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a!\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0005\u0019\u0000\u0000\u014c\u014e\u0005"+
		"\u0001\u0000\u0000\u014d\u014f\u0003:\u001d\u0000\u014e\u014d\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0005\u0002\u0000\u0000\u0153\u0156\u0003\u001e"+
		"\u000f\u0000\u0154\u0155\u0005\u001a\u0000\u0000\u0155\u0157\u0003\u001e"+
		"\u000f\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157#\u0001\u0000\u0000\u0000\u0158\u0159\u0005\u001b\u0000"+
		"\u0000\u0159\u015a\u0005\u0001\u0000\u0000\u015a\u015b\u0003&\u0013\u0000"+
		"\u015b\u015c\u0005\u0002\u0000\u0000\u015c\u015d\u0003\u001e\u000f\u0000"+
		"\u015d%\u0001\u0000\u0000\u0000\u015e\u0160\u00032\u0019\u0000\u015f\u015e"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0001\u0000\u0000\u0000\u0161\u0163\u0005\u000b\u0000\u0000\u0162\u0164"+
		"\u0003:\u001d\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0005"+
		"\u000b\u0000\u0000\u0166\u0168\u0003:\u001d\u0000\u0167\u0166\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\'\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0005\u001c\u0000\u0000\u016a\u016b\u0005\u0001\u0000"+
		"\u0000\u016b\u016c\u0003:\u001d\u0000\u016c\u016d\u0005\u0002\u0000\u0000"+
		"\u016d\u016e\u0003\u001e\u000f\u0000\u016e)\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\u0005\u001d\u0000\u0000\u0170\u0171\u0003\u001e\u000f\u0000\u0171"+
		"\u0172\u0005\u001c\u0000\u0000\u0172\u0173\u0005\u0001\u0000\u0000\u0173"+
		"\u0174\u0003:\u001d\u0000\u0174\u0175\u0005\u0002\u0000\u0000\u0175+\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0005*\u0000\u0000\u0177\u0178\u0005\r"+
		"\u0000\u0000\u0178\u0179\u0005+\u0000\u0000\u0179\u017a\u0005\u0001\u0000"+
		"\u0000\u017a\u017b\u0003:\u001d\u0000\u017b\u017c\u0005\u0002\u0000\u0000"+
		"\u017c-\u0001\u0000\u0000\u0000\u017d\u017e\u0003B!\u0000\u017e\u017f"+
		"\u0005\u000e\u0000\u0000\u017f\u0180\u0003H$\u0000\u0180/\u0001\u0000"+
		"\u0000\u0000\u0181\u0185\u00032\u0019\u0000\u0182\u0185\u00034\u001a\u0000"+
		"\u0183\u0185\u0003V+\u0000\u0184\u0181\u0001\u0000\u0000\u0000\u0184\u0182"+
		"\u0001\u0000\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u01851\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0007\u0001\u0000\u0000\u0187\u0188\u0003"+
		"B!\u0000\u0188\u018b\u0005\u000e\u0000\u0000\u0189\u018c\u0003F#\u0000"+
		"\u018a\u018c\u0003:\u001d\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b"+
		"\u018a\u0001\u0000\u0000\u0000\u018c3\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0003B!\u0000\u018e\u018f\u0005\f\u0000\u0000\u018f\u0192\u00036\u001b"+
		"\u0000\u0190\u0191\u0005\u0003\u0000\u0000\u0191\u0193\u0005\u0004\u0000"+
		"\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0197\u0005\u000e\u0000"+
		"\u0000\u0195\u0198\u0003F#\u0000\u0196\u0198\u0003:\u001d\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198"+
		"5\u0001\u0000\u0000\u0000\u0199\u019a\u0007\u0002\u0000\u0000\u019a7\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0003B!\u0000\u019c\u019f\u0005\u000e\u0000"+
		"\u0000\u019d\u01a0\u0003:\u001d\u0000\u019e\u01a0\u0003F#\u0000\u019f"+
		"\u019d\u0001\u0000\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0"+
		"9\u0001\u0000\u0000\u0000\u01a1\u01a2\u0006\u001d\uffff\uffff\u0000\u01a2"+
		"\u01ae\u0003\u0090H\u0000\u01a3\u01ae\u0003H$\u0000\u01a4\u01ae\u0003"+
		"N\'\u0000\u01a5\u01ae\u0003X,\u0000\u01a6\u01ae\u0005W\u0000\u0000\u01a7"+
		"\u01ae\u0003>\u001f\u0000\u01a8\u01ae\u00038\u001c\u0000\u01a9\u01ae\u0003"+
		"<\u001e\u0000\u01aa\u01ae\u0005\u001e\u0000\u0000\u01ab\u01ae\u0005\u001f"+
		"\u0000\u0000\u01ac\u01ae\u0003B!\u0000\u01ad\u01a1\u0001\u0000\u0000\u0000"+
		"\u01ad\u01a3\u0001\u0000\u0000\u0000\u01ad\u01a4\u0001\u0000\u0000\u0000"+
		"\u01ad\u01a5\u0001\u0000\u0000\u0000\u01ad\u01a6\u0001\u0000\u0000\u0000"+
		"\u01ad\u01a7\u0001\u0000\u0000\u0000\u01ad\u01a8\u0001\u0000\u0000\u0000"+
		"\u01ad\u01a9\u0001\u0000\u0000\u0000\u01ad\u01aa\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ae\u01b5\u0001\u0000\u0000\u0000\u01af\u01b0\n\u0007\u0000\u0000\u01b0"+
		"\u01b4\u0005Q\u0000\u0000\u01b1\u01b2\n\u0006\u0000\u0000\u01b2\u01b4"+
		"\u0005R\u0000\u0000\u01b3\u01af\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6;\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01ba\u0005\u0018"+
		"\u0000\u0000\u01b9\u01bb\u0003:\u001d\u0000\u01ba\u01b9\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb=\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0006\u001f\uffff\uffff\u0000\u01bd\u01c1\u0005X\u0000\u0000"+
		"\u01be\u01c1\u0005W\u0000\u0000\u01bf\u01c1\u0003B!\u0000\u01c0\u01bc"+
		"\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c8\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\n\u0004\u0000\u0000\u01c3\u01c4\u0003@ \u0000\u01c4\u01c5\u0003>\u001f"+
		"\u0005\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9?\u0001\u0000\u0000\u0000"+
		"\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc\u0007\u0003\u0000\u0000"+
		"\u01ccA\u0001\u0000\u0000\u0000\u01cd\u01cf\u0005Y\u0000\u0000\u01ce\u01d0"+
		"\u0003D\"\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d0C\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005\u0003"+
		"\u0000\u0000\u01d2\u01d7\u0003:\u001d\u0000\u01d3\u01d4\u0005\n\u0000"+
		"\u0000\u01d4\u01d6\u0003:\u001d\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000"+
		"\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01db\u0005\u0004\u0000\u0000"+
		"\u01dbE\u0001\u0000\u0000\u0000\u01dc\u01e3\u0003H$\u0000\u01dd\u01e3"+
		"\u0003N\'\u0000\u01de\u01e3\u0005W\u0000\u0000\u01df\u01e3\u0005V\u0000"+
		"\u0000\u01e0\u01e3\u0005X\u0000\u0000\u01e1\u01e3\u0005S\u0000\u0000\u01e2"+
		"\u01dc\u0001\u0000\u0000\u0000\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e2"+
		"\u01de\u0001\u0000\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3"+
		"G\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u0003\u0000\u0000\u01e5\u01e6"+
		"\u0003J%\u0000\u01e6\u01e7\u0005\u0004\u0000\u0000\u01e7I\u0001\u0000"+
		"\u0000\u0000\u01e8\u01ea\u0003L&\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000"+
		"\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01ef\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ec\u0005\n\u0000\u0000\u01ec\u01ee\u0003L&\u0000\u01ed\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0K\u0001"+
		"\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f6\u0003"+
		"F#\u0000\u01f3\u01f6\u0003:\u001d\u0000\u01f4\u01f6\u0003B!\u0000\u01f5"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f6M\u0001\u0000\u0000\u0000\u01f7\u01f8"+
		"\u0005\u0005\u0000\u0000\u01f8\u01f9\u0003P(\u0000\u01f9\u01fa\u0005\u0006"+
		"\u0000\u0000\u01faO\u0001\u0000\u0000\u0000\u01fb\u01fd\u0003R)\u0000"+
		"\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000"+
		"\u01fd\u0202\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005\n\u0000\u0000\u01ff"+
		"\u0201\u0003R)\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0204\u0001"+
		"\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202\u0203\u0001"+
		"\u0000\u0000\u0000\u0203Q\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000"+
		"\u0000\u0000\u0205\u0206\u0007\u0004\u0000\u0000\u0206\u0207\u0005\f\u0000"+
		"\u0000\u0207\u0208\u0003:\u001d\u0000\u0208S\u0001\u0000\u0000\u0000\u0209"+
		"\u020c\u0003V+\u0000\u020a\u020c\u0003X,\u0000\u020b\u0209\u0001\u0000"+
		"\u0000\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020cU\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0003B!\u0000\u020e\u020f\u0003\\.\u0000\u020f\u0210"+
		"\u0003Z-\u0000\u0210W\u0001\u0000\u0000\u0000\u0211\u0212\u0003\\.\u0000"+
		"\u0212\u0213\u0005\u000f\u0000\u0000\u0213\u0214\u0003Z-\u0000\u0214Y"+
		"\u0001\u0000\u0000\u0000\u0215\u0216\u0003\u001e\u000f\u0000\u0216[\u0001"+
		"\u0000\u0000\u0000\u0217\u0219\u0005\u0001\u0000\u0000\u0218\u021a\u0003"+
		"^/\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000"+
		"\u0000\u021a\u021f\u0001\u0000\u0000\u0000\u021b\u021c\u0005\n\u0000\u0000"+
		"\u021c\u021e\u0003^/\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u0221"+
		"\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u0220"+
		"\u0001\u0000\u0000\u0000\u0220\u0222\u0001\u0000\u0000\u0000\u0221\u021f"+
		"\u0001\u0000\u0000\u0000\u0222\u0223\u0005\u0002\u0000\u0000\u0223]\u0001"+
		"\u0000\u0000\u0000\u0224\u022b\u0003B!\u0000\u0225\u0226\u0005\f\u0000"+
		"\u0000\u0226\u0229\u00036\u001b\u0000\u0227\u0228\u0005\u0003\u0000\u0000"+
		"\u0228\u022a\u0005\u0004\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000"+
		"\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022c\u0001\u0000\u0000\u0000"+
		"\u022b\u0225\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000"+
		"\u022c_\u0001\u0000\u0000\u0000\u022d\u022e\u0005\u0017\u0000\u0000\u022e"+
		"\u022f\u0003b1\u0000\u022f\u0230\u0003\u001e\u000f\u0000\u0230a\u0001"+
		"\u0000\u0000\u0000\u0231\u0240\u0005\u0001\u0000\u0000\u0232\u0234\u0003"+
		"d2\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000"+
		"\u0000\u0234\u023d\u0001\u0000\u0000\u0000\u0235\u0237\u0005\n\u0000\u0000"+
		"\u0236\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000"+
		"\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000"+
		"\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023c\u0003d2\u0000\u023b\u0236"+
		"\u0001\u0000\u0000\u0000\u023c\u023f\u0001\u0000\u0000\u0000\u023d\u023b"+
		"\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u0241"+
		"\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u0240\u0233"+
		"\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0242"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0005\u0002\u0000\u0000\u0243c\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0003f3\u0000\u0245\u0246\u0003B!\u0000"+
		"\u0246\u0247\u0005\f\u0000\u0000\u0247\u0248\u00036\u001b\u0000\u0248"+
		"e\u0001\u0000\u0000\u0000\u0249\u024a\u0007\u0005\u0000\u0000\u024ag\u0001"+
		"\u0000\u0000\u0000\u024b\u024d\u0003j5\u0000\u024c\u024b\u0001\u0000\u0000"+
		"\u0000\u024d\u0250\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000"+
		"\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024fi\u0001\u0000\u0000\u0000"+
		"\u0250\u024e\u0001\u0000\u0000\u0000\u0251\u0256\u0003t:\u0000\u0252\u0256"+
		"\u0003l6\u0000\u0253\u0256\u0003r9\u0000\u0254\u0256\u0005Y\u0000\u0000"+
		"\u0255\u0251\u0001\u0000\u0000\u0000\u0255\u0252\u0001\u0000\u0000\u0000"+
		"\u0255\u0253\u0001\u0000\u0000\u0000\u0255\u0254\u0001\u0000\u0000\u0000"+
		"\u0256k\u0001\u0000\u0000\u0000\u0257\u0258\u0005\u0005\u0000\u0000\u0258"+
		"\u0259\u0005\u0005\u0000\u0000\u0259\u025a\u0003n7\u0000\u025a\u025b\u0005"+
		"\u0006\u0000\u0000\u025b\u025c\u0005\u0006\u0000\u0000\u025cm\u0001\u0000"+
		"\u0000\u0000\u025d\u0260\u0003p8\u0000\u025e\u0260\u0003B!\u0000\u025f"+
		"\u025d\u0001\u0000\u0000\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u0260"+
		"o\u0001\u0000\u0000\u0000\u0261\u0266\u0003B!\u0000\u0262\u0263\u0005"+
		"\r\u0000\u0000\u0263\u0265\u0003B!\u0000\u0264\u0262\u0001\u0000\u0000"+
		"\u0000\u0265\u0268\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000"+
		"\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267q\u0001\u0000\u0000\u0000"+
		"\u0268\u0266\u0001\u0000\u0000\u0000\u0269\u026b\b\u0006\u0000\u0000\u026a"+
		"\u0269\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c"+
		"\u026a\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d"+
		"s\u0001\u0000\u0000\u0000\u026e\u0279\u0003z=\u0000\u026f\u0273\u0003"+
		"x<\u0000\u0270\u0272\u0003j5\u0000\u0271\u0270\u0001\u0000\u0000\u0000"+
		"\u0272\u0275\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000"+
		"\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0276\u0001\u0000\u0000\u0000"+
		"\u0275\u0273\u0001\u0000\u0000\u0000\u0276\u0277\u0003|>\u0000\u0277\u0279"+
		"\u0001\u0000\u0000\u0000\u0278\u026e\u0001\u0000\u0000\u0000\u0278\u026f"+
		"\u0001\u0000\u0000\u0000\u0279u\u0001\u0000\u0000\u0000\u027a\u027b\u0005"+
		"Y\u0000\u0000\u027bw\u0001\u0000\u0000\u0000\u027c\u027d\u0005\u0007\u0000"+
		"\u0000\u027d\u027f\u0003v;\u0000\u027e\u0280\u0003~?\u0000\u027f\u027e"+
		"\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0286"+
		"\u0001\u0000\u0000\u0000\u0281\u0285\u0003\u008aE\u0000\u0282\u0285\u0003"+
		"\u0084B\u0000\u0283\u0285\u0003\u008eG\u0000\u0284\u0281\u0001\u0000\u0000"+
		"\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0283\u0001\u0000\u0000"+
		"\u0000\u0285\u0288\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000"+
		"\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0289\u0001\u0000\u0000"+
		"\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0289\u028a\u0005\b\u0000\u0000"+
		"\u028ay\u0001\u0000\u0000\u0000\u028b\u028c\u0005\u0007\u0000\u0000\u028c"+
		"\u028e\u0003v;\u0000\u028d\u028f\u0003~?\u0000\u028e\u028d\u0001\u0000"+
		"\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0295\u0001\u0000"+
		"\u0000\u0000\u0290\u0294\u0003\u008aE\u0000\u0291\u0294\u0003\u0084B\u0000"+
		"\u0292\u0294\u0003\u008eG\u0000\u0293\u0290\u0001\u0000\u0000\u0000\u0293"+
		"\u0291\u0001\u0000\u0000\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0294"+
		"\u0297\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295"+
		"\u0296\u0001\u0000\u0000\u0000\u0296\u0298\u0001\u0000\u0000\u0000\u0297"+
		"\u0295\u0001\u0000\u0000\u0000\u0298\u0299\u0005\t\u0000\u0000\u0299\u029a"+
		"\u0005\b\u0000\u0000\u029a{\u0001\u0000\u0000\u0000\u029b\u029c\u0005"+
		"\u0007\u0000\u0000\u029c\u029d\u0005\t\u0000\u0000\u029d\u029e\u0003v"+
		";\u0000\u029e\u029f\u0005\b\u0000\u0000\u029f}\u0001\u0000\u0000\u0000"+
		"\u02a0\u02a3\u0003\u0080@\u0000\u02a1\u02a3\u0003\u0082A\u0000\u02a2\u02a0"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a1\u0001\u0000\u0000\u0000\u02a3\u007f"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a5\u0005,\u0000\u0000\u02a5\u02a6\u0005"+
		"\u000e\u0000\u0000\u02a6\u02af\u0005W\u0000\u0000\u02a7\u02a8\u0005,\u0000"+
		"\u0000\u02a8\u02a9\u0005\u000e\u0000\u0000\u02a9\u02aa\u0005$\u0000\u0000"+
		"\u02aa\u02ab\u0003B!\u0000\u02ab\u02ac\u00056\u0000\u0000\u02ac\u02ad"+
		"\u0003B!\u0000\u02ad\u02af\u0001\u0000\u0000\u0000\u02ae\u02a4\u0001\u0000"+
		"\u0000\u0000\u02ae\u02a7\u0001\u0000\u0000\u0000\u02af\u0081\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b1\u0005-\u0000\u0000\u02b1\u02b2\u0005\u000e\u0000"+
		"\u0000\u02b2\u02ba\u0005W\u0000\u0000\u02b3\u02b4\u0005-\u0000\u0000\u02b4"+
		"\u02b7\u0005\u000e\u0000\u0000\u02b5\u02b8\u0003B!\u0000\u02b6\u02b8\u0003"+
		"F#\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b8\u02ba\u0001\u0000\u0000\u0000\u02b9\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b9\u02b3\u0001\u0000\u0000\u0000\u02ba\u0083\u0001\u0000\u0000"+
		"\u0000\u02bb\u02bc\u0003\u0086C\u0000\u02bc\u02bd\u0005\u000e\u0000\u0000"+
		"\u02bd\u02be\u0003\u0088D\u0000\u02be\u0085\u0001\u0000\u0000\u0000\u02bf"+
		"\u02c0\u0005Y\u0000\u0000\u02c0\u0087\u0001\u0000\u0000\u0000\u02c1\u02c4"+
		"\u0005W\u0000\u0000\u02c2\u02c4\u0003p8\u0000\u02c3\u02c1\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c4\u0089\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c6\u0005\u0003\u0000\u0000\u02c6\u02c7\u0003\u0086"+
		"C\u0000\u02c7\u02c8\u0005\u0004\u0000\u0000\u02c8\u02c9\u0005\u000e\u0000"+
		"\u0000\u02c9\u02ca\u0005W\u0000\u0000\u02ca\u02d2\u0001\u0000\u0000\u0000"+
		"\u02cb\u02cc\u0005\u0003\u0000\u0000\u02cc\u02cd\u0003\u0086C\u0000\u02cd"+
		"\u02ce\u0005\u0004\u0000\u0000\u02ce\u02cf\u0005\u000e\u0000\u0000\u02cf"+
		"\u02d0\u0003p8\u0000\u02d0\u02d2\u0001\u0000\u0000\u0000\u02d1\u02c5\u0001"+
		"\u0000\u0000\u0000\u02d1\u02cb\u0001\u0000\u0000\u0000\u02d2\u008b\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d4\u0005Y\u0000\u0000\u02d4\u008d\u0001\u0000"+
		"\u0000\u0000\u02d5\u02d6\u0005\u0001\u0000\u0000\u02d6\u02d7\u0003\u008c"+
		"F\u0000\u02d7\u02d8\u0005\u0002\u0000\u0000\u02d8\u02d9\u0005\u000e\u0000"+
		"\u0000\u02d9\u02da\u0005W\u0000\u0000\u02da\u02e2\u0001\u0000\u0000\u0000"+
		"\u02db\u02dc\u0005\u0001\u0000\u0000\u02dc\u02dd\u0003\u008cF\u0000\u02dd"+
		"\u02de\u0005\u0002\u0000\u0000\u02de\u02df\u0005\u000e\u0000\u0000\u02df"+
		"\u02e0\u0003\u0090H\u0000\u02e0\u02e2\u0001\u0000\u0000\u0000\u02e1\u02d5"+
		"\u0001\u0000\u0000\u0000\u02e1\u02db\u0001\u0000\u0000\u0000\u02e2\u008f"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e7\u0003p8\u0000\u02e4\u02e7\u00053"+
		"\u0000\u0000\u02e5\u02e7\u00057\u0000\u0000\u02e6\u02e3\u0001\u0000\u0000"+
		"\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e5\u0001\u0000\u0000"+
		"\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02f1\u0005\u0001\u0000"+
		"\u0000\u02e9\u02ee\u0003:\u001d\u0000\u02ea\u02eb\u0005\n\u0000\u0000"+
		"\u02eb\u02ed\u0003:\u001d\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ed"+
		"\u02f0\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee"+
		"\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f2\u0001\u0000\u0000\u0000\u02f0"+
		"\u02ee\u0001\u0000\u0000\u0000\u02f1\u02e9\u0001\u0000\u0000\u0000\u02f1"+
		"\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3"+
		"\u02f4\u0005\u0002\u0000\u0000\u02f4\u0091\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f8\u0003\u0094J\u0000\u02f6\u02f8\u0003\u0096K\u0000\u02f7\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f6\u0001\u0000\u0000\u0000\u02f8\u02fb\u0001"+
		"\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001"+
		"\u0000\u0000\u0000\u02fa\u0093\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001"+
		"\u0000\u0000\u0000\u02fc\u02fd\u0005Y\u0000\u0000\u02fd\u0301\u0005\u0005"+
		"\u0000\u0000\u02fe\u0300\u0003\u0096K\u0000\u02ff\u02fe\u0001\u0000\u0000"+
		"\u0000\u0300\u0303\u0001\u0000\u0000\u0000\u0301\u02ff\u0001\u0000\u0000"+
		"\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0304\u0001\u0000\u0000"+
		"\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0304\u0305\u0005\u0006\u0000"+
		"\u0000\u0305\u0095\u0001\u0000\u0000\u0000\u0306\u0307\u0005Y\u0000\u0000"+
		"\u0307\u0308\u0005\f\u0000\u0000\u0308\u030a\u0003\u0098L\u0000\u0309"+
		"\u030b\u0005\u000b\u0000\u0000\u030a\u0309\u0001\u0000\u0000\u0000\u030a"+
		"\u030b\u0001\u0000\u0000\u0000\u030b\u0097\u0001\u0000\u0000\u0000\u030c"+
		"\u0313\u0005W\u0000\u0000\u030d\u0313\u0005X\u0000\u0000\u030e\u0313\u0005"+
		"U\u0000\u0000\u030f\u0313\u0005<\u0000\u0000\u0310\u0313\u0003p8\u0000"+
		"\u0311\u0313\u0003\u009aM\u0000\u0312\u030c\u0001\u0000\u0000\u0000\u0312"+
		"\u030d\u0001\u0000\u0000\u0000\u0312\u030e\u0001\u0000\u0000\u0000\u0312"+
		"\u030f\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0312"+
		"\u0311\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314"+
		"\u0312\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315"+
		"\u0099\u0001\u0000\u0000\u0000\u0316\u0317\u0005;\u0000\u0000\u0317\u009b"+
		"\u0001\u0000\u0000\u0000T\u009f\u00a5\u00aa\u00b2\u00be\u00c3\u00cd\u00d0"+
		"\u00d3\u00dc\u00e5\u00ec\u00f5\u00fc\u0105\u010c\u0114\u012c\u0138\u013b"+
		"\u0141\u0149\u0150\u0156\u015f\u0163\u0167\u0184\u018b\u0192\u0197\u019f"+
		"\u01ad\u01b3\u01b5\u01ba\u01c0\u01c8\u01cf\u01d7\u01e2\u01e9\u01ef\u01f5"+
		"\u01fc\u0202\u020b\u0219\u021f\u0229\u022b\u0233\u0238\u023d\u0240\u024e"+
		"\u0255\u025f\u0266\u026c\u0273\u0278\u027f\u0284\u0286\u028e\u0293\u0295"+
		"\u02a2\u02ae\u02b7\u02b9\u02c3\u02d1\u02e1\u02e6\u02ee\u02f1\u02f7\u02f9"+
		"\u0301\u030a\u0312\u0314";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}