package toby.calculator.display.body.pad.expressionpad;

import javafx.event.ActionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import toby.calculator.display.body.pad.CalculatorSymbol;
import toby.calculator.display.body.pad.PadButton;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class ExpressionPadEqualsButton extends PadButton
{
    @Autowired
    public ExpressionPadEqualsButton(final ExpressionLine expressionLine)
    {
        super(expressionLine);
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
