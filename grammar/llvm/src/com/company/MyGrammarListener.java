package com.company;

import com.company.grammar.GrammarBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import com.company.grammar.GrammarBaseListener;
import com.company.grammar.GrammarParser;
import com.company.LLVMGrammar;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;


public class MyGrammarListener extends GrammarBaseListener {
    Map<String, TYPE> declarations = new HashMap<>();

    public String getResult() {
        
    }

    @Override
    public void exitProg(GrammarParser.ProgContext ctx) {

    }

    @Override
    public void exitAssign(GrammarParser.AssignContext ctx) {
        
    }

    @Override
    public void exitPrint(GrammarParser.PrintContext ctx) {
        
    }


    @Override
    public void exitPrints(GrammarParser.PrintsContext ctx) {
        
    }

    @Override
    public void exitReadi(GrammarParser.ReadiContext ctx) {
        
    }

    @Override
    public void exitReadr(GrammarParser.ReadrContext ctx) {

    }

    @Override
    public void exitReads(GrammarParser.ReadsContext ctx) {
        super.exitReads(ctx);
    }

    @Override
    public void exitSingle0(GrammarParser.Single0Context ctx) {
        super.exitSingle0(ctx);
    }

    @Override
    public void exitAdd(GrammarParser.AddContext ctx) {

    }

    @Override
    public void exitSingle1(GrammarParser.Single1Context ctx) {
        super.exitSingle1(ctx);
    }

    @Override
    public void exitMult(GrammarParser.MultContext ctx) {

    }

    @Override
    public void exitInteger(GrammarParser.IntegerContext ctx) {
        super.exitInteger(ctx);
    }

    @Override
    public void exitReal(GrammarParser.RealContext ctx) {
        super.exitReal(ctx);
    }

    @Override
    public void exitCasti(GrammarParser.CastiContext ctx) {
        super.exitCasti(ctx);
    }

    @Override
    public void exitCastr(GrammarParser.CastrContext ctx) {
        super.exitCastr(ctx);
    }

    @Override
    public void exitExp(GrammarParser.ExpContext ctx) {
        super.exitExp(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

}
