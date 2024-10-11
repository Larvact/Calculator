// Generated from toby/calculator/processing/evaluation/parser/Expression.g4 by ANTLR 4.13.2
package toby.calculator.processing.evaluation.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExpressionParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcExpr}
	 * labeled alternative in {@link ExpressionParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcExpr(ExpressionParser.CalcExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ExpressionParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ExpressionParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(ExpressionParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(ExpressionParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(ExpressionParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negate}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(ExpressionParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(ExpressionParser.NumContext ctx);
}