package com.example.sea_port_simulation.Nasir_2211444;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RequestTugboatController
{
    @javafx.fxml.FXML
    private TextField taPilotIdTextField;
    @javafx.fxml.FXML
    private DatePicker tsDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<TugboatAssistance,String> taTugboatIdCol;
    @javafx.fxml.FXML
    private TableColumn<TugboatAssistance,String> taDateCol;
    @javafx.fxml.FXML
    private TextField taTugboatIdTextField;
    @javafx.fxml.FXML
    private TableView<TugboatAssistance> taTableView;
    @javafx.fxml.FXML
    private TableColumn<TugboatAssistance,String> taPilotIdCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void tsShowOAButton(ActionEvent actionEvent) {
    }
}