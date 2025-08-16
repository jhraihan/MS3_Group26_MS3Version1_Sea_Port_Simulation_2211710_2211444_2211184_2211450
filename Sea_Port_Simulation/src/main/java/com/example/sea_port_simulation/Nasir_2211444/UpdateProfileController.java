package com.example.sea_port_simulation.Nasir_2211444;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class UpdateProfileController
{
    @javafx.fxml.FXML
    private TableView<profile> piTableView;
    @javafx.fxml.FXML
    private TableColumn<profile, String> piAddressCol;
    @javafx.fxml.FXML
    private TextField piClientNumTextField;
    @javafx.fxml.FXML
    private TextField piEmailTextField;
    @javafx.fxml.FXML
    private TableColumn<profile, String> piClientNameCol;
    @javafx.fxml.FXML
    private TableColumn<profile, String> piEmailCol;
    @javafx.fxml.FXML
    private TextField piClientNameTextField;
    @javafx.fxml.FXML
    private TextField piAddressTextField;
    @javafx.fxml.FXML
    private TableColumn<profile, String> piClientNumCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void piUpdateOAButton(ActionEvent actionEvent) {
    }
}