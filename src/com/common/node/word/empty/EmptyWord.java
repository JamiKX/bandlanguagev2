package com.common.node.word.empty;

import com.common.node.word.Word;

//虚词，不做任何操作
public class EmptyWord extends Word {

    @Override
    public boolean run(String methodName) {
        return true;
    }
}
