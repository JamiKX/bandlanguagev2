package com.common.antlrfile;

import com.common.node.*;
import com.common.node.scentence.DoSmtStmt;
import com.common.node.scentence.Scentence;
import com.common.node.script.Script;
import com.common.node.script.Stmt;
import com.common.node.script.simple.ActionStmt;
import com.common.node.script.simple.SimpleStmt;
import com.common.node.word.Word;
import com.common.node.word.object.LeaveTool;
import com.common.node.word.object.Object;
import com.common.node.word.object.PeopleName;
import com.common.node.word.object.Str;
import com.common.node.word.verb.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;

public class Visitor implements commonVisitor<Node> {
    public static HashMap<String, Word> map = new HashMap<>();
    static {
        map.put("显示",new Show());
        map.put("执行",new Execute());
        map.put("删除",new Delete());
        map.put("查找",new Search());
        map.put("helloworld",new Str());
        map.put("请假工具",new LeaveTool());
        map.put("张三",new PeopleName());
    }
    @Override
    public Node visitScript(commonParser.ScriptContext ctx) {
        List<commonParser.StmtContext> list= ctx.stmt();
        Script script = new Script();
        for (commonParser.StmtContext a : list){
            script.listStmt.add((Stmt) visit(a));
        }
        script.text = ctx.getText();
        return script;
    }

    @Override
    public Node visitStmt(commonParser.StmtContext ctx) {
        Stmt stmt = new Stmt();
        stmt.text = ctx.getText();
        stmt.simpleStmt = (SimpleStmt) visit(ctx.simpleStmt());
        return stmt;
    }

    @Override
    public Node visitVerb(commonParser.VerbContext ctx) {
        Verb verb = (Verb) map.get(ctx.getText());
        verb.text = ctx.getText();
        return verb;
    }

    @Override
    public Node visitObject(commonParser.ObjectContext ctx) {
        Object object = (Object) map.get(ctx.getText());
        object.text = ctx.getText();
        return object;
    }

    @Override
    public Node visitSimpleStmt(commonParser.SimpleStmtContext ctx) {
        SimpleStmt simpleStmt = new SimpleStmt();
        simpleStmt.text = ctx.getText();
        simpleStmt.actionStmt = (ActionStmt) visit(ctx.actionStmt());
        return simpleStmt;
    }

    @Override
    public Node visitActionStmt(commonParser.ActionStmtContext ctx) {
        ActionStmt actionStmt = new ActionStmt();
        actionStmt.text = ctx.getText();
        actionStmt.scentence = (Scentence) visit(ctx.doSmtStmt());
        return actionStmt;
    }

    @Override
    public Node visitDoSmtStmt(commonParser.DoSmtStmtContext ctx) {
        DoSmtStmt doSmtStmt = new DoSmtStmt();
        doSmtStmt.text = ctx.getText();
        doSmtStmt.object = (Object) visit(ctx.object());
        doSmtStmt.verb = (Verb) visit(ctx.verb());
        return doSmtStmt;
    }

    @Override
    public Node visit(ParseTree parseTree) {
        return parseTree.accept(this);
    }

    @Override
    public Node visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Node visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Node visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
