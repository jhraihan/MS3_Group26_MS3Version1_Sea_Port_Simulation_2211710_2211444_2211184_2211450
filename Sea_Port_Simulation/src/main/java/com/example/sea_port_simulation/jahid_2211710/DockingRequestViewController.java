package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class DockingRequestViewController
{
    @javafx.fxml.FXML
    private ComboBox shipSizecombobox;
    @javafx.fxml.FXML
    private TableColumn shipIDcol;
    @javafx.fxml.FXML
    private TableColumn shipSizecol;
    @javafx.fxml.FXML
    private TableColumn priorityLevelcol;
    @javafx.fxml.FXML
    private ComboBox requestedDockcombobox;
    @javafx.fxml.FXML
    private TextField shipIDtextfield;
    @javafx.fxml.FXML
    private TableColumn requestedDockcol;
    @javafx.fxml.FXML
    private ComboBox priorityLevelCombobox;
    @javafx.fxml.FXML
    private ComboBox cargoTypecombobox;
    @javafx.fxml.FXML
    private TableColumn shipnameCol;
    @javafx.fxml.FXML
    private ComboBox etaTimeCombobox;
    @javafx.fxml.FXML
    private TableColumn cargoTypecol;
    @javafx.fxml.FXML
    private TextField shipNametextfield;
    @javafx.fxml.FXML
    private TableColumn requestIDcol;
    @javafx.fxml.FXML
    private TableView dockingRequestTableView;
    @javafx.fxml.FXML
    private TableColumn ETAtimeCol;
    @javafx.fxml.FXML
    private TextField requestIDtextfield;
    @javafx.fxml.FXML
    private DatePicker ETAdateDatepicker;
    @javafx.fxml.FXML
    private TableColumn specialreqCol;
    @javafx.fxml.FXML
    private TextArea specialRequirementTextarea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitRequestButtonOnAction(ActionEvent actionEvent) {
    }
}