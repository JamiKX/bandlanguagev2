package com.common.antlrfile;

import com.common.node.Node;
import com.common.node.element.adverbial.Adverbial;
import com.common.node.element.adverbial.commonadverbial.CommonAdverbial1;
import com.common.node.element.adverbial.placeadverbial.PlaceAdverbial1;
import com.common.node.element.adverbial.timeadverbial.TimeAdverbial1;
import com.common.node.element.attribute.Attribute;
import com.common.node.element.attribute.Attribute1;
import com.common.node.element.object.Object;
import com.common.node.element.object.Object1;
import com.common.node.element.predicate.Predicate;
import com.common.node.element.predicate.Predicate1;
import com.common.node.element.subject.Subject;
import com.common.node.element.subject.Subject1;
import com.common.node.script.Script;
import com.common.node.script.Stmt;
import com.common.node.sentence.complex.*;
import com.common.node.sentence.simple.SimpleStmt1;
import com.common.node.sentence.simple.SimpleStmt2;
import com.common.node.sentence.simple.SimpleStmt3;
import com.common.node.sentence.simple.SimpleStmt4;
import com.common.node.word.real.noun.time.Today;
import com.common.node.word.real.verb.Verb;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;

public class Visitor implements BLVisitor<Node> {
    @Override
    public Node visitScript(BLParser.ScriptContext ctx) {
        Script script = new Script();
        List<Stmt> list = new LinkedList<>();
        List<BLParser.StmtContext> stmtContextList = ctx.stmt();
        for (BLParser.StmtContext context : stmtContextList){
            Stmt stmt = (Stmt) context.accept(this);
            list.add(stmt);
        }
        script.lists = list;
        return script;
    }

    @Override
    public Node visitStmt(BLParser.StmtContext ctx) {
        return ctx.children.get(0).accept(this);
    }

    @Override
    public Node visitSimpleStmt(BLParser.SimpleStmtContext ctx) {
        return ctx.children.get(0).accept(this);
    }

    @Override
    public Node visitPredicate_adverbial_attribute_object_stmt(BLParser.Predicate_adverbial_attribute_object_stmtContext ctx) {
        SimpleStmt1 simpleStmt1 = new SimpleStmt1();

        simpleStmt1.predicate = (Predicate) ctx.predicate().accept(this);
        simpleStmt1.adverbial = (Adverbial) ctx.adverbial().accept(this);
        simpleStmt1.attribute = (Attribute) ctx.attribute().accept(this);
        simpleStmt1.object = (Object) ctx.object().accept(this);

        return simpleStmt1;
    }

    @Override
    public Node visitPredicate_attribute_object_stmt(BLParser.Predicate_attribute_object_stmtContext ctx) {
        SimpleStmt2 simpleStmt2 = new SimpleStmt2();

        simpleStmt2.predicate = (Predicate) ctx.predicate().accept(this);
        simpleStmt2.attribute = (Attribute) ctx.attribute().accept(this);
        simpleStmt2.object = (Object) ctx.object().accept(this);

        return simpleStmt2;
    }

    @Override
    public Node visitSubject_predicate_object_stmt(BLParser.Subject_predicate_object_stmtContext ctx) {
        SimpleStmt3 simpleStmt3 = new SimpleStmt3();

        simpleStmt3.subject = (Subject) ctx.subject().accept(this);
        simpleStmt3.predicate = (Predicate) ctx.predicate().accept(this);
        simpleStmt3.object = (Object) ctx.object().accept(this);

        return simpleStmt3;
    }

    @Override
    public Node visitPredicate_object_stmt(BLParser.Predicate_object_stmtContext ctx) {
        SimpleStmt4 simpleStmt4 = new SimpleStmt4();

        simpleStmt4.predicate = (Predicate) ctx.predicate().accept(this);
        simpleStmt4.object = (Object) ctx.object().accept(this);

        return simpleStmt4;
    }

    @Override
    public Node visitComplexStmt(BLParser.ComplexStmtContext ctx) {
        return ctx.children.get(0).accept(this);
    }

    @Override
    public Node visitRunToolStmt(BLParser.RunToolStmtContext ctx) {
        RunToolStmt runToolStmt = new RunToolStmt();
        List<BLParser.Predicate_object_stmtContext> predicate_object_stmtContexts = ctx.predicate_object_stmt();
        runToolStmt.mainStmt = (SimpleStmt4) predicate_object_stmtContexts.get(0).accept(this);
        if(predicate_object_stmtContexts.size()>1){
            runToolStmt.saveStmt = (SimpleStmt4) predicate_object_stmtContexts.get(1).accept(this);
        }
        List<BLParser.Subject_predicate_object_stmtContext> subject_predicate_object_stmtContexts = ctx.subject_predicate_object_stmt();
        if(subject_predicate_object_stmtContexts.size()>0){
            runToolStmt.conditionList = new LinkedList<>();
            for (BLParser.Subject_predicate_object_stmtContext context: subject_predicate_object_stmtContexts){
                runToolStmt.conditionList.add((SimpleStmt3)context.accept(this));
            }
        }
        return runToolStmt;
    }

    @Override
    public Node visitSetStmt(BLParser.SetStmtContext ctx) {
        SetStmt setStmt = new SetStmt();
        setStmt.mainString = ctx.String().get(0).getText();

        if(null != ctx.stmt()){
            setStmt.value = ctx.stmt().accept(this);
            setStmt.enumType = SetValueEnum.STMT;
        }

        if(null != ctx.Number()){
            setStmt.value = ctx.Number().getText();
            setStmt.enumType = SetValueEnum.NUMBER;
        }

        if(ctx.String().size()>1){
            setStmt.value = ctx.String().get(1).getText();
            setStmt.enumType = SetValueEnum.STRING;
        }

        return setStmt;
    }

    @Override
    public Node visitSortStmt(BLParser.SortStmtContext ctx) {
        SortStmt sortStmt = new SortStmt();
        sortStmt.para = ctx.String(0).getText();
        sortStmt.objName = ctx.String(1).getText();
        sortStmt.type = ctx.sort().getText();
        return sortStmt;
    }

    @Override
    public Node visitGroupStmt(BLParser.GroupStmtContext ctx) {
        GroupStmt groupStmt = new GroupStmt();
        groupStmt.para = ctx.String(0).getText();
        groupStmt.objName = ctx.String(1).getText();
        return groupStmt;
    }

    @Override
    public Node visitSubject(BLParser.SubjectContext ctx) {
        Subject1 subject1 = new Subject1();
        subject1.string = ctx.String().getText();
        return subject1;
    }

    @Override
    public Node visitObject(BLParser.ObjectContext ctx) {
        Object1 object1 = new Object1();
        int num = ctx.getChildCount();
        for(int i=0;i+1<num;i=i+2){
            object1.list.add(ctx.getChild(i).accept(this));
            object1.splits.add(ctx.getChild(i+1).getText());
        }
        return object1;
    }

    @Override
    public Node visitPredicate(BLParser.PredicateContext ctx) {
        Predicate1 predicate1 = new Predicate1();
        predicate1.verb = (Verb) ctx.verb().accept(this);
        return predicate1;
    }

    @Override
    public Node visitAttribute(BLParser.AttributeContext ctx) {
        Attribute1 attribute1 = new Attribute1();
        int num = ctx.getChildCount();
        for(int i=0;i+1<num;i=i+2){
            attribute1.list.add(ctx.getChild(i).accept(this));
        }
        return attribute1;
    }

    @Override
    public Node visitAdverbial(BLParser.AdverbialContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Node visitPlace_adverbial(BLParser.Place_adverbialContext ctx) {
        PlaceAdverbial1 placeAdverbial1 = new PlaceAdverbial1();
        placeAdverbial1.string = ctx.String().getText();
        return placeAdverbial1;
    }

    @Override
    public Node visitTime_adverbial(BLParser.Time_adverbialContext ctx) {
        TimeAdverbial1 timeAdverbial1 = new TimeAdverbial1();
        timeAdverbial1.time = ctx.time().accept(this);
        return timeAdverbial1;
    }

    @Override
    public Node visitCommon_adverbial(BLParser.Common_adverbialContext ctx) {
        CommonAdverbial1 commonAdverbial1 = new CommonAdverbial1();
        commonAdverbial1.string = ctx.String().getText();
        return commonAdverbial1;
    }

    @Override
    public Node visitNoun(BLParser.NounContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Node visitVerb(BLParser.VerbContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Node visitAdjective(BLParser.AdjectiveContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Node visitNumerals(BLParser.NumeralsContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Node visitQuantifiers(BLParser.QuantifiersContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Node visitTime(BLParser.TimeContext ctx) {
        return new Today();
    }

    @Override
    public Node visitCompare(BLParser.CompareContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Node visitSort(BLParser.SortContext ctx) {
        return ctx.getChild(0).accept(this);
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
        //从map中找到对应的实例
        return null;
    }

    @Override
    public Node visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
