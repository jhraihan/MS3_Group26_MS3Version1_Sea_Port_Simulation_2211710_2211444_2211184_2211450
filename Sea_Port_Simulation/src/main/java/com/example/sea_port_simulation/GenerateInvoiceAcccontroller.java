package com.example.sea_port_simulation;

import com.example.sea_port_simulation.Nasir_2211444.Invoice;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class GenerateInvoiceAcccontroller {
    @javafx.fxml.FXML
    private Label lblExportStatus;
    @javafx.fxml.FXML
    private ComboBox comboShipList;
    @javafx.fxml.FXML
    private Label lblCalculatedAmount;

    @FXML private TableView<GenerateInvoiceAcc> tblInvoices;
    @FXML private TableColumn<GenerateInvoiceAcc, String> colInvId;
    @FXML private TableColumn<GenerateInvoiceAcc, String> colInvShip;
    @FXML private TableColumn<GenerateInvoiceAcc, Number> colInvService;
    @FXML private TableColumn<GenerateInvoiceAcc, Number> colInvTax;
    @FXML private TableColumn<GenerateInvoiceAcc, Number> colInvTotal;

    @javafx.fxml.FXML
    public void initialize() {
        colInvId.setCellValueFactory(new PropertyValueFactory<>("invoiceId"));
        colInvShip.setCellValueFactory(new PropertyValueFactory<>("shipId"));
        colInvService.setCellValueFactory(new PropertyValueFactory<>("serviceCharge"));
        colInvTax.setCellValueFactory(new PropertyValueFactory<>("tax"));
        colInvTotal.setCellValueFactory(new PropertyValueFactory<>("total"));
    }

    @javafx.fxml.FXML
    public void handleExportPDF(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.ERROR, "Export PDF").showAndWait();
    }

    @javafx.fxml.FXML
    public void handleCalculateInvoice(ActionEvent actionEvent) {
        try {
            String ship = colInvShip.getText();
            double service = Double.parseDouble(colInvService.getText());
            double tax = Double.parseDouble(colInvTax.getText());
            ObservableList<GenerateInvoiceAcc> items = tblInvoices.getItems();
            new Alert(Alert.AlertType.ERROR, "Service/Tax must be numeric").showAndWait();
        } finally {

        }
    }
}