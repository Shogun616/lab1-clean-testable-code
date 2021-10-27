module se.iths.lab1cleantestablecode {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.iths.lab1cleantestablecode to javafx.fxml;
    exports se.iths.lab1cleantestablecode;
}