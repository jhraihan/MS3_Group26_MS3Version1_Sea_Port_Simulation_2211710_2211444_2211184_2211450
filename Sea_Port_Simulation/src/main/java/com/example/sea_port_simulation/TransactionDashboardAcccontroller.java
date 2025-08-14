package com.example.sea_port_simulation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class TransactionDashboardAcccontroller
{
    @FXML
    private ComboBox<String> comboClient;
    @FXML
    private Button btnFilter;
    @FXML
    private DatePicker dpDateTo;
    @FXML
    private DatePicker dpDateFrom;
    @FXML
    private ComboBox<String> comboStatus;
    @FXML
    private Label lblResultCount;
    @FXML
    private TableView tvTransactions;

    @FXML private TableView<TransactionDashboardAcc> tblTransactions;
    @FXML private TableColumn<TransactionDashboardAcc, String> colTxnId;
    @FXML private TableColumn<TransactionDashboardAcc, String> colClient;
    @FXML private TableColumn<TransactionDashboardAcc, String> colDate;
    @FXML private TableColumn<TransactionDashboardAcc, Number> colAmount;
    @FXML private TableColumn<TransactionDashboardAcc, String> colStatus;

    @FXML
    public void initialize() {
        colTxnId.setCellValueFactory(new PropertyValueFactory<>("transactionId"));
        colClient.setCellValueFactory(new PropertyValueFactory<>("client"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        btnFilter.setText(String.valueOf(FXCollections.observableArrayList("All","Paid","Pending","Overdue")));
        btnFilter.setCache(Boolean.parseBoolean("All"));
    }

    @FXML
    public <Transaction> void handleFilter(ActionEvent actionEvent) throws InterruptedException {
        String client = comboClient.getValue();
        String date = String.valueOf(dpDateFrom.getValue());
        String status = btnFilter.getId();

        ObservableList<TransactionDashboardAcc> filtered = FXCollections.observableArrayList();

        }
    }