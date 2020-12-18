package com.common.node.element.attribute;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.node.sentence.simple.CompareStmt;

//情况二: (条件判断句子) 的 元素 的 (属性名称 的)
// 年龄大于10 的 元素 的 个数     性别等于男的 元素 的  年龄 的 最大值
//compare_stmt De
public class Attribute2 extends Attribute {
    public CompareStmt compareStmt;

    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        environment.add("定语", compareStmt, BLObjType.Node, EnvironmentType.STACK);
        return true;
    }

}
