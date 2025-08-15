//package com.example.sea_port_simulation.joy_2211450;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.*;
//import javafx.scene.control.cell.PropertyValueFactory;
//
//public class CargoManager3 {
//    @javafx.fxml.FXML
//    private TextField CargoIdTextField;
//    @javafx.fxml.FXML
//    private Label ConfirmationLable;
//    @javafx.fxml.FXML
//    private TableColumn<CargoManager3,String> CargoIdCol;
//    @javafx.fxml.FXML
//    private TableColumn <CargoManager3,String>AvailableSlotCol;
//    @javafx.fxml.FXML
//    private TextField AvailableSlotTextField;
//    @javafx.fxml.FXML
//    private TableView <CargoManager3>TableView;
//
//
//    @FXML
//    public void initialize() {
//        CargoIdCol.setCellValueFactory(new PropertyValueFactory<>("CargoId"));
//        AvailableSlotCol.setCellValueFactory(new PropertyValueFactory<>("AvailableSlot"));
//        }
//
//    @FXML
//    public void AssignButton(ActionEvent actionEvent) {
//        String cargoId = CargoIdTextField.getText();
//        String AvailableSlot=AvailableSlotTextField.getText();
//        if (cargoId.isEmpty() || AvailableSlot.isEmpty()) {
//            ConfirmationLable.setText("Fill all boxes");
//            return;
//        }
//        CargoManager1Model newCargo = new CargoManager1Model(cargoId,AvailableSlot );
//        TableView.getItems().add(newCargo);
//        ConfirmationLable.setText("successfully!");
//
//    }
//}
