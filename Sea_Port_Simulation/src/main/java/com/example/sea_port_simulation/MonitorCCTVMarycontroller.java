package com.example.sea_port_simulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class MonitorCCTVMarycontroller
{
    @javafx.fxml.FXML
    private Label lblLiveStatus;
    @javafx.fxml.FXML
    private ComboBox comboCameraSelect;

    @FXML private TableView<MonitorCCTVMary> tblCctv;
    @FXML private TableColumn<MonitorCCTVMary, String> colCamId;
    @FXML private TableColumn<MonitorCCTVMary, String> colLocation;
    @FXML private TableColumn<MonitorCCTVMary, String> colStatus;


    @javafx.fxml.FXML
    public void initialize() {
        colCamId.setCellValueFactory(new PropertyValueFactory<>("cameraId"));
        colLocation.setCellValueFactory(new PropertyValueFactory<>("location"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void btnViewLive(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION, "Check emails().").showAndWait();
    }
}