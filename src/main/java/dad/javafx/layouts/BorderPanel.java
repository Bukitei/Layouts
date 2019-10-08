package dad.javafx.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BorderPanel extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		Pane norte = new Pane();
		norte.setStyle("-fx-background-color:red");
		norte.setPrefHeight(25);
		Pane sur = new Pane();
		sur.setStyle("-fx-background-color:orange");
		sur.setPrefHeight(25);
		Pane este = new Pane();
		este.setStyle("-fx-background-color:blue");
		este.setPrefWidth(25);
		Pane oeste = new Pane();
		oeste.setStyle("-fx-background-color:green");
		oeste.setPrefWidth(25);
		Pane centro = new Pane();
		centro.setStyle("-fx-background-color:black");
		centro.setPrefHeight(25);
		centro.setPrefWidth(25);
		
		//Ejemplo de border panel
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(5, 20, 0, 47));
		root.setTop(norte);
		root.setBottom(sur);
		root.setLeft(oeste);
		root.setRight(este);
		root.setCenter(centro);
		
		BorderPane.setAlignment(oeste, Pos.CENTER);
		BorderPane.setAlignment(norte, Pos.CENTER);
		BorderPane.setAlignment(sur, Pos.CENTER);
		BorderPane.setAlignment(este, Pos.CENTER);
		BorderPane.setAlignment(centro, Pos.CENTER);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("Prueba de layouts");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
