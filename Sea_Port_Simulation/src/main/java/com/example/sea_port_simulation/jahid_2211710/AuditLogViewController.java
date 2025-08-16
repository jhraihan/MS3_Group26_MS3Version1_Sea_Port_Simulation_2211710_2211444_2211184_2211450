package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;
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

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void applyFilterButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearFilterButtonOnAction(ActionEvent actionEvent) {
    }
}