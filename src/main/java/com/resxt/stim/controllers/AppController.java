package com.resxt.stim.controllers;

import com.resxt.stim.App;
import com.resxt.stim.models.SteamApp;
import com.resxt.stim.services.SteamAppService;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

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

    public static Scene getScene(Stage stage)
    {
        ScrollPane scrollPane = new ScrollPane();
        GridPane gridPane = new GridPane();
        int row = 0;
        int column = 0;

        for (SteamApp steamApp : SteamAppService.getSteamApps()) {
            Image image = new Image(steamApp.getHeaderImageUrl(), true);
            ImageView imageView = new ImageView(image);
            imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("steam-app.fxml"));
                    try {
                        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
                        stage.setScene(scene);
                        SteamAppController steamAppController = fxmlLoader.getController();
                        steamAppController.init(steamApp, stage);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            gridPane.add(imageView, column, row);
            column++;
            if (column % 2 == 0 && column > 0) {
                row++;
                column = 0;
            }
        }

        scrollPane.setContent(gridPane);

        Scene scene = new Scene(scrollPane);
        scene.getStylesheets().add(App.class.getResource("style.css").toExternalForm());

        return scene;
    }
}