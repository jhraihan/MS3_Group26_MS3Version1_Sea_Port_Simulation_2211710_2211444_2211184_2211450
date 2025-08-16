//package com.example.sea_port_simulation;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Label;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//
//public class AuditReportAcccontroller
//{
//    @javafx.fxml.FXML
//    private Label lblAuditMessage;
//    @javafx.fxml.FXML
//    private TableView tblAuditMessage;
//    @javafx.fxml.FXML
//    private TableColumn colATxns;
//    @javafx.fxml.FXML
//    private TableColumn colASummary;
//    @javafx.fxml.FXML
//    private TableColumn colATotal;
//    @javafx.fxml.FXML
//    private TableColumn colAPeriod;
//
//    @javafx.fxml.FXML
//    public void initialize() {
//        colAPeriod.setCellValueFactory(new PropertyValueFactory<>("period"));
//        colATxns.setCellValueFactory(new PropertyValueFactory<>("transactionCount"));
//        colATotal.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
//        colASummary.setCellValueFactory(new PropertyValueFactory<>("summary"));
//    }
//
//    @javafx.fxml.FXML
//    public void handleExportAuditPDF(ActionEvent actionEvent) {
//    }
//
//    @FXML
//    public TableColumn handleGenerateAudit(ActionEvent actionEvent) {
//        String p = colAPeriod.getText().trim();
//        if (p.isEmpty()) { new Alert(Alert.AlertType.WARNING,"Enter a period").showAndWait();
//            return null;
//        }
//        tblAuditMessage.getItems().add(new AuditReportAcc(p, 250, 91000.40, "Auto-generated demo report"));
//        return colAPeriod;
//    }
//}