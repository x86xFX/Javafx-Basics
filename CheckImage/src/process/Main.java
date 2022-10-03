package process;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/ui/blub.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.setTitle("Switch on Bulb");

            primaryStage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private CheckBox checkBoxBulb;
    @FXML
    private ImageView ImageViewBulb;
    @FXML
    private Label statusLabel;

    public void bulbOn(){
        if(checkBoxBulb.isSelected()){
            Image image = new Image(getClass().getResourceAsStream("/assets/bulb-on.png"));
            ImageViewBulb.setImage(image);
            statusLabel.setText("Save energy. Turn light off");
            statusLabel.setAlignment(Pos.CENTER);
            System.out.println("Bulb On");
        }else{
            Image image = new Image(getClass().getResourceAsStream("/assets/bulb-off.png"));
            ImageViewBulb.setImage(image);
            statusLabel.setText("Too dark here. Turn light on");
            statusLabel.setAlignment(Pos.CENTER);
            System.out.println("Bulb Off");
        }
    }
}
