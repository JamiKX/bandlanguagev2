package com.common.node.script;

import com.common.node.Node;
import com.common.node.script.simple.SimpleStmt;

import java.util.List;
//语句
public class Stmt implements Node {
    //存放该节点所对应的文本
    public String text;

    public SimpleStmt simpleStmt;
    @Override
    public boolean run(String methodName) {
        return false;
    }

    @Override
    public void checkSelf(List<String> nodes) {

    }
}
