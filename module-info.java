module com.example.sea_port_securityofficer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sea_port_securityofficer to javafx.fxml;
    exports com.example.sea_port_securityofficer;
}