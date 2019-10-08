package dad.javafx.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneSample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FlowPane root = new FlowPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(5);
		root.setPadding(new Insets(5));
		
		for(int i = 0; i < 50; i++) {
			Button b = new Button("Button "+i);
			b.setPrefWidth(100);
			root.getChildren().add(b);
		}
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("Prueba de layouts");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
