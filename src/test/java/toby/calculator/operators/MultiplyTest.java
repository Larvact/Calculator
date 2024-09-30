package toby.calculator.operators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyTest
{
    private Operator multiply;

    @BeforeEach
    void setup()
    {
        multiply = new Multiply();
    }

    @Test
    void multiply_twoNumbers_returnsCorrectNumber()
    {
        assertEquals(new BigDecimal("2.2464"), multiply.operation(new BigDecimal("1.56"), new BigDecimal("1.44")));
    }
}