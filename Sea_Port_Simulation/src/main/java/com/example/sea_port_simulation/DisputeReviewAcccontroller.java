package com.example.sea_port_simulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class DisputeReviewAcccontroller
{
    @javafx.fxml.FXML
    private TableView tvTableDisputes;
    @javafx.fxml.FXML
    private TextField txtComments;
    @javafx.fxml.FXML
    private Label lblDecisionStatus;

    @FXML private TextField txtDisputeId, txtTxnId, txtReason;
    @FXML private TextArea txtComment;

    @FXML private TableView<DisputeReviewAcc> tblDisputes;
    @FXML private TableColumn<DisputeReviewAcc, String> colDispId, colDispTxn, colDispReason, colDispStatus, colDispComment;

    @javafx.fxml.FXML
    public void initialize() {
        colDispId.setCellValueFactory(new PropertyValueFactory<>("disputeId"));
        colDispTxn.setCellValueFactory(new PropertyValueFactory<>("transactionId"));
        colDispReason.setCellValueFactory(new PropertyValueFactory<>("reason"));
        colDispStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        colDispComment.setCellValueFactory(new PropertyValueFactory<>("accountantComment"));
    }

    @javafx.fxml.FXML
    public void handleReject(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION, "Rejection alert().").showAndWait();
    }

    @javafx.fxml.FXML
    public void handleApprove(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION, "Approval emails().").showAndWait();
    }
}