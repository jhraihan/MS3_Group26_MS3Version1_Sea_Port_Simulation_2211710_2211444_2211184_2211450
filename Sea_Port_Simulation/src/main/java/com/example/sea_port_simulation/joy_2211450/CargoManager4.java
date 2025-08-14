package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

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


    @FXML
    public void initialize() {
        CargoIdCol.setCellValueFactory(new PropertyValueFactory<>("CargoId"));
        DateCol.setCellValueFactory(new PropertyValueFactory<>("Date"));
        StatusCol.setCellValueFactory(new PropertyValueFactory<>("Status"));
        LocationCol.setCellValueFactory(new PropertyValueFactory<>("Location"));

    }
        @javafx.fxml.FXML
    public void FetchMovementHistoryButton(ActionEvent actionEvent) {


    }

    @javafx.fxml.FXML
    public void VerifyStatusButton(ActionEvent actionEvent) {


    }
}
