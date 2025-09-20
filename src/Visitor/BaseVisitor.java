package Visitor;

import AST.Block;
import AST.ComponentDecorator.ComponentDecorator;
import AST.ComponentDecorator.ComponentObject;
import AST.Dec.Dec;
import AST.Dec.Function.*;
import AST.Dec.Variable.VariableDecl;
import AST.Dec.Variable.VariableTypeDecl;
import AST.Expr.ArithmeticExpr;
import AST.Expr.Expr;
import AST.Expr.Operator;
import AST.HTMLAndInterpolation.HTML.HTML;
import AST.HTMLAndInterpolation.HTML.HtmlContent;
import AST.HTMLAndInterpolation.InterpolationValue.InterpolationValue;
import AST.HTMLElementsAndBindings.Attribute.Attribute;
import AST.HTMLElementsAndBindings.Attribute.AttributeName;
import AST.HTMLElementsAndBindings.Attribute.AttributeValue;
import AST.HTMLElementsAndBindings.Attribute.BoundAttribute;
import AST.HTMLElementsAndBindings.Bindings.EventBinding;
import AST.HTMLElementsAndBindings.Bindings.EventName;
import AST.HTMLElementsAndBindings.Directives.ForDirective;
import AST.HTMLElementsAndBindings.Directives.IfDirective;
import AST.HTMLElementsAndBindings.Directives.StructuralDirectives;
import AST.HTMLElementsAndBindings.HTMLElements.*;
import AST.Identifier.ArrayIndex;
import AST.Identifier.DataType;
import AST.Identifier.Identifier;
import AST.Identifier.IdentifierPath;
import AST.Import.ImportStatement;
import AST.Initialize.Initialize;
import AST.InjectableConstructorParameters.AccessModifiers;
import AST.InjectableConstructorParameters.Constructor;
import AST.InjectableConstructorParameters.InjectableFunctionParameters;
import AST.InjectableConstructorParameters.InjectableVariableFunctionSingleArgument;
import AST.Literal.AnyLiteral;
import AST.Literal.Array.ArrayElement;
import AST.Literal.Array.ArrayList;
import AST.Literal.Array.ArrayLiteral;
import AST.Literal.Object.ObjectBody;
import AST.Literal.Object.ObjectKeyValue;
import AST.Literal.Object.ObjectLiteral;
import AST.Program;
import AST.Return.Return;
import AST.Statement.ConsoleLog;
import AST.Statement.IfStatement;
import AST.Statement.Loops.*;
import AST.Statement.Statement;
import AST.StoreDec.*;
import LexerAndParser.Parser;
import LexerAndParser.ParserBaseVisitor;

import java.beans.Expression;

public class BaseVisitor extends ParserBaseVisitor {
    @Override
    public Program visitProg(Parser.ProgContext ctx) {
        Program object = new Program();

        for (int i = 0; i < ctx.importStatement().size(); i++) {
            ImportStatement child1 = visitImportStatement(ctx.importStatement(i));
            object.addImport(child1);
        }

        for (int i = 0; i < ctx.storeDecl().size(); i++) {
            StoreDec child2 = visitStoreDecl(ctx.storeDecl(i));
            object.addStore(child2);
        }

        ComponentDecorator child3 = visitComponentDecorator(ctx.componentDecorator());
        object.setComponent(child3);

        Identifier child4 = visitIdentifier_(ctx.identifier_());
        object.setClassName(child4);

        for (int i = 0; i < ctx.statement().size(); i++) {
            Statement child5 = visitStatement(ctx.statement(i));
            object.addStatement(child5);
        }

        return object;
    }

    @Override
    public ImportStatement visitImportStatement(Parser.ImportStatementContext ctx) {
        ImportStatement object = new ImportStatement();

        Identifier child1 = visitIdentifier_(ctx.identifier_());
        object.setIdentifier(child1);

        String child2 = ctx.StringLiteral().getText();
        object.setFileName(child2);

        return object;
    }

    @Override
    public StoreDec visitStoreDecl(Parser.StoreDeclContext ctx) {
        StoreDec object = new StoreDec();

        Identifier child1 = visitIdentifier_(ctx.identifier_());
        object.setIdentifier(child1);

        StoreBody child2 = visitStoreBody(ctx.storeBody());
        object.setBody(child2);

        return object;
    }

    @Override
    public StoreBody visitStoreBody(Parser.StoreBodyContext ctx) {
        StoreBody object = new StoreBody();

        StateSection child1 = visitStateSection(ctx.stateSection());
        object.setStateSection(child1);

        if (ctx.actionsSection() != null) {
            ActionsSection child2 = visitActionsSection(ctx.actionsSection());
            object.setActionsSection(child2);
        }

        if (ctx.reducerSection() != null) {
            ReducerSection child3 = visitReducerSection(ctx.reducerSection());
            object.setReducerSection(child3);
        }

        if (ctx.selectorsSection() != null) {
            SelectorsSection child4 = visitSelectorsSection(ctx.selectorsSection());
            object.setSelectorsSection(child4);
        }

        return object;
    }

    @Override
    public StateSection visitStateSection(Parser.StateSectionContext ctx) {
        StateSection object = new StateSection();

        for (int i = 0; i < ctx.storeStateField().size(); i++) {
            StoreStateField child1 = visitStoreStateField(ctx.storeStateField(i));
            object.addField(child1);
        }

        return object;
    }

    @Override
    public StoreStateField visitStoreStateField(Parser.StoreStateFieldContext ctx) {
        StoreStateField object = new StoreStateField();

        Identifier child1 = visitIdentifier_(ctx.identifier_());
        object.setIdentifier(child1);

        if (ctx.anyLiteral() != null) {
            AnyLiteral child2 = visitAnyLiteral(ctx.anyLiteral());
            object.setAnyLiteral(child2);
        }

        if (ctx.expr() != null) {
            Expr child3 = visitExpr(ctx.expr());
            object.setExpression(child3);
        }

        return object;
    }

    @Override
    public ActionsSection visitActionsSection(Parser.ActionsSectionContext ctx) {
        ActionsSection object = new ActionsSection();

        for (int i = 0; i < ctx.actionDecl().size(); i++) {
            ActionDec child = visitActionDecl(ctx.actionDecl(i));
            object.addAction(child);
        }

        return object;
    }

    @Override
    public ActionDec visitActionDecl(Parser.ActionDeclContext ctx) {
        ActionDec object = new ActionDec();

        Identifier child1 = visitIdentifier_(ctx.identifier_());
        object.setIdentifier(child1);

        ArrowFunctionDec child2 = visitArrowFunctionDecleration(ctx.arrowFunctionDecleration());
        object.setArrowFunctionDec(child2);

        return object;
    }

    @Override
    public ReducerSection visitReducerSection(Parser.ReducerSectionContext ctx) {
        ReducerSection object = new ReducerSection();

        for (int i = 0; i < ctx.reducerRule().size(); i++) {
            ReducerRule child = visitReducerRule(ctx.reducerRule(i));
            object.addRule(child);
        }

        return object;
    }

    @Override
    public ReducerRule visitReducerRule(Parser.ReducerRuleContext ctx) {
        ReducerRule object = new ReducerRule();

        Identifier child1 = visitIdentifier_(ctx.identifier_());
        object.setIdentifier(child1);

        ArrowFunctionDec child2 = visitArrowFunctionDecleration(ctx.arrowFunctionDecleration());
        object.setArrowFunctionDec(child2);

        return object;
    }

    @Override
    public SelectorsSection visitSelectorsSection(Parser.SelectorsSectionContext ctx) {
        SelectorsSection object = new SelectorsSection();

        for (int i = 0; i < ctx.selectorDecl().size(); i++) {
            SelectorDec child = visitSelectorDecl(ctx.selectorDecl(i));
            object.addSelector(child);
        }

        return object;
    }

    @Override
    public SelectorDec visitSelectorDecl(Parser.SelectorDeclContext ctx) {
        SelectorDec object = new SelectorDec();

        Identifier child1 = visitIdentifier_(ctx.identifier_());
        object.setIdentifier(child1);

        ArrowFunctionDec child2 = visitArrowFunctionDecleration(ctx.arrowFunctionDecleration());
        object.setArrowFunction(child2);

        return object;
    }

    @Override
    public ComponentDecorator visitComponentDecorator(Parser.ComponentDecoratorContext ctx) {
        ComponentDecorator object = new ComponentDecorator();

        Identifier child1 = visitIdentifier_(ctx.identifier_());
        object.setIdentifier(child1);

        ComponentObject child2 = visitCompoenentObject(ctx.compoenentObject());
        object.setComponentObject(child2);

        return object;
    }

    @Override
    public ComponentObject visitCompoenentObject(Parser.CompoenentObjectContext ctx) {
        ComponentObject object = new ComponentObject();

        String child1 = ctx.StringLiteral().getText();
        object.setComponentName(child1);

        HTML child2 = visitHtml(ctx.html());
        object.setTemplate(child2);

        return object;
    }

    @Override
    public Statement visitStatement(Parser.StatementContext ctx) {
        Statement object = new Statement();

        if (ctx.block() != null) {
            Block child1 = visitBlock(ctx.block());
            object.setBlock(child1);
        } else if (ctx.decl() != null) {
            Dec child2 = visitDecl(ctx.decl());
            object.setDec(child2);
        } else if (ctx.expr() != null) {
            Expr child3 = visitExpr(ctx.expr());
            object.setExpr(child3);
        } else if (ctx.loops() != null) {
            Loops child4 = visitLoops(ctx.loops());
            object.setLoops(child4);
        } else if (ctx.constructor() != null) {
            Constructor child5 = visitConstructor(ctx.constructor());
            object.setConstructor(child5);
        } else if (ctx.consoleLog() != null) {
            ConsoleLog child6 = visitConsoleLog(ctx.consoleLog());
            object.setConsoleLog(child6);
        } else if (ctx.if_() != null) {
            IfStatement child7 = visitIf(ctx.if_());
            object.setIfStatement(child7);
        }

        return object;
    }

    @Override
    public Block visitBlock(Parser.BlockContext ctx) {
        Block object = new Block();

        for (int i = 0; i < ctx.statement().size(); i++) {
            Statement child = visitStatement(ctx.statement(i));
            object.addStatement(child);
        }

        return object;
    }

    @Override
    public Loops visitLoops(Parser.LoopsContext ctx) {
        Loops object = new Loops();

        if (ctx.for_() != null) {
            ForLoop child1 = visitFor(ctx.for_());
            object.setForLoop(child1);
        } else if (ctx.while_() != null) {
            WhileLoop child2 = visitWhile(ctx.while_());
            object.setWhileLoop(child2);
        } else if (ctx.do_() != null) {
            DoLoop child3 = visitDo(ctx.do_());
            object.setDoLoop(child3);
        }

        return object;
    }

    @Override
    public IfStatement visitIf(Parser.IfContext ctx) {
        IfStatement object = new IfStatement();

        for (int i = 0; i < ctx.expr().size(); i++) {
            Expr child = visitExpr(ctx.expr(i));
            object.addExpr(child);
        }

        Block child1 = visitBlock(ctx.block(0));
        object.setBlock(child1);

        if (ctx.block(1) != null) {
            Block child2 = visitBlock(ctx.block(1));
            object.setElseBlock(child2);
        }

        return object;
    }

    @Override
    public ForLoop visitFor(Parser.ForContext ctx) {
        ForLoop object = new ForLoop();

        ForParameter child1 = visitForParameters(ctx.forParameters());
        object.setForParameter(child1);

        Block child2 = visitBlock(ctx.block());
        object.setBlock(child2);

        return object;
    }

    @Override
    public ForParameter visitForParameters(Parser.ForParametersContext ctx) {
        ForParameter object = new ForParameter();

        if (ctx.variableDecl() != null) {
            VariableDecl child1 = visitVariableDecl(ctx.variableDecl());
            object.setVarDecl(child1);
        }

        if (ctx.expr(0) != null) {
            Expr child2 = visitExpr(ctx.expr(0));
            object.setExpr1(child2);
        }

        if (ctx.expr(1) != null) {
            Expr child3 = visitExpr(ctx.expr(1));
            object.setExpr2(child3);
        }

        return object;
    }

    @Override
    public WhileLoop visitWhile(Parser.WhileContext ctx) {
        WhileLoop object = new WhileLoop();

        Expr child1 = visitExpr(ctx.expr());
        object.setExpr(child1);

        Block child2 = visitBlock(ctx.block());
        object.setBlock(child2);

        return object;
    }

    @Override
    public DoLoop visitDo(Parser.DoContext ctx) {
        DoLoop object = new DoLoop();

        Block child1 = visitBlock(ctx.block());
        object.setBody(child1);

        Expr child2 = visitExpr(ctx.expr());
        object.setExpr(child2);

        return object;
    }

    @Override
    public ConsoleLog visitConsoleLog(Parser.ConsoleLogContext ctx) {
        ConsoleLog object = new ConsoleLog();

        Expr child = visitExpr(ctx.expr());
        object.setExpr(child);

        return object;
    }

    @Override
    public Dec visitDecl(Parser.DeclContext ctx) {
        Dec object = new Dec();

        if (ctx.variableDecl() != null) {
            VariableDecl child1 = visitVariableDecl(ctx.variableDecl());
            object.setVariableDecl(child1);
        } else if (ctx.variableTypeDecl() != null) {
            VariableTypeDecl child2 = visitVariableTypeDecl(ctx.variableTypeDecl());
            object.setVariableTypeDecl(child2);
        } else if (ctx.normalFunctionDecleration() != null) {
            NormalFunctionDec child3 = visitNormalFunctionDecleration(ctx.normalFunctionDecleration());
            object.setNormalFunctionDeclaration(child3);
        }

        return object;
    }

    @Override
    public VariableDecl visitVariableDecl(Parser.VariableDeclContext ctx) {
        VariableDecl object = new VariableDecl();

        Identifier child1 = visitIdentifier_(ctx.identifier_());
        object.setName(child1);

        if (ctx.expr() != null) {
            Expr child2 = visitExpr(ctx.expr());
            object.setExpr(child2);
        } else if (ctx.anyLiteral() != null) {
            AnyLiteral child3 = visitAnyLiteral(ctx.anyLiteral());
            object.setValue(child3);
        }

        return object;
    }

    @Override
    public VariableTypeDecl visitVariableTypeDecl(Parser.VariableTypeDeclContext ctx) {
        VariableTypeDecl object = new VariableTypeDecl();

        Identifier child1 = visitIdentifier_(ctx.identifier_());
        object.setIdentifier(child1);

        if (ctx.expr() != null) {
            Expr child2 = visitExpr(ctx.expr());
            object.setExpr(child2);
        } else if (ctx.anyLiteral() != null) {
            AnyLiteral child3 = visitAnyLiteral(ctx.anyLiteral());
            object.setAnyLiteral(child3);
        }

        DataType child4 = visitDataTypes(ctx.dataTypes());
        object.setDataType(child4);

        return object;
    }

    @Override
    public DataType visitDataTypes(Parser.DataTypesContext ctx) {
        DataType object = new DataType();

        if (ctx.Number() != null) {
            object.setType(ctx.Number().getText());
        } else if (ctx.String() != null) {
            object.setType(ctx.String().getText());
        } else if (ctx.Boolean() != null) {
            object.setType(ctx.Boolean().getText());
        } else if (ctx.Any() != null) {
            object.setType(ctx.Any().getText());
        }

        return object;
    }

    @Override
    public Initialize visitInitialize(Parser.InitializeContext ctx) {
        Initialize object = new Initialize();

        Identifier child1 = visitIdentifier_(ctx.identifier_());
        object.setIdentifier(child1);

        if (ctx.expr() != null) {
            Expr child2 = visitExpr(ctx.expr());
            object.setExpr(child2);
        } else if (ctx.anyLiteral() != null) {
            AnyLiteral child3 = visitAnyLiteral(ctx.anyLiteral());
            object.setAnyLiteral(child3);
        }

        return object;
    }

    @Override
    public Expr visitExpr(Parser.ExprContext ctx) {
        Expr object = new Expr();

        if (ctx.functionCall() != null) {
            FunctionCall child1 = visitFunctionCall(ctx.functionCall());
            object.setFunc(child1);
        } else if (ctx.arrayLiteral() != null) {
            ArrayLiteral child2 = visitArrayLiteral(ctx.arrayLiteral());
            object.setArrayLiteral(child2);
        } else if (ctx.objectLiteral() != null) {
            ObjectLiteral child3 = visitObjectLiteral(ctx.objectLiteral());
            object.setObjectLiteral(child3);
        } else if (ctx.arrowFunctionDecleration() != null) {
            ArrowFunctionDec child4 = visitArrowFunctionDecleration(ctx.arrowFunctionDecleration());
            object.setArrowFunctionDec(child4);
        } else if (ctx.StringLiteral() != null) {
            object.setStringLiteral(ctx.StringLiteral().getText());
        } else if (ctx.arithmeticExpr() != null) {
            ArithmeticExpr child5 = visitArithmeticExpr(ctx.arithmeticExpr());
            object.setArithmeticExpr(child5);
        } else if (ctx.PlusPlus() != null) {
            Expr child6 = visitExpr(ctx.expr());
            object.setExpr(child6);
        } else if (ctx.MinusMinus() != null) {
            Expr child7 = visitExpr(ctx.expr());
            object.setExpr(child7);
        } else if (ctx.initialize() != null) {
            Initialize child8 = visitInitialize(ctx.initialize());
            object.setInitialize(child8);
        } else if (ctx.return_() != null) {
            Return child9 = visitReturn(ctx.return_());
            object.setReturn_(child9);
        } else if (ctx.Break() != null) {
            object.setBreak(ctx.Break().getText());
        } else if (ctx.Continue() != null) {
            object.setContinue(ctx.Continue().getText());
        } else if (ctx.identifier_() != null) {
            Identifier child10 = visitIdentifier_(ctx.identifier_());
            object.setIdentifier(child10);
        }

        return object;
    }

    @Override
    public Return visitReturn(Parser.ReturnContext ctx) {
        Return object = new Return();

        if (ctx.expr() != null) {
            Expr child = visitExpr(ctx.expr());
            object.setExpr(child);
        }

        return object;
    }

    @Override
    public ArithmeticExpr visitArithmeticExpr(Parser.ArithmeticExprContext ctx) {
        ArithmeticExpr object = new ArithmeticExpr();

        if (ctx.identifier_() != null) {
            Identifier child = visitIdentifier_(ctx.identifier_());
            object.setIdentifier(child);
        } else if (ctx.StringLiteral() != null) {
            object.setStringLiteral(ctx.StringLiteral().getText());
        } else if (ctx.DecimalLiteral() != null) {
            object.setDecimalLiteral(ctx.DecimalLiteral().getText());
        } else {
            ArithmeticExpr child2 = visitArithmeticExpr(ctx.arithmeticExpr(0));
            object.setLeft(child2);

            ArithmeticExpr child3 = visitArithmeticExpr(ctx.arithmeticExpr(1));
            object.setRight(child3);

            Operator child4 = visitOperartor(ctx.operartor());
            object.setOperator(child4);
        }

        return object;
    }

    @Override
    public Operator visitOperartor(Parser.OperartorContext ctx) {
        Operator object = new Operator();

        object.setOperator(ctx.getText());

        return object;
    }

    @Override
    public Identifier visitIdentifier_(Parser.Identifier_Context ctx) {
        Identifier object = new Identifier();

        object.setName(ctx.Identifier().getText());

        if (ctx.arrayIndex() != null) {
            ArrayIndex child = visitArrayIndex(ctx.arrayIndex());
            object.setArrayIndex(child);
        }

        return object;
    }

    @Override
    public ArrayIndex visitArrayIndex(Parser.ArrayIndexContext ctx) {
        ArrayIndex object = new ArrayIndex();

        for (int i = 0; i < ctx.expr().size(); i++) {
            Expr child = visitExpr(ctx.expr(i));
            object.addExpr(child);
        }

        return object;
    }

    @Override
    public AnyLiteral visitAnyLiteral(Parser.AnyLiteralContext ctx) {
        AnyLiteral object = new AnyLiteral();

        if (ctx.arrayLiteral() != null) {
            ArrayLiteral child1 = visitArrayLiteral(ctx.arrayLiteral());
            object.setArrayLiteral(child1);
        } else if (ctx.objectLiteral() != null) {
            ObjectLiteral child2 = visitObjectLiteral(ctx.objectLiteral());
            object.setObjectLiteral(child2);
        } else if (ctx.StringLiteral() != null) {
            object.setStringLiteral(ctx.StringLiteral().getText());
        } else if (ctx.DecimalLiteral() != null) {
            object.setDecimalLiteral(ctx.DecimalLiteral().getText());
        } else if (ctx.BooleanLiteral() != null) {
            object.setBoolLiteral(ctx.BooleanLiteral().getText());
        } else if (ctx.NullLiteral() != null) {
            object.setNullLiteral(ctx.NullLiteral().getText());
        }

        return object;
    }

    @Override
    public ArrayLiteral visitArrayLiteral(Parser.ArrayLiteralContext ctx) {
        ArrayLiteral object = new ArrayLiteral();

        ArrayList child = visitArrayList(ctx.arrayList());
        object.setArray(child);

        return object;
    }

    @Override
    public ArrayList visitArrayList(Parser.ArrayListContext ctx) {
        ArrayList object = new ArrayList();

        for (int i = 0; i < ctx.arrayElement().size(); i++) {
            ArrayElement child = visitArrayElement(ctx.arrayElement(i));
            object.addElement(child);
        }

        return object;
    }

    @Override
    public ArrayElement visitArrayElement(Parser.ArrayElementContext ctx) {
        ArrayElement object = new ArrayElement();

        if (ctx.anyLiteral() != null) {
            AnyLiteral child = visitAnyLiteral(ctx.anyLiteral());
            object.setAnyLiteral(child);
        } else if (ctx.expr() != null) {
            Expr child = visitExpr(ctx.expr());
            object.setExpr(child);
        } else if (ctx.identifier_() != null) {
            Identifier child = visitIdentifier_(ctx.identifier_());
            object.setId(child);
        }

        return object;
    }

    @Override
    public ObjectLiteral visitObjectLiteral(Parser.ObjectLiteralContext ctx) {
        ObjectLiteral object = new ObjectLiteral();

        ObjectBody child = visitObjectBody(ctx.objectBody());
        object.setObject(child);

        return object;
    }

    @Override
    public ObjectBody visitObjectBody(Parser.ObjectBodyContext ctx) {
        ObjectBody object = new ObjectBody();

        for (int i = 0; i < ctx.objectKeyValue().size(); i++) {
            ObjectKeyValue child = visitObjectKeyValue(ctx.objectKeyValue(i));
            object.addObject(child);
        }

        return object;
    }

    @Override
    public ObjectKeyValue visitObjectKeyValue(Parser.ObjectKeyValueContext ctx) {
        ObjectKeyValue object = new ObjectKeyValue();

        if (ctx.Identifier() != null) {
            object.setKey(ctx.Identifier().getText());
        } else if (ctx.StringLiteral() != null) {
            object.setKey(ctx.StringLiteral().getText());
        } else if (ctx.DecimalLiteral() != null) {
            object.setKey(ctx.DecimalLiteral().getText());
        }

        Expr child = visitExpr(ctx.expr());
        object.setValue(child);

        return object;
    }

    @Override
    public FunctionDec visitFunctionDecl(Parser.FunctionDeclContext ctx) {
        FunctionDec object = new FunctionDec();

        if (ctx.normalFunctionDecleration() != null) {
            NormalFunctionDec child1 = visitNormalFunctionDecleration(ctx.normalFunctionDecleration());
            object.setNormalFunctionDec(child1);
        } else if (ctx.arrowFunctionDecleration() != null) {
            ArrowFunctionDec child2 = visitArrowFunctionDecleration(ctx.arrowFunctionDecleration());
            object.setArrowFunctionDec(child2);
        }

        return object;
    }

    @Override
    public NormalFunctionDec visitNormalFunctionDecleration(Parser.NormalFunctionDeclerationContext ctx) {
        NormalFunctionDec object = new NormalFunctionDec();

        Identifier child1 = visitIdentifier_(ctx.identifier_());
        object.setName(child1);

        FunctionParameters child2 = visitFunctionParameters(ctx.functionParameters());
        object.setFunctionParameters(child2);

        FunctionBody child3 = visitFunctionBody(ctx.functionBody());
        object.setBody(child3);

        return object;
    }

    @Override
    public ArrowFunctionDec visitArrowFunctionDecleration(Parser.ArrowFunctionDeclerationContext ctx) {
        ArrowFunctionDec object = new ArrowFunctionDec();

        FunctionParameters child2 = visitFunctionParameters(ctx.functionParameters());
        object.setFunctionParameters(child2);

        FunctionBody child3 = visitFunctionBody(ctx.functionBody());
        object.setFunctionBody(child3);

        return object;
    }

    @Override
    public FunctionBody visitFunctionBody(Parser.FunctionBodyContext ctx) {
        FunctionBody object = new FunctionBody();

        Block child = visitBlock(ctx.block());
        object.setBody(child);

        return object;
    }

    @Override
    public FunctionParameters visitFunctionParameters(Parser.FunctionParametersContext ctx) {
        FunctionParameters object = new FunctionParameters();

        if (ctx.variableFunctionSingleArgument() != null) {
            for (int i = 0; i < ctx.variableFunctionSingleArgument().size(); i++) {
                VariableFunctionSingleArgument child = visitVariableFunctionSingleArgument(ctx.variableFunctionSingleArgument(i));
                object.addArgument(child);
            }
        }

        return object;
    }

    @Override
    public VariableFunctionSingleArgument visitVariableFunctionSingleArgument(Parser.VariableFunctionSingleArgumentContext ctx) {
        VariableFunctionSingleArgument object = new VariableFunctionSingleArgument();

        Identifier child1 = visitIdentifier_(ctx.identifier_());
        object.setIdentifier(child1);

        DataType child2 = visitDataTypes(ctx.dataTypes());
        object.setDataType(child2);

        return object;
    }

    @Override
    public Constructor visitConstructor(Parser.ConstructorContext ctx) {
        Constructor object = new Constructor();

        InjectableFunctionParameters child1 = visitInjectableFunctionParameters(ctx.injectableFunctionParameters());
        object.setParameters(child1);

        Block child2 = visitBlock(ctx.block());
        object.setBlock(child2);

        return object;
    }

    @Override
    public InjectableFunctionParameters visitInjectableFunctionParameters(Parser.InjectableFunctionParametersContext ctx) {
        InjectableFunctionParameters object = new InjectableFunctionParameters();

        if (ctx.injectableVariableFunctionSingleArgument() != null) {
            for (int i = 0; i < ctx.injectableVariableFunctionSingleArgument().size(); i++) {
                InjectableVariableFunctionSingleArgument child = visitInjectableVariableFunctionSingleArgument(ctx.injectableVariableFunctionSingleArgument(i));
                object.addArgument(child);
            }
        }

        return object;
    }

    @Override
    public InjectableVariableFunctionSingleArgument visitInjectableVariableFunctionSingleArgument(Parser.InjectableVariableFunctionSingleArgumentContext ctx) {
        InjectableVariableFunctionSingleArgument object = new InjectableVariableFunctionSingleArgument();

        AccessModifiers child1 = visitAccessModifires(ctx.accessModifires());
        object.setAccessModifiers(child1);

        Identifier child2 = visitIdentifier_(ctx.identifier_());
        object.setIdentifier(child2);

        DataType child3 = visitDataTypes(ctx.dataTypes());
        object.setDataType(child3);

        return object;
    }

    @Override
    public AccessModifiers visitAccessModifires(Parser.AccessModifiresContext ctx) {
        AccessModifiers object = new AccessModifiers();

        object.setModifier(ctx.getText());

        return object;
    }

    @Override
    public HTML visitHtml(Parser.HtmlContext ctx) {
        HTML object = new HTML();

        if (ctx.htmlContent() != null) {
            for (int i = 0; i < ctx.htmlContent().size(); i++) {
                HtmlContent child = visitHtmlContent(ctx.htmlContent(i));
                object.addContent(child);
            }
        }

        return object;
    }

    @Override
    public HtmlContent visitHtmlContent(Parser.HtmlContentContext ctx) {
        HtmlContent object = new HtmlContent();

        if (ctx.htmlElement() != null) {
            HtmlElement child = visitHtmlElement(ctx.htmlElement());
            object.setHtmlElement(child);
        } else if (ctx.Identifier() != null) {
            object.setHtml(ctx.Identifier().getText());
        } else if (ctx.interpolationValue() != null) {
            InterpolationValue child = visitInterpolationValue(ctx.interpolationValue());
            object.setInterpolationValue(child);
        }

        return object;
    }

    @Override
    public InterpolationValue visitInterpolationValue(Parser.InterpolationValueContext ctx) {
        InterpolationValue object = new InterpolationValue();

        if (ctx.identifier_() != null) {
            Identifier child = visitIdentifier_(ctx.identifier_());
            object.setIdentifier(child);
        } else if (ctx.identifierPath() != null) {
            IdentifierPath child = visitIdentifierPath(ctx.identifierPath());
            object.setIdentifierPath(child);
        }

        return object;
    }

    @Override
    public IdentifierPath visitIdentifierPath(Parser.IdentifierPathContext ctx) {
        IdentifierPath object = new IdentifierPath();

        for (int i = 0; i < ctx.identifier_().size(); i++) {
            Identifier child = visitIdentifier_(ctx.identifier_(i));
            object.addIdentifier(child);
        }

        return object;
    }

    @Override
    public HtmlElement visitHtmlElement(Parser.HtmlElementContext ctx) {
        HtmlElement object = new HtmlElement();

        if (ctx.selfClosingTag() != null) {
            SelfClosingTag child1 = visitSelfClosingTag(ctx.selfClosingTag());
            object.setSelfClosingTag(child1);
        } else if (ctx.openTag() != null) {
            OpenTag child2 = visitOpenTag(ctx.openTag());
            object.setOpenTag(child2);

            for (int i = 0; i < ctx.htmlContent().size(); i++) {
                HtmlContent child = visitHtmlContent(ctx.htmlContent(i));
                object.addHtmlContent(child);
            }

            CloseTag child3 = visitCloseTag(ctx.closeTag());
            object.setCloseTag(child3);
        }

        return object;
    }

    @Override
    public HtmlTag visitHtmlTag(Parser.HtmlTagContext ctx) {
        HtmlTag object = new HtmlTag();

        object.setTag(ctx.getText());

        return object;
    }

    @Override
    public OpenTag visitOpenTag(Parser.OpenTagContext ctx) {
        OpenTag object = new OpenTag();

        HtmlTag child1 = visitHtmlTag(ctx.htmlTag());
        object.setHtmlTag(child1);

        if (ctx.structuralDirectives() != null) {
            StructuralDirectives child2 = visitStructuralDirectives(ctx.structuralDirectives());
            object.setStructuralDirectives(child2);
        }

        if (ctx.boundAttribute() != null) {
            for (int i = 0; i < ctx.boundAttribute().size(); i++) {
                BoundAttribute child3 = visitBoundAttribute(ctx.boundAttribute(i));
                object.addBoundAttribute(child3);
            }
        }

        if (ctx.attribute() != null) {
            for (int i = 0; i < ctx.attribute().size(); i++) {
                Attribute child4 = visitAttribute(ctx.attribute(i));
                object.addAttribute(child4);
            }
        }

        if (ctx.eventBinding() != null) {
            for (int i = 0; i < ctx.eventBinding().size(); i++) {
                EventBinding child5 = visitEventBinding(ctx.eventBinding(i));
                object.addEventBinding(child5);
            }
        }

        return object;
    }

    @Override
    public SelfClosingTag visitSelfClosingTag(Parser.SelfClosingTagContext ctx) {
        SelfClosingTag object = new SelfClosingTag();

        object.setTag(ctx.Identifier().getText());

        if (ctx.boundAttribute() != null) {
            for (int i = 0; i < ctx.boundAttribute().size(); i++) {
                BoundAttribute child3 = visitBoundAttribute(ctx.boundAttribute(i));
                object.addBoundAttribute(child3);
            }
        }

        if (ctx.attribute() != null) {
            for (int i = 0; i < ctx.attribute().size(); i++) {
                Attribute child4 = visitAttribute(ctx.attribute(i));
                object.addAttribute(child4);
            }
        }

        if (ctx.eventBinding() != null) {
            for (int i = 0; i < ctx.eventBinding().size(); i++) {
                EventBinding child5 = visitEventBinding(ctx.eventBinding(i));
                object.addEventBinding(child5);
            }
        }

        return object;
    }

    @Override
    public CloseTag visitCloseTag(Parser.CloseTagContext ctx) {
        CloseTag object = new CloseTag();

        HtmlTag child1 = visitHtmlTag(ctx.htmlTag());
        object.setHtmlTag(child1);

        return object;
    }

    @Override
    public StructuralDirectives visitStructuralDirectives(Parser.StructuralDirectivesContext ctx) {
        StructuralDirectives object = new StructuralDirectives();

        if (ctx.ifDirective() != null) {
            IfDirective child1 = visitIfDirective(ctx.ifDirective());
            object.setIfDirective(child1);
        } else if (ctx.forDirective() != null) {
            ForDirective child2 = visitForDirective(ctx.forDirective());
            object.setForDirective(child2);
        }

        return object;
    }

    @Override
    public ForDirective visitForDirective(Parser.ForDirectiveContext ctx) {
        ForDirective object = new ForDirective();

        Identifier child1 = visitIdentifier_(ctx.identifier_(0));
        object.setIdentifier1(child1);

        Identifier child2 = visitIdentifier_(ctx.identifier_(1));
        object.setIdentifier2(child2);

        return object;
    }

    @Override
    public IfDirective visitIfDirective(Parser.IfDirectiveContext ctx) {
        IfDirective object = new IfDirective();

        if (ctx.identifier_() != null) {
            Identifier child1 = visitIdentifier_(ctx.identifier_());
            object.setCondition(child1);
        } else if (ctx.anyLiteral() != null) {
            AnyLiteral child2 = visitAnyLiteral(ctx.anyLiteral());
            object.setThen(child2);
        }

        return object;
    }

    @Override
    public Attribute visitAttribute(Parser.AttributeContext ctx) {
        Attribute object = new Attribute();

        AttributeName child1 = visitAttributeName(ctx.attributeName());
        object.setName(child1);

        AttributeValue child2 = visitAttributeValue(ctx.attributeValue());
        object.setValue(child2);

        return object;
    }

    @Override
    public AttributeName visitAttributeName(Parser.AttributeNameContext ctx) {
        AttributeName object = new AttributeName();

        object.setName(ctx.Identifier().getText());

        return object;
    }

    @Override
    public AttributeValue visitAttributeValue(Parser.AttributeValueContext ctx) {
        AttributeValue object = new AttributeValue();

        if (ctx.StringLiteral() != null) {
            object.setValue(ctx.StringLiteral().getText());
        } else if (ctx.identifierPath() != null) {
            IdentifierPath child = visitIdentifierPath(ctx.identifierPath());
            object.setPath(child);
        }

        return object;
    }

    @Override
    public BoundAttribute visitBoundAttribute(Parser.BoundAttributeContext ctx) {
        BoundAttribute object = new BoundAttribute();

        AttributeName child1 = visitAttributeName(ctx.attributeName());
        object.setName(child1);

        IdentifierPath child2 = visitIdentifierPath(ctx.identifierPath());
        object.setBound(child2);

        return object;
    }

    @Override
    public EventName visitEventName(Parser.EventNameContext ctx) {
        EventName object = new EventName();

        object.setEventName(ctx.Identifier().getText());

        return object;
    }

    @Override
    public EventBinding visitEventBinding(Parser.EventBindingContext ctx) {
        EventBinding object = new EventBinding();

        EventName child1 = visitEventName(ctx.eventName());
        object.setEventName(child1);

        if (ctx.functionCall() != null) {
            FunctionCall child2 = visitFunctionCall(ctx.functionCall());
            object.setFunctionCall(child2);
        } else if (ctx.identifierPath() != null) {
            IdentifierPath child3 = visitIdentifierPath(ctx.identifierPath());
            object.setIdentifierPath(child3);
        }

        return object;
    }

    @Override
    public FunctionCall visitFunctionCall(Parser.FunctionCallContext ctx) {
        FunctionCall object = new FunctionCall();

        if (ctx.identifierPath() != null) {
            IdentifierPath child1 = visitIdentifierPath(ctx.identifierPath());
            object.setIdentifierPath(child1);
        }

        if (ctx.expr() != null) {
            for (int i = 0; i < ctx.expr().size(); i++) {
                Expr child2 = visitExpr(ctx.expr(i));
                object.addArgument(child2);
            }
        }

        return object;
    }
}