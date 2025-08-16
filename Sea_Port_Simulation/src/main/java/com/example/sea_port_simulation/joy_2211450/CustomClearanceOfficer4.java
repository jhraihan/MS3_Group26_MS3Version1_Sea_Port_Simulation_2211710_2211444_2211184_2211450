package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CustomClearanceOfficer4 {
    @javafx.fxml.FXML
    private TextArea ResonTextArea;
    @javafx.fxml.FXML
    private Label NotificationLable;
    @javafx.fxml.FXML
    private TextField CargoIdTextField;
    @javafx.fxml.FXML
    private TextField OfficerIdTextField;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer4,String>CargoIdCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer4,String>OfficerIdCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer4,String>ReasonCol;
    @javafx.fxml.FXML
    private TableView<CustomClearanceOfficer4> TableView;


    @FXML
    public void initialize() {
        CargoIdCol.setCellValueFactory(new PropertyValueFactory<>("CargoId"));
        OfficerIdCol.setCellValueFactory(new PropertyValueFactory<>("OfficerId"));
        ReasonCol.setCellValueFactory(new PropertyValueFactory<>("Reason"));

    }


    @javafx.fxml.FXML
    public void HoldButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReqDocsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReleaseButton(ActionEvent actionEvent) {
    }
}
