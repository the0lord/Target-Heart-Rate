module com.example.targetheartrate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.targetheartrate to javafx.fxml;
    exports com.example.targetheartrate;
}