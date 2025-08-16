package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CustomClearanceOfficer2 {
    @javafx.fxml.FXML
    private DatePicker ShipingTimeDate;
    @javafx.fxml.FXML
    private TextField CargoNameTextField;
    @javafx.fxml.FXML
    private TextField cargoIdTextField;
    @javafx.fxml.FXML
    private TextField HsCodeTextField;
    @javafx.fxml.FXML
    private ComboBox <String>ShipmentTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer2,String>ShipmentTypeCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer2,String>CargoIdCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer2,String>ShipingTimeCol;
    @javafx.fxml.FXML
    private Label ConfiramitonMessegeLable;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer2,String>CargoNameCol;
    @javafx.fxml.FXML
    private TableView <CustomClearanceOfficer2>TableView;
    @javafx.fxml.FXML
    private TableColumn<CustomClearanceOfficer2,String> HsCodeCol;


    @FXML
    public void initialize() {
        CargoIdCol.setCellValueFactory(new PropertyValueFactory<>("CargoId"));
        CargoNameCol.setCellValueFactory(new PropertyValueFactory<>("CargoName"));
        ShipingTimeCol.setCellValueFactory(new PropertyValueFactory<>("ShipingTime"));
        ShipmentTypeCol.setCellValueFactory(new PropertyValueFactory<>("ShipmentType"));
        HsCodeCol.setCellValueFactory(new PropertyValueFactory<>("HsCode"));

        ShipmentTypeComboBox.getItems().addAll("AirCargo","SeaCargo","RailCargo");



    }

    @javafx.fxml.FXML
    public void uploadButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void VerifyButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ResetButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SaveButton(ActionEvent actionEvent) {
    }
}
