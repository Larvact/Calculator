package toby.calculator.processing.operators;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static toby.calculator.config.CalculatorProperties.MAXIMUM_DECIMAL_PLACES_KEY;
import static toby.calculator.config.CalculatorProperties.getCalculatorProperty;

@Component
@Qualifier(Divide.DIVIDE_OPERATOR)
public class Divide implements Operator
{
    public static final String DIVIDE_OPERATOR = "DivideOperator";

    @Override
    public BigDecimal operation(final BigDecimal firstNumber, final BigDecimal secondNumber)
    {
        return firstNumber.divide(secondNumber, Integer.parseInt(getCalculatorProperty(MAXIMUM_DECIMAL_PLACES_KEY)), RoundingMode.HALF_UP);
    }
}
