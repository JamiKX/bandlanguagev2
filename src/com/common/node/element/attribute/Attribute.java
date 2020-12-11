package com.common.node.element.attribute;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.node.element.Element;

//定语父类
public class Attribute extends Element {
    public Attribute1 attribute1;
    public Attribute2 attribute2;

    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        if(attribute1.text != null){
            environment.add("定语", attribute1, BLObjType.Node, EnvironmentType.STACK);
        }
        if(attribute2.text != null){
            environment.add("定语", attribute2, BLObjType.Node, EnvironmentType.STACK);
        }
        return true;
    }
}
