package com.example.sea_port_simulation.Nasir_2211444;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SetBookingController
{
    @javafx.fxml.FXML
    private TextField bookingReceiverNumberTextField;
    @javafx.fxml.FXML
    private ComboBox<Bookings> bookingShippingCountryComboBox;
    @javafx.fxml.FXML
    private DatePicker bookingDateDatePicker;
    @javafx.fxml.FXML
    private TextField bookingClientNameTextField;
    @javafx.fxml.FXML
    private ComboBox<Bookings> bookingTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox<Bookings> bookingClientCountryComboBox;
    @javafx.fxml.FXML
    private TextField bookingWeightTextField;
    @javafx.fxml.FXML
    private TextField bookingClientIdTextField;
    @javafx.fxml.FXML
    private TableColumn<Bookings, String> bookingWeightCol;
    @javafx.fxml.FXML
    private TableColumn<Bookings, String> bookingShippingCountryCol;
    @javafx.fxml.FXML
    private TableColumn<Bookings, String> bookingClientIdCol;
    @javafx.fxml.FXML
    private TableColumn<Bookings, String> bookingBookingTypeCol;
    @javafx.fxml.FXML
    private TableColumn<Bookings, String> bookingClientNameCol;
    @javafx.fxml.FXML
    private TableColumn<Bookings, String> bookingClientCountryCol;
    @javafx.fxml.FXML
    private TableView<Bookings> bookingTableView;
    @javafx.fxml.FXML
    private TableColumn<Bookings, String> bookingReceiverNumberCol;
    @javafx.fxml.FXML
    private TableColumn<Bookings, String> bookingBookingDateCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void bookingConfirmOAButton(ActionEvent actionEvent) {
    }
}