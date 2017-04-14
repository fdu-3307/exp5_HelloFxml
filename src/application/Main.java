package application;
	
import java.io.IOException;

import application.calculator.simple.SimpleCalculatorController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
			// NOTE ilker just replaced above default generated line with below 1
//			Parent root = getRoot4simpleCalculator();
//			Scene scene = new Scene(root,400,400);
			// NOTE ilker just replaced above default generated line with below 1
			Scene scene = getScene4simpleCalculator(primaryStage);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * NOTE ilker added to return the root layout in SimpleCalculator.fxml
	 * @param primaryStage
	 * @return
	 * @throws IOException
	 */
	private Parent getRoot4simpleCalculator() throws IOException {
		AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("calculator/simple/SimpleCalculator.fxml"));
		return anchorPane;
	}

	/**
	 * NOTE ilker added to return Scene that contains root layout of SimpleCalculator.fxml and sets Scene in SimpleCalculatorController instance of it
	 * @param primaryStage
	 * @return
	 * @throws IOException
	 */
	private Scene getScene4simpleCalculator(Stage primaryStage) throws IOException {
		FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("calculator/simple/SimpleCalculator.fxml"));
		AnchorPane root = fXMLLoader.load();

		Scene scene = new Scene(root,400,400);

		SimpleCalculatorController simpleCalculatorController = fXMLLoader.getController();
		simpleCalculatorController.setScene(scene);

		primaryStage.setTitle(SimpleCalculatorController.APP_TITLE);

		return scene;
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
