package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
