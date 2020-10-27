package com.common.antlrfile;// Generated from common.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link commonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface commonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link commonParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(commonParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(commonParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(commonParser.SimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#actionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionStmt(commonParser.ActionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#doSmtStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoSmtStmt(commonParser.DoSmtStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(commonParser.VerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(commonParser.ObjContext ctx);
}