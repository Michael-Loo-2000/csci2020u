import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class MyJavaFX extends Application {

    //Override
    public void start(Stage primaryStage) throws Exception {
        Button btOK = new Button("Ok");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
