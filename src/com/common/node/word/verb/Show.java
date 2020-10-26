package com.common.node.word.verb;

import java.util.List;

//“显示”所对应的节点
public class Show extends Verb {

    @Override
    public boolean run(String methodName) {
        return false;
    }

    @Override
    public void checkSelf(List<String> nodes) {

    }
}
