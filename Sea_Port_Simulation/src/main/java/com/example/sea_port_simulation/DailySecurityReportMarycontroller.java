//package com.example.sea_port_simulation;
//
//import javafx.beans.value.ObservableValue;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.*;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.util.Callback;
//
//import java.time.LocalDate;
//
//public class DailySecurityReportMarycontroller
//{
//    @javafx.fxml.FXML
//    private Label lblReportStatus;
//    @javafx.fxml.FXML
//    private TextField txtIncidentSummary;
//
//    @FXML private TableView<DailySecurityReportMary> tblReports;
//    @FXML private TableColumn<DailySecurityReportMary, String> colDate;
//    @FXML private TableColumn<DailySecurityReportMary, Number> colIncidents;
//    @FXML private TableColumn<DailySecurityReportMary, String> colSummary;
//    @FXML private TableColumn<DailySecurityReportMary, Boolean> colExported;
//
//
//    @javafx.fxml.FXML
//    public void initialize() {
//        colDate.setCellValueFactory(new PropertyValueFactory<>("reportDate"));
//        colIncidents.setCellValueFactory(new PropertyValueFactory<>("incidents"));
//        colSummary.setCellValueFactory(new PropertyValueFactory<>("summary"));
//        colExported.setCellValueFactory(new PropertyValueFactory<>("exported"));
//    }
//
//    @javafx.fxml.FXML
//    public void handleSubmitReport(ActionEvent actionEvent) {
//    }
//
//    @FXML
//    public void handleGenerateSummary(ActionEvent actionEvent) {
//        Callback<TableColumn.CellDataFeatures<DailySecurityReportMary, String>, ObservableValue<String>> d = colDate.getCellValueFactory();
//        new Alert(Alert.AlertType.WARNING, "Pick a date").showAndWait();
//        return;
//    }
//    }