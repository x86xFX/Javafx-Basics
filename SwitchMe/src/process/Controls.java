package process;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controls {
    @FXML
    private Label HomeLabel;

    @FXML
    private TextField UserName;

    public void login(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/Home.fxml"));
            Parent root = loader.load();
            Controls control = loader.getController();
            control.setName(UserName.getText());
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Home");
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setName(String userName){
        HomeLabel.setText("Welcome " + userName);
    }
}
