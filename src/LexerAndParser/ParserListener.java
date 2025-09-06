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
	 * Enter a parse tree produced by the {@code StatementStmt}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementStmt(Parser.StatementStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementStmt}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementStmt(Parser.StatementStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStmt}
	 * labeled alternative in {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(Parser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStmt}
	 * labeled alternative in {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(Parser.BlockStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code VariableDecla}
	 * labeled alternative in {@link Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecla(Parser.VariableDeclaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDecla}
	 * labeled alternative in {@link Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecla(Parser.VariableDeclaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableTypeDecla}
	 * labeled alternative in {@link Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVariableTypeDecla(Parser.VariableTypeDeclaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableTypeDecla}
	 * labeled alternative in {@link Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVariableTypeDecla(Parser.VariableTypeDeclaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalFunction}
	 * labeled alternative in {@link Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterNormalFunction(Parser.NormalFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalFunction}
	 * labeled alternative in {@link Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitNormalFunction(Parser.NormalFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Import}
	 * labeled alternative in {@link Parser#import_}.
	 * @param ctx the parse tree
	 */
	void enterImport(Parser.ImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Import}
	 * labeled alternative in {@link Parser#import_}.
	 * @param ctx the parse tree
	 */
	void exitImport(Parser.ImportContext ctx);
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
	 * Enter a parse tree produced by the {@code DataTypesStmt}
	 * labeled alternative in {@link Parser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void enterDataTypesStmt(Parser.DataTypesStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataTypesStmt}
	 * labeled alternative in {@link Parser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void exitDataTypesStmt(Parser.DataTypesStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralStmt}
	 * labeled alternative in {@link Parser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralStmt(Parser.ArrayLiteralStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralStmt}
	 * labeled alternative in {@link Parser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralStmt(Parser.ArrayLiteralStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayListStmt}
	 * labeled alternative in {@link Parser#arrayList}.
	 * @param ctx the parse tree
	 */
	void enterArrayListStmt(Parser.ArrayListStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayListStmt}
	 * labeled alternative in {@link Parser#arrayList}.
	 * @param ctx the parse tree
	 */
	void exitArrayListStmt(Parser.ArrayListStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyLiteralStmt}
	 * labeled alternative in {@link Parser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterAnyLiteralStmt(Parser.AnyLiteralStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyLiteralStmt}
	 * labeled alternative in {@link Parser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitAnyLiteralStmt(Parser.AnyLiteralStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exper}
	 * labeled alternative in {@link Parser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterExper(Parser.ExperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exper}
	 * labeled alternative in {@link Parser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitExper(Parser.ExperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link Parser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link Parser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLitStmt}
	 * labeled alternative in {@link Parser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLitStmt(Parser.ObjectLitStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLitStmt}
	 * labeled alternative in {@link Parser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLitStmt(Parser.ObjectLitStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectBodyStmt}
	 * labeled alternative in {@link Parser#objectBody}.
	 * @param ctx the parse tree
	 */
	void enterObjectBodyStmt(Parser.ObjectBodyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectBodyStmt}
	 * labeled alternative in {@link Parser#objectBody}.
	 * @param ctx the parse tree
	 */
	void exitObjectBodyStmt(Parser.ObjectBodyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectKeyValueStmt}
	 * labeled alternative in {@link Parser#objectKeyValue}.
	 * @param ctx the parse tree
	 */
	void enterObjectKeyValueStmt(Parser.ObjectKeyValueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectKeyValueStmt}
	 * labeled alternative in {@link Parser#objectKeyValue}.
	 * @param ctx the parse tree
	 */
	void exitObjectKeyValueStmt(Parser.ObjectKeyValueStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code Decltype}
	 * labeled alternative in {@link Parser#declTypes}.
	 * @param ctx the parse tree
	 */
	void enterDecltype(Parser.DecltypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decltype}
	 * labeled alternative in {@link Parser#declTypes}.
	 * @param ctx the parse tree
	 */
	void exitDecltype(Parser.DecltypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variablefuncarg}
	 * labeled alternative in {@link Parser#variableFunctionArguments}.
	 * @param ctx the parse tree
	 */
	void enterVariablefuncarg(Parser.VariablefuncargContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variablefuncarg}
	 * labeled alternative in {@link Parser#variableFunctionArguments}.
	 * @param ctx the parse tree
	 */
	void exitVariablefuncarg(Parser.VariablefuncargContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Varsingarg}
	 * labeled alternative in {@link Parser#variableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 */
	void enterVarsingarg(Parser.VarsingargContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Varsingarg}
	 * labeled alternative in {@link Parser#variableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 */
	void exitVarsingarg(Parser.VarsingargContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arraylit}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArraylit(Parser.ArraylitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arraylit}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArraylit(Parser.ArraylitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Objectlit}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectlit(Parser.ObjectlitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Objectlit}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectlit(Parser.ObjectlitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Stringlit}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringlit(Parser.StringlitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Stringlit}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringlit(Parser.StringlitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Booleanlet}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanlet(Parser.BooleanletContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Booleanlet}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanlet(Parser.BooleanletContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decimallit}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimallit(Parser.DecimallitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decimallit}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimallit(Parser.DecimallitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nulllet}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNulllet(Parser.NullletContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nulllet}
	 * labeled alternative in {@link Parser#anyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNulllet(Parser.NullletContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Normalfuncdecl}
	 * labeled alternative in {@link Parser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterNormalfuncdecl(Parser.NormalfuncdeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Normalfuncdecl}
	 * labeled alternative in {@link Parser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitNormalfuncdecl(Parser.NormalfuncdeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arrowfuncdecla}
	 * labeled alternative in {@link Parser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrowfuncdecla(Parser.ArrowfuncdeclaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arrowfuncdecla}
	 * labeled alternative in {@link Parser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrowfuncdecla(Parser.ArrowfuncdeclaContext ctx);
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
	 * Enter a parse tree produced by the {@code Funcpara}
	 * labeled alternative in {@link Parser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFuncpara(Parser.FuncparaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Funcpara}
	 * labeled alternative in {@link Parser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFuncpara(Parser.FuncparaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link Parser#if}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(Parser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link Parser#if}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(Parser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link Parser#for}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(Parser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link Parser#for}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(Parser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Forpara}
	 * labeled alternative in {@link Parser#forParameters}.
	 * @param ctx the parse tree
	 */
	void enterForpara(Parser.ForparaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Forpara}
	 * labeled alternative in {@link Parser#forParameters}.
	 * @param ctx the parse tree
	 */
	void exitForpara(Parser.ForparaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link Parser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(Parser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link Parser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(Parser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoStmt}
	 * labeled alternative in {@link Parser#do}.
	 * @param ctx the parse tree
	 */
	void enterDoStmt(Parser.DoStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoStmt}
	 * labeled alternative in {@link Parser#do}.
	 * @param ctx the parse tree
	 */
	void exitDoStmt(Parser.DoStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Parser#initialize}.
	 * @param ctx the parse tree
	 */
	void enterInt(Parser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Parser#initialize}.
	 * @param ctx the parse tree
	 */
	void exitInt(Parser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRet(Parser.RetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRet(Parser.RetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Intialize}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntialize(Parser.IntializeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Intialize}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntialize(Parser.IntializeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Strliteral}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStrliteral(Parser.StrliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Strliteral}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStrliteral(Parser.StrliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arthexp}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArthexp(Parser.ArthexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arthexp}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArthexp(Parser.ArthexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Break}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBreak(Parser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBreak(Parser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterContinue(Parser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitContinue(Parser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minusminus}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusminus(Parser.MinusminusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minusminus}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusminus(Parser.MinusminusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjliteralExpr}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObjliteralExpr(Parser.ObjliteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjliteralExpr}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObjliteralExpr(Parser.ObjliteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunccallExpr}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunccallExpr(Parser.FunccallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunccallExpr}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunccallExpr(Parser.FunccallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrliteralExpr}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrliteralExpr(Parser.ArrliteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrliteralExpr}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrliteralExpr(Parser.ArrliteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arrfundec}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrfundec(Parser.ArrfundecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arrfundec}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrfundec(Parser.ArrfundecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identi}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdenti(Parser.IdentiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identi}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdenti(Parser.IdentiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plusplus}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusplus(Parser.PlusplusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plusplus}
	 * labeled alternative in {@link Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusplus(Parser.PlusplusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link Parser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(Parser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link Parser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(Parser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Iden}
	 * labeled alternative in {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterIden(Parser.IdenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Iden}
	 * labeled alternative in {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitIden(Parser.IdenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decllit}
	 * labeled alternative in {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterDecllit(Parser.DecllitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decllit}
	 * labeled alternative in {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitDecllit(Parser.DecllitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Strlit}
	 * labeled alternative in {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterStrlit(Parser.StrlitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Strlit}
	 * labeled alternative in {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitStrlit(Parser.StrlitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arthimaticexpr}
	 * labeled alternative in {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArthimaticexpr(Parser.ArthimaticexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arthimaticexpr}
	 * labeled alternative in {@link Parser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArthimaticexpr(Parser.ArthimaticexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier__}
	 * labeled alternative in {@link Parser#identifier_}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier__(Parser.Identifier__Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier__}
	 * labeled alternative in {@link Parser#identifier_}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier__(Parser.Identifier__Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayIndexStmt}
	 * labeled alternative in {@link Parser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexStmt(Parser.ArrayIndexStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayIndexStmt}
	 * labeled alternative in {@link Parser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexStmt(Parser.ArrayIndexStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code ComponentDecoratorStmt}
	 * labeled alternative in {@link Parser#componentDecorator}.
	 * @param ctx the parse tree
	 */
	void enterComponentDecoratorStmt(Parser.ComponentDecoratorStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentDecoratorStmt}
	 * labeled alternative in {@link Parser#componentDecorator}.
	 * @param ctx the parse tree
	 */
	void exitComponentDecoratorStmt(Parser.ComponentDecoratorStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Componentobj}
	 * labeled alternative in {@link Parser#compoenentObject}.
	 * @param ctx the parse tree
	 */
	void enterComponentobj(Parser.ComponentobjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Componentobj}
	 * labeled alternative in {@link Parser#compoenentObject}.
	 * @param ctx the parse tree
	 */
	void exitComponentobj(Parser.ComponentobjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorStmt}
	 * labeled alternative in {@link Parser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructorStmt(Parser.ConstructorStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorStmt}
	 * labeled alternative in {@link Parser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructorStmt(Parser.ConstructorStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Htmlcont}
	 * labeled alternative in {@link Parser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtmlcont(Parser.HtmlcontContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Htmlcont}
	 * labeled alternative in {@link Parser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtmlcont(Parser.HtmlcontContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextStmt}
	 * labeled alternative in {@link Parser#text}.
	 * @param ctx the parse tree
	 */
	void enterTextStmt(Parser.TextStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextStmt}
	 * labeled alternative in {@link Parser#text}.
	 * @param ctx the parse tree
	 */
	void exitTextStmt(Parser.TextStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code HtmlTagStmt}
	 * labeled alternative in {@link Parser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagStmt(Parser.HtmlTagStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlTagStmt}
	 * labeled alternative in {@link Parser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagStmt(Parser.HtmlTagStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenTagStmt}
	 * labeled alternative in {@link Parser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTagStmt(Parser.OpenTagStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenTagStmt}
	 * labeled alternative in {@link Parser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTagStmt(Parser.OpenTagStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code CloseTagStmt}
	 * labeled alternative in {@link Parser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTagStmt(Parser.CloseTagStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CloseTagStmt}
	 * labeled alternative in {@link Parser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTagStmt(Parser.CloseTagStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ngfor}
	 * labeled alternative in {@link Parser#structuralDirectives}.
	 * @param ctx the parse tree
	 */
	void enterNgfor(Parser.NgforContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ngfor}
	 * labeled alternative in {@link Parser#structuralDirectives}.
	 * @param ctx the parse tree
	 */
	void exitNgfor(Parser.NgforContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ngif}
	 * labeled alternative in {@link Parser#structuralDirectives}.
	 * @param ctx the parse tree
	 */
	void enterNgif(Parser.NgifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ngif}
	 * labeled alternative in {@link Parser#structuralDirectives}.
	 * @param ctx the parse tree
	 */
	void exitNgif(Parser.NgifContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code InjecFuncPara}
	 * labeled alternative in {@link Parser#injectableFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterInjecFuncPara(Parser.InjecFuncParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InjecFuncPara}
	 * labeled alternative in {@link Parser#injectableFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitInjecFuncPara(Parser.InjecFuncParaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InjecVarFuncSiArg}
	 * labeled alternative in {@link Parser#injectableVariableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 */
	void enterInjecVarFuncSiArg(Parser.InjecVarFuncSiArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InjecVarFuncSiArg}
	 * labeled alternative in {@link Parser#injectableVariableFunctionSingleArgument}.
	 * @param ctx the parse tree
	 */
	void exitInjecVarFuncSiArg(Parser.InjecVarFuncSiArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Public}
	 * labeled alternative in {@link Parser#accessModifires}.
	 * @param ctx the parse tree
	 */
	void enterPublic(Parser.PublicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Public}
	 * labeled alternative in {@link Parser#accessModifires}.
	 * @param ctx the parse tree
	 */
	void exitPublic(Parser.PublicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Private}
	 * labeled alternative in {@link Parser#accessModifires}.
	 * @param ctx the parse tree
	 */
	void enterPrivate(Parser.PrivateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Private}
	 * labeled alternative in {@link Parser#accessModifires}.
	 * @param ctx the parse tree
	 */
	void exitPrivate(Parser.PrivateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Protocted}
	 * labeled alternative in {@link Parser#accessModifires}.
	 * @param ctx the parse tree
	 */
	void enterProtocted(Parser.ProtoctedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Protocted}
	 * labeled alternative in {@link Parser#accessModifires}.
	 * @param ctx the parse tree
	 */
	void exitProtocted(Parser.ProtoctedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConsoleLogStmt}
	 * labeled alternative in {@link Parser#consoleLog}.
	 * @param ctx the parse tree
	 */
	void enterConsoleLogStmt(Parser.ConsoleLogStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConsoleLogStmt}
	 * labeled alternative in {@link Parser#consoleLog}.
	 * @param ctx the parse tree
	 */
	void exitConsoleLogStmt(Parser.ConsoleLogStmtContext ctx);
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
}