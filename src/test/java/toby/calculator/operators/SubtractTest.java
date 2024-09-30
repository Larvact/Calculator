package toby.calculator.operators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractTest
{
    private Operator subtract;

    @BeforeEach
    void setup()
    {
        subtract = new Subtract();
    }

    @Test
    void subtract_twoNumbers_returnsCorrectNumber()
    {
        assertEquals(new BigDecimal("0.12"), subtract.operation(new BigDecimal("1.56"), new BigDecimal("1.44")));
    }
}