package p5;

/*
 * Created by emailman on 3/22/2016.
 * Button handler is attached to both buttons
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

public class SharedHandlerDemo extends Application {
    Button btUp;
    Button btDown;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox(20);
        pane.setPadding(new Insets(20, 20, 20, 20));

        ButtonHandler handler = new ButtonHandler();

        btUp = new Button("UP");
        btUp.setPrefWidth(100);
        btUp.setOnAction(handler);

        btDown = new Button("DOWN");
        btDown.setPrefWidth(100);
        btDown.setOnAction(handler);

        pane.getChildren().addAll(btUp, btDown);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("V1");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    class ButtonHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            String message;
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Button Event");
            alert.setHeaderText(null);

            if (event.getSource() == btUp)
                message = "UP Button Pressed";
            else
                message = "DOWN Button Pressed";

            alert.setContentText(message);
            alert.showAndWait();
        }
    }
}




