package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class UserAccountViewController
{
    @javafx.fxml.FXML
    private TableColumn<UserAccount,String> usernameCol;
    @javafx.fxml.FXML
    private TextField fullNametextfield;
    @javafx.fxml.FXML
    private TableColumn<UserAccount, LocalDate> lastLoginCol;
    @javafx.fxml.FXML
    private TableColumn<UserAccount,Integer> userIDcol;
    @javafx.fxml.FXML
    private TextField emailTextfield;
    @javafx.fxml.FXML
    private TextField usernametextfield;
    @javafx.fxml.FXML
    private TableColumn<UserAccount,String> passwordCol;
    @javafx.fxml.FXML
    private TableColumn<UserAccount,String> fullNamecol;
    @javafx.fxml.FXML
    private TextField userIDtextfield;
    @javafx.fxml.FXML
    private DatePicker lastLogINdatepicker;
    @javafx.fxml.FXML
    private ComboBox<String> statusCombobox;
    @javafx.fxml.FXML
    private TableColumn<UserAccount,String> statusCol;
    @javafx.fxml.FXML
    private TableView<UserAccount> userAccountManagementTableview;
    @javafx.fxml.FXML
    private TextField passwordtextfield;
    @javafx.fxml.FXML
    private ComboBox<String> selectRolecombobox;
    @javafx.fxml.FXML
    private TableColumn<UserAccount,String> emailCol;
    @javafx.fxml.FXML
    private TableColumn<UserAccount,String> roleCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createUserButtonOnAction(ActionEvent actionEvent) {
    }
}