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
        System.out.print("\n");
        return LLVMGrammar.generate();
    }

    @Override
    public void exitProg(GrammarParser.ProgContext ctx) {
    }

    @Override
    public void exitAssign(GrammarParser.AssignContext ctx) {
        var id = ctx.getChild(0).getText();
        var expr = ctx.getText();

        if (ctx.getChild(2).getChildCount() > 1 || ctx.getChild(2).getChild(0).getChildCount() > 1) {
            if (expr.contains(".")) {
                if (!this.declarations.containsKey(id)) {
                    LLVMGrammar.declare_double(id);
                    this.declarations.put(id, TYPE.REAL);
                }
                LLVMGrammar.assign_last_double(id);

            } else {
                if (!this.declarations.containsKey(id)) {
                    LLVMGrammar.declare_i32(id);
                    this.declarations.put(id, TYPE.INT);
                }
                LLVMGrammar.assign_last_i32(id);
            }
        } else {
            var val = ctx.getChild(2).getText();
            if (val.contains(".")) {
                if (!this.declarations.containsKey(id)) {
                    LLVMGrammar.declare_double(id);
                    this.declarations.put(id, TYPE.REAL);
                }
                LLVMGrammar.assign_double(id, val);
            } else {
                if (!this.declarations.containsKey(id)) {
                    LLVMGrammar.declare_i32(id);
                    this.declarations.put(id, TYPE.INT);
                }
                LLVMGrammar.assign_i32(id, val);
            }
        }
    }

    @Override
    public void exitPrint(GrammarParser.PrintContext ctx) {
        var id = ctx.getChild(1).getText();
        var type = this.declarations.get(id);

        if (type == TYPE.REAL) {
            LLVMGrammar.printf_double(id);
        } else if (type == TYPE.INT) {
            LLVMGrammar.printf_i32(id);
        }
    }


    @Override
    public void exitPrints(GrammarParser.PrintsContext ctx) {
    }

    @Override
    public void exitReadi(GrammarParser.ReadiContext ctx) {
        var id = ctx.getChild(1).getText();

        if (!this.declarations.containsKey(id)) {
            LLVMGrammar.declare_i32(id);
            this.declarations.put(id, TYPE.INT);
        }
        LLVMGrammar.read_i32(id);
    }

    @Override
    public void exitReadr(GrammarParser.ReadrContext ctx) {
        var id = ctx.getChild(1).getText();

        if (!this.declarations.containsKey(id)) {
            LLVMGrammar.declare_double(id);
            this.declarations.put(id, TYPE.REAL);
        }
        LLVMGrammar.read_double(id);
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
        var expr = ctx.getText();
        var val1 = ctx.getChild(0).getText();
        var val2 = ctx.getChild(2).getText();

        if (expr.contains(".")) {
            LLVMGrammar.add_double(val1, val2);
        } else {
            LLVMGrammar.add_i32(val1, val2);
        }
    }

    @Override
    public void exitSingle1(GrammarParser.Single1Context ctx) {
        super.exitSingle1(ctx);
    }

    @Override
    public void exitMult(GrammarParser.MultContext ctx) {
        var expr = ctx.getText();
        var val1 = ctx.getChild(0).getText();
        var val2 = ctx.getChild(2).getText();

        if (expr.contains(".")) {
            LLVMGrammar.mult_double(val1, val2);
        } else {
            LLVMGrammar.mult_i32(val1, val2);
        }

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

    private enum TYPE {
        REAL, INT, STRING
    }
}
