package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class AuditLogViewController
{
    @javafx.fxml.FXML
    private TableColumn<AuditLog, LocalDate> endDatecol;
    @javafx.fxml.FXML
    private TableColumn<AuditLog,String> searchcol;
    @javafx.fxml.FXML
    private ComboBox<String> actionTypecombobox;
    @javafx.fxml.FXML
    private DatePicker startdateDatepicker;
    @javafx.fxml.FXML
    private TableColumn<AuditLog,Integer> userIDcol;
    @javafx.fxml.FXML
    private TableView<AuditLog> auditLogTableview;
    @javafx.fxml.FXML
    private TableColumn<AuditLog,String> userRolecol;
    @javafx.fxml.FXML
    private ComboBox<String> entityTypecombobox;
    @javafx.fxml.FXML
    private TextField userIDtextfield;
    @javafx.fxml.FXML
    private TableColumn<AuditLog,LocalDate> startDatecol;
    @javafx.fxml.FXML
    private TextField searchTextfield;
    @javafx.fxml.FXML
    private TableColumn<AuditLog,String> entityTypecol;
    @javafx.fxml.FXML
    private TableColumn<AuditLog,String> actionTypeCol;
    @javafx.fxml.FXML
    private TextField logIDtextfield;
    @javafx.fxml.FXML
    private DatePicker endDateDatepicker;
    @javafx.fxml.FXML
    private TableColumn<AuditLog,Integer> logIDcol;
    @javafx.fxml.FXML
    private ComboBox<String> userRolecombobox;
    ArrayList<AuditLog> auditList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        endDatecol.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        searchcol.setCellValueFactory(new PropertyValueFactory<>("search"));
        userIDcol.setCellValueFactory(new PropertyValueFactory<>("userID"));
        userRolecol.setCellValueFactory(new PropertyValueFactory<>("userrole"));
        startDatecol.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        entityTypecol.setCellValueFactory(new PropertyValueFactory<>("entityType"));
        actionTypeCol.setCellValueFactory(new PropertyValueFactory<>("actionType"));
        logIDcol.setCellValueFactory(new PropertyValueFactory<>("logID"));

        userRolecombobox.getItems().addAll("All", "Port Admin", "Ship Captain", "Customs Officer", "Security");
        entityTypecombobox.getItems().addAll("All", "Info", "Warning", "Critical");
        actionTypecombobox.getItems().addAll("All", "Login", "Data Change", "Ship Movement", "Security Alert");



    }

    @javafx.fxml.FXML
    public void applyFilterButtonOnAction(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void clearFilterButtonOnAction(ActionEvent actionEvent) {
    }
}