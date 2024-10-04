package toby.calculator.display.body.operationpad;

import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class OperationSubtractButton extends OperationPadButton
{
    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        button.setText("-");
    }

    @Override
    void inputOperation(final ActionEvent event)
    {

    }
}
