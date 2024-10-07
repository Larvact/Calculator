package toby.calculator.display.body.pad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import toby.calculator.display.body.pad.expressionpad.ExpressionLine;

public abstract class PadButton implements Initializable
{
    @FXML
    protected Button button;
    protected final ExpressionLine expressionLine;

    public PadButton(final ExpressionLine expressionLine)
    {
        this.expressionLine = expressionLine;
    }

    @FXML
    protected abstract void inputSymbol(final ActionEvent event);

    protected void inputSymbol(final String symbol)
    {
        final var newExpression = expressionLine.getExpressionLine().getText() + symbol;
        expressionLine.getExpressionLine().setText(newExpression);
    }
}
