package com.example.sea_port_simulation.Nasir_2211444;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

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
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void bookingConfirmOAButton(ActionEvent actionEvent) {
    }
}