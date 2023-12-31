package client.GUI.RecipeScreen;

import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.text.*;

public class Header extends HBox {

  Header() {
    this.setPrefSize(500, 60); // Size of the header
    this.setStyle("-fx-background-color: #F0F8FF;");

    Text titleText = new Text("Recipe"); // Text of the Header
    titleText.setStyle("-fx-font-weight: bold; -fx-font-size: 20;");
    this.getChildren().add(titleText);
    this.setAlignment(Pos.CENTER); // Align the text to the Center
  }
}
