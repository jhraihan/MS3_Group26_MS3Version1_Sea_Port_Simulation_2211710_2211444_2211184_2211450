package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ShipViewcontroller
{
    @javafx.fxml.FXML
    private TableColumn<Ship,String> sizeCol;
    @javafx.fxml.FXML
    private ComboBox<String> cargotypecombobox;
    @javafx.fxml.FXML
    private TableColumn<Ship,String> shipIDcol;
    @javafx.fxml.FXML
    private TableColumn<Ship,String> cargoTypeCol;
    @javafx.fxml.FXML
    private ComboBox<String> sizecombobox;
    @javafx.fxml.FXML
    private TableView<Ship> shipTableView;
    @javafx.fxml.FXML
    private TableColumn<Ship,String> nameCol;
    @javafx.fxml.FXML
    private TextField shipIDtextfield;
    @javafx.fxml.FXML
    private TextField nametextfield;
    @javafx.fxml.FXML
    private ComboBox<String> shiptypecombobox;
    @javafx.fxml.FXML
    private TableColumn<Ship,String> assigneDocCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addshipButtonOnAction(ActionEvent actionEvent) {
    }
}