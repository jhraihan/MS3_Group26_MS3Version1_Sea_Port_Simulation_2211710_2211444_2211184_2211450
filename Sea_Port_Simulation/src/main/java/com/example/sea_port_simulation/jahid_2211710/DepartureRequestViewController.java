package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class DepartureRequestViewController
{
    @javafx.fxml.FXML
    private TableColumn shipIDcol;
    @javafx.fxml.FXML
    private TableView departureReqTableview;
    @javafx.fxml.FXML
    private TableColumn deptTypeCol;
    @javafx.fxml.FXML
    private TextField shipIDtextfield;
    @javafx.fxml.FXML
    private TableColumn tugboatAssisCol;
    @javafx.fxml.FXML
    private ComboBox departuretypeCombobox;
    @javafx.fxml.FXML
    private TableColumn reqIDcol;
    @javafx.fxml.FXML
    private TextField shipNametextfield;
    @javafx.fxml.FXML
    private TableColumn nextDestinationCol;
    @javafx.fxml.FXML
    private ComboBox tugboatAssisCombobox;
    @javafx.fxml.FXML
    private ComboBox nextDestinationPortCombobox;
    @javafx.fxml.FXML
    private TableColumn shipNameCol;
    @javafx.fxml.FXML
    private TextField requestIDtextfield;
    @javafx.fxml.FXML
    private ComboBox customeClearanceStatuscombobox;
    @javafx.fxml.FXML
    private TableColumn customeClearStatuscol;
    @javafx.fxml.FXML
    private DatePicker reqDeptdateDatepicker;
    @javafx.fxml.FXML
    private TableColumn reqDeptDateCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitReqButtonOnAction(ActionEvent actionEvent) {
    }
}