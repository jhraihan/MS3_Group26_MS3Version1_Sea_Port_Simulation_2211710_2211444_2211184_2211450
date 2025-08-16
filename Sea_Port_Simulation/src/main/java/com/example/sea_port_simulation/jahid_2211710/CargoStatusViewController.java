package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CargoStatusViewController
{
    @javafx.fxml.FXML
    private TableColumn<CargoStatus,Integer> shipIDcol;
    @javafx.fxml.FXML
    private ComboBox<String> cargoOptcatagorycombobox;
    @javafx.fxml.FXML
    private TextField shipIDtextfield;
    @javafx.fxml.FXML
    private TableColumn<CargoStatus,String> shipnameCol;
    @javafx.fxml.FXML
    private TableColumn<CargoStatus,String> cargoCatagoryCol;
    @javafx.fxml.FXML
    private TableColumn<CargoStatus,String> cargoTypecol;
    @javafx.fxml.FXML
    private TextField shipNametextfield;
    @javafx.fxml.FXML
    private ComboBox<String> statusCombobox;
    @javafx.fxml.FXML
    private TableColumn<CargoStatus,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<CargoStatus,String> currDockLocCOL;
    @javafx.fxml.FXML
    private TextField currentdocLocationtextfield;
    @javafx.fxml.FXML
    private TableView<CargoStatus> cargoStatusTableview;
    @javafx.fxml.FXML
    private ComboBox<String> cargoOperationTypecombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewCargoButtonOnAction(ActionEvent actionEvent) {
    }
}