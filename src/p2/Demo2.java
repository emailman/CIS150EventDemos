package p2;

/*
 * Created by emailman on 3/22/2016.
 * Button handlers are inner classes
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox(20);
        pane.setPadding(new Insets(20, 20, 20, 20));

        Button btUp = new Button("UP");
        btUp.setPrefWidth(100);
        UpHandler upHandler = new UpHandler();
        btUp.setOnAction(upHandler);

        Button btDown = new Button("DOWN");
        btDown.setPrefWidth(100);
        DownHandler downHandler = new DownHandler();
        btDown.setOnAction(downHandler);

        pane.getChildren().addAll(btUp, btDown);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("V1");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    class UpHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Button Event");
            alert.setHeaderText(null);
            alert.setContentText("UP Button Pressed");

            alert.showAndWait();
        }
    }

    class DownHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Button Event");
            alert.setHeaderText(null);
            alert.setContentText("DOWN Button Pressed");

            alert.showAndWait();
        }
    }
}




