package toby.calculator.display.body.pad.expressionpad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import toby.calculator.display.body.pad.CalculatorSymbol;
import toby.calculator.processing.evaluation.parser.ExpressionLexer;
import toby.calculator.processing.evaluation.parser.ExpressionParser;
import toby.calculator.processing.evaluation.parser.ExpressionParserVisitor;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class ExpressionPadEqualsButton implements Initializable
{
    private static final String SYNTAX_ERROR_DISPLAY = "Syntax Error";

    @FXML
    private Button button;
    private final ExpressionLine expressionLine;
    private final ExpressionParserVisitor expressionParserVisitor;
    private final ResultLine resultLine;

    @Autowired
    public ExpressionPadEqualsButton(final ExpressionLine expressionLine,
                                     final ExpressionParserVisitor expressionParserVisitor,
                                     final ResultLine resultLine)
    {
        this.expressionLine = expressionLine;
        this.expressionParserVisitor = expressionParserVisitor;
        this.resultLine = resultLine;
    }

    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle)
    {
        button.setText(CalculatorSymbol.EQUALS.getSymbolDisplay());
    }

    public void calculate(final ActionEvent event) throws IOException
    {
        final InputStream inputStream = new ByteArrayInputStream(expressionLine.getExpressionLine().getText().getBytes());
        final var lexer = new ExpressionLexer(CharStreams.fromStream(inputStream));
        final var tokens = new CommonTokenStream(lexer);
        final var parser = new ExpressionParser(tokens);
        final var tree = parser.prog();
        try
        {
            final var result = expressionParserVisitor.visit(tree);
            resultLine.getExpressionResult().setText(result.toPlainString());
        }
        catch (Exception e)
        {
            resultLine.getExpressionResult().setText(SYNTAX_ERROR_DISPLAY);
        }
    }
}
