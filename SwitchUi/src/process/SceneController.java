package process;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent parent;

    public void switchToScene1(ActionEvent evt){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/ui/scene1.fxml"));
            stage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void switchToScene2(ActionEvent evt){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/ui/scene2.fxml"));
            stage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}