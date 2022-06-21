package com.resxt.stim.controllers;

import com.resxt.stim.models.SteamApp;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

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

    public void init(SteamApp steamApp, Stage stage) {
        initData(steamApp, stage);
        setTextColors(Color.WHITE);
        setTextAlignment(TextAlignment.CENTER);
    }
    private void initData(SteamApp app, Stage stage) {
        this.stage = stage;

        BackgroundImage backgroundImage = new BackgroundImage(new Image(app.getBackgroundImageUrl(),true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                new BackgroundSize(1.0, 1.0, true, true, false, false));
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

    // Temporary solution. Should be done in the css file
    private void setTextColors(Color color) {
        name.setFill(color);
        descriptionShort.setFill(color);
        price.setFill(color);
        releaseDate.setFill(color);
        positiveRecommendations.setFill(color);
        supportedLanguages.setFill(color);
        developers.setFill(color);
        publishers.setFill(color);
        pcRequirementsMinimum.setFill(color);
        pcRequirementsRecommended.setFill(color);
        website.setFill(color);
        supportUrl.setFill(color);
        supportEmail.setFill(color);
    }

    // Temporary solution. Should be done in the css file
    private void setTextAlignment(TextAlignment textAlignment) {
        name.setTextAlignment(textAlignment);
        descriptionShort.setTextAlignment(textAlignment);
        price.setTextAlignment(textAlignment);
        releaseDate.setTextAlignment(textAlignment);
        positiveRecommendations.setTextAlignment(textAlignment);
        supportedLanguages.setTextAlignment(textAlignment);
        developers.setTextAlignment(textAlignment);
        publishers.setTextAlignment(textAlignment);
        pcRequirementsMinimum.setTextAlignment(textAlignment);
        pcRequirementsRecommended.setTextAlignment(textAlignment);
        website.setTextAlignment(textAlignment);
        supportUrl.setTextAlignment(textAlignment);
        supportEmail.setTextAlignment(textAlignment);
    }

    @FXML
    protected void onBackButtonClick() {
        stage.setScene(AppController.getScene(stage));
    }
}
