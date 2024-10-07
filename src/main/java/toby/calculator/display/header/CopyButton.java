package toby.calculator.display.header;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import toby.calculator.display.body.pad.expressionpad.ExpressionLine;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class CopyButton implements Initializable
{
    @FXML
    private Button copyButton;
    protected final ExpressionLine expressionLine;

    @Autowired
    public CopyButton(final ExpressionLine expressionLine)
    {
        this.expressionLine = expressionLine;
    }

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
