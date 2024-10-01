package toby.calculator.display;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import lombok.Getter;
import lombok.Setter;
import toby.calculator.config.CalculatorType;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorTypeSwitchButton implements Initializable
{
    @FXML
    private Button calculatorType;

    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        calculatorType.setText(CalculatorType.BASIC.getDisplayName());
    }

    @FXML
    public void switchCalculatorType(final ActionEvent event)
    {
        if(CalculatorType.BASIC.getDisplayName().equals(calculatorType.getText()))
        {
            calculatorType.setText(CalculatorType.SCIENTIFIC.getDisplayName());
        }
        else
        {
            calculatorType.setText(CalculatorType.BASIC.getDisplayName());
        }
    }
}
