import javafx.applications.Applications;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJava extends Applications {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btOK = new Button(text "OK");
        Scene scene = new Scene(btOK, width 200, height 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}