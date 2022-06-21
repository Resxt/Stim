package com.resxt.stim.controllers;

import com.resxt.stim.models.SteamApp;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.lang.reflect.Field;

public class SteamAppController {
    @FXML private VBox root;
    @FXML private Text name;
    @FXML private ImageView headerImage;
    @FXML private Text descriptionShort;
    @FXML private Text price;
    @FXML private Text releaseDate;
    @FXML private Text positiveRecommendations;
    @FXML private Text supportedLanguages;
    @FXML private Text developers;
    @FXML private Text publishers;
    @FXML private Text pcRequirementsMinimum;
    @FXML private Text pcRequirementsRecommended;
    @FXML private Text website;
    @FXML private Text supportUrl;
    @FXML private Text supportEmail;
    //@FXML private Text legalNotice;

    private Stage stage;
    public void initData(SteamApp app, Stage stage) {
        this.stage = stage;

        BackgroundImage backgroundImage = new BackgroundImage(new Image(app.getBackgroundImageUrl(),true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);
        root.setBackground(new Background(backgroundImage));

        descriptionShort.setWrappingWidth(stage.getX() / 1.5);
        supportedLanguages.setWrappingWidth(stage.getX() / 1.5);
        pcRequirementsMinimum.setWrappingWidth(stage.getX() / 1.5);
        pcRequirementsRecommended.setWrappingWidth(stage.getX() / 1.5);
        //legalNotice.setWrappingWidth(stage.getX() / 1.5);

        Image image = new Image(app.getHeaderImageUrl(), true);
        headerImage.setImage(image);

        name.setText(app.getName());
        descriptionShort.setText(app.getDescriptionShort());
        price.setText(app.getPrice());
        releaseDate.setText("Release date: " + app.getReleaseDate());
        positiveRecommendations.setText(String.valueOf(app.getPositiveRecommendations()) + " positive recommendations");
        supportedLanguages.setText(app.getSupportedLanguages());
        developers.setText("Developers: " + app.getDevelopers());
        publishers.setText("Publishers: " + app.getPublishers());
        pcRequirementsMinimum.setText("PC minimum requirements: " + app.getPcRequirementsMinimum());
        pcRequirementsRecommended.setText("PC recommended requirements: " + app.getPcRequirementsRecommended());
        website.setText("Website: " + app.getWebsite());
        supportUrl.setText("Support: " + app.getSupportUrl());
        supportEmail.setText("Email: " + app.getSupportEmail());
        //legalNotice.setText(app.getLegalNotice());
    }

    @FXML
    protected void onBackButtonClick() {
        stage.setScene(AppController.getScene(stage));
    }
}
