package toby.calculator.display.body.numberpad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public abstract class NumberPadButton implements Initializable
{
    @FXML
    protected Button button;

    @FXML
    abstract void inputNumber(final ActionEvent event);
}
