package process;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class Home extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load((getClass().getResource("/ui/home.fxml")));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Radio Button Check");
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private RadioButton bananaRadio, orangeRadio;
    @FXML
    private Label statusLabel;

    public void RadioCheck(){
        if(bananaRadio.isSelected()){
            statusLabel.setText("Banana");

        }else if(orangeRadio.isSelected()){
            statusLabel.setText("Orange");

        }else {
            statusLabel.setText("Apple");
        }
    }
}
