import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class job02 extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Button quitter = new Button("Quitter");
        quitter.setOnAction(e -> System.exit(0));
        root.setBottom(quitter);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Exemple BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
