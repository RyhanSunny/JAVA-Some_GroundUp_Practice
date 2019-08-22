package Project__JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFX_A_Cool_Circle extends Application {
    public static void main(String[] args) {
        launch(args );
    }
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();

        Circle circle = new Circle(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.ORANGERED);
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        pane.getChildren().add(circle);

        primaryStage.setScene(new Scene(pane,600,300));
        primaryStage.setTitle("THIS IS A COOL CIRCLE BRO!");
        primaryStage.show();
        // done for now
    }
}
