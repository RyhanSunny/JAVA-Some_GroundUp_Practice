package Project__JavaFX;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPane_and_Multiple_Buttons extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        Button[] btns = new Button[5];
        for(int i=0; i <btns.length; i++){
            btns[i] = new Button("Button "+(i+1));
        }

        FlowPane fplane = new FlowPane();
        fplane.setAlignment(Pos.CENTER);
        fplane.setPadding(new Insets(10));
        fplane.setHgap(5);
        fplane.setVgap(10);

        fplane.getChildren().addAll(btns);

        primaryStage.setScene(new Scene(fplane, 400, 300));
        primaryStage.setTitle("A COOL WINDOW WITH COOL BUTTONS");
        primaryStage.show();
    }
}
