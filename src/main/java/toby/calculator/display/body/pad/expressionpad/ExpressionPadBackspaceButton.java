package toby.calculator.display.body.pad.expressionpad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import toby.calculator.display.body.pad.CalculatorSymbol;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class ExpressionPadBackspaceButton implements Initializable
{
    @FXML
    private Button button;
    private final ExpressionLine expressionLine;

    @Autowired
    public ExpressionPadBackspaceButton(final ExpressionLine expressionLine)
    {
        this.expressionLine = expressionLine;
    }

    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        button.setText(CalculatorSymbol.BACKSPACE.getSymbolDisplay());
    }

    public void backspace(final ActionEvent event)
    {
        final var currentExpression = expressionLine.getExpressionLine().getText();
        if (!currentExpression.isEmpty())
        {
            expressionLine.getExpressionLine().setText(currentExpression.substring(0, currentExpression.length() - 1));
        }
    }
}
