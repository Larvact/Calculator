package toby.calculator.operators;

import java.math.BigDecimal;

public class Multiply implements Operator
{
    @Override
    public BigDecimal operation(final BigDecimal firstNumber, final BigDecimal secondNumber)
    {
        return firstNumber.multiply(secondNumber);
    }
}
