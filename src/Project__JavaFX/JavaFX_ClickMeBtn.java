package Project__JavaFX;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class JavaFX_ClickMeBtn extends Application{
    public static void main(String[] args) {
        launch(args );
    }
    @Override
    public void start(Stage primaryStage){
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("CLICK ME!!!"));

        //Scene scene = new Scene(pane, 500,200);
        primaryStage.setScene(new Scene(pane,500,300));
        primaryStage.setTitle("YOOO THIS IS A SUPER COOL WINDOW BRO!");
        primaryStage.show();
        // done for now
    }
}
