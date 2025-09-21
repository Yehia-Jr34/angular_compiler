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
		RULE_eventBinding = 68, RULE_functionCall = 69;
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
			"boundAttribute", "eventName", "eventBinding", "functionCall"
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
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(140);
				importStatement();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Store) {
				{
				{
				setState(146);
				storeDecl();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			componentDecorator();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(153);
				match(Export);
				}
			}

			setState(156);
			match(Class);
			setState(157);
			identifier_();
			setState(158);
			match(OpenBrace);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785654952099882L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) {
				{
				{
				setState(159);
				statement();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(CloseBrace);
			setState(166);
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
			setState(168);
			match(Import);
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				{
				{
				setState(169);
				match(OpenBrace);
				setState(170);
				identifier_();
				setState(171);
				match(CloseBrace);
				}
				}
				break;
			case Identifier:
				{
				setState(173);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(176);
			match(From);
			setState(177);
			match(StringLiteral);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(178);
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
			setState(181);
			match(Store);
			setState(182);
			identifier_();
			setState(183);
			match(OpenBrace);
			setState(184);
			storeBody();
			setState(185);
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
			setState(187);
			stateSection();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Actions) {
				{
				setState(188);
				actionsSection();
				}
			}

			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Reducer) {
				{
				setState(191);
				reducerSection();
				}
			}

			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Selectors) {
				{
				setState(194);
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
			setState(197);
			match(State);
			setState(198);
			match(OpenBrace);
			setState(199);
			storeStateField();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(200);
				match(Comma);
				setState(201);
				storeStateField();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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
			setState(209);
			identifier_();
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==Colon || _la==Assign) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(211);
				anyLiteral();
				}
				break;
			case 2:
				{
				setState(212);
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
			setState(215);
			match(Actions);
			setState(216);
			match(OpenBrace);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(217);
				actionDecl();
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
			setState(225);
			identifier_();
			setState(226);
			match(Assign);
			setState(227);
			arrowFunctionDecleration();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(228);
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
			setState(231);
			match(Reducer);
			setState(232);
			match(OpenBrace);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(233);
				reducerRule();
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
			setState(241);
			identifier_();
			setState(242);
			match(Colon);
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
			setState(247);
			match(Selectors);
			setState(248);
			match(OpenBrace);
			setState(250); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(249);
				selectorDecl();
				}
				}
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(254);
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
			setState(256);
			identifier_();
			setState(257);
			match(Assign);
			setState(258);
			arrowFunctionDecleration();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(259);
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
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
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
			setState(262);
			identifier_();
			setState(263);
			match(OpenParen);
			setState(264);
			compoenentObject();
			setState(265);
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
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public TerminalNode Template() { return getToken(AngularParser.Template, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(OpenBrace);
			setState(268);
			match(Selector);
			setState(269);
			match(Colon);
			setState(270);
			match(StringLiteral);
			setState(271);
			match(Comma);
			setState(272);
			match(Template);
			setState(273);
			match(Colon);
			setState(274);
			html();
			setState(275);
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
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(277);
				block();
				}
				break;
			case 2:
				{
				setState(278);
				decl();
				}
				break;
			case 3:
				{
				setState(279);
				expr(0);
				}
				break;
			case 4:
				{
				setState(280);
				loops();
				}
				break;
			case 5:
				{
				setState(281);
				if_();
				}
				break;
			case 6:
				{
				setState(282);
				constructor();
				}
				break;
			case 7:
				{
				setState(283);
				consoleLog();
				}
				break;
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(286);
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
			setState(289);
			match(OpenBrace);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785654952099882L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) {
				{
				{
				setState(290);
				statement();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
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
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case For:
				{
				setState(298);
				for_();
				}
				break;
			case While:
				{
				setState(299);
				while_();
				}
				break;
			case Do:
				{
				setState(300);
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
			setState(303);
			match(If);
			setState(304);
			match(OpenParen);
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305);
				expr(0);
				}
				}
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4785075008831530L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0) );
			setState(310);
			match(CloseParen);
			setState(311);
			block();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(312);
				match(Else);
				setState(313);
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
			setState(316);
			match(For);
			setState(317);
			match(OpenParen);
			setState(318);
			forParameters();
			setState(319);
			match(CloseParen);
			setState(320);
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
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) {
				{
				setState(322);
				variableDecl();
				}
			}

			setState(325);
			match(SemiColon);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785075008831530L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) {
				{
				setState(326);
				expr(0);
				}
			}

			setState(329);
			match(SemiColon);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785075008831530L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) {
				{
				setState(330);
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
			setState(333);
			match(While);
			setState(334);
			match(OpenParen);
			setState(335);
			expr(0);
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
			setState(339);
			match(Do);
			setState(340);
			block();
			setState(341);
			match(While);
			setState(342);
			match(OpenParen);
			setState(343);
			expr(0);
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
			setState(346);
			match(Console);
			setState(347);
			match(Dot);
			setState(348);
			match(Log);
			setState(349);
			match(OpenParen);
			setState(350);
			expr(0);
			setState(351);
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
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				variableDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				variableTypeDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
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
			setState(358);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(359);
			identifier_();
			setState(360);
			match(Assign);
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(361);
				anyLiteral();
				}
				break;
			case 2:
				{
				setState(362);
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
			setState(365);
			identifier_();
			setState(366);
			match(Colon);
			setState(367);
			dataTypes();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBracket) {
				{
				setState(368);
				match(OpenBracket);
				setState(369);
				match(CloseBracket);
				}
			}

			setState(372);
			match(Assign);
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(373);
				anyLiteral();
				}
				break;
			case 2:
				{
				setState(374);
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
			setState(377);
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
			setState(379);
			identifier_();
			setState(380);
			match(Assign);
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(381);
				expr(0);
				}
				break;
			case 2:
				{
				setState(382);
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
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(386);
				functionCall();
				}
				break;
			case 2:
				{
				setState(387);
				arrayLiteral();
				}
				break;
			case 3:
				{
				setState(388);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(389);
				arrowFunctionDecleration();
				}
				break;
			case 5:
				{
				setState(390);
				match(StringLiteral);
				}
				break;
			case 6:
				{
				setState(391);
				arithmeticExpr(0);
				}
				break;
			case 7:
				{
				setState(392);
				initialize();
				}
				break;
			case 8:
				{
				setState(393);
				return_();
				}
				break;
			case 9:
				{
				setState(394);
				match(Break);
				}
				break;
			case 10:
				{
				setState(395);
				match(Continue);
				}
				break;
			case 11:
				{
				setState(396);
				identifier_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(403);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(399);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(400);
						match(PlusPlus);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(401);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(402);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
			setState(408);
			match(Return);
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(409);
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
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecimalLiteral:
				{
				setState(413);
				match(DecimalLiteral);
				}
				break;
			case StringLiteral:
				{
				setState(414);
				match(StringLiteral);
				}
				break;
			case Identifier:
				{
				setState(415);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpr);
					setState(418);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(419);
					operartor();
					setState(420);
					arithmeticExpr(5);
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
			setState(427);
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
			setState(429);
			match(Identifier);
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(430);
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
			setState(433);
			match(OpenBracket);
			setState(434);
			expr(0);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(435);
				match(Comma);
				setState(436);
				expr(0);
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
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
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				objectLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				match(BooleanLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				match(DecimalLiteral);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(449);
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
			setState(452);
			match(OpenBracket);
			setState(453);
			arrayList();
			setState(454);
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
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785075008831530L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0)) {
				{
				setState(456);
				arrayElement();
				}
			}

			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(459);
				match(Comma);
				setState(460);
				arrayElement();
				}
				}
				setState(465);
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
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				anyLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
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
			setState(471);
			match(OpenBrace);
			setState(472);
			objectBody();
			setState(473);
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
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) {
				{
				setState(475);
				objectKeyValue();
				}
			}

			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(478);
				match(Comma);
				setState(479);
				objectKeyValue();
				}
				}
				setState(484);
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
			setState(485);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(486);
			match(Colon);
			setState(487);
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
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				normalFunctionDecleration();
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
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
			setState(493);
			identifier_();
			setState(494);
			functionParameters();
			setState(495);
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
			setState(497);
			functionParameters();
			setState(498);
			match(Arrow);
			setState(499);
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
			setState(501);
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
			setState(503);
			match(OpenParen);
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(504);
				variableFunctionSingleArgument();
				}
			}

			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(507);
				match(Comma);
				setState(508);
				variableFunctionSingleArgument();
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(514);
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
			setState(516);
			identifier_();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(517);
				match(Colon);
				setState(518);
				dataTypes();
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket) {
					{
					setState(519);
					match(OpenBracket);
					setState(520);
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
			setState(525);
			match(Constructor);
			setState(526);
			injectableFunctionParameters();
			setState(527);
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
			setState(529);
			match(OpenParen);
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) {
					{
					setState(530);
					injectableVariableFunctionSingleArgument();
					}
				}

				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(534); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(533);
						match(Comma);
						}
						}
						setState(536); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(538);
					injectableVariableFunctionSingleArgument();
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
			setState(548);
			accessModifires();
			setState(549);
			identifier_();
			setState(550);
			match(Colon);
			setState(551);
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
			setState(553);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
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
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenBrace || _la==LessThan || _la==Identifier) {
				{
				{
				setState(555);
				htmlContent();
				}
				}
				setState(560);
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
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LessThan:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				htmlElement();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				match(Identifier);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(563);
				match(OpenBrace);
				setState(564);
				match(OpenBrace);
				setState(565);
				interpolationValue();
				setState(566);
				match(CloseBrace);
				setState(567);
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
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				identifierPath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
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
			setState(575);
			identifier_();
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(576);
				match(Dot);
				setState(577);
				identifier_();
				}
				}
				setState(582);
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
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				selfClosingTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				openTag();
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(585);
						htmlContent();
						}
						} 
					}
					setState(590);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(591);
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
			setState(595);
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
			setState(597);
			match(LessThan);
			setState(598);
			htmlTag();
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NgFor || _la==NgIf) {
				{
				setState(599);
				structuralDirectives();
				}
			}

			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenParen || _la==OpenBracket || _la==Identifier) {
				{
				setState(605);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
					{
					setState(602);
					boundAttribute();
					}
					break;
				case Identifier:
					{
					setState(603);
					attribute();
					}
					break;
				case OpenParen:
					{
					setState(604);
					eventBinding();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
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
			setState(612);
			match(LessThan);
			setState(613);
			match(Identifier);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenParen || _la==OpenBracket || _la==Identifier) {
				{
				setState(617);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
					{
					setState(614);
					boundAttribute();
					}
					break;
				case Identifier:
					{
					setState(615);
					attribute();
					}
					break;
				case OpenParen:
					{
					setState(616);
					eventBinding();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(622);
			match(Divide);
			setState(623);
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
			setState(625);
			match(LessThan);
			setState(626);
			match(Divide);
			setState(627);
			htmlTag();
			setState(628);
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
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NgFor:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				forDirective();
				}
				break;
			case NgIf:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
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
			setState(634);
			match(NgFor);
			setState(635);
			match(Assign);
			setState(636);
			match(Let);
			setState(637);
			identifier_();
			setState(638);
			match(Of);
			setState(639);
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
			setState(641);
			match(NgIf);
			setState(642);
			match(Assign);
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(643);
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
				setState(644);
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
			setState(647);
			attributeName();
			setState(648);
			match(Assign);
			setState(649);
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
			setState(651);
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
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				match(StringLiteral);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
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
			setState(657);
			match(OpenBracket);
			setState(658);
			attributeName();
			setState(659);
			match(CloseBracket);
			setState(660);
			match(Assign);
			setState(661);
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
			setState(663);
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
			setState(665);
			match(OpenParen);
			setState(666);
			eventName();
			setState(667);
			match(CloseParen);
			setState(668);
			match(Assign);
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(669);
				functionCall();
				}
				break;
			case 2:
				{
				setState(670);
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
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(673);
				identifierPath();
				}
				break;
			case Select:
				{
				setState(674);
				match(Select);
				}
				break;
			case Dispatch:
				{
				setState(675);
				match(Dispatch);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(678);
			match(OpenParen);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785075008831530L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) {
				{
				setState(679);
				expr(0);
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(680);
					match(Comma);
					setState(681);
					expr(0);
					}
					}
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(689);
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
		"\u0004\u0001S\u02b4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0001"+
		"\u0000\u0005\u0000\u008e\b\u0000\n\u0000\f\u0000\u0091\t\u0000\u0001\u0000"+
		"\u0005\u0000\u0094\b\u0000\n\u0000\f\u0000\u0097\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u009b\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u00a1\b\u0000\n\u0000\f\u0000\u00a4\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u00af\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00b4\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00be\b\u0003\u0001\u0003\u0003\u0003\u00c1\b\u0003\u0001\u0003\u0003"+
		"\u0003\u00c4\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00cb\b\u0004\n\u0004\f\u0004\u00ce\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00d6\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00db\b"+
		"\u0006\n\u0006\f\u0006\u00de\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00e6\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00eb\b\b\n\b\f\b\u00ee\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f6\b\t\u0001\n\u0001\n\u0001\n\u0004"+
		"\n\u00fb\b\n\u000b\n\f\n\u00fc\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0105\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u011d\b\u000e\u0001\u000e"+
		"\u0003\u000e\u0120\b\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u0124\b"+
		"\u000f\n\u000f\f\u000f\u0127\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u012e\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0004\u0011\u0133\b\u0011\u000b\u0011\f\u0011\u0134\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u013b\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0003\u0013\u0144\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0148"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u014c\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0165\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u016c\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0173\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0178\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0180\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u018e\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0194\b\u001c\n\u001c"+
		"\f\u001c\u0197\t\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u019b\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01a1\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01a7\b\u001e"+
		"\n\u001e\f\u001e\u01aa\t\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003"+
		" \u01b0\b \u0001!\u0001!\u0001!\u0001!\u0005!\u01b6\b!\n!\f!\u01b9\t!"+
		"\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\""+
		"\u01c3\b\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0003$\u01ca\b$\u0001$\u0001"+
		"$\u0005$\u01ce\b$\n$\f$\u01d1\t$\u0001%\u0001%\u0001%\u0003%\u01d6\b%"+
		"\u0001&\u0001&\u0001&\u0001&\u0001\'\u0003\'\u01dd\b\'\u0001\'\u0001\'"+
		"\u0005\'\u01e1\b\'\n\'\f\'\u01e4\t\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0003)\u01ec\b)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001-\u0001-\u0003-\u01fa\b-\u0001-\u0001-\u0005"+
		"-\u01fe\b-\n-\f-\u0201\t-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u020a\b.\u0003.\u020c\b.\u0001/\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00030\u0214\b0\u00010\u00040\u0217\b0\u000b0\f0\u0218\u00010\u0005"+
		"0\u021c\b0\n0\f0\u021f\t0\u00030\u0221\b0\u00010\u00010\u00011\u00011"+
		"\u00011\u00011\u00011\u00012\u00012\u00013\u00053\u022d\b3\n3\f3\u0230"+
		"\t3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u023a"+
		"\b4\u00015\u00015\u00035\u023e\b5\u00016\u00016\u00016\u00056\u0243\b"+
		"6\n6\f6\u0246\t6\u00017\u00017\u00017\u00057\u024b\b7\n7\f7\u024e\t7\u0001"+
		"7\u00017\u00037\u0252\b7\u00018\u00018\u00019\u00019\u00019\u00039\u0259"+
		"\b9\u00019\u00019\u00019\u00059\u025e\b9\n9\f9\u0261\t9\u00019\u00019"+
		"\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u026a\b:\n:\f:\u026d\t:\u0001"+
		":\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0003"+
		"<\u0279\b<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001"+
		">\u0001>\u0001>\u0003>\u0286\b>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001A\u0001A\u0003A\u0290\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u02a0"+
		"\bD\u0001E\u0001E\u0001E\u0003E\u02a5\bE\u0001E\u0001E\u0001E\u0001E\u0005"+
		"E\u02ab\bE\nE\fE\u02ae\tE\u0003E\u02b0\bE\u0001E\u0001E\u0001E\u0000\u0002"+
		"8<F\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u0000\u0006\u0002\u0000\f\f\u000e\u000e"+
		"\u0001\u0000 \"\u0001\u0000#&\u0003\u0000\u0007\t\r\u000e6I\u0001\u0000"+
		"NP\u0001\u0000\u001d\u001f\u02cf\u0000\u008f\u0001\u0000\u0000\u0000\u0002"+
		"\u00a8\u0001\u0000\u0000\u0000\u0004\u00b5\u0001\u0000\u0000\u0000\u0006"+
		"\u00bb\u0001\u0000\u0000\u0000\b\u00c5\u0001\u0000\u0000\u0000\n\u00d1"+
		"\u0001\u0000\u0000\u0000\f\u00d7\u0001\u0000\u0000\u0000\u000e\u00e1\u0001"+
		"\u0000\u0000\u0000\u0010\u00e7\u0001\u0000\u0000\u0000\u0012\u00f1\u0001"+
		"\u0000\u0000\u0000\u0014\u00f7\u0001\u0000\u0000\u0000\u0016\u0100\u0001"+
		"\u0000\u0000\u0000\u0018\u0106\u0001\u0000\u0000\u0000\u001a\u010b\u0001"+
		"\u0000\u0000\u0000\u001c\u011c\u0001\u0000\u0000\u0000\u001e\u0121\u0001"+
		"\u0000\u0000\u0000 \u012d\u0001\u0000\u0000\u0000\"\u012f\u0001\u0000"+
		"\u0000\u0000$\u013c\u0001\u0000\u0000\u0000&\u0143\u0001\u0000\u0000\u0000"+
		"(\u014d\u0001\u0000\u0000\u0000*\u0153\u0001\u0000\u0000\u0000,\u015a"+
		"\u0001\u0000\u0000\u0000.\u0164\u0001\u0000\u0000\u00000\u0166\u0001\u0000"+
		"\u0000\u00002\u016d\u0001\u0000\u0000\u00004\u0179\u0001\u0000\u0000\u0000"+
		"6\u017b\u0001\u0000\u0000\u00008\u018d\u0001\u0000\u0000\u0000:\u0198"+
		"\u0001\u0000\u0000\u0000<\u01a0\u0001\u0000\u0000\u0000>\u01ab\u0001\u0000"+
		"\u0000\u0000@\u01ad\u0001\u0000\u0000\u0000B\u01b1\u0001\u0000\u0000\u0000"+
		"D\u01c2\u0001\u0000\u0000\u0000F\u01c4\u0001\u0000\u0000\u0000H\u01c9"+
		"\u0001\u0000\u0000\u0000J\u01d5\u0001\u0000\u0000\u0000L\u01d7\u0001\u0000"+
		"\u0000\u0000N\u01dc\u0001\u0000\u0000\u0000P\u01e5\u0001\u0000\u0000\u0000"+
		"R\u01eb\u0001\u0000\u0000\u0000T\u01ed\u0001\u0000\u0000\u0000V\u01f1"+
		"\u0001\u0000\u0000\u0000X\u01f5\u0001\u0000\u0000\u0000Z\u01f7\u0001\u0000"+
		"\u0000\u0000\\\u0204\u0001\u0000\u0000\u0000^\u020d\u0001\u0000\u0000"+
		"\u0000`\u0211\u0001\u0000\u0000\u0000b\u0224\u0001\u0000\u0000\u0000d"+
		"\u0229\u0001\u0000\u0000\u0000f\u022e\u0001\u0000\u0000\u0000h\u0239\u0001"+
		"\u0000\u0000\u0000j\u023d\u0001\u0000\u0000\u0000l\u023f\u0001\u0000\u0000"+
		"\u0000n\u0251\u0001\u0000\u0000\u0000p\u0253\u0001\u0000\u0000\u0000r"+
		"\u0255\u0001\u0000\u0000\u0000t\u0264\u0001\u0000\u0000\u0000v\u0271\u0001"+
		"\u0000\u0000\u0000x\u0278\u0001\u0000\u0000\u0000z\u027a\u0001\u0000\u0000"+
		"\u0000|\u0281\u0001\u0000\u0000\u0000~\u0287\u0001\u0000\u0000\u0000\u0080"+
		"\u028b\u0001\u0000\u0000\u0000\u0082\u028f\u0001\u0000\u0000\u0000\u0084"+
		"\u0291\u0001\u0000\u0000\u0000\u0086\u0297\u0001\u0000\u0000\u0000\u0088"+
		"\u0299\u0001\u0000\u0000\u0000\u008a\u02a4\u0001\u0000\u0000\u0000\u008c"+
		"\u008e\u0003\u0002\u0001\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0095\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0092\u0094\u0003\u0004\u0002\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u009a\u0003\u0018\f\u0000\u0099\u009b\u0005\u0012\u0000\u0000\u009a\u0099"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0013\u0000\u0000\u009d\u009e"+
		"\u0003@ \u0000\u009e\u00a2\u0005\u0005\u0000\u0000\u009f\u00a1\u0003\u001c"+
		"\u000e\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005\u0006\u0000\u0000\u00a6\u00a7\u0005\u0000"+
		"\u0000\u0001\u00a7\u0001\u0001\u0000\u0000\u0000\u00a8\u00ae\u0005\u0010"+
		"\u0000\u0000\u00a9\u00aa\u0005\u0005\u0000\u0000\u00aa\u00ab\u0003@ \u0000"+
		"\u00ab\u00ac\u0005\u0006\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000"+
		"\u00ad\u00af\u0003@ \u0000\u00ae\u00a9\u0001\u0000\u0000\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0011\u0000\u0000\u00b1\u00b3\u0005N\u0000\u0000\u00b2\u00b4\u0005"+
		"\u000b\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u0003\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"+\u0000\u0000\u00b6\u00b7\u0003@ \u0000\u00b7\u00b8\u0005\u0005\u0000"+
		"\u0000\u00b8\u00b9\u0003\u0006\u0003\u0000\u00b9\u00ba\u0005\u0006\u0000"+
		"\u0000\u00ba\u0005\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003\b\u0004\u0000"+
		"\u00bc\u00be\u0003\f\u0006\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c1\u0003\u0010\b\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0003\u0014\n\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c4\u0007\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		",\u0000\u0000\u00c6\u00c7\u0005\u0005\u0000\u0000\u00c7\u00cc\u0003\n"+
		"\u0005\u0000\u00c8\u00c9\u0005\n\u0000\u0000\u00c9\u00cb\u0003\n\u0005"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005\u0006\u0000\u0000\u00d0\t\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0003@ \u0000\u00d2\u00d5\u0007\u0000\u0000\u0000\u00d3\u00d6"+
		"\u0003D\"\u0000\u00d4\u00d6\u00038\u001c\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u000b\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0005-\u0000\u0000\u00d8\u00dc\u0005\u0005\u0000"+
		"\u0000\u00d9\u00db\u0003\u000e\u0007\u0000\u00da\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0006\u0000"+
		"\u0000\u00e0\r\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003@ \u0000\u00e2"+
		"\u00e3\u0005\u000e\u0000\u0000\u00e3\u00e5\u0003V+\u0000\u00e4\u00e6\u0005"+
		"\u000b\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u000f\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		".\u0000\u0000\u00e8\u00ec\u0005\u0005\u0000\u0000\u00e9\u00eb\u0003\u0012"+
		"\t\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005\u0006\u0000\u0000\u00f0\u0011\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0003@ \u0000\u00f2\u00f3\u0005\f\u0000\u0000\u00f3"+
		"\u00f5\u0003V+\u0000\u00f4\u00f6\u0005\u000b\u0000\u0000\u00f5\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u0013\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005/\u0000\u0000\u00f8\u00fa\u0005\u0005"+
		"\u0000\u0000\u00f9\u00fb\u0003\u0016\u000b\u0000\u00fa\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0005\u0006\u0000\u0000\u00ff\u0015\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0003@ \u0000\u0101\u0102\u0005\u000e\u0000\u0000"+
		"\u0102\u0104\u0003V+\u0000\u0103\u0105\u0005\u000b\u0000\u0000\u0104\u0103"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0017"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0003@ \u0000\u0107\u0108\u0005\u0001"+
		"\u0000\u0000\u0108\u0109\u0003\u001a\r\u0000\u0109\u010a\u0005\u0002\u0000"+
		"\u0000\u010a\u0019\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0005\u0000"+
		"\u0000\u010c\u010d\u00051\u0000\u0000\u010d\u010e\u0005\f\u0000\u0000"+
		"\u010e\u010f\u0005N\u0000\u0000\u010f\u0110\u0005\n\u0000\u0000\u0110"+
		"\u0111\u00052\u0000\u0000\u0111\u0112\u0005\f\u0000\u0000\u0112\u0113"+
		"\u0003f3\u0000\u0113\u0114\u0005\u0006\u0000\u0000\u0114\u001b\u0001\u0000"+
		"\u0000\u0000\u0115\u011d\u0003\u001e\u000f\u0000\u0116\u011d\u0003.\u0017"+
		"\u0000\u0117\u011d\u00038\u001c\u0000\u0118\u011d\u0003 \u0010\u0000\u0119"+
		"\u011d\u0003\"\u0011\u0000\u011a\u011d\u0003^/\u0000\u011b\u011d\u0003"+
		",\u0016\u0000\u011c\u0115\u0001\u0000\u0000\u0000\u011c\u0116\u0001\u0000"+
		"\u0000\u0000\u011c\u0117\u0001\u0000\u0000\u0000\u011c\u0118\u0001\u0000"+
		"\u0000\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u011f\u0001\u0000"+
		"\u0000\u0000\u011e\u0120\u0005\u000b\u0000\u0000\u011f\u011e\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u001d\u0001\u0000"+
		"\u0000\u0000\u0121\u0125\u0005\u0005\u0000\u0000\u0122\u0124\u0003\u001c"+
		"\u000e\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000"+
		"\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0005\u0006\u0000\u0000\u0129\u001f\u0001\u0000"+
		"\u0000\u0000\u012a\u012e\u0003$\u0012\u0000\u012b\u012e\u0003(\u0014\u0000"+
		"\u012c\u012e\u0003*\u0015\u0000\u012d\u012a\u0001\u0000\u0000\u0000\u012d"+
		"\u012b\u0001\u0000\u0000\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e"+
		"!\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u0016\u0000\u0000\u0130\u0132"+
		"\u0005\u0001\u0000\u0000\u0131\u0133\u00038\u001c\u0000\u0132\u0131\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0132\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005\u0002\u0000\u0000\u0137\u013a\u0003"+
		"\u001e\u000f\u0000\u0138\u0139\u0005\u0017\u0000\u0000\u0139\u013b\u0003"+
		"\u001e\u000f\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001"+
		"\u0000\u0000\u0000\u013b#\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0018"+
		"\u0000\u0000\u013d\u013e\u0005\u0001\u0000\u0000\u013e\u013f\u0003&\u0013"+
		"\u0000\u013f\u0140\u0005\u0002\u0000\u0000\u0140\u0141\u0003\u001e\u000f"+
		"\u0000\u0141%\u0001\u0000\u0000\u0000\u0142\u0144\u00030\u0018\u0000\u0143"+
		"\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0001\u0000\u0000\u0000\u0145\u0147\u0005\u000b\u0000\u0000\u0146"+
		"\u0148\u00038\u001c\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014b"+
		"\u0005\u000b\u0000\u0000\u014a\u014c\u00038\u001c\u0000\u014b\u014a\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\'\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005\u0019\u0000\u0000\u014e\u014f\u0005\u0001"+
		"\u0000\u0000\u014f\u0150\u00038\u001c\u0000\u0150\u0151\u0005\u0002\u0000"+
		"\u0000\u0151\u0152\u0003\u001e\u000f\u0000\u0152)\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0005\u001a\u0000\u0000\u0154\u0155\u0003\u001e\u000f\u0000"+
		"\u0155\u0156\u0005\u0019\u0000\u0000\u0156\u0157\u0005\u0001\u0000\u0000"+
		"\u0157\u0158\u00038\u001c\u0000\u0158\u0159\u0005\u0002\u0000\u0000\u0159"+
		"+\u0001\u0000\u0000\u0000\u015a\u015b\u0005\'\u0000\u0000\u015b\u015c"+
		"\u0005\r\u0000\u0000\u015c\u015d\u0005(\u0000\u0000\u015d\u015e\u0005"+
		"\u0001\u0000\u0000\u015e\u015f\u00038\u001c\u0000\u015f\u0160\u0005\u0002"+
		"\u0000\u0000\u0160-\u0001\u0000\u0000\u0000\u0161\u0165\u00030\u0018\u0000"+
		"\u0162\u0165\u00032\u0019\u0000\u0163\u0165\u0003T*\u0000\u0164\u0161"+
		"\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0163"+
		"\u0001\u0000\u0000\u0000\u0165/\u0001\u0000\u0000\u0000\u0166\u0167\u0007"+
		"\u0001\u0000\u0000\u0167\u0168\u0003@ \u0000\u0168\u016b\u0005\u000e\u0000"+
		"\u0000\u0169\u016c\u0003D\"\u0000\u016a\u016c\u00038\u001c\u0000\u016b"+
		"\u0169\u0001\u0000\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c"+
		"1\u0001\u0000\u0000\u0000\u016d\u016e\u0003@ \u0000\u016e\u016f\u0005"+
		"\f\u0000\u0000\u016f\u0172\u00034\u001a\u0000\u0170\u0171\u0005\u0003"+
		"\u0000\u0000\u0171\u0173\u0005\u0004\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174\u0177\u0005\u000e\u0000\u0000\u0175\u0178\u0003D\""+
		"\u0000\u0176\u0178\u00038\u001c\u0000\u0177\u0175\u0001\u0000\u0000\u0000"+
		"\u0177\u0176\u0001\u0000\u0000\u0000\u01783\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0007\u0002\u0000\u0000\u017a5\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0003@ \u0000\u017c\u017f\u0005\u000e\u0000\u0000\u017d\u0180\u00038"+
		"\u001c\u0000\u017e\u0180\u0003D\"\u0000\u017f\u017d\u0001\u0000\u0000"+
		"\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u01807\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0006\u001c\uffff\uffff\u0000\u0182\u018e\u0003\u008aE\u0000"+
		"\u0183\u018e\u0003F#\u0000\u0184\u018e\u0003L&\u0000\u0185\u018e\u0003"+
		"V+\u0000\u0186\u018e\u0005N\u0000\u0000\u0187\u018e\u0003<\u001e\u0000"+
		"\u0188\u018e\u00036\u001b\u0000\u0189\u018e\u0003:\u001d\u0000\u018a\u018e"+
		"\u0005\u001b\u0000\u0000\u018b\u018e\u0005\u001c\u0000\u0000\u018c\u018e"+
		"\u0003@ \u0000\u018d\u0181\u0001\u0000\u0000\u0000\u018d\u0183\u0001\u0000"+
		"\u0000\u0000\u018d\u0184\u0001\u0000\u0000\u0000\u018d\u0185\u0001\u0000"+
		"\u0000\u0000\u018d\u0186\u0001\u0000\u0000\u0000\u018d\u0187\u0001\u0000"+
		"\u0000\u0000\u018d\u0188\u0001\u0000\u0000\u0000\u018d\u0189\u0001\u0000"+
		"\u0000\u0000\u018d\u018a\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000"+
		"\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e\u0195\u0001\u0000"+
		"\u0000\u0000\u018f\u0190\n\u0007\u0000\u0000\u0190\u0194\u0005J\u0000"+
		"\u0000\u0191\u0192\n\u0006\u0000\u0000\u0192\u0194\u0005K\u0000\u0000"+
		"\u0193\u018f\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000"+
		"\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0001\u0000\u0000\u0000\u01969\u0001\u0000\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0198\u019a\u0005\u0015\u0000\u0000\u0199"+
		"\u019b\u00038\u001c\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0001\u0000\u0000\u0000\u019b;\u0001\u0000\u0000\u0000\u019c\u019d\u0006"+
		"\u001e\uffff\uffff\u0000\u019d\u01a1\u0005O\u0000\u0000\u019e\u01a1\u0005"+
		"N\u0000\u0000\u019f\u01a1\u0003@ \u0000\u01a0\u019c\u0001\u0000\u0000"+
		"\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u019f\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a8\u0001\u0000\u0000\u0000\u01a2\u01a3\n\u0004\u0000\u0000"+
		"\u01a3\u01a4\u0003>\u001f\u0000\u01a4\u01a5\u0003<\u001e\u0005\u01a5\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a2\u0001\u0000\u0000\u0000\u01a7\u01aa"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a9=\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u0007\u0003\u0000\u0000\u01ac?\u0001\u0000"+
		"\u0000\u0000\u01ad\u01af\u0005P\u0000\u0000\u01ae\u01b0\u0003B!\u0000"+
		"\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b0A\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005\u0003\u0000\u0000\u01b2"+
		"\u01b7\u00038\u001c\u0000\u01b3\u01b4\u0005\n\u0000\u0000\u01b4\u01b6"+
		"\u00038\u001c\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bb\u0005\u0004\u0000\u0000\u01bbC\u0001\u0000"+
		"\u0000\u0000\u01bc\u01c3\u0003F#\u0000\u01bd\u01c3\u0003L&\u0000\u01be"+
		"\u01c3\u0005N\u0000\u0000\u01bf\u01c3\u0005M\u0000\u0000\u01c0\u01c3\u0005"+
		"O\u0000\u0000\u01c1\u01c3\u0005L\u0000\u0000\u01c2\u01bc\u0001\u0000\u0000"+
		"\u0000\u01c2\u01bd\u0001\u0000\u0000\u0000\u01c2\u01be\u0001\u0000\u0000"+
		"\u0000\u01c2\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3E\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c5\u0005\u0003\u0000\u0000\u01c5\u01c6\u0003H$\u0000\u01c6\u01c7"+
		"\u0005\u0004\u0000\u0000\u01c7G\u0001\u0000\u0000\u0000\u01c8\u01ca\u0003"+
		"J%\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cf\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005\n\u0000\u0000"+
		"\u01cc\u01ce\u0003J%\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01d1"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0I\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d6\u0003D\"\u0000\u01d3\u01d6\u00038\u001c"+
		"\u0000\u01d4\u01d6\u0003@ \u0000\u01d5\u01d2\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6"+
		"K\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005\u0005\u0000\u0000\u01d8\u01d9"+
		"\u0003N\'\u0000\u01d9\u01da\u0005\u0006\u0000\u0000\u01daM\u0001\u0000"+
		"\u0000\u0000\u01db\u01dd\u0003P(\u0000\u01dc\u01db\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01e2\u0001\u0000\u0000\u0000"+
		"\u01de\u01df\u0005\n\u0000\u0000\u01df\u01e1\u0003P(\u0000\u01e0\u01de"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3O\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e6\u0007"+
		"\u0004\u0000\u0000\u01e6\u01e7\u0005\f\u0000\u0000\u01e7\u01e8\u00038"+
		"\u001c\u0000\u01e8Q\u0001\u0000\u0000\u0000\u01e9\u01ec\u0003T*\u0000"+
		"\u01ea\u01ec\u0003V+\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ea"+
		"\u0001\u0000\u0000\u0000\u01ecS\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003"+
		"@ \u0000\u01ee\u01ef\u0003Z-\u0000\u01ef\u01f0\u0003X,\u0000\u01f0U\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f2\u0003Z-\u0000\u01f2\u01f3\u0005\u000f\u0000"+
		"\u0000\u01f3\u01f4\u0003X,\u0000\u01f4W\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f6\u0003\u001e\u000f\u0000\u01f6Y\u0001\u0000\u0000\u0000\u01f7\u01f9"+
		"\u0005\u0001\u0000\u0000\u01f8\u01fa\u0003\\.\u0000\u01f9\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01ff\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0005\n\u0000\u0000\u01fc\u01fe\u0003\\"+
		".\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u0201\u0001\u0000\u0000"+
		"\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000"+
		"\u0000\u0200\u0202\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0005\u0002\u0000\u0000\u0203[\u0001\u0000\u0000\u0000"+
		"\u0204\u020b\u0003@ \u0000\u0205\u0206\u0005\f\u0000\u0000\u0206\u0209"+
		"\u00034\u001a\u0000\u0207\u0208\u0005\u0003\u0000\u0000\u0208\u020a\u0005"+
		"\u0004\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001"+
		"\u0000\u0000\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u0205\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c]\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0005\u0014\u0000\u0000\u020e\u020f\u0003`0\u0000"+
		"\u020f\u0210\u0003\u001e\u000f\u0000\u0210_\u0001\u0000\u0000\u0000\u0211"+
		"\u0220\u0005\u0001\u0000\u0000\u0212\u0214\u0003b1\u0000\u0213\u0212\u0001"+
		"\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u021d\u0001"+
		"\u0000\u0000\u0000\u0215\u0217\u0005\n\u0000\u0000\u0216\u0215\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000"+
		"\u0000\u0000\u021a\u021c\u0003b1\u0000\u021b\u0216\u0001\u0000\u0000\u0000"+
		"\u021c\u021f\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000"+
		"\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u0221\u0001\u0000\u0000\u0000"+
		"\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0213\u0001\u0000\u0000\u0000"+
		"\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000"+
		"\u0222\u0223\u0005\u0002\u0000\u0000\u0223a\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0003d2\u0000\u0225\u0226\u0003@ \u0000\u0226\u0227\u0005\f\u0000"+
		"\u0000\u0227\u0228\u00034\u001a\u0000\u0228c\u0001\u0000\u0000\u0000\u0229"+
		"\u022a\u0007\u0005\u0000\u0000\u022ae\u0001\u0000\u0000\u0000\u022b\u022d"+
		"\u0003h4\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022d\u0230\u0001\u0000"+
		"\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000"+
		"\u0000\u0000\u022fg\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000"+
		"\u0000\u0231\u023a\u0003n7\u0000\u0232\u023a\u0005P\u0000\u0000\u0233"+
		"\u0234\u0005\u0005\u0000\u0000\u0234\u0235\u0005\u0005\u0000\u0000\u0235"+
		"\u0236\u0003j5\u0000\u0236\u0237\u0005\u0006\u0000\u0000\u0237\u0238\u0005"+
		"\u0006\u0000\u0000\u0238\u023a\u0001\u0000\u0000\u0000\u0239\u0231\u0001"+
		"\u0000\u0000\u0000\u0239\u0232\u0001\u0000\u0000\u0000\u0239\u0233\u0001"+
		"\u0000\u0000\u0000\u023ai\u0001\u0000\u0000\u0000\u023b\u023e\u0003l6"+
		"\u0000\u023c\u023e\u0003@ \u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d"+
		"\u023c\u0001\u0000\u0000\u0000\u023ek\u0001\u0000\u0000\u0000\u023f\u0244"+
		"\u0003@ \u0000\u0240\u0241\u0005\r\u0000\u0000\u0241\u0243\u0003@ \u0000"+
		"\u0242\u0240\u0001\u0000\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000"+
		"\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000"+
		"\u0245m\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0247"+
		"\u0252\u0003t:\u0000\u0248\u024c\u0003r9\u0000\u0249\u024b\u0003h4\u0000"+
		"\u024a\u0249\u0001\u0000\u0000\u0000\u024b\u024e\u0001\u0000\u0000\u0000"+
		"\u024c\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000"+
		"\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000"+
		"\u024f\u0250\u0003v;\u0000\u0250\u0252\u0001\u0000\u0000\u0000\u0251\u0247"+
		"\u0001\u0000\u0000\u0000\u0251\u0248\u0001\u0000\u0000\u0000\u0252o\u0001"+
		"\u0000\u0000\u0000\u0253\u0254\u0005P\u0000\u0000\u0254q\u0001\u0000\u0000"+
		"\u0000\u0255\u0256\u0005\u0007\u0000\u0000\u0256\u0258\u0003p8\u0000\u0257"+
		"\u0259\u0003x<\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0258\u0259\u0001"+
		"\u0000\u0000\u0000\u0259\u025f\u0001\u0000\u0000\u0000\u025a\u025e\u0003"+
		"\u0084B\u0000\u025b\u025e\u0003~?\u0000\u025c\u025e\u0003\u0088D\u0000"+
		"\u025d\u025a\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000"+
		"\u025d\u025c\u0001\u0000\u0000\u0000\u025e\u0261\u0001\u0000\u0000\u0000"+
		"\u025f\u025d\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000"+
		"\u0260\u0262\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000"+
		"\u0262\u0263\u0005\b\u0000\u0000\u0263s\u0001\u0000\u0000\u0000\u0264"+
		"\u0265\u0005\u0007\u0000\u0000\u0265\u026b\u0005P\u0000\u0000\u0266\u026a"+
		"\u0003\u0084B\u0000\u0267\u026a\u0003~?\u0000\u0268\u026a\u0003\u0088"+
		"D\u0000\u0269\u0266\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000"+
		"\u0000\u0269\u0268\u0001\u0000\u0000\u0000\u026a\u026d\u0001\u0000\u0000"+
		"\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000"+
		"\u0000\u026c\u026e\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000"+
		"\u0000\u026e\u026f\u0005\t\u0000\u0000\u026f\u0270\u0005\b\u0000\u0000"+
		"\u0270u\u0001\u0000\u0000\u0000\u0271\u0272\u0005\u0007\u0000\u0000\u0272"+
		"\u0273\u0005\t\u0000\u0000\u0273\u0274\u0003p8\u0000\u0274\u0275\u0005"+
		"\b\u0000\u0000\u0275w\u0001\u0000\u0000\u0000\u0276\u0279\u0003z=\u0000"+
		"\u0277\u0279\u0003|>\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0278\u0277"+
		"\u0001\u0000\u0000\u0000\u0279y\u0001\u0000\u0000\u0000\u027a\u027b\u0005"+
		")\u0000\u0000\u027b\u027c\u0005\u000e\u0000\u0000\u027c\u027d\u0005!\u0000"+
		"\u0000\u027d\u027e\u0003@ \u0000\u027e\u027f\u00053\u0000\u0000\u027f"+
		"\u0280\u0003@ \u0000\u0280{\u0001\u0000\u0000\u0000\u0281\u0282\u0005"+
		"*\u0000\u0000\u0282\u0285\u0005\u000e\u0000\u0000\u0283\u0286\u0003@ "+
		"\u0000\u0284\u0286\u0003D\"\u0000\u0285\u0283\u0001\u0000\u0000\u0000"+
		"\u0285\u0284\u0001\u0000\u0000\u0000\u0286}\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0003\u0080@\u0000\u0288\u0289\u0005\u000e\u0000\u0000\u0289\u028a"+
		"\u0003\u0082A\u0000\u028a\u007f\u0001\u0000\u0000\u0000\u028b\u028c\u0005"+
		"P\u0000\u0000\u028c\u0081\u0001\u0000\u0000\u0000\u028d\u0290\u0005N\u0000"+
		"\u0000\u028e\u0290\u0003l6\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u028f"+
		"\u028e\u0001\u0000\u0000\u0000\u0290\u0083\u0001\u0000\u0000\u0000\u0291"+
		"\u0292\u0005\u0003\u0000\u0000\u0292\u0293\u0003\u0080@\u0000\u0293\u0294"+
		"\u0005\u0004\u0000\u0000\u0294\u0295\u0005\u000e\u0000\u0000\u0295\u0296"+
		"\u0003l6\u0000\u0296\u0085\u0001\u0000\u0000\u0000\u0297\u0298\u0005P"+
		"\u0000\u0000\u0298\u0087\u0001\u0000\u0000\u0000\u0299\u029a\u0005\u0001"+
		"\u0000\u0000\u029a\u029b\u0003\u0086C\u0000\u029b\u029c\u0005\u0002\u0000"+
		"\u0000\u029c\u029f\u0005\u000e\u0000\u0000\u029d\u02a0\u0003\u008aE\u0000"+
		"\u029e\u02a0\u0003l6\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u029f\u029e"+
		"\u0001\u0000\u0000\u0000\u02a0\u0089\u0001\u0000\u0000\u0000\u02a1\u02a5"+
		"\u0003l6\u0000\u02a2\u02a5\u00050\u0000\u0000\u02a3\u02a5\u00054\u0000"+
		"\u0000\u02a4\u02a1\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000"+
		"\u0000\u02a6\u02af\u0005\u0001\u0000\u0000\u02a7\u02ac\u00038\u001c\u0000"+
		"\u02a8\u02a9\u0005\n\u0000\u0000\u02a9\u02ab\u00038\u001c\u0000\u02aa"+
		"\u02a8\u0001\u0000\u0000\u0000\u02ab\u02ae\u0001\u0000\u0000\u0000\u02ac"+
		"\u02aa\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad"+
		"\u02b0\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02af"+
		"\u02a7\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b2\u0005\u0002\u0000\u0000\u02b2"+
		"\u008b\u0001\u0000\u0000\u0000H\u008f\u0095\u009a\u00a2\u00ae\u00b3\u00bd"+
		"\u00c0\u00c3\u00cc\u00d5\u00dc\u00e5\u00ec\u00f5\u00fc\u0104\u011c\u011f"+
		"\u0125\u012d\u0134\u013a\u0143\u0147\u014b\u0164\u016b\u0172\u0177\u017f"+
		"\u018d\u0193\u0195\u019a\u01a0\u01a8\u01af\u01b7\u01c2\u01c9\u01cf\u01d5"+
		"\u01dc\u01e2\u01eb\u01f9\u01ff\u0209\u020b\u0213\u0218\u021d\u0220\u022e"+
		"\u0239\u023d\u0244\u024c\u0251\u0258\u025d\u025f\u0269\u026b\u0278\u0285"+
		"\u028f\u029f\u02a4\u02ac\u02af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}