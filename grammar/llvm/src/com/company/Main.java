package com.company;

import com.company.grammar.GrammarLexer;

import com.company.grammar.GrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    public static void main(String[] args) {
        String code = """
                a = 5
                print a
                
                b = 5 + 5
                print b
                
                c = 5.5 + 0.05
                print c
                
                d = 3.14
                print d
                
                readi e
                print e
                
                f = 2.5 * 4.5
                print f
                """;
        GrammarLexer lexer = new GrammarLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        MyGrammarListener listener = new MyGrammarListener();
        walker.walk(listener, tree);
        System.out.println(listener.getResult());
    }
}
