module Calculator
{
    requires static lombok;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;
    requires spring.aop;
    requires spring.beans;
    requires spring.context;
    requires spring.core;
    requires spring.expression;
    requires spring.jcl;

    opens toby.calculator to spring.core;
    opens toby.calculator.display.header to javafx.fxml;
    opens toby.calculator.display.body to javafx.fxml;
    opens toby.calculator.display.body.pad to javafx.fxml;
    opens toby.calculator.display.body.pad.inputlinepad to javafx.fxml;
    opens toby.calculator.display.body.pad.numberpad to javafx.fxml;
    opens toby.calculator.display.body.pad.operationpad to javafx.fxml;

    exports toby.calculator;
    exports toby.calculator.display.header;
    exports toby.calculator.display.body;
    exports toby.calculator.display.body.pad.numberpad to spring.beans;
    exports toby.calculator.display.body.pad.operationpad to spring.beans;
    exports toby.calculator.display.body.pad.inputlinepad to spring.beans;
}