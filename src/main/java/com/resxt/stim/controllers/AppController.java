package com.resxt.stim.controllers;

import com.resxt.stim.dao.SteamAppDao;
import com.resxt.stim.models.SteamApp;
import com.resxt.stim.services.SteamAppService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AppController {

    SteamAppService service = new SteamAppService();
    @FXML
    private Label displayDataText;

    @FXML
    protected void onDisplayDataButtonClick() {
        displayDataText.setText("Data was displayed in the console");

        for (SteamApp steamApp : service.getSteamApps()) {
            System.out.println(steamApp.toString());
        }
    }
}