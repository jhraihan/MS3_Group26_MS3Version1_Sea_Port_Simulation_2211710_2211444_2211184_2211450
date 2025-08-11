package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CargoManager1 {
    @javafx.fxml.FXML
    private TextField CargoTypeTextField;
    @javafx.fxml.FXML
    private Label ConfiramationMessageLable;
    @javafx.fxml.FXML
    private TextField CargoIdTextField;
    @javafx.fxml.FXML
    private TableColumn<CargoManager1Model,String> CargoIdCol;
    @javafx.fxml.FXML
    private TableColumn<CargoManager1Model,String> CargoTypeCol;
    @javafx.fxml.FXML
    private TableView <CargoManager1Model>TableView;

    @FXML
    public void initialize() {
        CargoIdCol.setCellValueFactory(new PropertyValueFactory<>("CargoId"));
        CargoTypeCol.setCellValueFactory(new PropertyValueFactory<>("CargoType"));

    }


    @javafx.fxml.FXML
    public void SubmitButton(ActionEvent actionEvent) {
        String cargoId = CargoIdTextField.getText();
        String cargoType = CargoTypeTextField.getText();

        if (cargoId.isEmpty() || cargoType.isEmpty()) {
            ConfiramationMessageLable.setText("Fill all boxes");
            return;
        }
        CargoManager1Model newCargo = new CargoManager1Model(cargoId, cargoType);
        TableView.getItems().add(newCargo);
        ConfiramationMessageLable.setText("successfully!");

    }
}
