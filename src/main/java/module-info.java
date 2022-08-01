module com.example.greatcircledistancee {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.greatcircledistancee to javafx.fxml;
    exports com.example.greatcircledistancee;
}