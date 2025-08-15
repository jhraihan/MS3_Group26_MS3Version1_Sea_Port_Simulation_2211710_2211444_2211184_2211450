package com.example.sea_port_simulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ManualPaymentAcccontroller
{
    @javafx.fxml.FXML
    private TextField txtTransactionId;
    @javafx.fxml.FXML
    private TextField txtPayerDetails;
    @javafx.fxml.FXML
    private Label lblPaymentStatus;
    @javafx.fxml.FXML
    private TableColumn colMAmt;
    @javafx.fxml.FXML
    private TableView tblPaymentStatus;
    @javafx.fxml.FXML
    private TableColumn colMTxn;
    @javafx.fxml.FXML
    private TableColumn colMDate;
    @javafx.fxml.FXML
    private TableColumn colMPayer;
    @javafx.fxml.FXML
    private TableColumn colMReceipt;

    @javafx.fxml.FXML
    public void initialize() {
        colMTxn.setCellValueFactory(new PropertyValueFactory<>("transactionId"));
        colMAmt.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colMPayer.setCellValueFactory(new PropertyValueFactory<>("payerName"));
        colMReceipt.setCellValueFactory(new PropertyValueFactory<>("receiptPath"));
        colMDate.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    @javafx.fxml.FXML
    public void handleAttachReceipt(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.WARNING, "Attach Receipt").showAndWait();
    }

    @FXML
    public void handleConfirmPayment(ActionEvent actionEvent) {
        String id = colMTxn.getText();
        String payer = colMPayer.getText();
        String rec = colMReceipt.getText();
        String date = colMDate.getText();
        colMTxn.getText(); colMPayer.getText();
    new Alert(Alert.AlertType.ERROR, "Amount must be numeric").showAndWait();
    }
}