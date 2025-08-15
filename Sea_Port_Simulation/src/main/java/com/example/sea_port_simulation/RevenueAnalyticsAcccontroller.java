package com.example.sea_port_simulation;

import javafx.event.ActionEvent;
import javafx.scene.chart.LineChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class RevenueAnalyticsAcccontroller
{
    @javafx.fxml.FXML
    private ComboBox comboMonth;
    @javafx.fxml.FXML
    private ComboBox comboCategory;
    @javafx.fxml.FXML
    private Label lblRevenueSummary;
    @javafx.fxml.FXML
    private LineChart chartRevenue;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleGenerateChart(ActionEvent actionEvent) {
    }
}