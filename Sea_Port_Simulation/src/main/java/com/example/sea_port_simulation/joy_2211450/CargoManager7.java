package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CargoManager7 {
    @javafx.fxml.FXML
    private TableColumn<CargoManager7,String> CargoIdCol;
    @javafx.fxml.FXML
    private TextField CargoIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> ValidateTimeComboBox;
    @javafx.fxml.FXML
    private TableView<CargoManager7> TableView;
    @javafx.fxml.FXML
    private TableColumn <CargoManager7,String>ValidateTimeCol;
    @javafx.fxml.FXML
    private TableColumn<CargoManager7,String> StatusCol;
    @javafx.fxml.FXML
    private TableColumn<CargoManager7,String> ExpectedTimeCol;
    @javafx.fxml.FXML
    private TextField StatusTextField;
    @javafx.fxml.FXML
    private TextField ExpectedTimeTextField;
    @javafx.fxml.FXML
    private TableColumn <CargoManager7,String>LocationCol;

    @FXML
    public void initialize() {
        CargoIdCol.setCellValueFactory(new PropertyValueFactory<>("CargoId"));
        ExpectedTimeCol.setCellValueFactory(new PropertyValueFactory<>("ExpectedTime"));
        StatusCol.setCellValueFactory(new PropertyValueFactory<>("Status"));
        LocationCol.setCellValueFactory(new PropertyValueFactory<>("Location"));
        ValidateTimeCol.setCellValueFactory(new PropertyValueFactory<>("ValidateTime"));


    }

    @Deprecated
    public void ScheduleButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CheckAvailabilityButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ConfirmScheduleButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void NotifyUnloadingTeamButton(ActionEvent actionEvent) {
    }
}
