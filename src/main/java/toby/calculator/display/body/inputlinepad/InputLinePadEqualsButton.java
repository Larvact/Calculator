package toby.calculator.display.body.inputlinepad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class InputLinePadEqualsButton implements Initializable
{
    @FXML
    private Button equalsButton;

    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        equalsButton.setText("=");
    }

    public void calculate(final ActionEvent event)
    {
    }
}
