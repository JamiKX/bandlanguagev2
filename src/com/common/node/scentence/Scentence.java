package com.common.node.scentence;

import com.common.node.Node;
import java.util.List;

//句型的基本父类
public class Scentence implements Node {
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
