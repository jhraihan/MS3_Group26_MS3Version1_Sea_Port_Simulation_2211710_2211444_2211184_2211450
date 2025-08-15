package com.example.sea_port_simulation;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class TariffSettingsAcccontroller
{
    @javafx.fxml.FXML
    private Button handleSaveRates;
    @javafx.fxml.FXML
    private TextField txtTaxRules;
    @javafx.fxml.FXML
    private TextField txtServiceCharge;
    @javafx.fxml.FXML
    private Label lblSaveStatus;
    @javafx.fxml.FXML
    private TextField txtBaseRate;
    @javafx.fxml.FXML
    private TableView tblTariffs;
    @javafx.fxml.FXML
    private TableColumn colSurCharge;
    @javafx.fxml.FXML
    private TableColumn colBase;
    @javafx.fxml.FXML
    private TableColumn colTaxPct;
    @javafx.fxml.FXML
    private TableColumn colEff;

    @javafx.fxml.FXML
    public void initialize() {
        colBase.setCellValueFactory(new PropertyValueFactory<>("baseDockingRate"));
        colTaxPct.setCellValueFactory(new PropertyValueFactory<>("taxPercentage"));
        colEff.setCellValueFactory(new PropertyValueFactory<>("effectiveFrom"));
    }}