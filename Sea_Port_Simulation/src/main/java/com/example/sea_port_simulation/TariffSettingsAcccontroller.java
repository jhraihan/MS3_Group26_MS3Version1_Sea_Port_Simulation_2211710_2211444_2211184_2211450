package com.example.sea_port_simulation;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class TariffSettingsAcccontroller
{
    @javafx.fxml.FXML
    private Button handleGenerateChart;
    @javafx.fxml.FXML
    private TextField txtTaxRules;
    @javafx.fxml.FXML
    private TextField txtServiceCharge;
    @javafx.fxml.FXML
    private Label lblSaveStatus;

    @FXML private TextField txtSurcharge, txtTaxPct, txtEffective;
    @FXML private TableView<TariffSettingsAcc> tblTariffs;
    @FXML private TableColumn<TariffSettingsAcc, Number> colBase, colSurcharge, colTaxPct;
    @FXML private TableColumn<TariffSettingsAcc, String> colEff;

    @javafx.fxml.FXML
    public void initialize() {
        colBase.setCellValueFactory(new PropertyValueFactory<>("baseDockingRate"));
        colSurcharge.setCellValueFactory(new PropertyValueFactory<>("serviceSurcharge"));
        colTaxPct.setCellValueFactory(new PropertyValueFactory<>("taxPercentage"));
        colEff.setCellValueFactory(new PropertyValueFactory<>("effectiveFrom"));
    }}