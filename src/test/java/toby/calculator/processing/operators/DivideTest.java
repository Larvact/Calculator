package toby.calculator.processing.operators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import toby.calculator.processing.operators.Divide;
import toby.calculator.processing.operators.Operator;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivideTest
{
    private Operator divide;

    @BeforeEach
    void setup()
    {
        divide = new Divide();
    }

    @Test
    void divideByZero_returnsException()
    {
        assertThrows(ArithmeticException.class, () -> divide.operation(new BigDecimal("1.56"), new BigDecimal("0")));
    }

    @Test
    void divide_twoNumbers_returnsCorrectNumber()
    {
        assertEquals(new BigDecimal("1.083333333"), divide.operation(new BigDecimal("1.56"), new BigDecimal("1.44")));
    }
}