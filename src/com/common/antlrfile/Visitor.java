package com.common.antlrfile;

import com.alibaba.fastjson.JSONObject;
import com.common.node.*;
import com.common.node.element.adverbial.Adverbial;
import com.common.node.element.adverbial.commonadverbial.CommonAdverbial1;
import com.common.node.element.adverbial.placeadverbial.PlaceAdverbial1;
import com.common.node.element.adverbial.timeadverbial.TimeAdverbial1;
import com.common.node.element.attribute.Attribute;
import com.common.node.element.attribute.Attribute1;
import com.common.node.element.attribute.Attribute2;
import com.common.node.element.object.B_Object;
import com.common.node.element.object.Object1;
import com.common.node.element.object.ObjectSingle;
import com.common.node.element.object.ObjectSplit;
import com.common.node.element.predicate.Predicate;
import com.common.node.element.predicate.Predicate1;
import com.common.node.element.subject.Subject;
import com.common.node.element.subject.Subject1;
import com.common.node.script.Script;
import com.common.node.script.Stmt;
import com.common.node.sentence.complex.*;
import com.common.node.sentence.simple.*;
import com.common.node.word.Num;
import com.common.node.word.Str;
import com.common.node.word.Word;
import com.common.node.word.real.adjective.Adjective;
import com.common.node.word.real.adjective.Old;
import com.common.node.word.real.noun.*;
import com.common.node.word.real.noun.time.Today;
import com.common.node.word.real.quantifiers.Ge;
import com.common.node.word.real.verb.*;
import com.common.node.word.real.compare.*;
import com.common.node.word.real.verb.sort.SortAscending;
import com.common.node.word.real.verb.sort.SortDescending;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Visitor implements BLVisitor<Node> {

    public Map<String, Word> wordMap = new HashMap<>();
    {
        wordMap.put("显示", new Show());
        wordMap.put("执行", new Execute());
        wordMap.put("得到", new Get());
        wordMap.put("找出", new Find());
        wordMap.put("去掉", new Remove());
        wordMap.put("求", new Qiu());
        wordMap.put("设定", new Set());
        wordMap.put("统计", new Count());
        wordMap.put("进行", new CarryOut());
        wordMap.put("升序排序", new SortAscending());
        wordMap.put("降序排序", new SortDescending());
        wordMap.put("进行分组", new Group());
        wordMap.put("输入部件", new InputPart());
        wordMap.put("输出部件", new OutputPart());
        wordMap.put("元素", new Element());
        wordMap.put("数量", new Amount());
        wordMap.put("数据", new Data());
        wordMap.put("最大值", new Max());
        wordMap.put("最小值", new Min());
        wordMap.put("平均值", new Average());
        wordMap.put("今天", new Today());
        wordMap.put("个", new Ge());
        wordMap.put("老的", new Old());
        wordMap.put("等于", new Equals());
        wordMap.put("=", new Equals());
        wordMap.put("大于", new MoreThan());
        wordMap.put(">", new MoreThan());
        wordMap.put("小于", new LessThan());
        wordMap.put("<", new LessThan());
        wordMap.put("不等于", new NoEquals());
        wordMap.put("!=", new NoEquals());
        wordMap.put("不大于", new NoMoreThan());
        wordMap.put("<=", new NoMoreThan());
        wordMap.put("不小于", new NoLessThan());
        wordMap.put(">=", new NoLessThan());
    }

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

        script.text = ctx.getText();
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
        simpleStmt1.BObject = (B_Object) ctx.object().accept(this);

        simpleStmt1.text = ctx.getText();
        return simpleStmt1;
    }

    @Override
    public Node visitPredicate_attribute_object_stmt(BLParser.Predicate_attribute_object_stmtContext ctx) {
        SimpleStmt2 simpleStmt2 = new SimpleStmt2();

        simpleStmt2.predicate = (Predicate) ctx.predicate().accept(this);
        simpleStmt2.attribute = (Attribute) ctx.attribute().accept(this);
        simpleStmt2.BObject = (B_Object) ctx.object().accept(this);

        simpleStmt2.text = ctx.getText();
        return simpleStmt2;
    }

    @Override
    public Node visitSubject_predicate_object_stmt(BLParser.Subject_predicate_object_stmtContext ctx) {
        SimpleStmt3 simpleStmt3 = new SimpleStmt3();

        simpleStmt3.subject = (Subject) ctx.subject().accept(this);
        simpleStmt3.predicate = (Predicate) ctx.predicate().accept(this);
        simpleStmt3.BObject = (B_Object) ctx.object().accept(this);

        simpleStmt3.text = ctx.getText();
        return simpleStmt3;
    }

    @Override
    public Node visitPredicate_object_stmt(BLParser.Predicate_object_stmtContext ctx) {
        SimpleStmt4 simpleStmt4 = new SimpleStmt4();

        simpleStmt4.predicate = (Predicate) ctx.predicate().accept(this);
        simpleStmt4.BObject = (B_Object) ctx.object().accept(this);

        simpleStmt4.text = ctx.getText();
        return simpleStmt4;
    }

    @Override
    public Node visitCompare_stmt(BLParser.Compare_stmtContext ctx) {
        CompareStmt compareStmt = new CompareStmt();
        compareStmt.first = (B_Object) ctx.object(0).accept(this);
        compareStmt.second = (B_Object) ctx.object(1).accept(this);
        compareStmt.compare = (Compare) ctx.compare().accept(this);
        compareStmt.text = ctx.getText();
        return compareStmt;
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
        List<BLParser.Compare_stmtContext> compare_stmtContexts = ctx.compare_stmt();
        if(compare_stmtContexts.size()>0){
            runToolStmt.conditionList = new LinkedList<>();
            for (BLParser.Compare_stmtContext context: compare_stmtContexts){
                runToolStmt.conditionList.add((CompareStmt)context.accept(this));
            }
        }
        runToolStmt.text = ctx.getText();
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
        setStmt.text = ctx.getText();
        return setStmt;
    }

    @Override
    public Node visitSortStmt(BLParser.SortStmtContext ctx) {
        SortStmt sortStmt = new SortStmt();
        sortStmt.para = ctx.String(0).getText();
        sortStmt.objName = ctx.String(1).getText();
        sortStmt.type = ctx.sort().SortAscending() == null ? 1 : -1;
        sortStmt.text = ctx.getText();
        return sortStmt;
    }

    @Override
    public Node visitGroupStmt(BLParser.GroupStmtContext ctx) {
        GroupStmt groupStmt = new GroupStmt();
        groupStmt.para = ctx.String(0).getText();
        groupStmt.objName = ctx.String(1).getText();
        groupStmt.text = ctx.getText();
        return groupStmt;
    }

    @Override
    public Node visitSubject(BLParser.SubjectContext ctx) {
        Subject1 subject1 = new Subject1();
        subject1.string = ctx.String().getText();
        subject1.text = ctx.getText();
        return subject1;
    }

    @Override
    public Node visitObject(BLParser.ObjectContext ctx) {
        Object1 object1 = new Object1();
        object1.list.add((ObjectSingle) ctx.getChild(0).accept(this));
        int num = ctx.getChildCount();
        for(int i=1;i+1<num;i=i+2){
            object1.list.add((ObjectSingle) ctx.getChild(i+1).accept(this));
            object1.splits.add((ObjectSplit) ctx.getChild(i).accept(this));
        }

        object1.text = ctx.getText();
        return object1;
    }

    @Override
    public Node visitObject_split(BLParser.Object_splitContext ctx) {
        ObjectSplit objectSplit = new ObjectSplit();
        objectSplit.split = (Word) ctx.Split().accept(this);
        objectSplit.text = ctx.getText();
        return objectSplit;
    }

    @Override
    public Node visitObject_single(BLParser.Object_singleContext ctx) {
        ObjectSingle objectSingle = new ObjectSingle();
        if(ctx.String() != null){
            objectSingle.object_string = (Str)ctx.String().accept(this);
        }
        //objectSingle.object_string = (Str)ctx.getChild(0).accept(this);
        int num = ctx.noun().size();
        for(int i=0;i<num;i++){
            objectSingle.noun_words.add((Noun) ctx.noun(i).accept(this));
        }
        objectSingle.text = ctx.getText();
        return objectSingle;
    }

    @Override
    public Node visitPredicate(BLParser.PredicateContext ctx) {
        Predicate1 predicate1 = new Predicate1();
        predicate1.verb = (Verb) ctx.verb().accept(this);
        predicate1.text = ctx.getText();
        return predicate1;
    }

    @Override
    public Node visitAttribute(BLParser.AttributeContext ctx) {
        //情况二
        if(ctx.adjective() != null){
            Attribute1 attribute1 = new Attribute1();
            attribute1.text = ctx.getText();
            attribute1.adjective = (Adjective) ctx.adjective().accept(this);
            return attribute1;
        }

        //情况一
        if(ctx.compare_stmt() != null){
            Attribute2 attribute2 = new Attribute2();
            attribute2.text = ctx.getText();
            attribute2.compareStmt = (CompareStmt) ctx.compare_stmt().accept(this);
            return attribute2;
        }

        return null;
    }

    @Override
    public Node visitAdverbial(BLParser.AdverbialContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Node visitPlace_adverbial(BLParser.Place_adverbialContext ctx) {
        PlaceAdverbial1 placeAdverbial1 = new PlaceAdverbial1();
        placeAdverbial1.string = ctx.String().getText();
        placeAdverbial1.text = ctx.getText();
        return placeAdverbial1;
    }

    @Override
    public Node visitTime_adverbial(BLParser.Time_adverbialContext ctx) {
        TimeAdverbial1 timeAdverbial1 = new TimeAdverbial1();
        timeAdverbial1.time = ctx.time().accept(this);
        timeAdverbial1.text = ctx.getText();
        return timeAdverbial1;
    }

    @Override
    public Node visitCommon_adverbial(BLParser.Common_adverbialContext ctx) {
        CommonAdverbial1 commonAdverbial1 = new CommonAdverbial1();
        commonAdverbial1.string = ctx.String().getText();
        commonAdverbial1.text = ctx.getText();
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
        Today today = new Today();
        today.text = ctx.getText();
        return today;
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
        String text = terminalNode.getText();
        Word word;
        if(wordMap.containsKey(terminalNode.getText())){
            Word word0 = wordMap.get(terminalNode.getText());
            JSONObject jsonObject = (JSONObject) JSONObject.toJSON(word0);
            word = jsonObject.toJavaObject(word0.getClass());
        }else if(terminalNode.getText().matches("[0-9]+")){
            word = new Num();
        } else {
            word = new Str();
        }
        word.text = text;
        return word;
    }

    @Override
    public Node visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
