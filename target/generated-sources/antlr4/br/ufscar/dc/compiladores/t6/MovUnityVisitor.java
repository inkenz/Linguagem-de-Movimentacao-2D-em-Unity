// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t6;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MovUnityParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MovUnityVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MovUnityParser#gameobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGameobject(MovUnityParser.GameobjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MovUnityParser#def_atributos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_atributos(MovUnityParser.Def_atributosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MovUnityParser#controles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControles(MovUnityParser.ControlesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MovUnityParser#teclado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTeclado(MovUnityParser.TecladoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MovUnityParser#attr_teclado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_teclado(MovUnityParser.Attr_tecladoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MovUnityParser#mouse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMouse(MovUnityParser.MouseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MovUnityParser#attr_mouse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_mouse(MovUnityParser.Attr_mouseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MovUnityParser#templates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplates(MovUnityParser.TemplatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MovUnityParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(MovUnityParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MovUnityParser#modos_teclado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModos_teclado(MovUnityParser.Modos_tecladoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MovUnityParser#modos_mouse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModos_mouse(MovUnityParser.Modos_mouseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MovUnityParser#botoes_mouse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBotoes_mouse(MovUnityParser.Botoes_mouseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MovUnityParser#botoes_teclado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBotoes_teclado(MovUnityParser.Botoes_tecladoContext ctx);
}