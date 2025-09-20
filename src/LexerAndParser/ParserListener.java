// Generated from D:/F.I.T.E/Fifth Year/S2/Compiler/Last_Angular_Compiler/src/LexerAndParser/Parser.g4 by ANTLR 4.13.2
package LexerAndParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(Parser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(Parser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#storeDecl}.
	 * @param ctx the parse tree
	 */
	void enterStoreDecl(Parser.StoreDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#storeDecl}.
	 * @param ctx the parse tree
	 */
	void exitStoreDecl(Parser.StoreDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#storeBody}.
	 * @param ctx the parse tree
	 */
	void enterStoreBody(Parser.StoreBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#storeBody}.
	 * @param ctx the parse tree
	 */
	void exitStoreBody(Parser.StoreBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#stateSection}.
	 * @param ctx the parse tree
	 */
	void enterStateSection(Parser.StateSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#stateSection}.
	 * @param ctx the parse tree
	 */
	void exitStateSection(Parser.StateSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#storeStateField}.
	 * @param ctx the parse tree
	 */
	void enterStoreStateField(Parser.StoreStateFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#storeStateField}.
	 * @param ctx the parse tree
	 */
	void exitStoreStateField(Parser.StoreStateFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#actionsSection}.
	 * @param ctx the parse tree
	 */
	void enterActionsSection(Parser.ActionsSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#actionsSection}.
	 * @param ctx the parse tree
	 */
	void exitActionsSection(Parser.ActionsSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#actionDecl}.
	 * @param ctx the parse tree
	 */
	void enterActionDecl(Parser.ActionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#actionDecl}.
	 * @param ctx the parse tree
	 */
	void exitActionDecl(Parser.ActionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#reducerSection}.
	 * @param ctx the parse tree
	 */
	void enterReducerSection(Parser.ReducerSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#reducerSection}.
	 * @param ctx the parse tree
	 */
	void exitReducerSection(Parser.ReducerSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#reducerRule}.
	 * @param ctx the parse tree
	 */
	void enterReducerRule(Parser.ReducerRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#reducerRule}.
	 * @param ctx the parse tree
	 */
	void exitReducerRule(Parser.ReducerRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#selectorsSection}.
	 * @param ctx the parse tree
	 */
	void enterSelectorsSection(Parser.SelectorsSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#selectorsSection}.
	 * @param ctx the parse tree
	 */
	void exitSelectorsSection(Parser.SelectorsSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#selectorDecl}.
	 * @param ctx the parse tree
	 */
	void enterSelectorDecl(Parser.SelectorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#selectorDecl}.
	 * @param ctx the parse tree
	 */
	void exitSelectorDecl(Parser.SelectorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#componentDecorator}.
	 * @param ctx the parse tree
	 */
	void enterComponentDecorator(Parser.ComponentDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#componentDecorator}.
	 * @param ctx the parse tree
	 */
	void exitComponentDecorator(Parser.ComponentDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#compoenentObject}.
	 * @param ctx the parse tree
	 */
	void enterCompoenentObject(Parser.CompoenentObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#compoenentObject}.
	 * @param ctx the parse tree
	 */
	void exitCompoenentObject(Parser.CompoenentObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(Parser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(Parser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(Parser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(Parser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(Parser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(Parser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#forParameters}.
	 * @param ctx the parse tree
	 */
	void enterForParameters(Parser.ForParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forParameters}.
	 * @param ctx the parse tree
	 */
	void exitForParameters(Parser.ForParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(Parser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(Parser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#do}.
	 * @param ctx the parse tree
	 */
	void enterDo(Parser.DoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#do}.
	 * @param ctx the parse tree
	 */
	void exitDo(Parser.DoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#consoleLog}.
	 * @param ctx the parse tree
	 */
	void enterConsoleLog(Parser.ConsoleLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#consoleLog}.
	 * @param ctx the parse tree
	 */
	void exitConsoleLog(Parser.ConsoleLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(Parser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(Parser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableTypeDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableTypeDecl(Parser.VariableTypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableTypeDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableTypeDecl(Parser.VariableTypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void enterDataTypes(Parser.DataTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void exitDataTypes(Parser.DataTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#initialize}.
	 * @param ctx the parse tree
	 */
	void enterInitialize(Parser.InitializeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#initialize}.
	 * @param ctx the parse tree
	 */
	void exitInitialize(Parser.InitializeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(Parser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(Parser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(Parser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(Parser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#operartor}.
	 * @param ctx the parse tree
	 */
	void enterOperartor(Parser.OperartorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#operartor}.
	 * @param ctx the parse tree
	 */
	void exitOperartor(Parser.OperartorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#identifier_}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_(Parser.Identifier_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#identifier_}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_(Parser.Identifier_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(Parser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(Parser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterAnyLiteral(Parser.AnyLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitAnyLiteral(Parser.AnyLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(Parser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(Parser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayList}.
	 * @param ctx the parse tree
	 */
	void enterArrayList(Parser.ArrayListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayList}.
	 * @param ctx the parse tree
	 */
	void exitArrayList(Parser.ArrayListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(Parser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(Parser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(Parser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(Parser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#objectBody}.
	 * @param ctx the parse tree
	 */
	void enterObjectBody(Parser.ObjectBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#objectBody}.
	 * @param ctx the parse tree
	 */
	void exitObjectBody(Parser.ObjectBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#objectKeyValue}.
	 * @param ctx the parse tree
	 */
	void enterObjectKeyValue(Parser.ObjectKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#objectKeyValue}.
	 * @param ctx the parse tree
	 */
	void exitObjectKeyValue(Parser.ObjectKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(Parser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(Parser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#normalFunctionDecleration}.
	 * @param ctx the parse tree
	 */
	void enterNormalFunctionDecleration(Parser.NormalFunctionDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#normalFunctionDecleration}.
	 * @param ctx the parse tree
	 */
	void exitNormalFunctionDecleration(Parser.NormalFunctionDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrowFunctionDecleration}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionDecleration(Parser.ArrowFunctionDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrowFunctionDecleration}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionDecleration(Parser.ArrowFunctionDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(Parser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(Parser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(Parser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(Parser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 */
	void enterVariableFunctionSingleArgument(Parser.VariableFunctionSingleArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 */
	void exitVariableFunctionSingleArgument(Parser.VariableFunctionSingleArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(Parser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(Parser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#injectableFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterInjectableFunctionParameters(Parser.InjectableFunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#injectableFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitInjectableFunctionParameters(Parser.InjectableFunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#injectableVariableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 */
	void enterInjectableVariableFunctionSingleArgument(Parser.InjectableVariableFunctionSingleArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#injectableVariableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 */
	void exitInjectableVariableFunctionSingleArgument(Parser.InjectableVariableFunctionSingleArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#accessModifires}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifires(Parser.AccessModifiresContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#accessModifires}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifires(Parser.AccessModifiresContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(Parser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(Parser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(Parser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(Parser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#interpolationValue}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationValue(Parser.InterpolationValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#interpolationValue}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationValue(Parser.InterpolationValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#identifierPath}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPath(Parser.IdentifierPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#identifierPath}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPath(Parser.IdentifierPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(Parser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(Parser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTag(Parser.HtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTag(Parser.HtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(Parser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(Parser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(Parser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(Parser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(Parser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(Parser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#structuralDirectives}.
	 * @param ctx the parse tree
	 */
	void enterStructuralDirectives(Parser.StructuralDirectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#structuralDirectives}.
	 * @param ctx the parse tree
	 */
	void exitStructuralDirectives(Parser.StructuralDirectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#forDirective}.
	 * @param ctx the parse tree
	 */
	void enterForDirective(Parser.ForDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forDirective}.
	 * @param ctx the parse tree
	 */
	void exitForDirective(Parser.ForDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#ifDirective}.
	 * @param ctx the parse tree
	 */
	void enterIfDirective(Parser.IfDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#ifDirective}.
	 * @param ctx the parse tree
	 */
	void exitIfDirective(Parser.IfDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(Parser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(Parser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(Parser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(Parser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#boundAttribute}.
	 * @param ctx the parse tree
	 */
	void enterBoundAttribute(Parser.BoundAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#boundAttribute}.
	 * @param ctx the parse tree
	 */
	void exitBoundAttribute(Parser.BoundAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterEventName(Parser.EventNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitEventName(Parser.EventNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(Parser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(Parser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Parser.FunctionCallContext ctx);
}