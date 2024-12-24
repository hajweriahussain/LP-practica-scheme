// Generated from scheme.g4 by ANTLR 4.13.2
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
	/**
	 * Enter a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link schemeParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterSuma(schemeParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link schemeParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitSuma(schemeParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Resta}
	 * labeled alternative in {@link schemeParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterResta(schemeParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Resta}
	 * labeled alternative in {@link schemeParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitResta(schemeParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplicacio}
	 * labeled alternative in {@link schemeParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacio(schemeParser.MultiplicacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplicacio}
	 * labeled alternative in {@link schemeParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacio(schemeParser.MultiplicacioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divisio}
	 * labeled alternative in {@link schemeParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterDivisio(schemeParser.DivisioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divisio}
	 * labeled alternative in {@link schemeParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitDivisio(schemeParser.DivisioContext ctx);
}