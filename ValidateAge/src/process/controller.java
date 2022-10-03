package process;


import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class controller {

    @FXML
    private TextField ageInput;
    @FXML
    private Label statusLabel;
    int age;

    public void Validate(){
        statusLabel.setAlignment(Pos.CENTER);
        statusLabel.setTextFill(Color.ORANGE);
        try{
            age = Integer.parseInt(ageInput.getText());

            if(age >= 18 && age < 50){
                statusLabel.setText("Age validate success");

            }else {
                statusLabel.setText("Age validate fail. U must be above 18");
            }

        } catch (NumberFormatException n){
            statusLabel.setText("Please Enter Valid Number");

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
