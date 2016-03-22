package p4;

/*
 * Created by emailman on 3/22/2016.
 * Button handlers are lamba expressions
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo4 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox(20);
        pane.setPadding(new Insets(20, 20, 20, 20));

        Button btUp = new Button("UP");
        btUp.setPrefWidth(100);
        btUp.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Button Event");
            alert.setHeaderText(null);
            alert.setContentText("UP Button Pressed");

            alert.showAndWait();
        });

        Button btDown = new Button("DOWN");
        btDown.setPrefWidth(100);

        btDown.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Button Event");
            alert.setHeaderText(null);
            alert.setContentText("DOWN Button Pressed");

            alert.showAndWait();
        });

        pane.getChildren().addAll(btUp, btDown);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("V1");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}




