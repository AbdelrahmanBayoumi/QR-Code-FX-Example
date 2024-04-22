module com.example.qrcode {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.zxing;
    requires java.desktop;
    requires javafx.swing;


    opens com.example.qrcode to javafx.fxml;
    exports com.example.qrcode;
}