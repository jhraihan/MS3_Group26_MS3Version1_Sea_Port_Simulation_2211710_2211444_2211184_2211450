package com.example.sea_port_simulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class OverdueaccountsAcccontroller
{
    @javafx.fxml.FXML
    private Label lblReminderStatus;
    @javafx.fxml.FXML
    private TableColumn colAmountOverdue;
    @javafx.fxml.FXML
    private TableColumn colClientName;
    @javafx.fxml.FXML
    private TableView tvOverdueClients;

    @FXML private TableView<OverdueaccountsAcccontroller> tblOverdue;
    @FXML private TableColumn<OverdueaccountsAcccontroller, String> colClient, colLastInv;
    @FXML private TableColumn<OverdueaccountsAcccontroller, Number> colDays, colDue;

    @javafx.fxml.FXML
    public void initialize() {
        colClient.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        colDays.setCellValueFactory(new PropertyValueFactory<>("overdueDays"));
        colDue.setCellValueFactory(new PropertyValueFactory<>("dueAmount"));
        colLastInv.setCellValueFactory(new PropertyValueFactory<>("lastInvoiceId"));
    }

    @javafx.fxml.FXML
    public void handleSendReminders(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION, "Reminder emails triggered (demo).").showAndWait();
    }

    @javafx.fxml.FXML
    public void handleCheckOverdue(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION, "Reminder emails().").showAndWait();
    }
}