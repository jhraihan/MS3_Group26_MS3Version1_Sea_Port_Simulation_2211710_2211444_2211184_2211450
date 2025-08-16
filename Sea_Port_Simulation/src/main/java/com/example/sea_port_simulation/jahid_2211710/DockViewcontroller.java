package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javax.print.Doc;
import javax.print.DocFlavor;

public class DockViewcontroller
{
    @javafx.fxml.FXML
    private TableColumn<Dock,String> locationCol;
    @javafx.fxml.FXML
    private TableColumn<Dock,String> sizeCol;
    @javafx.fxml.FXML
    private TableView<Dock> dockManagementTableview;
    @javafx.fxml.FXML
    private TextField maxShipSizetextfield;
    @javafx.fxml.FXML
    private TableColumn<Dock,String> specializationCol;
    @javafx.fxml.FXML
    private TextField nameTextfield;
    @javafx.fxml.FXML
    private TextField locationTextfield;
    @javafx.fxml.FXML
    private TableColumn<Dock,String> dockIDcol;
    @javafx.fxml.FXML
    private ComboBox<String> statusCombobox;
    @javafx.fxml.FXML
    private TableColumn<Dock,String> statusCol;
    @javafx.fxml.FXML
    private TextField dockIDtextfield;
    @javafx.fxml.FXML
    private TableColumn<Dock,String> maxShipsizeCol;
    @javafx.fxml.FXML
    private ComboBox<String> selectSizeCombobox;
    @javafx.fxml.FXML
    private TableColumn<Dock,String> nameCol;
    @javafx.fxml.FXML
    private ComboBox<String> specializationCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addDockButtonOnAction(ActionEvent actionEvent) {
    }
}