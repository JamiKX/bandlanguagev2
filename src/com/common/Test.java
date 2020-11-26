package com.common;

import com.common.antlrfile.Visitor;
import com.common.antlrfile.*;
import com.common.node.script.Script;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Test {
    public static void main(String[] args) {
        CharStream input = CharStreams.fromString("显示 张三");
        BLLexer lexer = new BLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BLParser parser = new BLParser(tokens);
        ParseTree p = parser.script();

        Visitor visitor = new Visitor();
        Script script = (Script)visitor.visit(p);

        return;
    }
}
