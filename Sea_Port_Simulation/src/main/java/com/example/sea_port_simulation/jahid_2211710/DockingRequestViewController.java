package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import javax.print.Doc;
import java.time.LocalDate;

public class DockingRequestViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> shipSizecombobox;
    @javafx.fxml.FXML
    private TableColumn<DockingRequest,Integer> shipIDcol;
    @javafx.fxml.FXML
    private TableColumn<DockingRequest,String> shipSizecol;
    @javafx.fxml.FXML
    private TableColumn<DockingRequest,String> priorityLevelcol;
    @javafx.fxml.FXML
    private ComboBox<String> requestedDockcombobox;
    @javafx.fxml.FXML
    private TextField shipIDtextfield;
    @javafx.fxml.FXML
    private TableColumn<DockingRequest,String> requestedDockcol;
    @javafx.fxml.FXML
    private ComboBox<String> priorityLevelCombobox;
    @javafx.fxml.FXML
    private ComboBox<String> cargoTypecombobox;
    @javafx.fxml.FXML
    private TableColumn<DockingRequest,String> shipnameCol;
    @javafx.fxml.FXML
    private ComboBox<LocalDate> etaTimeCombobox;
    @javafx.fxml.FXML
    private TableColumn<DockingRequest,String> cargoTypecol;
    @javafx.fxml.FXML
    private TextField shipNametextfield;
    @javafx.fxml.FXML
    private TableColumn<DockingRequest,Integer> requestIDcol;
    @javafx.fxml.FXML
    private TableView<DockingRequest> dockingRequestTableView;
    @javafx.fxml.FXML
    private TableColumn<DockingRequest,LocalDate> ETAtimeCol;
    @javafx.fxml.FXML
    private TextField requestIDtextfield;
    @javafx.fxml.FXML
    private DatePicker ETAdateDatepicker;
    @javafx.fxml.FXML
    private TableColumn<DockingRequest,String> specialreqCol;
    @javafx.fxml.FXML
    private TextArea specialRequirementTextarea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitRequestButtonOnAction(ActionEvent actionEvent) {
    }
}