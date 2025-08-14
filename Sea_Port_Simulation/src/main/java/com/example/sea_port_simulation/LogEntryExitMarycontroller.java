package com.example.sea_port_simulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class LogEntryExitMarycontroller
{
    @javafx.fxml.FXML
    private TextField txtShipName;
    @javafx.fxml.FXML
    private TextField txtCrewId;
    @javafx.fxml.FXML
    private TextField txtGateNumber;
    @javafx.fxml.FXML
    private Label lblStatusMessage;

    @FXML private TableView<LogInEntryExitMary> logTable;
    @FXML private TableColumn<LogInEntryExitMary, String> colShipName;
    @FXML private TableColumn<LogInEntryExitMary, String> colCrewId;
    @FXML private TableColumn<LogInEntryExitMary, String> colGateNumber;

    @javafx.fxml.FXML
    public void initialize() {
        colShipName.setCellValueFactory(new PropertyValueFactory<>("shipId"));
        colCrewId.setCellValueFactory(new PropertyValueFactory<>("crewId"));
        colGateNumber.setCellValueFactory(new PropertyValueFactory<>("gateNumber"));
    }

    @javafx.fxml.FXML
    public void handleRecordEntry(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Check entry records().").showAndWait();
    }
}