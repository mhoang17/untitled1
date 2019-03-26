package gen;// Generated from /Users/Maria/Desktop/untitled1/mogens.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mogensParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mogensVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mogensParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(mogensParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link mogensParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(mogensParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link mogensParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(mogensParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link mogensParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(mogensParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link mogensParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(mogensParser.TContext ctx);
}