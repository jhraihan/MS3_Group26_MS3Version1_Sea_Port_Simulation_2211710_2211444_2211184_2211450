package com.example.sea_port_simulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class VerifyCrewIdMarycontroller
{
    @javafx.fxml.FXML
    private TextField txtCrewBadgeId;
    @javafx.fxml.FXML
    private Label lblAccessStatus;
    @javafx.fxml.FXML
    private Label lblScanResult;

    @FXML private TableView<VerifyCrewIdMary> crewTable;
    @FXML private TableColumn<VerifyCrewIdMary, String> colCrewId;
    @FXML private TableColumn<VerifyCrewIdMary, String> colCrewName;
    @FXML private TableColumn<VerifyCrewIdMary, String> colRole;
    @FXML private TableColumn<VerifyCrewIdMary, String> colStatus;

    @javafx.fxml.FXML
    public void initialize() {
        colCrewId.setCellValueFactory(new PropertyValueFactory<>("crewId"));
        colCrewName.setCellValueFactory(new PropertyValueFactory<>("crewName"));
        colRole.setCellValueFactory(new PropertyValueFactory<>("role"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void handleScanId(ActionEvent actionEvent) {
        crewTable.setItems(VerifyCrewIdMary.getDummyScan());
    }
}