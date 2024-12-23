module com.hong {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.hong to javafx.fxml;
    exports com.hong;
}
