package com.common.node.word.verb;

import java.util.List;

//“查找”所对应的节点
public class Search implements Verb {
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
