package com.mycompany.proyectopoo2g2;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {
    

    
    @FXML
    private void switchToAjustes() throws IOException {
        App.setRoot("secondary");
    }
}
