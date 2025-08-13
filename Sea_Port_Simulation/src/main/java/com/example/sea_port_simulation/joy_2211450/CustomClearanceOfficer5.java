package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class CustomClearanceOfficer5 {
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer5,String>CargoIdCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer5,String>StatusCol;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer5,String>ClientNameCol;
    @javafx.fxml.FXML
    private TextField CargoIdTextField;
    @javafx.fxml.FXML
    private DatePicker DateD;
    @javafx.fxml.FXML
    private TextArea StatusTextArea;
    @javafx.fxml.FXML
    private TextField ClientNameTextField;
    @javafx.fxml.FXML
    private TableColumn <CustomClearanceOfficer5, LocalDate>DateCol;
    @javafx.fxml.FXML
    private TableView <CustomClearanceOfficer5>TableView;

    @javafx.fxml.FXML
    public void GenerateSummaryButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SavePdfButton(ActionEvent actionEvent) {
    }
}
