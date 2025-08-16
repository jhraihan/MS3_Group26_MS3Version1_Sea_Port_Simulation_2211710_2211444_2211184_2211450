package com.example.sea_port_simulation.Nasir_2211444;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SearchAssignmentController
{
    @javafx.fxml.FXML
    private TextField assignmentPilotIdTextField;
    @javafx.fxml.FXML
    private DatePicker assignmentDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<Assignment> assignmentWorkingZoneComboBox;
    @javafx.fxml.FXML
    private TableView<Assignment> assignmentTableView;
    @javafx.fxml.FXML
    private TableColumn<Assignment, String> assignmentPilotIdCol;
    @javafx.fxml.FXML
    private TableColumn<Assignment, String> assignmentWorkingZoneCol;
    @javafx.fxml.FXML
    private TableColumn<Assignment, String> assignmentDateCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void assignmentGoOAButton(ActionEvent actionEvent) {
    }
}