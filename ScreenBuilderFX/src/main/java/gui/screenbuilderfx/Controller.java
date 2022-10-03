package gui.screenbuilderfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle circle;
    private double y;
    private double x;

    public void up(ActionEvent evt){
        circle.setCenterY(y-=10);
    }

    public void down(ActionEvent evt){
        circle.setCenterY(y+=10);
    }

    public void left(ActionEvent evt){
        circle.setCenterX(x-=10);
    }

    public void right(ActionEvent evt){
        circle.setCenterX(x+=10);
    }
}