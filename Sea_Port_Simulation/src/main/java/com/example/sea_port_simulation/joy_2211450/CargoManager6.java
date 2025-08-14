package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class CargoManager6 {
    @javafx.fxml.FXML
    private TableColumn <CargoManager6,String>CargoIdCol;
    @javafx.fxml.FXML
    private TextField ExpiredListTextField;
    @javafx.fxml.FXML
    private TextField CargoIdTextField;
    @javafx.fxml.FXML
    private DatePicker DateD;
    @javafx.fxml.FXML
    private TableColumn <CargoManager6, LocalDate>DateCol;
    @javafx.fxml.FXML
    private TableView <CargoManager6>TableView;
    @javafx.fxml.FXML
    private TableColumn <CargoManager6,String>ExpiryListCol;

    @FXML
    public void initialize() {
        CargoIdCol.setCellValueFactory(new PropertyValueFactory<>("CargoId"));
        DateCol.setCellValueFactory(new PropertyValueFactory<>("Date"));
        ExpiryListCol.setCellValueFactory(new PropertyValueFactory<>("ExpiryList"));

    }

    @javafx.fxml.FXML
    public void UpdateStatusButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ExpiryCheckButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void NotifyStakeholderButton(ActionEvent actionEvent) {
    }
}
