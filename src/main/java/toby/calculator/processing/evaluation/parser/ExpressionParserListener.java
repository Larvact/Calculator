// Generated from toby/calculator/processing/evaluation/parser/ExpressionParser.g4 by ANTLR 4.13.2
package toby.calculator.processing.evaluation.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParserParser}.
 */
public interface ExpressionParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExpressionParserParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExpressionParserParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ExpressionParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(ExpressionParserParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ExpressionParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(ExpressionParserParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ExpressionParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ExpressionParserParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ExpressionParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ExpressionParserParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExpressionParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(ExpressionParserParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExpressionParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(ExpressionParserParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExpressionParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(ExpressionParserParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExpressionParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(ExpressionParserParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExpressionParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(ExpressionParserParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExpressionParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(ExpressionParserParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExpressionParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ExpressionParserParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExpressionParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ExpressionParserParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExpressionParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(ExpressionParserParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExpressionParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(ExpressionParserParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExpressionParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ExpressionParserParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExpressionParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ExpressionParserParser.IntContext ctx);
}