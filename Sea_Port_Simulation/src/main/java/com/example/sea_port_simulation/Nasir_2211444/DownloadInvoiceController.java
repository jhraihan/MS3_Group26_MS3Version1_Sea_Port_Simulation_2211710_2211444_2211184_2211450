package com.example.sea_port_simulation.Nasir_2211444;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DownloadInvoiceController
{
    @javafx.fxml.FXML
    private TextField invoiceShipmentNoTextBox;
    @javafx.fxml.FXML
    private TableColumn<Invoice, String> invoiceClientIdCol;
    @javafx.fxml.FXML
    private TableColumn<Invoice,String> invoiceClientNameCol;
    @javafx.fxml.FXML
    private TextField invoiceOrderNumberTextField;
    @javafx.fxml.FXML
    private TextField invoiceClientIdTextBox;
    @javafx.fxml.FXML
    private TableView<Invoice> invoiceViewTableView;
    @javafx.fxml.FXML
    private TableColumn<Invoice,String> invoiceOrderNumberCol;
    @javafx.fxml.FXML
    private TextField invoiceClientNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Invoice,String> invoiceShipmentNumberCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void invoiceLoadOAButton(ActionEvent actionEvent) {
    }
}