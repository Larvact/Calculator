package toby.calculator.display.header;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import toby.calculator.config.CalculatorType;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorTypeSwitchButton implements Initializable
{
    @FXML
    private Button calculatorTypeButton;

    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        calculatorTypeButton.setText(CalculatorType.BASIC.getDisplayName());
    }

    @FXML
    public void switchCalculatorType(final ActionEvent event)
    {
        if(CalculatorType.BASIC.getDisplayName().equals(calculatorTypeButton.getText()))
        {
            calculatorTypeButton.setText(CalculatorType.SCIENTIFIC.getDisplayName());
        }
        else
        {
            calculatorTypeButton.setText(CalculatorType.BASIC.getDisplayName());
        }
    }
}
