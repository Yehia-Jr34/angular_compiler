// Generated from D:/F.I.T.E/Fifth Year/S2/Compiler/Last_Angular_Compiler/src/LexerAndParser/AngularParser.g4 by ANTLR 4.13.2
package LexerAndParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(AngularParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#storeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStoreDecl(AngularParser.StoreDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#storeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStoreBody(AngularParser.StoreBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stateSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateSection(AngularParser.StateSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#storeStateField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStoreStateField(AngularParser.StoreStateFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#actionsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionsSection(AngularParser.ActionsSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#actionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionDecl(AngularParser.ActionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#reducerSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReducerSection(AngularParser.ReducerSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#reducerRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReducerRule(AngularParser.ReducerRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selectorsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorsSection(AngularParser.SelectorsSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selectorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorDecl(AngularParser.SelectorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDecorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDecorator(AngularParser.ComponentDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#compoenentObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoenentObject(AngularParser.CompoenentObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngularParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AngularParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(AngularParser.LoopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(AngularParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(AngularParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForParameters(AngularParser.ForParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(AngularParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo(AngularParser.DoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#consoleLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleLog(AngularParser.ConsoleLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(AngularParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(AngularParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableTypeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTypeDecl(AngularParser.VariableTypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#dataTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypes(AngularParser.DataTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#initialize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialize(AngularParser.InitializeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AngularParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(AngularParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpr(AngularParser.ArithmeticExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#operartor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperartor(AngularParser.OperartorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#identifier_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_(AngularParser.Identifier_Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(AngularParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#anyLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyLiteral(AngularParser.AnyLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayList(AngularParser.ArrayListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(AngularParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectBody(AngularParser.ObjectBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectKeyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectKeyValue(AngularParser.ObjectKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#normalFunctionDecleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFunctionDecleration(AngularParser.NormalFunctionDeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrowFunctionDecleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionDecleration(AngularParser.ArrowFunctionDeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(AngularParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFunctionSingleArgument(AngularParser.VariableFunctionSingleArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#injectableFunctionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableFunctionParameters(AngularParser.InjectableFunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#injectableVariableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableVariableFunctionSingleArgument(AngularParser.InjectableVariableFunctionSingleArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#accessModifires}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifires(AngularParser.AccessModifiresContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(AngularParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interpolationValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationValue(AngularParser.InterpolationValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#identifierPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierPath(AngularParser.IdentifierPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTag(AngularParser.HtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#structuralDirectives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuralDirectives(AngularParser.StructuralDirectivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDirective(AngularParser.ForDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDirective(AngularParser.IfDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(AngularParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(AngularParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(AngularParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#boundAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundAttribute(AngularParser.BoundAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventName(AngularParser.EventNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyles(AngularParser.StylesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stringArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArray(AngularParser.StringArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValue(AngularParser.CssValueContext ctx);
}