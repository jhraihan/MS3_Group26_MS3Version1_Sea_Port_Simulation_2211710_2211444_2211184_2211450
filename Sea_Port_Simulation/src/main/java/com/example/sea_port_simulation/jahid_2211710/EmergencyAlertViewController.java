package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class EmergencyAlertViewController
{
    @javafx.fxml.FXML
    private TableColumn<EmergencyAlert,String> locationCol;
    @javafx.fxml.FXML
    private TableView<EmergencyAlert> emergencyAlertTableview;
    @javafx.fxml.FXML
    private ComboBox<String> statusCombobox;
    @javafx.fxml.FXML
    private TableColumn<EmergencyAlert,String> statusCol;
    @javafx.fxml.FXML
    private TextArea descriptiontextarea;
    @javafx.fxml.FXML
    private TextField alertIDtextfield;
    @javafx.fxml.FXML
    private ComboBox<String> alertTypecombobox;
    @javafx.fxml.FXML
    private TableColumn<EmergencyAlert,Integer> alertIDcol;
    @javafx.fxml.FXML
    private TextField locationTextfield;
    @javafx.fxml.FXML
    private TableColumn<EmergencyAlert,String> alertTypeCol;
    @javafx.fxml.FXML
    private TableColumn<EmergencyAlert,String> descriptionCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createEmergencyButtonOnAction(ActionEvent actionEvent) {
    }
}