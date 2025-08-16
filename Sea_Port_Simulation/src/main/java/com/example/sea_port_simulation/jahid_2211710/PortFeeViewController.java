package com.example.sea_port_simulation.jahid_2211710;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class PortFeeViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> feeTypeCombobox;
    @javafx.fxml.FXML
    private DatePicker expiryDatedatepicker;
    @javafx.fxml.FXML
    private TableColumn<PortFee,String> vesselSizecol;
    @javafx.fxml.FXML
    private TableView<PortFee> portFeeManagementTableview;
    @javafx.fxml.FXML
    private TableColumn<PortFee,String> rateCatagorycol;
    @javafx.fxml.FXML
    private TextField feeIDtextfield;
    @javafx.fxml.FXML
    private ComboBox<String> currencyCombobox;
    @javafx.fxml.FXML
    private TableColumn<PortFee,String> descriptionCol;
    @javafx.fxml.FXML
    private TextArea descriptiontextArea;
    @javafx.fxml.FXML
    private TableColumn<PortFee, LocalDate> expiryDatecol;
    @javafx.fxml.FXML
    private TableColumn<PortFee,Integer> feeIDcol;
    @javafx.fxml.FXML
    private TextField baseAmounttextfield;
    @javafx.fxml.FXML
    private TableColumn<PortFee,LocalDate> effectiveDatecol;
    @javafx.fxml.FXML
    private ComboBox<String> rateCatagoryCombobox;
    @javafx.fxml.FXML
    private DatePicker effectiveDateDatepicker;
    @javafx.fxml.FXML
    private TableColumn<PortFee,String> feeTypecol;
    @javafx.fxml.FXML
    private TableColumn<PortFee,String> currencyCol;
    @javafx.fxml.FXML
    private TableColumn<PortFee,String> baseAmountCol;
    @javafx.fxml.FXML
    private ComboBox<String> vesselSizecombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addNewFeeButtonOnAction(ActionEvent actionEvent) {
    }
}