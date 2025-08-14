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

    @FXML private TextField txtTxn, txtAmount, txtPayer, txtReceipt, txtDate;
    @FXML private TableView<ManualPaymentAcc> tblManual;
    @FXML private TableColumn<ManualPaymentAcc, String> colMTxn, colMPayer, colMReceipt, colMDate;
    @FXML private TableColumn<ManualPaymentAcc, Number> colMAmt;

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
        new Alert(Alert.AlertType.INFORMATION,"Check attached receipts().").showAndWait();
    }

    @javafx.fxml.FXML
    public void handleConfirmPayment(ActionEvent actionEvent) {
        try {
            String id = txtTxn.getText();
            double amt = Double.parseDouble(txtAmount.getText());
            String payer = txtPayer.getText();
            String rec = txtReceipt.getText();
            String date = txtDate.getText();
            tblManual.getItems().add(new ManualPaymentAcc(id, amt, payer, rec, date));
            txtTxn.clear(); txtAmount.clear(); txtPayer.clear(); txtReceipt.clear(); txtDate.clear();
        } catch (NumberFormatException nfe) {
            new Alert(Alert.AlertType.ERROR, "Amount must be numeric").showAndWait();
        }
    }
}