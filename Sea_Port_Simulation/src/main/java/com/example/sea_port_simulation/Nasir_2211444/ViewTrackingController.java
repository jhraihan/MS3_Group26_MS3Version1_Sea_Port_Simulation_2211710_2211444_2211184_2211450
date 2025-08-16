package com.example.sea_port_simulation.Nasir_2211444;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewTrackingController
{
    @javafx.fxml.FXML
    private TableColumn<Tracking, String> trackingStatusCol;
    @javafx.fxml.FXML
    private TableColumn<Tracking, String> trackingShipmentIdCol;
    @javafx.fxml.FXML
    private TextField trackingShipmentIdTextField;
    @javafx.fxml.FXML
    private TextField trackingIdTextField;
    @javafx.fxml.FXML
    private TableColumn<Tracking, String> trackingIdCol;
    @javafx.fxml.FXML
    private ComboBox<Tracking> trackingStatusComboBox;
    @javafx.fxml.FXML
    private TableView<Tracking> trackingTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void trackingDoneOAButton(ActionEvent actionEvent) {
    }
}