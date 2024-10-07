package toby.calculator.processing.operators;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static toby.calculator.config.CalculatorProperties.MAXIMUM_DECIMAL_PLACES_KEY;
import static toby.calculator.config.CalculatorProperties.getCalculatorProperty;

public class Divide implements Operator
{
    @Override
    public BigDecimal operation(final BigDecimal firstNumber, final BigDecimal secondNumber)
    {
        return firstNumber.divide(secondNumber, Integer.parseInt(getCalculatorProperty(MAXIMUM_DECIMAL_PLACES_KEY)), RoundingMode.HALF_UP);
    }
}
