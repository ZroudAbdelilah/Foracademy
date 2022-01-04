module org.youcode.foracademy.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.youcode.foracademy to javafx.fxml;
    exports org.youcode.foracademy;
}