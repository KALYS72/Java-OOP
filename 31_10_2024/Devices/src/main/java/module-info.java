module org.example.devices {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.devices to javafx.fxml;
    exports org.example.devices;
}