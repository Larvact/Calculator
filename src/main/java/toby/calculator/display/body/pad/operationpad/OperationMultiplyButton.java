package toby.calculator.display.body.pad.operationpad;

import javafx.event.ActionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import toby.calculator.display.body.CalculatorInputLine;
import toby.calculator.display.body.pad.CalculatorSymbol;
import toby.calculator.display.body.pad.PadButton;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class OperationMultiplyButton extends PadButton
{
    @Autowired
    public OperationMultiplyButton(final CalculatorInputLine calculatorInputLine)
    {
        super(calculatorInputLine);
    }

    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        button.setText(CalculatorSymbol.MULTIPLY.getSymbolDisplay());
    }

    @Override
    public void inputSymbol(final ActionEvent event)
    {
        super.inputSymbol(CalculatorSymbol.MULTIPLY.getSymbolDisplay());
    }
}
