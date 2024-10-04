package toby.calculator.display.body.numberpad;

import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class NumberPadNineButton extends NumberPadButton
{
    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        button.setText("9");
    }

    @Override
    void inputNumber(ActionEvent event)
    {
    }
}
