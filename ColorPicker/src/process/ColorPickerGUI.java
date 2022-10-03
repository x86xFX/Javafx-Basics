package process;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.stage.Stage;

public class ColorPickerGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/ui/ColorPickerUI.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Color Picker");
            primaryStage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private ColorPicker bgColorPicker;
    @FXML
    private AnchorPane bgPanel;

    public void SetColorBg(){
        bgPanel.setStyle("-fx-background: '"+ bgColorPicker.getValue() +"';");
//        bgPanel.setBackground(new Background(new BackgroundFill(bgColorPicker.getValue(), null,null)));
    }
}
