import javafx.scene.control.label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {
    //Override
    public void start(Stage primaryStage) throws exception {
        BorderPane pane = new BorderPane();

        StackPane panel = new StackPane();
        panel.getChildren().add(new Label(text"Top"));
        panel.setStyle("-fx-border-color: red");
        panel.setPadding()
    }


}
