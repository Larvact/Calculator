package toby.calculator.display.body.pad.inputlinepad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import toby.calculator.display.body.CalculatorInputLine;
import toby.calculator.display.body.pad.CalculatorSymbol;
import toby.calculator.display.body.pad.PadButton;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class InputLinePadEqualsButton extends PadButton
{
    @Autowired
    public InputLinePadEqualsButton(final CalculatorInputLine calculatorInputLine)
    {
        super(calculatorInputLine);
    }

    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        button.setText(CalculatorSymbol.EQUALS.getSymbolDisplay());
    }

    @Override
    public void inputSymbol(final ActionEvent event)
    {
        super.inputSymbol(CalculatorSymbol.EQUALS.getSymbolDisplay());
    }

    public void calculate(final ActionEvent event)
    {
    }
}
