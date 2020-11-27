package com.common.node.sentence.simple;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.node.element.adverbial.Adverbial;
import com.common.node.element.attribute.Attribute;
import com.common.node.element.object.Object;
import com.common.node.element.predicate.Predicate;
import com.common.node.script.SimpleStmt;

//predicate_attribute_object_stmt  谓定宾句
public class SimpleStmt2 extends SimpleStmt {
    public Predicate predicate;
    public Attribute attribute;
    public Object object;

    /**
     * 将整个句子的相关部分，放入语境中，之后执行单个节点
     * @param methodName
     * @return
     */
    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        environment.add("定语",attribute, BLObjType.Node, EnvironmentType.STACK);
        environment.add("宾语",object, BLObjType.Node, EnvironmentType.STACK);
        return predicate.run(null);
    }
}
