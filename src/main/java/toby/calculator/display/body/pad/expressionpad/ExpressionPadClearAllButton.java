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
public class ExpressionPadClearAllButton implements Initializable
{
    @FXML
    private Button button;
    private final ExpressionLine expressionLine;
    private final ResultLine resultLine;

    @Autowired
    public ExpressionPadClearAllButton(final ExpressionLine expressionLine,
                                     final ResultLine resultLine)
    {
        this.expressionLine = expressionLine;
        this.resultLine = resultLine;
    }

    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        button.setText(CalculatorSymbol.CLEAR_ALL.getSymbolDisplay());
    }

    public void clearAll(final ActionEvent event)
    {
        expressionLine.getExpressionLine().setText("");
        resultLine.getExpressionResult().setText(null);
    }
}
