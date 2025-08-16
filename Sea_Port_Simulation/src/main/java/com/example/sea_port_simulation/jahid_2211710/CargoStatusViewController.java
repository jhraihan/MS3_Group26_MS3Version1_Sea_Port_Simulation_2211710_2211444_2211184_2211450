package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

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
    ArrayList<CargoStatus> statuslist = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        currDockLocCOL.setCellValueFactory(new PropertyValueFactory<>("currentDockLocation"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("statusSelection"));
        cargoTypecol.setCellValueFactory(new PropertyValueFactory<>("cargoOperationType"));
        cargoCatagoryCol.setCellValueFactory(new PropertyValueFactory<>("cargoCatagory"));
        shipnameCol.setCellValueFactory(new PropertyValueFactory<>("shipName"));
        shipIDcol.setCellValueFactory(new PropertyValueFactory<>("shipID"));

        cargoOperationTypecombobox.getItems().addAll("Loading", "Unloading", "Transfer", "Inspection", "Emergency Handling");
        statusCombobox.getItems().addAll("Not Started", "In Progress", "Paused", "Completed", "Delayed", "Cancelled");
        cargoOptcatagorycombobox.getItems().addAll("Container", "Bulk Dry", "Liquid", "Refrigerated", "Hazardous", "Oversized", "Livestock");

    }

    @javafx.fxml.FXML
    public void viewCargoButtonOnAction(ActionEvent actionEvent) {
        CargoStatus st1 = new CargoStatus(
                Integer.parseInt(shipIDtextfield.getText()),
                currentdocLocationtextfield.getText(),
                shipNametextfield.getText(),
                cargoOperationTypecombobox.getValue(),
                cargoOptcatagorycombobox.getValue(),
                statusCombobox.getValue()
        );
        statuslist.add(st1);
        cargoStatusTableview.getItems().clear();
        cargoStatusTableview.getItems().addAll(st1);
    }
}