import javafx.application.Application;

public class MultipleStageDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new Button(text "OK"), width 200, height 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.show();

        Stage stage = new Stage();
        stage.setScene(new Scene(new Button(text "New Stage Button")), width 300, height 400);
        stage.setTitle("secpnd Stage");
        stage.show();
    }
}