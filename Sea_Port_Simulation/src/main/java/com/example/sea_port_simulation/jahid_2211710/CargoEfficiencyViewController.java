package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CargoEfficiencyViewController
{
    @javafx.fxml.FXML
    private TableColumn shipIDcol;
    @javafx.fxml.FXML
    private TableColumn efficiencyIDcol;
    @javafx.fxml.FXML
    private TableColumn endTimecol;
    @javafx.fxml.FXML
    private DatePicker endTimeDatepicker;
    @javafx.fxml.FXML
    private TableColumn delayReasoncol;
    @javafx.fxml.FXML
    private TableView cargoEfficiencyTableView;
    @javafx.fxml.FXML
    private DatePicker startTimeDatepicker;
    @javafx.fxml.FXML
    private ComboBox cargoTypecombobox;
    @javafx.fxml.FXML
    private TextField delayTextfield;
    @javafx.fxml.FXML
    private ComboBox shipIDcombobox;
    @javafx.fxml.FXML
    private TableColumn cargoTypecol;
    @javafx.fxml.FXML
    private TextArea delayReasonTextarea;
    @javafx.fxml.FXML
    private TableColumn delayCol;
    @javafx.fxml.FXML
    private TextField efficiencyIDtextfield;
    @javafx.fxml.FXML
    private TableColumn startTimecol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void newRecordButtonOnAction(ActionEvent actionEvent) {
    }
}