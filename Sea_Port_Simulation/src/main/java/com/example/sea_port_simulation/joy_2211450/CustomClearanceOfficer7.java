package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CustomClearanceOfficer7 {
    @javafx.fxml.FXML
    private TextArea CustomNoteTextArea;
    @javafx.fxml.FXML
    private TextField CargoIdTextField;
    @javafx.fxml.FXML
    private TextField OfficerIdTextField;
    @javafx.fxml.FXML
    private TextField OfficerNumTextField;
    @javafx.fxml.FXML
    private ComboBox <String>RiskLevelComboBox;
    @javafx.fxml.FXML
    private TextField OfficerNameTextField;
    @javafx.fxml.FXML
    private ComboBox <String>StatusComboBox;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer7,String>CargoIdCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer7,String>StatusCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer7,String>OfficerIdCol;
    @javafx.fxml.FXML
    private TableView <CustomClearanceOfficer7>tableView;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer7,String>CustomNoteCol;
    @javafx.fxml.FXML
    private TableColumn<CustomClearanceOfficer7,String> RiskLevelCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer7,String>OfficerNumCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer7,String>OfficerNameCol;


    @FXML
    public void initialize() {
        CargoIdCol.setCellValueFactory(new PropertyValueFactory<>("CargoId"));
        OfficerIdCol.setCellValueFactory(new PropertyValueFactory<>("OfficerId"));
        OfficerNameCol.setCellValueFactory(new PropertyValueFactory<>("OfficerName"));
        OfficerNumCol.setCellValueFactory(new PropertyValueFactory<>("OfficerNum"));
        StatusCol.setCellValueFactory(new PropertyValueFactory<>("Status"));
        RiskLevelCol.setCellValueFactory(new PropertyValueFactory<>("RiskLevel"));
        CustomNoteCol.setCellValueFactory(new PropertyValueFactory<>("CustomNote"));


        RiskLevelComboBox.getItems().addAll("Low","Medium","High","Critical");
        StatusComboBox.getItems().addAll("Pending","on hold","Cleared","Rejected");




    }

    @javafx.fxml.FXML
    public void AppendRecordButton(ActionEvent actionEvent) {
        String CargoId=CargoIdTextField.getText();
        String OfficerId=OfficerIdTextField.getId();
        String OfficerName=OfficerNameTextField.getText();
        String OfficerNum=OfficerNumTextField.getText();
        String Status=StatusComboBox.getValue();
        String RiskLevel=RiskLevelComboBox.getValue();
        String CustomNote=CustomNoteTextArea.getText();


    }

    @javafx.fxml.FXML
    public void ConfirmedButton(ActionEvent actionEvent) {
    }
}
