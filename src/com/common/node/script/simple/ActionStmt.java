package com.common.node.script.simple;

import com.common.node.scentence.Scentence;

//执行句
public class ActionStmt extends SimpleStmt {
    //具体一个句型
    public Scentence scentence;

    @Override
    public boolean run(String methodName) {
        scentence.run(methodName);
        return true;
    }
}
