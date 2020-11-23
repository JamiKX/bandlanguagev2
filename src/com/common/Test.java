package com.common;

import com.common.antlrfile.Visitor;
import com.common.antlrfile.*;
import com.common.environment.Environment;
import com.common.node.*;
import com.common.node.script.Script;
import com.sun.deploy.util.StringUtils;
import org.abego.treelayout.internal.util.java.lang.string.StringUtil;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Test {
    public static void main(String[] args) {
        //System.out.println("ss");
        CharStream input = CharStreams.fromString("显示张三");
        BLLexer lexer = new BLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BLParser parser = new BLParser(tokens);
        ParseTree p = parser.script();

        Visitor visitor = new Visitor();
        Script script = (Script)visitor.visit(p);
        Environment environment = new Environment();
        environment.methodChoosed.add("showFromMemory");
        environment.methodChoosed.add("getItself");
        script.run("");
        System.out.println(environment.showForUser.get("result"));
        return;
    }
}
