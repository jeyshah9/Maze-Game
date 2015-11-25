package application;

import java.util.HashMap;

import javafx.application.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.shape.Sphere;

public class Main extends Application {

	static HashMap<String, String> values;

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Gui.fxml"));

			Scene scene = new Scene(root, 470, 470);
			
			primaryStage.setScene(scene);
			scene.setOnKeyReleased(new EventHandler<javafx.scene.input.KeyEvent>() {

				@Override
				public void handle(javafx.scene.input.KeyEvent event) {
					
					if (values.containsKey(event.getCode().toString())) {

						System.out.println("Pressed>" + event.getCode());
						Sphere s = (Sphere) root.lookup("#ball");

						//Method 
						//check();
						System.out.println(s.getLayoutX());
						System.out.println(s.getLayoutY());

					}

				}

			});

			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		values = new HashMap<String, String>();
		values.put("UP", "UP");
		values.put("DOWN", "DOWN");
		values.put("RIGHT", "RIGHT");
		values.put("LEFT", "LEFT");
		values.put("ENTER", "ENTER");

		launch(args);
	}
}
