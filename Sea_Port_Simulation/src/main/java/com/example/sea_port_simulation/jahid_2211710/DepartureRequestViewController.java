package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class DepartureRequestViewController
{
    @javafx.fxml.FXML
    private TableColumn<DepartureRequest,Integer> shipIDcol;
    @javafx.fxml.FXML
    private TableView<DepartureRequest> departureReqTableview;
    @javafx.fxml.FXML
    private TableColumn<DepartureRequest,String> deptTypeCol;
    @javafx.fxml.FXML
    private TextField shipIDtextfield;
    @javafx.fxml.FXML
    private TableColumn<DepartureRequest,String> tugboatAssisCol;
    @javafx.fxml.FXML
    private ComboBox<String> departuretypeCombobox;
    @javafx.fxml.FXML
    private TableColumn<DepartureRequest,Integer> reqIDcol;
    @javafx.fxml.FXML
    private TextField shipNametextfield;
    @javafx.fxml.FXML
    private TableColumn<DepartureRequest,String> nextDestinationCol;
    @javafx.fxml.FXML
    private ComboBox<String> tugboatAssisCombobox;
    @javafx.fxml.FXML
    private ComboBox<String> nextDestinationPortCombobox;
    @javafx.fxml.FXML
    private TableColumn<DepartureRequest,String> shipNameCol;
    @javafx.fxml.FXML
    private TextField requestIDtextfield;
    @javafx.fxml.FXML
    private ComboBox<String> customeClearanceStatuscombobox;
    @javafx.fxml.FXML
    private TableColumn<DepartureRequest,String> customeClearStatuscol;
    @javafx.fxml.FXML
    private DatePicker reqDeptdateDatepicker;
    @javafx.fxml.FXML
    private TableColumn<DepartureRequest, LocalDate> reqDeptDateCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitReqButtonOnAction(ActionEvent actionEvent) {
    }
}