package process;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private ImageView MainImageView;

    public void switchImage(){
        MainImageView.setImage(new Image(getClass().getResourceAsStream("/assets/img1.jpg")));
    }
}
