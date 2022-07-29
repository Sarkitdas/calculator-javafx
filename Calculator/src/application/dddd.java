package application;

import java.text.DecimalFormat;


import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class dddd {


	    @FXML
	    private Pane btn0;

	    @FXML
	    private Pane btn1;

	    @FXML
	    private Pane btn2;

	    @FXML
	    private Pane btn3;

	    @FXML
	    private Pane btn4;

	    @FXML
	    private Pane btn5;

	    @FXML
	    private Pane btn6;

	    @FXML
	    private Pane btn7;

	    @FXML
	    private Pane btn8;

	    @FXML
	    private Pane btn9;

	    @FXML
	    private Pane btnClear;

	    @FXML
	    private ImageView btnClose;

	    @FXML
	    private Pane btnDivide;

	    @FXML
	    private Pane btnEquals;

	    @FXML
	    private ImageView btnMinimize;

	    @FXML
	    private Pane btnMinus;

	    @FXML
	    private Pane btnMultiply;

	    @FXML
	    private Pane btnPlus;

	    @FXML
	    private Label lblResult;

	    @FXML
	    private Pane titlePane;
	    
	    
	    int num;
	    double num1,num2;
	    double result;
	    String op;
	    
	    
	    @FXML
	    void oneClicked(MouseEvent event) 
	    {
	    	
	    	num=Integer.parseInt(lblResult.getText());
	    	if(num==0)
	    	{
	    		
	    		lblResult.setText("1");
	    	}
	    	else
	    	{
	    		lblResult.setText(lblResult.getText() +"1");
	    	}

	    }
	    
	    @FXML
	    void twoClicked(MouseEvent event) 
	    {
	    	
	    	
	    	num=Integer.parseInt(lblResult.getText());
	    	if(num==0)
	    	{
	    		
	    		lblResult.setText("2");
	    	}
	    	else
	    	{
	    		lblResult.setText(lblResult.getText() +"2");
	    	}

	    }
	    
	    @FXML
	    void threeClicked(MouseEvent event) 
	    {
	    	
	    	num=Integer.parseInt(lblResult.getText());
	    	if(num==0)
	    	{
	    		
	    		lblResult.setText("3");
	    	}
	    	else
	    	{
	    		lblResult.setText(lblResult.getText() +"3");
	    	}

	    }
	    
	    
	    @FXML
        void zeroClicked(MouseEvent event) {
	    	num=Integer.parseInt(lblResult.getText());
	    	num=Integer.parseInt(lblResult.getText());
	    	if(num==0)
	    	{
	    		
	    		lblResult.setText("0");
	    	}
	    	else
	    	{
	    		lblResult.setText(lblResult.getText() +"0");
	    	}

        }
	    
	    @FXML
	    void sixClicked(MouseEvent event) {
	    	num=Integer.parseInt(lblResult.getText());
	    	if(num==0)
	    	{
	    		
	    		lblResult.setText("6");
	    	}
	    	else
	    	{
	    		lblResult.setText(lblResult.getText() +"6");
	    	}

	    }
	    
	    @FXML
	    void sevenClicked(MouseEvent event) {
	    	num=Integer.parseInt(lblResult.getText());
	    	if(num==0)
	    	{
	    		
	    		lblResult.setText("7");
	    	}
	    	else
	    	{
	    		lblResult.setText(lblResult.getText() +"7");
	    	}

	    }
	    
	    @FXML
	    void fourClicked(MouseEvent event) {
	    	num=Integer.parseInt(lblResult.getText());
	    	if(num==0)
	    	{
	    		
	    		lblResult.setText("4");
	    	}
	    	else
	    	{
	    		lblResult.setText(lblResult.getText() +"4");
	    	}

	    }

	    @FXML
	    void nineClicked(MouseEvent event) {
	    	num=Integer.parseInt(lblResult.getText());
	    	if(num==0)
	    	{
	    		
	    		lblResult.setText("9");
	    	}
	    	else
	    	{
	    		lblResult.setText(lblResult.getText() +"9");
	    	}

	    }
	    
	    @FXML
	    void eightClicked(MouseEvent event) {
	    	num=Integer.parseInt(lblResult.getText());
	    	if(num==0)
	    	{
	    		
	    		lblResult.setText("8");
	    	}
	    	else
	    	{
	    		lblResult.setText(lblResult.getText() +"8");
	    	}

	    }

	    @FXML
	    void fiveClicked(MouseEvent event) {
	    	num=Integer.parseInt(lblResult.getText());
	    	if(num==0)
	    	{
	    		
	    		lblResult.setText("5");
	    	}
	    	else
	    	{
	    		lblResult.setText(lblResult.getText() +"5");
	    	}

	    }
	    
	    @FXML
	    void clear(MouseEvent event) {

	    	lblResult.setText("0");

	    }
	    
	    @FXML
	    void plus(MouseEvent event) {
	    	
	    	num1=Integer.parseInt(lblResult.getText());
	    	op="+";
	    	lblResult.setText("0");
	    }
	    
	    @FXML
	    void minus(MouseEvent event) {
	    	num1=Integer.parseInt(lblResult.getText());
	    	op="-";
	    	lblResult.setText("0");

	    }

	    @FXML
	    void multiply(MouseEvent event) {
	    	num1=Integer.parseInt(lblResult.getText());
	    	op="*";
	    	lblResult.setText("0");

	    }
	    
	    @FXML
	    void divide(MouseEvent event) {
	    	num1=Integer.parseInt(lblResult.getText());
	    	op="/";
	    	lblResult.setText("0");

	    }
	    
	    DecimalFormat df=new DecimalFormat("0.#");
	    
	    @FXML
	    void equal(MouseEvent event) 
	    { 	
	    	num2=Integer.parseInt(lblResult.getText());
	    	
	    	switch(op)
	    	{
	    	case "+":
	    		result=num1+num2;
	    		break;
	    	case "-":
	    		result=num1-num2;
	    		break;
	    	case "*":
	    		result=num1*num2;
	    		break;
	    	case "/":
	    		result=num1/num2;
	    		break;
	    	}
	    	lblResult.setText(String.valueOf(df.format(num1) +op+ df.format(num2) +"=" + df.format(result)));
	    }
	}
