package toby.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(CalculatorApplicationContextConfig.class);
        context.refresh();
        final var fmxlLoader = new FXMLLoader(getClass().getResource(getCalculatorProperty(CALCULATOR_XML_PATH_KEY)), CALCULATOR_PROPERTIES);
        fmxlLoader.setControllerFactory(context::getBean);
        Scene scene = new Scene(fmxlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.setResizable(false);
        stage.show();
    }
}