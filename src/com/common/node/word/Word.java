package com.common.node.word;

import com.common.node.Node;

import java.util.List;
//词的基本父类
public class Word implements Node {
    //存放该节点所对应的文本
    public String text;

    @Override
    public boolean run(String methodName) {
        return false;
    }

    @Override
    public void checkSelf(List<String> nodes) {

    }
}
