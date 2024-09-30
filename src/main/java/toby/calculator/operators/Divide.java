package toby.calculator.operators;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divide implements Operator
{
    @Override
    public BigDecimal operation(final BigDecimal firstNumber, final BigDecimal secondNumber)
    {
        return firstNumber.divide(secondNumber, RoundingMode.UNNECESSARY);
    }
}
