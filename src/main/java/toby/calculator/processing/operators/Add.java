package toby.calculator.processing.operators;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Qualifier(Add.ADD_OPERATOR)
public class Add implements Operator
{
    public static final String ADD_OPERATOR = "AddOperator";

    @Override
    public BigDecimal operation(final BigDecimal firstNumber, final BigDecimal secondNumber)
    {
        return firstNumber.add(secondNumber);
    }
}
