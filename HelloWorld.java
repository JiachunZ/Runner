import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloWorld extends Application {

    private static final Image SCENARY = new Image ("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\desert.png",800,400,true,true);
    final private ImageView imageviewSceneLeft = new ImageView (SCENARY);

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Demo");
        Group root = new Group();
        Scene scene = new Scene(root, 800, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        root.getChildren().addAll(imageviewSceneLeft);

    }

    public static void main(String[] args) {
        launch(args);
        // write your code here
    }
}





