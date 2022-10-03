package process;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Home extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/ui/logout.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Settings");
            primaryStage.show();

            primaryStage.setOnCloseRequest(event -> {
                event.consume();
                logout(primaryStage);
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void logout(Stage stage) {
        try {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Logout");
            alert.setHeaderText("You're about to logout");
            alert.setContentText("Do you want to logout?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                System.out.println("Logout");
                stage.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
