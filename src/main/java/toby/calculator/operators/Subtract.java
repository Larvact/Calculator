package toby.calculator.operators;

import java.math.BigDecimal;

public class Subtract implements Operator
{
    @Override
    public BigDecimal operation(final BigDecimal firstNumber, final BigDecimal secondNumber)
    {
        return firstNumber.subtract(secondNumber);
    }
}
