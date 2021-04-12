package com.company.grammar;// Generated from Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readi}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReadi(GrammarParser.ReadiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readi}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReadi(GrammarParser.ReadiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readr}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReadr(GrammarParser.ReadrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readr}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReadr(GrammarParser.ReadrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reads}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReads(GrammarParser.ReadsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reads}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReads(GrammarParser.ReadsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(GrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(GrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prints}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrints(GrammarParser.PrintsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prints}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrints(GrammarParser.PrintsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link GrammarParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(GrammarParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link GrammarParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(GrammarParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link GrammarParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(GrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link GrammarParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(GrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link GrammarParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(GrammarParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link GrammarParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(GrammarParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link GrammarParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(GrammarParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link GrammarParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(GrammarParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link GrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterInteger(GrammarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link GrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitInteger(GrammarParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link GrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterReal(GrammarParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link GrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitReal(GrammarParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casti}
	 * labeled alternative in {@link GrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterCasti(GrammarParser.CastiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casti}
	 * labeled alternative in {@link GrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitCasti(GrammarParser.CastiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castr}
	 * labeled alternative in {@link GrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterCastr(GrammarParser.CastrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castr}
	 * labeled alternative in {@link GrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitCastr(GrammarParser.CastrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp}
	 * labeled alternative in {@link GrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExp(GrammarParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link GrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExp(GrammarParser.ExpContext ctx);
}