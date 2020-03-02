package at.htl.demo;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        System.out.println("primary");
        App.setRoot("secondary");
    }
}
