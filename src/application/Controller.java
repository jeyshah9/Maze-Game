package application;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Sphere;

public class Controller {

	int Flag = 0;
	@FXML
	private Sphere ball;
	@FXML
	private MenuBar menu;
	@FXML
	private AnchorPane anchorPlane;
	@FXML
	private Arc ani1, ani2, ani3, ani4, ani5, ani6, ani7, ani8, ani9, ani10, ani11;

	public void changeTheme(ActionEvent actionEvent) {
		if (Flag == 0) {

			anchorPlane.getStyleClass().add("layout2");
			anchorPlane.getStyleClass().remove(1);

			Flag++;
		} else {

			anchorPlane.getStyleClass().add("layout");
			anchorPlane.getStyleClass().remove(1);
			Flag--;
		}

	}

}
