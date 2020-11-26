package com.common.node.script;

import com.common.node.Node;

import java.util.List;
import java.util.Map;

//句子父类
public class Stmt implements Node {
    public String text;

    @Override
    public boolean run(String methodName) {
        return false;
    }

    @Override
    public void checkSelf(Map<String, List<Object>> nodes) {

    }
}
