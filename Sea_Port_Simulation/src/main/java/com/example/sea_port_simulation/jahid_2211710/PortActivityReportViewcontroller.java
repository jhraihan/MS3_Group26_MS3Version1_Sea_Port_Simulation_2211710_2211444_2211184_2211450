package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.Locale;

public class PortActivityReportViewcontroller
{
    @javafx.fxml.FXML
    private TableColumn<PortActivityReport,String> reportIDcol;
    @javafx.fxml.FXML
    private TableColumn<PortActivityReport, LocalDate> endDateCol;
    @javafx.fxml.FXML
    private TableColumn<PortActivityReport,LocalDate> startDateCol;
    @javafx.fxml.FXML
    private TableView<PortActivityReport> portActivityreportTableview;
    @javafx.fxml.FXML
    private TableColumn<PortActivityReport,String> reportTypecol;
    @javafx.fxml.FXML
    private DatePicker startDatedatepicker;
    @javafx.fxml.FXML
    private DatePicker endDateDatepicker;
    @javafx.fxml.FXML
    private TableColumn<PortActivityReport,String> exportFormatcol;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypecombobox;
    @javafx.fxml.FXML
    private ComboBox<String> exportFormatCombobox;
    @javafx.fxml.FXML
    private TextField reportIDtextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateButtonOnAction(ActionEvent actionEvent) {
    }
}