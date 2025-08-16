package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class LogInpageViewController
{
    @javafx.fxml.FXML
    private TextField userIDtextfield;
    @javafx.fxml.FXML
    private TextField passwordtextfield;
    @javafx.fxml.FXML
    private ComboBox<String> userTypecombobox;

    @javafx.fxml.FXML
    public void initialize() {
        userTypecombobox.getItems().addAll("Port Administrator","Ship captain","client","Harbour pilot","cargo manager","custom clearance officer","security officer","accountant");

    }

    @javafx.fxml.FXML
    public void logINButtonOnAction(ActionEvent actionEvent) {
    }
}