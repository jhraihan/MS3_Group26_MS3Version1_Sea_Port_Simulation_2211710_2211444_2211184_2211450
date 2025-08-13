package com.example.sea_port_simulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class AuditLogsMarycontroller
{
    @javafx.fxml.FXML
    private DatePicker dpDateTo;
    @javafx.fxml.FXML
    private DatePicker dpDateFrom;
    @javafx.fxml.FXML
    private TableView tvTableLogs;
    @javafx.fxml.FXML
    private Label lblAuditStatus;

    @FXML private TableView<AuditLogsMary> tblAudit;
    @FXML private TableColumn<AuditLogsMary, String> colRange;
    @FXML private TableColumn<AuditLogsMary, Number> colEntries;
    @FXML private TableColumn<AuditLogsMary, Number> colAlerts;
    @FXML private TableColumn<AuditLogsMary, Number> colBreaches;

    @javafx.fxml.FXML
    public void initialize() {
        colRange.setCellValueFactory(new PropertyValueFactory<>("dateRange"));
        colEntries.setCellValueFactory(new PropertyValueFactory<>("entryCount"));
        colAlerts.setCellValueFactory(new PropertyValueFactory<>("alertCount"));
        colBreaches.setCellValueFactory(new PropertyValueFactory<>("zoneBreaches"));
    }

    @javafx.fxml.FXML
    public void handleExportPDF(ActionEvent actionEvent) {
        handleExportPDF().getItems().clear();
    }

    private ComboBox<Object> handleExportPDF() {
        return null;
    }

    @javafx.fxml.FXML
    public void handleGenerateLog(ActionEvent actionEvent) {
        LocalDate f = dpDateFrom.getValue(), t = dpDateTo.getValue();
        if (f == null || t == null) {
            new Alert(Alert.AlertType.WARNING, "Select from/to dates").showAndWait();
            return;
        }
        tblAudit.getItems().clear();
        tblAudit.getItems().add(new AuditLogsMary(f + " to " + t, 111, 5, 2));
    }
    }