module com.example.hospitalapplication {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.hospitalapplication to javafx.fxml;
    exports com.example.hospitalapplication;

}