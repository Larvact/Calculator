module Calculator
{
    requires static lombok;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;

    opens toby.calculator.display.header to javafx.fxml;
    opens toby.calculator.display.body to javafx.fxml;
    opens toby.calculator.display.body.inputlinepad to javafx.fxml;
    opens toby.calculator.display.body.numberpad to javafx.fxml;
    opens toby.calculator.display.body.operationpad to javafx.fxml;

    exports toby.calculator;
    exports toby.calculator.display.header;
    exports toby.calculator.display.body;
}