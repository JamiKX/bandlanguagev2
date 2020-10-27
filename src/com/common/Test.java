package com.common;

import com.common.antlrfile.Visitor;
import com.common.antlrfile.commonLexer;
import com.common.antlrfile.commonParser;
import com.common.node.script.Script;
import com.sun.deploy.util.StringUtils;
import org.abego.treelayout.internal.util.java.lang.string.StringUtil;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Test {
    public static void main(String[] args) {
        System.out.println("ss");
        CharStream input = CharStreams.fromString("执行请假工具");
        commonLexer lexer = new commonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        commonParser parser = new commonParser(tokens);
        ParseTree p = parser.script();

        Visitor visitor = new Visitor();
        Script script = (Script)visitor.visit(p);

        return;
    }
}
