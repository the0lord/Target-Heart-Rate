package com.example.targetheartrate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class THRController {

    @FXML
    private Label AgeLabel;

    @FXML
    private TextField AgeTextField;

    @FXML
    private Label MHRLabel;

    @FXML
    private TextField MHRTextField;

    @FXML
    private Label THRLabel;

    @FXML
    private TextField THRTextField;

    @FXML
    private Button calculateButton;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try {
            double age = Double.parseDouble(AgeTextField.getText());
            double mH = 220 - age;
            double l = 0.5 * mH;
            double r = 0.85 * mH;
            MHRTextField.setText(String.valueOf(mH));
            THRTextField.setText(String.valueOf(l) + " - " + String.valueOf(r));

        } catch (Exception e) {
            AgeTextField.setText("Enter amount");
            AgeTextField.selectAll();
            AgeTextField.requestFocus();
        }
    }

}
