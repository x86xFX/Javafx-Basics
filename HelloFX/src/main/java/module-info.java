module gui.hellofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens gui.hellofx to javafx.fxml;
    exports gui.hellofx;
}