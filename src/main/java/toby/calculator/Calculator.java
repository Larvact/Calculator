package toby.calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Calculator extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(final Stage stage)
    {
        final var button = new Button("1");
        final var root= new StackPane();
        root.getChildren().add(button);
        final var scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }
}