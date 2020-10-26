package com.common.node.script.simple;

import com.common.node.script.Stmt;

import java.util.List;

//简单句的统一父类
public class SimpleStmt implements Stmt {
    public String text;
    @Override
    public boolean run(String methodName) {
        return false;
    }

    @Override
    public void checkSelf(List<String> nodes) {

    }
}
