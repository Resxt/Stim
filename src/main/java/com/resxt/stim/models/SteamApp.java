package com.resxt.stim.models;

import java.util.Date;

public class SteamApp {
    private int id;
    private String name;
    private int appId;
    private int requiredAge;
    private String descriptionLong;
    private String descriptionShort;
    private String supportedLanguages;
    private String headerImageUrl;
    private String website;
    private String pcRequirementsMinimum;
    private String pcRequirementsRecommended;
    private String legalNotice;
    private String developers;
    private String publishers;
    private String price;
    private int positiveRecommendations;
    private String releaseDate;
    private String supportUrl;
    private String supportEmail;
    private String backgroundImageUrl;
    private Date createdAt;
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAppId() {
        return appId;
    }

    public int getRequiredAge() {
        return requiredAge;
    }

    public String getDescriptionLong() {
        return descriptionLong;
    }

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public String getSupportedLanguages() {
        return supportedLanguages;
    }

    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    public String getWebsite() {
        return website;
    }

    public String getPcRequirementsMinimum() {
        return pcRequirementsMinimum;
    }

    public String getPcRequirementsRecommended() {
        return pcRequirementsRecommended;
    }

    public String getLegalNotice() {
        return legalNotice;
    }

    public String getDevelopers() {
        return developers;
    }

    public String getPublishers() {
        return publishers;
    }

    public String getPrice() {
        return price;
    }

    public int getPositiveRecommendations() {
        return positiveRecommendations;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getSupportUrl() {
        return supportUrl;
    }

    public String getSupportEmail() {
        return supportEmail;
    }

    public String getBackgroundImageUrl() {
        return backgroundImageUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return "App{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", appId=" + appId +
                ", requiredAge=" + requiredAge +
                ", descriptionLong='" + descriptionLong + '\'' +
                ", descriptionShort='" + descriptionShort + '\'' +
                ", supportedLanguages='" + supportedLanguages + '\'' +
                ", headerImageUrl='" + headerImageUrl + '\'' +
                ", website='" + website + '\'' +
                ", pcRequirementsMinimum='" + pcRequirementsMinimum + '\'' +
                ", pcRequirementsRecommended='" + pcRequirementsRecommended + '\'' +
                ", legalNotice='" + legalNotice + '\'' +
                ", developers='" + developers + '\'' +
                ", publishers='" + publishers + '\'' +
                ", price='" + price + '\'' +
                ", positiveRecommendations=" + positiveRecommendations +
                ", releaseDate='" + releaseDate + '\'' +
                ", supportUrl='" + supportUrl + '\'' +
                ", supportEmail='" + supportEmail + '\'' +
                ", backgroundImageUrl='" + backgroundImageUrl + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
