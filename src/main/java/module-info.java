module com.resxt.stim {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires json.simple;
    requires com.fasterxml.jackson.databind;

    opens com.resxt.stim;
    exports com.resxt.stim;
    exports com.resxt.stim.models;
    opens com.resxt.stim.models;
    exports com.resxt.stim.services;
    opens com.resxt.stim.services;
    exports com.resxt.stim.dao;
    opens com.resxt.stim.dao;
    exports com.resxt.stim.controllers;
    opens com.resxt.stim.controllers;
}