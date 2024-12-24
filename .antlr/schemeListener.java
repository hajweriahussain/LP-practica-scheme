// Generated from /home/hajweriahussain/UNI/Q5/LP/PRACTICA/scheme.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link schemeParser}.
 */
public interface schemeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link schemeParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(schemeParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link schemeParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(schemeParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressio}
	 * labeled alternative in {@link schemeParser#expressionsBasiques}.
	 * @param ctx the parse tree
	 */
	void enterExpressio(schemeParser.ExpressioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressio}
	 * labeled alternative in {@link schemeParser#expressionsBasiques}.
	 * @param ctx the parse tree
	 */
	void exitExpressio(schemeParser.ExpressioContext ctx);
	/**
	 * Enter a parse tree produced by {@link schemeParser#expressioBasica}.
	 * @param ctx the parse tree
	 */
	void enterExpressioBasica(schemeParser.ExpressioBasicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link schemeParser#expressioBasica}.
	 * @param ctx the parse tree
	 */
	void exitExpressioBasica(schemeParser.ExpressioBasicaContext ctx);
}