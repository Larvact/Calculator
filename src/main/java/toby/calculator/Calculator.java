package toby.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.Objects;

import static toby.calculator.config.CalculatorProperties.*;

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
        final var fxml = new FXMLLoader(getClass().getResource(getCalculatorProperty(CALCULATOR_XML_PATH_KEY)), CALCULATOR_PROPERTIES);
        fxml.setControllerFactory(context::getBean);
        Scene scene = new Scene(fxml.load());
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(getCalculatorProperty(APPLICATION_CSS_PATH_KEY))).toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.setResizable(false);
        stage.show();
    }
}