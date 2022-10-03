package process;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private AnchorPane logoutPanel;
    @FXML
    private Button logoutBtn;

    public void logout(ActionEvent event){
        try {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Logout");
            alert.setHeaderText("You're about to logout");
            alert.setContentText("Do you want to logout?");

            if(alert.showAndWait().get() == ButtonType.OK){
                Stage stage = (Stage) logoutPanel.getScene().getWindow();
                System.out.println("Logout");
                stage.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
