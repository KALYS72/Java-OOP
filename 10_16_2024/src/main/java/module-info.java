module com.example.demo33 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.demo33 to javafx.fxml;
    exports com.example.demo33;
}