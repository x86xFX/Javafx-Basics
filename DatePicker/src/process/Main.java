package process;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/ui/datePicker.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Pick Date");
            primaryStage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private DatePicker DatePickerMain;
    @FXML
    private Label statusLabel;

    public void AddDate(){
        LocalDate userDate = DatePickerMain.getValue();
        String DateFormatted = userDate.format(DateTimeFormatter.ofPattern("MMM/dd/yyyy"));
        statusLabel.setAlignment(Pos.CENTER);
        statusLabel.setText(DateFormatted);
    }
}
