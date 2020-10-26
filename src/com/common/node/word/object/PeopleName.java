package com.common.node.word.object;

import com.common.node.Context;
import com.common.node.Environment;

public class PeopleName extends Obj {


    @Override
    public boolean run(String methodName) {
        Environment environment = Context.getEnvironment();
        environment.resultForSingleNode.push("");
        return true;
    }
}
