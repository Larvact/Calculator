package toby.calculator.display.body.numberpad;

import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class NumberPadFiveButton extends NumberPadButton
{
    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        button.setText("5");
    }

    @Override
    void inputNumber(ActionEvent event)
    {
    }
}
