// Generated from D:/F.I.T.E/Fifth Year/S2/Compiler/Last_Angular_Compiler/src/LexerAndParser/AngularParser.g4 by ANTLR 4.13.2
package LexerAndParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(AngularParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(AngularParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#storeDecl}.
	 * @param ctx the parse tree
	 */
	void enterStoreDecl(AngularParser.StoreDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#storeDecl}.
	 * @param ctx the parse tree
	 */
	void exitStoreDecl(AngularParser.StoreDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#storeBody}.
	 * @param ctx the parse tree
	 */
	void enterStoreBody(AngularParser.StoreBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#storeBody}.
	 * @param ctx the parse tree
	 */
	void exitStoreBody(AngularParser.StoreBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#stateSection}.
	 * @param ctx the parse tree
	 */
	void enterStateSection(AngularParser.StateSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#stateSection}.
	 * @param ctx the parse tree
	 */
	void exitStateSection(AngularParser.StateSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#storeStateField}.
	 * @param ctx the parse tree
	 */
	void enterStoreStateField(AngularParser.StoreStateFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#storeStateField}.
	 * @param ctx the parse tree
	 */
	void exitStoreStateField(AngularParser.StoreStateFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#actionsSection}.
	 * @param ctx the parse tree
	 */
	void enterActionsSection(AngularParser.ActionsSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#actionsSection}.
	 * @param ctx the parse tree
	 */
	void exitActionsSection(AngularParser.ActionsSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#actionDecl}.
	 * @param ctx the parse tree
	 */
	void enterActionDecl(AngularParser.ActionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#actionDecl}.
	 * @param ctx the parse tree
	 */
	void exitActionDecl(AngularParser.ActionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#reducerSection}.
	 * @param ctx the parse tree
	 */
	void enterReducerSection(AngularParser.ReducerSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#reducerSection}.
	 * @param ctx the parse tree
	 */
	void exitReducerSection(AngularParser.ReducerSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#reducerRule}.
	 * @param ctx the parse tree
	 */
	void enterReducerRule(AngularParser.ReducerRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#reducerRule}.
	 * @param ctx the parse tree
	 */
	void exitReducerRule(AngularParser.ReducerRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selectorsSection}.
	 * @param ctx the parse tree
	 */
	void enterSelectorsSection(AngularParser.SelectorsSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selectorsSection}.
	 * @param ctx the parse tree
	 */
	void exitSelectorsSection(AngularParser.SelectorsSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selectorDecl}.
	 * @param ctx the parse tree
	 */
	void enterSelectorDecl(AngularParser.SelectorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selectorDecl}.
	 * @param ctx the parse tree
	 */
	void exitSelectorDecl(AngularParser.SelectorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDecorator}.
	 * @param ctx the parse tree
	 */
	void enterComponentDecorator(AngularParser.ComponentDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDecorator}.
	 * @param ctx the parse tree
	 */
	void exitComponentDecorator(AngularParser.ComponentDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#compoenentObject}.
	 * @param ctx the parse tree
	 */
	void enterCompoenentObject(AngularParser.CompoenentObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#compoenentObject}.
	 * @param ctx the parse tree
	 */
	void exitCompoenentObject(AngularParser.CompoenentObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(AngularParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(AngularParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(AngularParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(AngularParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(AngularParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(AngularParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forParameters}.
	 * @param ctx the parse tree
	 */
	void enterForParameters(AngularParser.ForParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forParameters}.
	 * @param ctx the parse tree
	 */
	void exitForParameters(AngularParser.ForParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(AngularParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(AngularParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#do}.
	 * @param ctx the parse tree
	 */
	void enterDo(AngularParser.DoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#do}.
	 * @param ctx the parse tree
	 */
	void exitDo(AngularParser.DoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#consoleLog}.
	 * @param ctx the parse tree
	 */
	void enterConsoleLog(AngularParser.ConsoleLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#consoleLog}.
	 * @param ctx the parse tree
	 */
	void exitConsoleLog(AngularParser.ConsoleLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(AngularParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(AngularParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(AngularParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(AngularParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(AngularParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableTypeDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableTypeDecl(AngularParser.VariableTypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableTypeDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableTypeDecl(AngularParser.VariableTypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void enterDataTypes(AngularParser.DataTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void exitDataTypes(AngularParser.DataTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#initialize}.
	 * @param ctx the parse tree
	 */
	void enterInitialize(AngularParser.InitializeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#initialize}.
	 * @param ctx the parse tree
	 */
	void exitInitialize(AngularParser.InitializeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AngularParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AngularParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(AngularParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(AngularParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(AngularParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(AngularParser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#operartor}.
	 * @param ctx the parse tree
	 */
	void enterOperartor(AngularParser.OperartorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#operartor}.
	 * @param ctx the parse tree
	 */
	void exitOperartor(AngularParser.OperartorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#identifier_}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_(AngularParser.Identifier_Context ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#identifier_}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_(AngularParser.Identifier_Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(AngularParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(AngularParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterAnyLiteral(AngularParser.AnyLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitAnyLiteral(AngularParser.AnyLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayList}.
	 * @param ctx the parse tree
	 */
	void enterArrayList(AngularParser.ArrayListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayList}.
	 * @param ctx the parse tree
	 */
	void exitArrayList(AngularParser.ArrayListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(AngularParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(AngularParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectBody}.
	 * @param ctx the parse tree
	 */
	void enterObjectBody(AngularParser.ObjectBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectBody}.
	 * @param ctx the parse tree
	 */
	void exitObjectBody(AngularParser.ObjectBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectKeyValue}.
	 * @param ctx the parse tree
	 */
	void enterObjectKeyValue(AngularParser.ObjectKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectKeyValue}.
	 * @param ctx the parse tree
	 */
	void exitObjectKeyValue(AngularParser.ObjectKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#normalFunctionDecleration}.
	 * @param ctx the parse tree
	 */
	void enterNormalFunctionDecleration(AngularParser.NormalFunctionDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#normalFunctionDecleration}.
	 * @param ctx the parse tree
	 */
	void exitNormalFunctionDecleration(AngularParser.NormalFunctionDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrowFunctionDecleration}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionDecleration(AngularParser.ArrowFunctionDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrowFunctionDecleration}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionDecleration(AngularParser.ArrowFunctionDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(AngularParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(AngularParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 */
	void enterVariableFunctionSingleArgument(AngularParser.VariableFunctionSingleArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 */
	void exitVariableFunctionSingleArgument(AngularParser.VariableFunctionSingleArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#injectableFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterInjectableFunctionParameters(AngularParser.InjectableFunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#injectableFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitInjectableFunctionParameters(AngularParser.InjectableFunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#injectableVariableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 */
	void enterInjectableVariableFunctionSingleArgument(AngularParser.InjectableVariableFunctionSingleArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#injectableVariableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 */
	void exitInjectableVariableFunctionSingleArgument(AngularParser.InjectableVariableFunctionSingleArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#accessModifires}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifires(AngularParser.AccessModifiresContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#accessModifires}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifires(AngularParser.AccessModifiresContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(AngularParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(AngularParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interpolationValue}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationValue(AngularParser.InterpolationValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interpolationValue}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationValue(AngularParser.InterpolationValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#identifierPath}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPath(AngularParser.IdentifierPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#identifierPath}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPath(AngularParser.IdentifierPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#textContent}.
	 * @param ctx the parse tree
	 */
	void enterTextContent(AngularParser.TextContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#textContent}.
	 * @param ctx the parse tree
	 */
	void exitTextContent(AngularParser.TextContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTag(AngularParser.HtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTag(AngularParser.HtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#structuralDirectives}.
	 * @param ctx the parse tree
	 */
	void enterStructuralDirectives(AngularParser.StructuralDirectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#structuralDirectives}.
	 * @param ctx the parse tree
	 */
	void exitStructuralDirectives(AngularParser.StructuralDirectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forDirective}.
	 * @param ctx the parse tree
	 */
	void enterForDirective(AngularParser.ForDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forDirective}.
	 * @param ctx the parse tree
	 */
	void exitForDirective(AngularParser.ForDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifDirective}.
	 * @param ctx the parse tree
	 */
	void enterIfDirective(AngularParser.IfDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifDirective}.
	 * @param ctx the parse tree
	 */
	void exitIfDirective(AngularParser.IfDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(AngularParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(AngularParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(AngularParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(AngularParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(AngularParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(AngularParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#boundAttribute}.
	 * @param ctx the parse tree
	 */
	void enterBoundAttribute(AngularParser.BoundAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#boundAttribute}.
	 * @param ctx the parse tree
	 */
	void exitBoundAttribute(AngularParser.BoundAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterEventName(AngularParser.EventNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitEventName(AngularParser.EventNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styles}.
	 * @param ctx the parse tree
	 */
	void enterStyles(AngularParser.StylesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styles}.
	 * @param ctx the parse tree
	 */
	void exitStyles(AngularParser.StylesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(AngularParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(AngularParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(AngularParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(AngularParser.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValue(AngularParser.PropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValue(AngularParser.PropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssBasicColor}.
	 * @param ctx the parse tree
	 */
	void enterCssBasicColor(AngularParser.CssBasicColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssBasicColor}.
	 * @param ctx the parse tree
	 */
	void exitCssBasicColor(AngularParser.CssBasicColorContext ctx);
}