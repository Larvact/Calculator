package toby.calculator.display.body.numberpad;

import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class NumberPadThreeButton extends NumberPadButton
{
    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        button.setText("3");
    }

    @Override
    void inputNumber(ActionEvent event)
    {
    }
}
