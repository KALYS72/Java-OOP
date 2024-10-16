package com.example.demo33;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label label2;

    @FXML
    private TextField weight;

    @FXML
    private TextField height;

    public static double bmi(double weight, double height) {
        return weight / (height/100 * height/100);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    @FXML
    private void onHelloButtonClick() {
        String val1 = weight.getText();
        String val2 = height.getText();
        double weightValue = Double.parseDouble(val1);
        double heightValue = Double.parseDouble(val2);
        double BMI = bmi(weightValue, heightValue);
        String formattedBMI = String.format("%.1f", BMI);
        String res = getBMIStatus(BMI);
        label2.setText("BMI: " + formattedBMI + " you are " + res);
    }
}