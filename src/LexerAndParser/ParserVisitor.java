// Generated from D:/F.I.T.E/Fifth Year/S2/Compiler/Last_Angular_Compiler/src/LexerAndParser/Parser.g4 by ANTLR 4.13.2
package LexerAndParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(Parser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#storeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStoreDecl(Parser.StoreDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#storeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStoreBody(Parser.StoreBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#stateSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateSection(Parser.StateSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#storeStateField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStoreStateField(Parser.StoreStateFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#actionsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionsSection(Parser.ActionsSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#actionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionDecl(Parser.ActionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#reducerSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReducerSection(Parser.ReducerSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#reducerRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReducerRule(Parser.ReducerRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#selectorsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorsSection(Parser.SelectorsSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#selectorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorDecl(Parser.SelectorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#componentDecorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDecorator(Parser.ComponentDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#compoenentObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoenentObject(Parser.CompoenentObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(Parser.LoopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(Parser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(Parser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#forParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForParameters(Parser.ForParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(Parser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo(Parser.DoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#consoleLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleLog(Parser.ConsoleLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(Parser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(Parser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableTypeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTypeDecl(Parser.VariableTypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#dataTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypes(Parser.DataTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#initialize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialize(Parser.InitializeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(Parser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpr(Parser.ArithmeticExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#operartor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperartor(Parser.OperartorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#identifier_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_(Parser.Identifier_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(Parser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyLiteral(Parser.AnyLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(Parser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayList(Parser.ArrayListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(Parser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(Parser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#objectBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectBody(Parser.ObjectBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#objectKeyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectKeyValue(Parser.ObjectKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(Parser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#normalFunctionDecleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFunctionDecleration(Parser.NormalFunctionDeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrowFunctionDecleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionDecleration(Parser.ArrowFunctionDeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(Parser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(Parser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFunctionSingleArgument(Parser.VariableFunctionSingleArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(Parser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#injectableFunctionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableFunctionParameters(Parser.InjectableFunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#injectableVariableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableVariableFunctionSingleArgument(Parser.InjectableVariableFunctionSingleArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#accessModifires}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifires(Parser.AccessModifiresContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(Parser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(Parser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#interpolationValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationValue(Parser.InterpolationValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#identifierPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierPath(Parser.IdentifierPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(Parser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTag(Parser.HtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(Parser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(Parser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(Parser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#structuralDirectives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuralDirectives(Parser.StructuralDirectivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#forDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDirective(Parser.ForDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#ifDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDirective(Parser.IfDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(Parser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(Parser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(Parser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#boundAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundAttribute(Parser.BoundAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventName(Parser.EventNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#eventBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(Parser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Parser.FunctionCallContext ctx);
}