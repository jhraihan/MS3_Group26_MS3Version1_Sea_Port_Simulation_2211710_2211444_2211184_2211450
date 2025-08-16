package com.example.sea_port_simulation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class RevenueAnalyticsAcccontroller
{
    @FXML
    private ComboBox<String> comboMonth;
    @FXML
    private ComboBox<String> comboCategory;
    @FXML
    private Label lblRevenueSummary;
    @FXML
    private LineChart chartRevenue;

    @FXML
    private TableView<RevenueAnalyticsAcc> tblRevenue;
    @FXML private TableColumn<RevenueAnalyticsAcc, String> colRevMonth, colRevCat;
    @FXML private TableColumn<RevenueAnalyticsAcc, Number> colRevAmt;

    @FXML
    public void initialize() {
        colRevMonth.setCellValueFactory(new PropertyValueFactory<>("month"));
        colRevCat.setCellValueFactory(new PropertyValueFactory<>("category"));
        colRevAmt.setCellValueFactory(new PropertyValueFactory<>("amount"));
        ChoiceBox<String> categoryBox = null;
        categoryBox.setItems(FXCollections.observableArrayList("All","Docking","Cargo","Fuel"));
        categoryBox.setValue("All");
    }

    @FXML
    public void handleGenerateChart(ActionEvent actionEvent) {
        String m = comboMonth.getValue().trim();
        String c = comboCategory.getValue();
        ObservableList<RevenueAnalyticsAcc> out = FXCollections.observableArrayList();
    }
}