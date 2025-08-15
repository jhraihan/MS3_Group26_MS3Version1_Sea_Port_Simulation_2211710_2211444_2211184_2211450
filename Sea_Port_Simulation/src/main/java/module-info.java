module com.example.sea_port_simulation {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.sea_port_simulation to javafx.fxml;
    exports com.example.sea_port_simulation;
    exports com.example.sea_port_simulation.joy_2211450;
    opens com.example.sea_port_simulation.joy_2211450 to javafx.fxml;
    exports com.example.sea_port_simulation.Nasir_2211444;
    opens com.example.sea_port_simulation.Nasir_2211444 to javafx.fxml;
    exports com.example.sea_port_simulation.jahid_2211710;
    opens com.example.sea_port_simulation.jahid_2211710 to javafx.fxml;


}