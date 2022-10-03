package process;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Slider slider;
    @FXML
    private Label statusLabel;
    int DefaultVolume;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DefaultVolume = (int) slider.getValue();
        statusLabel.setText(String.valueOf(DefaultVolume));

        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                DefaultVolume = (int) slider.getValue();
                statusLabel.setText(String.valueOf(DefaultVolume));
            }
        });
    }
}
