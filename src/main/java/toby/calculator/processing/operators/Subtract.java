package toby.calculator.processing.operators;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Qualifier(Subtract.SUBTRACT_OPERATOR)
public class Subtract implements Operator
{
    public static final String SUBTRACT_OPERATOR = "SubtractOperator";

    @Override
    public BigDecimal operation(final BigDecimal firstNumber, final BigDecimal secondNumber)
    {
        return firstNumber.subtract(secondNumber);
    }
}
