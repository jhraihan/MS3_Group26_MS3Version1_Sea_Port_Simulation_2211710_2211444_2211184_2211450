package com.example.sea_port_simulation.Nasir_2211444;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ReportSubmissionController
{
    @javafx.fxml.FXML
    private TableColumn<SubmitReport, String> rsDateCol;
    @javafx.fxml.FXML
    private TableView<SubmitReport> rsTableView;
    @javafx.fxml.FXML
    private DatePicker rsSubmissionDateDatePicker;
    @javafx.fxml.FXML
    private TextField rsReportTextField;
    @javafx.fxml.FXML
    private TableColumn<SubmitReport, String> rsPilotIdCol;
    @javafx.fxml.FXML
    private TableColumn<SubmitReport, String> rsReportCol;
    @javafx.fxml.FXML
    private TextField rsPilotIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void rsSubmitOAButton(ActionEvent actionEvent) {
    }
}