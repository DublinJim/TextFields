module com.example.textfields {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.textfields to javafx.fxml;
    exports com.example.textfields;
}