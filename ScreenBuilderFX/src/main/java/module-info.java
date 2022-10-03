module gui.screenbuilderfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens gui.screenbuilderfx to javafx.fxml;
    exports gui.screenbuilderfx;
}