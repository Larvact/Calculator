package toby.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Calculator extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws IOException
    {
        Scene scene = new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/display/calculator.fxml"))));
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }
}