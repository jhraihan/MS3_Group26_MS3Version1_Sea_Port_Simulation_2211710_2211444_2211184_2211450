package com.example.sea_port_simulation;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CargoVerificationMarycontroller
{
    @javafx.fxml.FXML
    private Label lblValidationResult;
    @javafx.fxml.FXML
    private TableView tvCargoList;

    @FXML private TableView<CargoVerificationMary> tblCargo;
    @FXML private TableColumn<CargoVerificationMary, String> colManifest;
    @FXML private TableColumn<CargoVerificationMary, String> colPersonnel;
    @FXML private TableColumn<CargoVerificationMary, String> colVehicles;
    @FXML private TableColumn<CargoVerificationMary, Boolean> colValid;

    @javafx.fxml.FXML
    public void initialize() {
        colManifest.setCellValueFactory(new PropertyValueFactory<>("manifestId"));
        colPersonnel.setCellValueFactory(new PropertyValueFactory<>("personnelList"));
        colVehicles.setCellValueFactory(new PropertyValueFactory<>("vehicleList"));
        colValid.setCellValueFactory(new PropertyValueFactory<>("validationSuccess"));
    }

    @javafx.fxml.FXML
    public void handleFetchMovementLogs(ActionEvent actionEvent) {
    }

    @FXML
    public void handleValidateFields(ActionEvent actionEvent) throws InterruptedException {
        if (colManifest.getText().isBlank()) {
            new Alert(Alert.AlertType.INFORMATION, "Enter a Manifest ID to validate").showAndWait();
            return;
        }
        ObservableList<CargoVerificationMary> items = tblCargo.getItems();
        items.add(new CargoVerificationMary(colManifest.getText(),"C101,C202","V-33", true));
        colManifest.wait();
    }
    }