module com.example.bancoimobiliariomatheusleticia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bancoimobiliariomatheusleticia to javafx.fxml;
    exports com.example.bancoimobiliariomatheusleticia;
}