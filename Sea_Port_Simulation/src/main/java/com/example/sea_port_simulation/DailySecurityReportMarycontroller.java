package com.example.sea_port_simulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class DailySecurityReportMarycontroller
{
    @javafx.fxml.FXML
    private Label lblReportStatus;
    @javafx.fxml.FXML
    private TextField txtIncidentSummary;

    @FXML private DatePicker dpReportDate;
    @FXML private TableView<DailySecurityReportMary> tblReports;
    @FXML private TableColumn<DailySecurityReportMary, String> colDate;
    @FXML private TableColumn<DailySecurityReportMary, Number> colIncidents;
    @FXML private TableColumn<DailySecurityReportMary, String> colSummary;
    @FXML private TableColumn<DailySecurityReportMary, Boolean> colExported;


    @javafx.fxml.FXML
    public void initialize() {
        colDate.setCellValueFactory(new PropertyValueFactory<>("reportDate"));
        colIncidents.setCellValueFactory(new PropertyValueFactory<>("incidents"));
        colSummary.setCellValueFactory(new PropertyValueFactory<>("summary"));
        colExported.setCellValueFactory(new PropertyValueFactory<>("exported"));
    }

    @javafx.fxml.FXML
    public void handleSubmitReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenerateSummary(ActionEvent actionEvent) {
        LocalDate d = dpReportDate.getValue();
        if (d == null) {
            new Alert(Alert.AlertType.WARNING, "Pick a date").showAndWait();
            return;
        }
        tblReports.getItems().add(new DailySecurityReportMary(d.toString(), 3, "All clear. Routine patrols completed.", false));
        dpReportDate.setValue(null);
    }
    }