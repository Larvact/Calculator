package toby.calculator.display.body.pad.numberpad;

import javafx.event.ActionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import toby.calculator.display.body.CalculatorInputLine;
import toby.calculator.display.body.pad.CalculatorSymbol;
import toby.calculator.display.body.pad.PadButton;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class NumberPadTwoButton extends PadButton
{
    @Autowired
    public NumberPadTwoButton(final CalculatorInputLine calculatorInputLine)
    {
        super(calculatorInputLine);
    }

    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        button.setText(CalculatorSymbol.TWO.getSymbolDisplay());
    }

    @Override
    public void inputSymbol(final ActionEvent event)
    {
        super.inputSymbol(CalculatorSymbol.TWO.getSymbolDisplay());
    }
}
