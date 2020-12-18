package com.common.node.element.attribute;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.node.word.real.adjective.Adjective;


//情况一： 形容词 的
// 损坏的 最大的 最小的
//adjective De
public class Attribute1 extends Attribute {
    public Adjective adjective;

    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        environment.add("定语", adjective, BLObjType.Node, EnvironmentType.STACK);
        return true;
    }
}
