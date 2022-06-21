package com.resxt.stim;

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
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

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
                    System.out.println(steamApp.getAppId() + " clicked");
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
        Scene newScene = new Scene(scrollPane);
        stage.setScene(newScene);
    }

    public static void main(String[] args) {
        launch();
    }
}