package com.example.sea_port_simulation;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class RestrictedZonesMarycontroller
{
    @javafx.fxml.FXML
    private ComboBox<String> comboAccessLevel;
    @javafx.fxml.FXML
    private Label lblRestrictionStatus;
    @javafx.fxml.FXML
    private Button btnActivateRestriction;

    @FXML private TableView<RestrictedZonesMary> tblZones;
    @FXML private TableColumn<RestrictedZonesMary, String> colZoneId;
    @FXML private TableColumn<RestrictedZonesMary, String> colArea;
    @FXML private TableColumn<RestrictedZonesMary, Number> colLevel;
    @FXML private TableColumn<RestrictedZonesMary, Boolean> colActive;

    @javafx.fxml.FXML
    public void initialize() {
        colZoneId.setCellValueFactory(new PropertyValueFactory<>("zoneId"));
        colArea.setCellValueFactory(new PropertyValueFactory<>("areaName"));
        colLevel.setCellValueFactory(new PropertyValueFactory<>("requiredAccessLevel"));
        colActive.setCellValueFactory(new PropertyValueFactory<>("active"));
    }}