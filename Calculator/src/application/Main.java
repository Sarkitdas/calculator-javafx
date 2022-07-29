package application;
	
import javafx.application.Application;


import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage Stage) {
		try {
			Parent root= FXMLLoader.load(getClass().getResource("calculator.fxml"));
			Stage.setTitle("Calculator");
			Stage.setScene(new Scene(root,460,610));
			Stage.show();
			Stage.setResizable(false);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
