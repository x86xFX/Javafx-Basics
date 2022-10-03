package process;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ProgressBar progressStatus;
    @FXML
    private Label statusLabel;
    //The BigDecimal class gives its user complete control over rounding behavior.
    BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        progressStatus.setStyle("-fx-accent: #3af211;");
    }

    public void increaseProgress(){
        if(progress.doubleValue() < 1){
            progress = new BigDecimal(String.format("%.2f",  progress.doubleValue() + 0.1));
            System.out.println(progress);
            progressStatus.setProgress(progress.doubleValue());
            statusLabel.setText(String.valueOf(Math.round(progress.doubleValue() * 100)) + "%");
        }else {
            System.out.println("Level increased");
        }
    }
}
