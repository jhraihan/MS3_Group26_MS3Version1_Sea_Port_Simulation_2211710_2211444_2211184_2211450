package com.example.sea_port_simulation.Nasir_2211444;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AcknowledgeAssignedShipController
{
    @javafx.fxml.FXML
    private TextField captainIDTextField;
    @javafx.fxml.FXML
    private TableColumn<AcknowledgeShip, String> acknowledgeMessageCol;
    @javafx.fxml.FXML
    private TableColumn<AcknowledgeShip, String> shipNumberCol;
    @javafx.fxml.FXML
    private TextField typeAcknowledgeMessageTextField;
    @javafx.fxml.FXML
    private TextField shipNumberTextField;
    @javafx.fxml.FXML
    private TableColumn<AcknowledgeShip, String> shipCaptainIdCol;
    @javafx.fxml.FXML
    private TableView<AcknowledgeShip> acknowledgeShipTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sendAcknowledgeButton(ActionEvent actionEvent) {
    }
}