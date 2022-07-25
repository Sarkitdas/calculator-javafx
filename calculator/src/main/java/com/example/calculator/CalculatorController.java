package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {
    @FXML
    private Label output;
    public String outputText = "";
    public void outputWindow(String txt){
        outputText+=txt;
   }
    @FXML
    void AcClick(ActionEvent event) {
outputText="";
    }
    @FXML
    void processNumPad(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        outputWindow(value);
        output.setText(outputText);
    }
    @FXML
    void calculate(ActionEvent event) {
        System.out.println("Button CLicked");
        int cal = 0 ;
        String str = "";
        String x = "";
        for(int i=0 ;i<outputText.length();i++){
          Character ch = outputText.charAt(i);

    if(ch=='='){
        System.out.println(str);
        x+=str;
        str = "";
            }
            else if(ch=='+'){
        System.out.println("Str click");
        x+=str;
        System.out.println(str);
   str= "";
            }else if(ch.equals('-')){

            }else{
                str+=ch;
        System.out.println("checking "+str);
            }

        }
        System.out.println("sum " + x);
    }
    @FXML
    void processOperator(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();

        outputWindow(value);
        output.setText(outputText);


    }
}
