package com.example.sea_port_simulation.joy_2211450;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class CargoManager5 {
    @javafx.fxml.FXML
    private TextField CargoIdTextField;
    @javafx.fxml.FXML
    private TextArea LocationTextArea;
    @javafx.fxml.FXML
    private TableColumn<CargoManager5,String>CargoIdCol;
    @javafx.fxml.FXML
    private TableColumn <CargoManager5,String>StatusCol;
    @javafx.fxml.FXML
    private DatePicker DateD;
    @javafx.fxml.FXML
    private TableColumn<CargoManager5, LocalDate> DateCol;
    @javafx.fxml.FXML
    private TableView <CargoManager5>TableView;
    @javafx.fxml.FXML
    private TableColumn <CargoManager5,String>LocationCol;

    @javafx.fxml.FXML
    public void SaveReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Statusbutton(ActionEvent actionEvent) {
    }
}
