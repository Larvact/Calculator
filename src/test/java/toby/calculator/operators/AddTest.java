package toby.calculator.operators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest
{
    private Operator add;

    @BeforeEach
    void setup()
    {
        add = new Add();
    }

    @Test
    void add_twoNumbers_returnsCorrectNumber()
    {
        assertEquals(new BigDecimal("3.00"), add.operation(new BigDecimal("1.56"), new BigDecimal("1.44")));
    }
}