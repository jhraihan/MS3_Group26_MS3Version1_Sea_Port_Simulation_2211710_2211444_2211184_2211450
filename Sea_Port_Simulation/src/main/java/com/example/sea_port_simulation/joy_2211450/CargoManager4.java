package com.example.sea_port_simulation.joy_2211450;

import javafx.animation.Animation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class CargoManager4 {
    @javafx.fxml.FXML
    private TextField CargoIdTextField;
    @javafx.fxml.FXML
    private Label MovementLogViewTextField;
    @javafx.fxml.FXML
    private TextField LocationTextField;
    @javafx.fxml.FXML
    private TableColumn <CargoManager4,String>CargoIdCol;
    @javafx.fxml.FXML
    private TableColumn <CargoManager4,String>StatusCol;
    @javafx.fxml.FXML
    private TableColumn <CargoManager4, LocalDate>DateCol;
    @javafx.fxml.FXML
    private DatePicker DateP;
    @javafx.fxml.FXML
    private TableView <CargoManager4>TableView;
    @javafx.fxml.FXML
    private TableColumn<CargoManager4,String> LocationCol;

    private ArrayList<CargoManager4Model> userList = new ArrayList<>();

    @FXML
    public void initialize() {
        CargoIdCol.setCellValueFactory(new PropertyValueFactory<>("CargoId"));
        DateCol.setCellValueFactory(new PropertyValueFactory<>("Date"));
        StatusCol.setCellValueFactory(new PropertyValueFactory<>("Status"));
        LocationCol.setCellValueFactory(new PropertyValueFactory<>("Location"));

    }
        @javafx.fxml.FXML
    public void FetchMovementHistoryButton(ActionEvent actionEvent) {
            String CargoId=CargoIdTextField.getText();
            String Location=LocationTextField.getText();
            LocalDate Date=DateP.getValue();



        }

    @javafx.fxml.FXML
    public void VerifyStatusButton(ActionEvent actionEvent) {
        String CargoId=CargoIdTextField.getText();
        String Location=LocationTextField.getText();
        LocalDate Date=DateP.getValue();


    }
}
