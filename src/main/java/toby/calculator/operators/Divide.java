package toby.calculator.operators;

import toby.calculator.config.CalculatorProperties;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divide implements Operator
{
    @Override
    public BigDecimal operation(final BigDecimal firstNumber, final BigDecimal secondNumber)
    {
        return firstNumber.divide(secondNumber, Integer.parseInt(CalculatorProperties.getCalculatorProperty(CalculatorProperties.MAXIMUM_DECIMAL_PLACES_KEY)), RoundingMode.HALF_UP);
    }
}
