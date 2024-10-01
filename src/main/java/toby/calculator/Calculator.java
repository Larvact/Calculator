package toby.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

import static toby.calculator.config.CalculatorProperties.CALCULATOR_PROPERTIES;
import static toby.calculator.config.CalculatorProperties.CALCULATOR_XML_PATH_KEY;
import static toby.calculator.config.CalculatorProperties.getCalculatorProperty;

public class Calculator extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws IOException
    {
        Scene scene = new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource(getCalculatorProperty(CALCULATOR_XML_PATH_KEY))), CALCULATOR_PROPERTIES));
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.setResizable(false);
        stage.show();
    }
}