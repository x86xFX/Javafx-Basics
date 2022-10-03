package process;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label statusLabel;

    @FXML
    private ChoiceBox BoxUi;

    private String[] foods = {"Apple", "Orange", "Banana"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        BoxUi.getItems().addAll(foods);
        BoxUi.setOnAction(this::getFood);
    }

    public void getFood(Event event){
        statusLabel.setText("Your choice is : " + BoxUi.getValue().toString());
    }
}
