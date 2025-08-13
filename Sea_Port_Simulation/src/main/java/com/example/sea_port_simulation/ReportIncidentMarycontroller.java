package com.example.sea_port_simulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ReportIncidentMarycontroller
{
    @javafx.fxml.FXML
    private TextField txtIncidentDesc;
    @javafx.fxml.FXML
    private Label lblAlertStatus;
    @javafx.fxml.FXML
    private Label lblAttachmentStatus;

    @FXML private TableView<ReportIncidentMary> tblIncidents;
    @FXML private TableColumn<ReportIncidentMary, String> colIncId;
    @FXML private TableColumn<ReportIncidentMary, String> colIncTime;
    @FXML private TableColumn<ReportIncidentMary, String> colIncZone;
    @FXML private TableColumn<ReportIncidentMary, String> colIncDesc;
    @FXML private TableColumn<ReportIncidentMary, Boolean> colAlert;

    @javafx.fxml.FXML
    public void initialize() {
        colIncId.setCellValueFactory(new PropertyValueFactory<>("incidentId"));
        colIncTime.setCellValueFactory(new PropertyValueFactory<>("reportedTime"));
        colIncZone.setCellValueFactory(new PropertyValueFactory<>("zone"));
        colIncDesc.setCellValueFactory(new PropertyValueFactory<>("description"));
        colAlert.setCellValueFactory(new PropertyValueFactory<>("alertSent"));
    }

    @FXML
    public void handleAttachSnapshot(ActionEvent actionEvent) {
        if (txtIncidentDesc.getText().isBlank() || colAlert.getText().isBlank()) {
            new Alert(Alert.AlertType.WARNING, "Please fill description and zone").showAndWait();
            return;
    }

}}