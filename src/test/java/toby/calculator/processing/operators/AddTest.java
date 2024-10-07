package toby.calculator.processing.operators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import toby.calculator.processing.operators.Add;
import toby.calculator.processing.operators.Operator;

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