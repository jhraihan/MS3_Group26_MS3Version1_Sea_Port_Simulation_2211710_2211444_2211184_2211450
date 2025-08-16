package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

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
    ArrayList<CargoEfficiency> cargoEfficiencylist = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        shipIDcol.setCellValueFactory(new PropertyValueFactory<>("shipID"));
        delayCol.setCellValueFactory(new PropertyValueFactory<>("delay"));
        cargoTypecol.setCellValueFactory(new PropertyValueFactory<>("cargoType"));
        delayReasoncol.setCellValueFactory(new PropertyValueFactory<>("delayReason"));
        endTimecol.setCellValueFactory(new PropertyValueFactory<>("endTime"));
        efficiencyIDcol.setCellValueFactory(new PropertyValueFactory<>("efficiencyID"));
        startTimecol.setCellValueFactory(new PropertyValueFactory<>("startTime"));

        cargoTypecombobox.getItems().addAll("All", "Containers", "Bulk", "Liquid", "Refrigerated", "Hazardous");
        shipIDcombobox.getItems().addAll(001,002,003);
    }

    @javafx.fxml.FXML
    public void newRecordButtonOnAction(ActionEvent actionEvent) {

    }
}