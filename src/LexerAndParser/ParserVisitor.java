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
	 * Visit a parse tree produced by the {@code StatementStmt}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementStmt(Parser.StatementStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStmt}
	 * labeled alternative in {@link Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(Parser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(Parser.LoopsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDecla}
	 * labeled alternative in {@link Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecla(Parser.VariableDeclaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableTypeDecla}
	 * labeled alternative in {@link Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTypeDecla(Parser.VariableTypeDeclaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalFunction}
	 * labeled alternative in {@link Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFunction(Parser.NormalFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Import}
	 * labeled alternative in {@link Parser#import_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport(Parser.ImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableTypeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTypeDecl(Parser.VariableTypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataTypesStmt}
	 * labeled alternative in {@link Parser#dataTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypesStmt(Parser.DataTypesStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralStmt}
	 * labeled alternative in {@link Parser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralStmt(Parser.ArrayLiteralStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayListStmt}
	 * labeled alternative in {@link Parser#arrayList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayListStmt(Parser.ArrayListStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyLiteralStmt}
	 * labeled alternative in {@link Parser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyLiteralStmt(Parser.AnyLiteralStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exper}
	 * labeled alternative in {@link Parser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExper(Parser.ExperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link Parser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLitStmt}
	 * labeled alternative in {@link Parser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLitStmt(Parser.ObjectLitStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectBodyStmt}
	 * labeled alternative in {@link Parser#objectBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectBodyStmt(Parser.ObjectBodyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectKeyValueStmt}
	 * labeled alternative in {@link Parser#objectKeyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectKeyValueStmt(Parser.ObjectKeyValueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(Parser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decltype}
	 * labeled alternative in {@link Parser#declTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecltype(Parser.DecltypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variablefuncarg}
	 * labeled alternative in {@link Parser#variableFunctionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablefuncarg(Parser.VariablefuncargContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Varsingarg}
	 * labeled alternative in {@link Parser#variableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsingarg(Parser.VarsingargContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arraylit}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraylit(Parser.ArraylitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Objectlit}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectlit(Parser.ObjectlitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Stringlit}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringlit(Parser.StringlitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Booleanlet}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanlet(Parser.BooleanletContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decimallit}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimallit(Parser.DecimallitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nulllet}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNulllet(Parser.NullletContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Normalfuncdecl}
	 * labeled alternative in {@link Parser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalfuncdecl(Parser.NormalfuncdeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arrowfuncdecla}
	 * labeled alternative in {@link Parser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowfuncdecla(Parser.ArrowfuncdeclaContext ctx);
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
	 * Visit a parse tree produced by the {@code Funcpara}
	 * labeled alternative in {@link Parser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncpara(Parser.FuncparaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link Parser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(Parser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link Parser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(Parser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Forpara}
	 * labeled alternative in {@link Parser#forParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForpara(Parser.ForparaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link Parser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(Parser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoStmt}
	 * labeled alternative in {@link Parser#do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStmt(Parser.DoStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Parser#initialize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(Parser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(Parser.RetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Intialize}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntialize(Parser.IntializeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Strliteral}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrliteral(Parser.StrliteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arthexp}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArthexp(Parser.ArthexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(Parser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(Parser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minusminus}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusminus(Parser.MinusminusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjliteralExpr}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjliteralExpr(Parser.ObjliteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunccallExpr}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccallExpr(Parser.FunccallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrliteralExpr}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrliteralExpr(Parser.ArrliteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arrfundec}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrfundec(Parser.ArrfundecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identi}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdenti(Parser.IdentiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plusplus}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusplus(Parser.PlusplusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link Parser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(Parser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Iden}
	 * labeled alternative in {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIden(Parser.IdenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decllit}
	 * labeled alternative in {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecllit(Parser.DecllitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Strlit}
	 * labeled alternative in {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrlit(Parser.StrlitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arthimaticexpr}
	 * labeled alternative in {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArthimaticexpr(Parser.ArthimaticexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier__}
	 * labeled alternative in {@link Parser#identifier_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier__(Parser.Identifier__Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayIndexStmt}
	 * labeled alternative in {@link Parser#arrayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexStmt(Parser.ArrayIndexStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#operartor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperartor(Parser.OperartorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentDecoratorStmt}
	 * labeled alternative in {@link Parser#componentDecorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDecoratorStmt(Parser.ComponentDecoratorStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Componentobj}
	 * labeled alternative in {@link Parser#compoenentObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentobj(Parser.ComponentobjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorStmt}
	 * labeled alternative in {@link Parser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorStmt(Parser.ConstructorStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Htmlcont}
	 * labeled alternative in {@link Parser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlcont(Parser.HtmlcontContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextStmt}
	 * labeled alternative in {@link Parser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextStmt(Parser.TextStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#identifierPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierPath(Parser.IdentifierPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#interpolationValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationValue(Parser.InterpolationValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(Parser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(Parser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlTagStmt}
	 * labeled alternative in {@link Parser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagStmt(Parser.HtmlTagStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpenTagStmt}
	 * labeled alternative in {@link Parser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTagStmt(Parser.OpenTagStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(Parser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CloseTagStmt}
	 * labeled alternative in {@link Parser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTagStmt(Parser.CloseTagStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ngfor}
	 * labeled alternative in {@link Parser#structuralDirectives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgfor(Parser.NgforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ngif}
	 * labeled alternative in {@link Parser#structuralDirectives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgif(Parser.NgifContext ctx);
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
	/**
	 * Visit a parse tree produced by the {@code InjecFuncPara}
	 * labeled alternative in {@link Parser#injectableFunctionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjecFuncPara(Parser.InjecFuncParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InjecVarFuncSiArg}
	 * labeled alternative in {@link Parser#injectableVariableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjecVarFuncSiArg(Parser.InjecVarFuncSiArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Public}
	 * labeled alternative in {@link Parser#accessModifires}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublic(Parser.PublicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Private}
	 * labeled alternative in {@link Parser#accessModifires}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate(Parser.PrivateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Protocted}
	 * labeled alternative in {@link Parser#accessModifires}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocted(Parser.ProtoctedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConsoleLogStmt}
	 * labeled alternative in {@link Parser#consoleLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleLogStmt(Parser.ConsoleLogStmtContext ctx);
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
}