package calculator.view;

import calculator.controller.CalculatorController;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class CalculatorApp extends Application {
    private CalculatorController controller;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Simple Calculator");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CalculatorView.fxml"));
        loader.setController(controller);

        Parent root = loader.load();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    } 
}
