package toby.calculator.display.body.pad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import toby.calculator.display.body.CalculatorInputLine;

public abstract class PadButton implements Initializable
{
    @FXML
    protected Button button;
    protected final CalculatorInputLine calculatorInputLine;

    public PadButton(final CalculatorInputLine calculatorInputLine)
    {
        this.calculatorInputLine = calculatorInputLine;
    }

    @FXML
    protected abstract void inputSymbol(final ActionEvent event);

    protected void inputSymbol(final String symbol)
    {
        final var newExpression = calculatorInputLine.getCalculatorInputLine().getText() + symbol;
        calculatorInputLine.getCalculatorInputLine().setText(newExpression);
    }
}
