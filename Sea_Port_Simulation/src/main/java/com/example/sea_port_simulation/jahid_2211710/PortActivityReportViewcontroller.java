package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class PortActivityReportViewcontroller
{
    @javafx.fxml.FXML
    private TableColumn reportIDcol;
    @javafx.fxml.FXML
    private TableColumn endDateCol;
    @javafx.fxml.FXML
    private TableColumn startDateCol;
    @javafx.fxml.FXML
    private TableView portActivityreportTableview;
    @javafx.fxml.FXML
    private TableColumn reportTypecol;
    @javafx.fxml.FXML
    private DatePicker startDatedatepicker;
    @javafx.fxml.FXML
    private DatePicker endDateDatepicker;
    @javafx.fxml.FXML
    private TableColumn exportFormatcol;
    @javafx.fxml.FXML
    private ComboBox reportTypecombobox;
    @javafx.fxml.FXML
    private ComboBox exportFormatCombobox;
    @javafx.fxml.FXML
    private TextField reportIDtextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateButtonOnAction(ActionEvent actionEvent) {
    }
}