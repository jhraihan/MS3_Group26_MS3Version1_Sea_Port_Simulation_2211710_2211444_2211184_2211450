package com.example.sea_port_simulation.Nasir_2211444;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class TaskUpdateController
{
    @javafx.fxml.FXML
    private DatePicker utDatePicker;
    @javafx.fxml.FXML
    private TableColumn<UpdateTask, String> utPilotIdCol;
    @javafx.fxml.FXML
    private ComboBox<UpdateTask> utStatusComboBox;
    @javafx.fxml.FXML
    private TableColumn<UpdateTask, String> utStatusCol;
    @javafx.fxml.FXML
    private TextField utPilotIdTextField;
    @javafx.fxml.FXML
    private TableView<UpdateTask> utTableView;
    @javafx.fxml.FXML
    private TableColumn<UpdateTask, String> utShipIdCol;
    @javafx.fxml.FXML
    private TableColumn<UpdateTask, String> utDateCol;
    @javafx.fxml.FXML
    private TextField utShipIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void utUpdateOAButton(ActionEvent actionEvent) {
    }
}