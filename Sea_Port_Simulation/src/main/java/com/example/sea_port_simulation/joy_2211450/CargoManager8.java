package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
<<<<<<< HEAD
import javafx.scene.control.*;
=======
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
>>>>>>> cff924a0e645e9d861be3e59aecc5f8f12c623b7
import javafx.scene.control.cell.PropertyValueFactory;

public class CargoManager8 {
    @javafx.fxml.FXML
<<<<<<< HEAD
    private TableColumn<CargoManager8,String> EnterRemarkCol;
    @javafx.fxml.FXML
    private TableColumn<CargoManager8,String> CargoIdCol;
    @javafx.fxml.FXML
    private TableColumn <CargoManager8,String>StatusChoiceBoxCol;
    @javafx.fxml.FXML
    private TextField CargoIdTextField;
    @javafx.fxml.FXML
    private ChoiceBox <String>StatusChoiceBox;
    @javafx.fxml.FXML
    private TextArea EnterRemarkTextArea;
    @javafx.fxml.FXML
    private TableView<CargoManager8> TableView;
=======
    private TableColumn <CargoManager8,String>EnterRemarkCol;
    @javafx.fxml.FXML
    private TableColumn <CargoManager8,String>CargoIdCol;
    @javafx.fxml.FXML
    private TableColumn<CargoManager8,String> StatusChoiceBoxCol;
    @javafx.fxml.FXML
    private TextField CargoIdTextField;
    @javafx.fxml.FXML
    private ChoiceBox StatusChoiceBox;
    @javafx.fxml.FXML
    private TextArea EnterRemarkTextArea;
    @javafx.fxml.FXML
    private TableView <CargoManager8>TableView;
>>>>>>> cff924a0e645e9d861be3e59aecc5f8f12c623b7

    @FXML
    public void initialize() {
        CargoIdCol.setCellValueFactory(new PropertyValueFactory<>("CargoId"));
        StatusChoiceBoxCol.setCellValueFactory(new PropertyValueFactory<>("Status"));
        EnterRemarkCol .setCellValueFactory(new PropertyValueFactory<>("EnterRemark"));
<<<<<<< HEAD


    }

        @javafx.fxml.FXML
    public void UpdateButton(ActionEvent actionEvent) {
            String CargoId=CargoIdTextField.getText();
            String EnterRemark=EnterRemarkTextArea.getText();
            String Status=StatusChoiceBoxCol.getText();



        }
}

=======
    }

    @javafx.fxml.FXML
    public void UpdateButton(ActionEvent actionEvent) {
    }
}
>>>>>>> cff924a0e645e9d861be3e59aecc5f8f12c623b7
