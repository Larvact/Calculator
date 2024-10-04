package toby.calculator.display.body.operationpad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public abstract class OperationPadButton implements Initializable
{
    @FXML
    protected Button button;

    @FXML
    abstract void inputOperation(final ActionEvent event);
}
