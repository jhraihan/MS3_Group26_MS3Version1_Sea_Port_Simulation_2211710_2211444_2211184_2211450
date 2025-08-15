package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
<<<<<<< HEAD
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
=======
import javafx.scene.control.*;
>>>>>>> cff924a0e645e9d861be3e59aecc5f8f12c623b7
import javafx.scene.control.cell.PropertyValueFactory;

public class CargoManager3 {
    @javafx.fxml.FXML
<<<<<<< HEAD
    private TableColumn <CargoManager3,String>CargoIdCol;
    @javafx.fxml.FXML
=======
>>>>>>> cff924a0e645e9d861be3e59aecc5f8f12c623b7
    private TextField CargoIdTextField;
    @javafx.fxml.FXML
    private Label ConfirmationLable;
    @javafx.fxml.FXML
<<<<<<< HEAD
=======
    private TableColumn<CargoManager3,String> CargoIdCol;
    @javafx.fxml.FXML
>>>>>>> cff924a0e645e9d861be3e59aecc5f8f12c623b7
    private TableColumn <CargoManager3,String>AvailableSlotCol;
    @javafx.fxml.FXML
    private TextField AvailableSlotTextField;
    @javafx.fxml.FXML
    private TableView <CargoManager3>TableView;

<<<<<<< HEAD
=======

>>>>>>> cff924a0e645e9d861be3e59aecc5f8f12c623b7
    @FXML
    public void initialize() {
        CargoIdCol.setCellValueFactory(new PropertyValueFactory<>("CargoId"));
        AvailableSlotCol.setCellValueFactory(new PropertyValueFactory<>("AvailableSlot"));
<<<<<<< HEAD
    }
=======
        }
>>>>>>> cff924a0e645e9d861be3e59aecc5f8f12c623b7

    @FXML
    public void AssignButton(ActionEvent actionEvent) {
        String cargoId = CargoIdTextField.getText();
        String AvailableSlot=AvailableSlotTextField.getText();
        if (cargoId.isEmpty() || AvailableSlot.isEmpty()) {
            ConfirmationLable.setText("Fill all boxes");
            return;
        }
<<<<<<< HEAD


    }
}



=======
        CargoManager1Model newCargo = new CargoManager1Model(cargoId,AvailableSlot );
        TableView.getItems().add(newCargo);
        ConfirmationLable.setText("successfully!");

    }
}
>>>>>>> cff924a0e645e9d861be3e59aecc5f8f
