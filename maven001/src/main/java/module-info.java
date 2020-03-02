module at.htl.demo {
    requires javafx.controls;
    requires javafx.fxml;

    opens at.htl.demo to javafx.fxml;
    exports at.htl.demo;
}