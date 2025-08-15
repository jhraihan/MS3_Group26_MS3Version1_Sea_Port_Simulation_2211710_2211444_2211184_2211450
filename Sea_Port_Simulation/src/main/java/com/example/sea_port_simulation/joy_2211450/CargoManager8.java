package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CargoManager8 {

    @javafx.fxml.FXML
    private TableColumn<CargoManager8,String> EnterRemarkCol;
    @javafx.fxml.FXML
    private TableColumn <CargoManager8,String>CargoIdCol;
    @javafx.fxml.FXML
    private TableColumn<CargoManager8,String> StatusChoiceBoxCol;
    @javafx.fxml.FXML
    private TextField CargoIdTextField;
    @javafx.fxml.FXML
    private ChoiceBox <String>StatusChoiceBox;
    @javafx.fxml.FXML
    private TextArea EnterRemarkTextArea;
    @javafx.fxml.FXML
    private TableView <CargoManager8>TableView;

    @FXML
    public void initialize() {
        CargoIdCol.setCellValueFactory(new PropertyValueFactory<>("CargoId"));
        StatusChoiceBoxCol.setCellValueFactory(new PropertyValueFactory<>("Status"));
        EnterRemarkCol .setCellValueFactory(new PropertyValueFactory<>("EnterRemark"));


    }


    @javafx.fxml.FXML
    public void UpdateButton(ActionEvent actionEvent) {
    }
}
