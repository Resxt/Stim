package com.resxt.stim;

import com.resxt.stim.controllers.AppController;
import com.resxt.stim.controllers.SteamAppController;
import com.resxt.stim.models.SteamApp;
import com.resxt.stim.services.SteamAppService;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.controlsfx.control.GridCell;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("app.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        scene.getStylesheets().add(App.class.getResource("style.css").toExternalForm());
        stage.setTitle("Stim");
        stage.setScene(scene);
        stage.show();

        stage.setScene(AppController.getScene(stage));
    }

    public static void main(String[] args) {
        launch();
    }
}