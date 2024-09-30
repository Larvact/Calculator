package toby.calculator.operators;

import java.math.BigDecimal;

public interface Operator
{
    BigDecimal operation(final BigDecimal firstNumber, final BigDecimal secondNumber);
}
