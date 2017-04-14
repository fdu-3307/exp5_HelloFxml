/**
 * 
 */
package application.calculator.simple;

import java.net.URL;
import java.util.ResourceBundle;

import application.controller.HasScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * @author ilker
 *
 */
public class SimpleCalculatorController implements Initializable, HasScene {
	public static final String APP_TITLE = "FX Basic Calculator";	// NOTE ilker public for Main to use it to set Title of Stage
	private static final int    WIDTH_PREF_SINGLE_CELL = 80;
	private static final int    WIDTH_PREF_DOUBLE_CELL = 170;
	
	private static final String  NUM1_DEFAULT_MESSAGE = "enter num1";
	private static final String  NUM2_DEFAULT_MESSAGE = "enter num2";
	private static final String  RESULT_DEFAULT_MESSAGE = "result will be here";

	//	@FXML
//	private TextField textField_num1, textField_num2;
	@FXML
	private TextField textField_num1;
	@FXML
	private TextField textField_num2;
//	@FXML
//	private Button button2add, button2subtract, button2multiply, button2divide, button2clear;
	@FXML
	private Button button2add;
	@FXML
	private Button button2subtract;
	@FXML
	private Button button2multiply;
	@FXML
	private Button button2divide;
	@FXML
	private Button button2clear;
	@FXML
	private Label label4result;
	
	Scene scene;
	
	@FXML
	public void handleActionEvent(ActionEvent ae) {
		float num1, num2, result=0f;
		char symbol='E';
		boolean unHandledSource = false;
		
		if (ae.getSource() == button2clear) {
			textField_num1.setText(NUM1_DEFAULT_MESSAGE);
			textField_num2.setText(NUM2_DEFAULT_MESSAGE);
			label4result.setText(RESULT_DEFAULT_MESSAGE);
			textField_num1.requestFocus();
		} else {
			try {
				// parse number inputs from textFields
				num1 = Float.parseFloat(textField_num1.getText());
				num2 = Float.parseFloat(textField_num2.getText());
				
				if (ae.getSource() == button2add) {
					symbol = '+';
					result = num1 + num2;
				} else if (ae.getSource() == button2subtract) {
					symbol = '-';
					result = num1 - num2;
				} else if (ae.getSource() == button2multiply) {
					symbol = '*';
					result = num1 * num2;
				} else if (ae.getSource() == button2divide) {
					symbol = '/';
					result = num1 / num2;
				} else {
					unHandledSource = true;
				}
				
				if (unHandledSource) {
					label4result.setText("ERROR - UnHandled button source");
				} else {
					label4result.setText("" + num1 + symbol + num2 + '=' + result);
				}
			} catch (NullPointerException npe) {
				label4result.setText("ERROR - Input number(s) null");
				npe.printStackTrace();
			} catch (NumberFormatException nfe) {
				label4result.setText("ERROR - Invalid input number can not be parsed");
				nfe.printStackTrace();
			}
		}
	}

	@FXML
//	public void handleKeyEvent(KeyEvent ke, Scene scene) {
	public void handleKeyEvent(KeyEvent ke) {
//	public void handleKeyReleased(KeyEvent ke) {
		if (ke.getCode() == KeyCode.ENTER) {
			Node focusedNode = scene.getFocusOwner();
			if (focusedNode == button2add || focusedNode == button2subtract || focusedNode == button2multiply || focusedNode == button2divide || focusedNode == button2clear) {
				// ENTER was pressed while focus was on one of the buttons, then create an equivalent ActionEvent on that button emulating user clicking on it and let handleActionEvent handle it
				ActionEvent actionEvent = new ActionEvent(focusedNode, focusedNode);
				handleActionEvent(actionEvent);
			}
		}
	}

	@Override
	public boolean setScene(Scene scene) {
		boolean retVal = false;
		if (scene != null) {
			this.scene = scene;
			retVal = true;
		}
		return retVal;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}


}
