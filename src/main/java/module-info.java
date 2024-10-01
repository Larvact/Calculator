module Calculator
{
    requires static lombok;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;

    opens toby.calculator.display to javafx.fxml;
    exports toby.calculator.display;
    exports toby.calculator;
}