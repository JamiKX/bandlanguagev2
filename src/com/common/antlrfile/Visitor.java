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
import com.common.node.word.object.Obj;
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
        return visit(ctx.simpleStmt());
    }

    @Override
    public Node visitVerb(commonParser.VerbContext ctx) {
        Verb verb = (Verb) map.get(ctx.getText());
        verb.text = ctx.getText();
        return verb;
    }

    @Override
    public Node visitObj(commonParser.ObjContext ctx) {
        Obj obj = (Obj) map.get(ctx.getText());
        obj.text = ctx.getText();
        return obj;
    }

    @Override
    public Node visitSimpleStmt(commonParser.SimpleStmtContext ctx) {
        return  visit(ctx.actionStmt());
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
        doSmtStmt.obj = (Obj) visit(ctx.obj());
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
