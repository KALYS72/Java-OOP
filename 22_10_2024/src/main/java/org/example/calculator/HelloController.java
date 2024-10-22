package org.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class HelloController {

    Calculator calc = new Calculator();

    @FXML
    private TextField text;

    @FXML
    private void on1() {
        appendText("1");
    }

    @FXML
    private void on2() {
        appendText("2");
    }

    @FXML
    private void on3() {
        appendText("3");
    }

    @FXML
    private void on4() {
        appendText("4");
    }

    @FXML
    private void on5() {
        appendText("5");
    }

    @FXML
    private void on6() {
        appendText("6");
    }

    @FXML
    private void on7() {
        appendText("7");
    }

    @FXML
    private void on8() {
        appendText("8");
    }

    @FXML
    private void on9() {
        appendText("9");
    }

    @FXML
    private void on0() {
        appendText("0");
    }

    @FXML
    private void onDot() {
        appendText(".");
    }

    private void appendText(String value) {
        String val = text.getText();
        val = val + value;
        text.setText(val);
    }

    @FXML
    private void onPlus() {
        setOperator('+');
    }

    @FXML
    private void onMinus() {
        setOperator('-');
    }

    @FXML
    private void onMultiply() {
        setOperator('*');
    }

    @FXML
    private void onDivide() {
        setOperator('/');
    }

    private void setOperator(char operator) {
        String op1 = text.getText();
        text.setText("");
        calc.setOp1(Double.parseDouble(op1));
        calc.setOperator(operator);
    }

    @FXML
    private void onEqualClick() {
        String op2 = text.getText();
        calc.setOp2(Double.parseDouble(op2));
        calc.calculate();
        if (calc.isError()) {
            text.setText("Error: Division by Zero");
        } else {
            text.setText(String.valueOf(calc.getResult()));
        }
    }

    @FXML
    private void onClear() {
        calc.clear();
        text.setText("");
    }

    @FXML
    private void onExit() {
        javafx.application.Platform.exit();
    }

    @FXML
    private void onHelp() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Help");
        alert.setHeaderText("Calculator Instructions");
        alert.setContentText("To use this calculator:\n"
                + "1. Use the number buttons (0-9) to enter values.\n"
                + "2. Use the operator buttons (+, -, *, /) to select the operation you want to perform.\n"
                + "3. Press '=' to calculate the result of the operation.\n"
                + "4. Use 'C' to clear the current input or result.\n"
                + "5. Use 'CE' to reset the entire expression.\n"
                + "6. Press 'Exit' to close the application.");
        alert.showAndWait();
    }
}
