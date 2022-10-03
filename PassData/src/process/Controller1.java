package process;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller1 {
    @FXML
    private TextField userNameField;

    public void login(ActionEvent event){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/scene2.fxml"));
            Parent root = loader.load();
            Controller2 controller2 = loader.getController();
            controller2.displayName(userNameField.getText());
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}