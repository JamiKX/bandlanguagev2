package com.common.node.script;

import com.common.node.Node;

import java.util.LinkedList;
import java.util.List;
//剧本
public class Script implements Node {
    //存放该节点所对应的文本
    public String text;
    //存放所有语句节点
    public List<Stmt> listStmt = new LinkedList<>();

    @Override
    public boolean run(String methodName) {
        return false;
    }

    @Override
    public void checkSelf(List<String> nodes) {

    }
}
