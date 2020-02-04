import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class MultipleStageDemo extends Application {
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new Button("Ok"), 200, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.show();

        Stage stage = new Stage();
        stage.setScene(new Scene(new Button("New Stage Button"), 100, 100));
        stage.setTitle("second Stage");
        stage.show();

    }
}
