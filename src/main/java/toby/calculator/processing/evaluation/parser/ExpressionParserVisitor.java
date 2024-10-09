package toby.calculator.processing.evaluation.parser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import toby.calculator.processing.operators.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Component
public class ExpressionParserVisitor extends ExpressionBaseVisitor<BigDecimal>
{
    private final Operator divide;
    private final Operator multiply;
    private final Operator add;
    private final Operator subtract;
    private final Map<String, BigDecimal> memory = new HashMap<>();

    @Autowired
    public ExpressionParserVisitor(@Qualifier(Divide.DIVIDE_OPERATOR) final Operator divide,
                                   @Qualifier(Multiply.MULTIPLY_OPERATOR) final Operator multiply,
                                   @Qualifier(Add.ADD_OPERATOR) final Operator add,
                                   @Qualifier(Subtract.SUBTRACT_OPERATOR) final Operator subtract)
    {
        this.divide = divide;
        this.multiply = multiply;
        this.add = add;
        this.subtract = subtract;
    }

    @Override
    public BigDecimal visitAssign(final ExpressionParser.AssignContext ctx)
    {
        String id = ctx.ID().getText();
        var value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    @Override
    public BigDecimal visitPrintExpr(final ExpressionParser.PrintExprContext ctx)
    {
        var value = visit(ctx.expr());
        System.out.println(value);
        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal visitInt(final ExpressionParser.IntContext ctx)
    {
        return new BigDecimal(ctx.INT().getText());
    }

    @Override
    public BigDecimal visitId(final ExpressionParser.IdContext ctx)
    {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal visitMult(final ExpressionParser.MultContext ctx)
    {
        var left = visit(ctx.expr(0));
        var right = visit(ctx.expr(1));
        return multiply.operation(left, right);
    }

    @Override
    public BigDecimal visitDiv(final ExpressionParser.DivContext ctx)
    {
        var left = visit(ctx.expr(0));
        var right = visit(ctx.expr(1));
        return divide.operation(left, right);
    }

    @Override
    public BigDecimal visitAdd(final ExpressionParser.AddContext ctx)
    {
        var left = visit(ctx.expr(0));
        var right = visit(ctx.expr(1));
       return add.operation(left, right);
    }

    @Override
    public BigDecimal visitSub(final ExpressionParser.SubContext ctx)
    {
        var left = visit(ctx.expr(0));
        var right = visit(ctx.expr(1));
        return subtract.operation(left, right);
    }

    @Override
    public BigDecimal visitParens(final ExpressionParser.ParensContext ctx)
    {
        return visit(ctx.expr());
    }
}
