package toby.calculator.display.body.pad.numberpad;

import javafx.event.ActionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import toby.calculator.display.body.pad.expressionpad.ExpressionLine;
import toby.calculator.display.body.pad.CalculatorSymbol;
import toby.calculator.display.body.pad.PadButton;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class NumberPadZeroButton extends PadButton
{
    @Autowired
    public NumberPadZeroButton(final ExpressionLine expressionLine)
    {
        super(expressionLine);
    }

    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        button.setText(CalculatorSymbol.ZERO.getSymbolDisplay());
    }

    @Override
    public void inputSymbol(final ActionEvent event)
    {
        super.inputSymbol(CalculatorSymbol.ZERO.getSymbolDisplay());
    }
}
