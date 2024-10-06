package toby.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import toby.calculator.display.body.CalculatorInputLine;

@Configuration
@ComponentScan
public class CalculatorApplicationContextConfig
{
    @Bean
    CalculatorInputLine calculatorInputLine()
    {
        final var calculatorInputLine = new CalculatorInputLine();
        return calculatorInputLine;
    }
/*
    @Bean
    CalculatorTypeSwitchButton calculatorTypeSwitchButton()
    {
        final var calculatorTypeSwitchButton = new CalculatorTypeSwitchButton();
        return calculatorTypeSwitchButton;
    }

    @Bean
    InputLinePadEqualsButton inputLinePadEqualsButton()
    {
        final var inputLinePadEqualsButton = new InputLinePadEqualsButton(null);
        return inputLinePadEqualsButton;
    }

    @Bean
    NumberPadDotButton numberPadDotButton()
    {
        final var numberPadDotButton = new NumberPadDotButton();
        return numberPadDotButton;
    }
    @Bean
    NumberPadZeroButton numberPadZeroButton()
    {
        final var numberPadZeroButton = new NumberPadZeroButton();
        return numberPadZeroButton;
    }
/*
    @Bean
    NumberPadOneButton numberPadOneButton()
    {
        final var numberPadOneButton = new NumberPadOneButton();
        return numberPadOneButton;
    }



    @Bean
    NumberPadTwoButton numberPadTwoButton()
    {
        final var numberPadTwoButton = new NumberPadTwoButton();
        return numberPadTwoButton;
    }

    @Bean
    NumberPadThreeButton numberPadThreeButton()
    {
        final var numberPadThreeButton = new NumberPadThreeButton();
        return numberPadThreeButton;
    }

    @Bean
    NumberPadFourButton numberPadFourButton()
    {
        final var numberPadFourButton = new NumberPadFourButton();
        return numberPadFourButton;
    }

    @Bean
    NumberPadFiveButton numberPadFiveButton()
    {
        final var numberPadFiveButton = new NumberPadFiveButton();
        return numberPadFiveButton;
    }

    @Bean
    NumberPadSixButton numberPadSixButton()
    {
        final var numberPadSixButton = new NumberPadSixButton();
        return numberPadSixButton;
    }

    @Bean
    NumberPadSevenButton numberPadSevenButton()
    {
        final var numberPadSevenButton = new NumberPadSevenButton();
        return numberPadSevenButton;
    }

    @Bean
    NumberPadEightButton numberPadEightButton()
    {
        final var numberPadEightButton = new NumberPadEightButton();
        return numberPadEightButton;
    }
    @Bean
    NumberPadNineButton numberPadNineButton()
    {
        final var numberPadNineButton = new NumberPadNineButton();
        return numberPadNineButton;
    }

    @Bean
    OperationAddButton operationAddButton()
    {
        final var operationAddButton = new OperationAddButton();
        return operationAddButton;
    }

    @Bean
    OperationSubtractButton operationSubtractButton()
    {
        final var operationSubtractButton = new OperationSubtractButton();
        return operationSubtractButton;
    }

    @Bean
    OperationMultiplyButton operationMultiplyButton()
    {
        final var operationMultiplyButton = new OperationMultiplyButton();
        return operationMultiplyButton;
    }

    @Bean
    OperationDivideButton operationDivideButton()
    {
        final var operationDivideButton = new OperationDivideButton();
        return operationDivideButton;
    }

    @Bean
    CopyButton copyButton()
    {
        final var copyButton = new CopyButton();
        return copyButton;
    }
*/
}
