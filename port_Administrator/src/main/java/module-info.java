module com.example.port_administrator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.port_administrator to javafx.fxml;
    exports com.example.port_administrator;
}