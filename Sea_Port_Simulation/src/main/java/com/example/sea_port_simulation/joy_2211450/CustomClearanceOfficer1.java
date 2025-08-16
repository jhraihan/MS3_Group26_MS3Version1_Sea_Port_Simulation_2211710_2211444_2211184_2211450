package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class CustomClearanceOfficer1 {
    @javafx.fxml.FXML
    private TextArea showSucessMessegeTextArea;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField licenceNumTextField;
    @javafx.fxml.FXML
    private DatePicker DateOfRegisterD;
    @javafx.fxml.FXML
    private TextArea AddressTextArea;
    @javafx.fxml.FXML
    private TextField PhNumTextField;
    @javafx.fxml.FXML
    private TextField CountryTextField;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer1,String>CountryCol;
    @javafx.fxml.FXML
    private TableColumn<CustomClearanceOfficer1,String> AddressCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer1,String>NameCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer1,String>PhNumCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer1,LocalDate>DateOfRegCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer1,String>LicenceNumCol;
    @javafx.fxml.FXML
    private TableView<CustomClearanceOfficer1> TableView;


    @FXML
    public void initialize() {
        NameCol.setCellValueFactory(new PropertyValueFactory<>("Name"));
        LicenceNumCol.setCellValueFactory(new PropertyValueFactory<>("LicenceNum"));
        AddressCol.setCellValueFactory(new PropertyValueFactory<>("Address"));
        PhNumCol.setCellValueFactory(new PropertyValueFactory<>("PhNum"));
        DateOfRegCol.setCellValueFactory(new PropertyValueFactory<>("DateOfReg"));
        CountryCol.setCellValueFactory(new PropertyValueFactory<>("Country"));


    }

    @javafx.fxml.FXML
    public void addToRegButton(ActionEvent actionEvent) {
        String Name=nameTextField.getText();
        String LicenceNum=licenceNumTextField.getText();
        String Address=AddressTextArea.getText();
        String PhNum=PhNumTextField.getText();
        String country=CountryTextField.getText();
        LocalDate DateOfReg=DateOfRegisterD.getValue();


        if (Name.isEmpty() || LicenceNum.isEmpty()||Address.isEmpty()||PhNum.isEmpty()||country.isEmpty()) {
            showSucessMessegeTextArea.setText("Fill all boxes");
            return;
        }

        showSucessMessegeTextArea.setText("successfully!");

    }
}
