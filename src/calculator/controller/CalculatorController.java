package calculator.controller;

import calculator.model.Calculator;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import java.util.Optional;

public class CalculatorController {
    @FXML
    private Button calculate;

    @FXML
    private Button quit;

    @FXML
    private Pane pane;

    @FXML
    private Label label;

    private Calculator cal;

    public CalculatorController() {
        this.cal = new Calculator();
    }

    @FXML
    public void handleCalculate(ActionEvent event) {
        TextInputDialog text = new TextInputDialog();

        text.setTitle("Simple Calculator");

        text.getDialogPane().setContentText("Enter equation");

        Optional<String> result = text.showAndWait();
        TextField t = text.getEditor();

        String str = t.getText();
        String[] ele = str.split(" ");

        cal.getAnswer(Double.parseDouble(ele[0]), Double.parseDouble(ele[2]), ele[1].charAt(0));
    }

    @FXML
    public void handleQuit(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }
}
