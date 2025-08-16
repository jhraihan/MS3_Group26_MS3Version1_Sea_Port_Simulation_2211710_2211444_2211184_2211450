package com.example.sea_port_simulation.Nasir_2211444;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class SendFeedbackController
{
    @javafx.fxml.FXML
    private TextField feedReceiverIdTextField;
    @javafx.fxml.FXML
    private ComboBox<Feedback> feedFeedbackDateDatePicker;
    @javafx.fxml.FXML
    private TextField feedMessageTextField;
    @javafx.fxml.FXML
    private TextField feedClientIdTextField;
    @javafx.fxml.FXML
    private ComboBox<Feedback> feedFeedbackTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<Feedback, String> feedSeeMwssageTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void feedSendOAButton(ActionEvent actionEvent) {
    }
}