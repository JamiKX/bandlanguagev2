package com.common.node.word.object;

import java.util.List;

public class LeaveTool implements Obj {
    //存放该节点所对应的文本
    public String text;

    @Override
    public boolean run(String methodName) {
        return false;
    }

    @Override
    public void checkSelf(List<String> nodes) {

    }

    @Override
    public void setText(String t) {
        text = t;
    }

}