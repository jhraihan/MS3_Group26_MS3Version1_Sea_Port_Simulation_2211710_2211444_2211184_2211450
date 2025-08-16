package com.example.sea_port_simulation.Nasir_2211444;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class CheckWeatherController
{
    @javafx.fxml.FXML
    private DatePicker weatherDatePicker;
    @javafx.fxml.FXML
    private ComboBox<Weather> weatherCheckingShiftCombobox;
    @javafx.fxml.FXML
    private ComboBox<Weather> workingAreaForWeatherCombobox;
    @javafx.fxml.FXML
    private TableColumn<Weather, String> weatherDateCol;
    @javafx.fxml.FXML
    private TableColumn<Weather, String> weatherShiftCol;
    @javafx.fxml.FXML
    private TableColumn<Weather, String> weatherWorkingAreaCol;
    @javafx.fxml.FXML
    private TableView<Weather> weatherViewTableView;
    ArrayList<Weather> weatherList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        weatherDateCol.setCellValueFactory(new PropertyValueFactory<>("EnterDate"));

        workingAreaForWeatherCombobox.getItems().addAll("East", "West", "North", "South");
        weatherCheckingShiftCombobox.getItems().addAll("day", "night");
    }

        Weather weather = new Weather(
            weatherDatePicker.getValue(),
            weatherCheckingShiftCombobox.getValue(),
            workingAreaForWeatherCombobox.getValue()
    );



    @javafx.fxml.FXML
    public void weatherUpdateOAButton(ActionEvent actionEvent) {
    }
}