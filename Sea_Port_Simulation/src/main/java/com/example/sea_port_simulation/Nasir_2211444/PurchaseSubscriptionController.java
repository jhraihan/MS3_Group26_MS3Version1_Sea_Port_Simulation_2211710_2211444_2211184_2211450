package com.example.sea_port_simulation.Nasir_2211444;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class PurchaseSubscriptionController
{
    @javafx.fxml.FXML
    private TableColumn<subscription, String> subsClientIdCol;
    @javafx.fxml.FXML
    private TableView<subscription> subsTableView;
    @javafx.fxml.FXML
    private TableColumn<subscription, String> subsEndDateCol;
    @javafx.fxml.FXML
    private DatePicker subsStartDateDatePicker;
    @javafx.fxml.FXML
    private TextField subsClientIdTextBox;
    @javafx.fxml.FXML
    private ComboBox<subscription> subsPlanTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox<subscription> subsPaymentMethodComboBox;
    @javafx.fxml.FXML
    private DatePicker subsEndDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<subscription, String> subsStartDateCol;
    @javafx.fxml.FXML
    private TableColumn<subscription, String> subsPlanTypeCol;
    @javafx.fxml.FXML
    private TableColumn<subscription, String> subsPaymentMethodCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void subsConfirmPurchaseOAButton(ActionEvent actionEvent) {
    }
}