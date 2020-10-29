package com.common.node.word.object;

import com.common.node.word.verb.Verb;

import java.util.List;

//
public class Str implements Obj {
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
