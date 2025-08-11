module com.example.sea_port_simulation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sea_port_simulation to javafx.fxml;
    exports com.example.sea_port_simulation;
    exports com.example.sea_port_simulation.joy_2211450;
    opens com.example.sea_port_simulation.joy_2211450 to javafx.fxml;



}