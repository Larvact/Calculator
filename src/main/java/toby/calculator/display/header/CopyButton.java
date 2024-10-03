package toby.calculator.display.header;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class CopyButton implements Initializable
{
    @FXML
    private Button copyButton;

    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        copyButton.setText("Copy");
    }

    @FXML
    public void copy(final ActionEvent event)
    {
    }
}
