package toby.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import toby.calculator.display.body.pad.expressionpad.ExpressionLine;
import toby.calculator.display.body.pad.expressionpad.ResultLine;

@Configuration
@ComponentScan
public class CalculatorApplicationContextConfig
{
    @Bean
    ExpressionLine expressionLine()
    {
        final var expressionLine = new ExpressionLine();
        return expressionLine;
    }

    @Bean
    ResultLine resultLine()
    {
        final var resultLine = new ResultLine();
        return resultLine;
    }
}
