package com.example.hrpulse.Controllers.RoleControllers.Secreteriat;

import com.example.hrpulse.Services.Interfaces.Navigators;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class SecretaryController implements Navigators {

    @FXML
    private Button homePageButton;

    @FXML
    void homePageButton(ActionEvent event) throws IOException {
    navigateToLoginPage(event);
    }

}
