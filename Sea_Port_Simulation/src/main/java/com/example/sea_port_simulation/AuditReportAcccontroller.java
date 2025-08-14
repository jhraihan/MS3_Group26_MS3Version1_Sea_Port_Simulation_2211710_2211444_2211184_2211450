package com.example.sea_port_simulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class AuditReportAcccontroller
{
    @javafx.fxml.FXML
    private Label lblAuditMessage;
    @javafx.fxml.FXML
    private TableView tvAuditLogs;

    @FXML private TextField txtPeriod;
    @FXML private TableView<AuditReportAcc> tblAudit;
    @FXML private TableColumn<AuditReportAcc, String> colAPeriod, colASummary;
    @FXML private TableColumn<AuditReportAcc, Number> colATxns, colATotal;

    @javafx.fxml.FXML
    public void initialize() {
        colAPeriod.setCellValueFactory(new PropertyValueFactory<>("period"));
        colATxns.setCellValueFactory(new PropertyValueFactory<>("transactionCount"));
        colATotal.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
        colASummary.setCellValueFactory(new PropertyValueFactory<>("summary"));
    }

    @javafx.fxml.FXML
    public void handleExportAuditPDF(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION, "Check Audit PDF().").showAndWait();
    }

    @javafx.fxml.FXML
    public void handleGenerateAudit(ActionEvent actionEvent) {
        String p = txtPeriod.getText().trim();
        if (p.isEmpty()) { new Alert(Alert.AlertType.WARNING,"Enter a period").showAndWait(); return; }
        tblAudit.getItems().add(new AuditReportAcc(p, 250, 91000.40, "Auto-generated demo report"));
        txtPeriod.clear();
    }
    }