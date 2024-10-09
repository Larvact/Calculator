package toby.calculator.processing.evaluation.parser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import toby.calculator.processing.operators.Add;
import toby.calculator.processing.operators.Divide;
import toby.calculator.processing.operators.Multiply;
import toby.calculator.processing.operators.Operator;
import toby.calculator.processing.operators.Subtract;

import java.math.BigDecimal;

@Component
public class ExpressionParserVisitor extends ExpressionBaseVisitor<BigDecimal>
{
    private final Operator divide;
    private final Operator multiply;
    private final Operator add;
    private final Operator subtract;

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
    public BigDecimal visitCalcExpr(final ExpressionParser.CalcExprContext ctx)
    {
        return visit(ctx.expr());
    }

    @Override
    public BigDecimal visitInt(final ExpressionParser.IntContext ctx)
    {
        return new BigDecimal(ctx.INT().getText());
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
