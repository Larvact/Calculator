package toby.calculator.processing.operators;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Qualifier(Multiply.MULTIPLY_OPERATOR)
public class Multiply implements Operator
{
    public static final String MULTIPLY_OPERATOR = "MultiplyOperator";

    @Override
    public BigDecimal operation(final BigDecimal firstNumber, final BigDecimal secondNumber)
    {
        return firstNumber.multiply(secondNumber);
    }
}
