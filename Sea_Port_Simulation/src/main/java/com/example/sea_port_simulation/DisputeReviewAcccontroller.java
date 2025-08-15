package com.example.sea_port_simulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class DisputeReviewAcccontroller
{
    @FXML private TableColumn colDispStatus;
    @FXML private TableView tblDisputes;
    @FXML private TextField txtComments;
    @FXML private TableColumn colDispTxn;
    @FXML private TableColumn colDispComment;
    @FXML private TableColumn colDispReason;
    @FXML private Label lblDecisionStatus;
    @FXML private TableColumn colDispId;

    @FXML
    public void initialize() {
        colDispId.setCellValueFactory(new PropertyValueFactory<>("disputeId"));
        colDispTxn.setCellValueFactory(new PropertyValueFactory<>("transactionId"));
        colDispReason.setCellValueFactory(new PropertyValueFactory<>("reason"));
        colDispStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        colDispComment.setCellValueFactory(new PropertyValueFactory<>("accountantComment"));
    }

    @FXML
    public void handleReject(ActionEvent actionEvent) {
        Object sel = tblDisputes.getSelectionModel().getSelectedItem();
        if (sel == null) { new Alert(Alert.AlertType.INFORMATION,"Select a dispute").showAndWait(); return; }
    }

    @FXML
    public void handleApprove(ActionEvent actionEvent) {
        Object sel = tblDisputes.getSelectionModel().getSelectedItem();
        if (sel == null) { new Alert(Alert.AlertType.INFORMATION,"Select a dispute").showAndWait(); return; }

    }
}