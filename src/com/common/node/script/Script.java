package com.common.node.script;

import com.common.node.Node;

import java.util.List;
import java.util.Map;

public class Script implements Node {
    public List<Stmt> lists;

    @Override
    public boolean run(String methodName) {
        return false;
    }

    @Override
    public void checkSelf(Map<String, List<Object>> nodes) {

    }
}
