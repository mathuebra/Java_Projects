module com.example.campominado {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.campominado to javafx.fxml;
    exports com.example.campominado;
}