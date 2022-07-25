package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    private long num1;
    private String operator = "";
    private boolean start = true;
    @FXML
    private Label output;
    @FXML
    private void processNumPad(ActionEvent event) {
        if(start){
            output.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void processOperator(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        if(!value.equals("=")) {
            if(!operator.isEmpty()) {
                return;
            }
            operator = value;
            num1 = Long.parseLong(output.getText());
            output.setText("");
        }
        else {
            if(operator.isEmpty()){
                return;
            }
            if (output.getText().isEmpty()){
                output.setText("ERROR");
                operator = "";
                start = true;
            }
            output.setText(calculate(num1, Long.parseLong(output.getText()), operator));
//            operator = "";
            start = true;
        }
    }

    private String calculate(long num1, long num2, String op) {
        System.out.println(num1+" " +num2+" " +op);
        switch (op) {

            case "+":
                String.valueOf(num1 + num2);
            case "-":
                String.valueOf(num1 - num2);
            case "×":
                String.valueOf(num1 * num2);
            case "÷":
                if (num2 == 0) {
                    return "ERROR";
                }
                String.valueOf(num1 / num2);

        }
        return "ERROR";
    }

}