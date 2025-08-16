package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class CargoEfficiencyViewController
{
    @javafx.fxml.FXML
    private TableColumn<CargoEfficiency,Integer> shipIDcol;
    @javafx.fxml.FXML
    private TableColumn<CargoEfficiency,Integer> efficiencyIDcol;
    @javafx.fxml.FXML
    private TableColumn<CargoEfficiency, LocalDate> endTimecol;
    @javafx.fxml.FXML
    private DatePicker endTimeDatepicker;
    @javafx.fxml.FXML
    private TableColumn<CargoEfficiency,String> delayReasoncol;
    @javafx.fxml.FXML
    private TableView<CargoEfficiency> cargoEfficiencyTableView;
    @javafx.fxml.FXML
    private DatePicker startTimeDatepicker;
    @javafx.fxml.FXML
    private ComboBox<String> cargoTypecombobox;
    @javafx.fxml.FXML
    private TextField delayTextfield;
    @javafx.fxml.FXML
    private ComboBox<Integer> shipIDcombobox;
    @javafx.fxml.FXML
    private TableColumn<CargoEfficiency,String> cargoTypecol;
    @javafx.fxml.FXML
    private TextArea delayReasonTextarea;
    @javafx.fxml.FXML
    private TableColumn<CargoEfficiency,String> delayCol;
    @javafx.fxml.FXML
    private TextField efficiencyIDtextfield;
    @javafx.fxml.FXML
    private TableColumn<CargoEfficiency,LocalDate> startTimecol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void newRecordButtonOnAction(ActionEvent actionEvent) {
    }
}