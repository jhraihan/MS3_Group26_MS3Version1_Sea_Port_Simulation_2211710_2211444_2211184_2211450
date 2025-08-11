package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class CargoManager2 {
    @javafx.fxml.FXML
    private TextField DepTimeTextField;
    @javafx.fxml.FXML
    private TextField CargoIdTextField;



    @javafx.fxml.FXML
    public void departureButton(ActionEvent actionEvent) {
        String cargoId = CargoIdTextField.getText();
        String departureTime = DepTimeTextField.getText();

    }

    @javafx.fxml.FXML
    public void NotifyClientButton(ActionEvent actionEvent) {
        String cargoId = CargoIdTextField.getText();
        String departureTime = DepTimeTextField.getText();
        if (cargoId.isEmpty() || departureTime.isEmpty()) {
            NotifyClientButton().setText("error");
               return;
        }
        CargoManager2Model newCargo = new CargoManager2Model(cargoId, departureTime);
        NotifyClientButton().setText("successfully!");


    }

}
