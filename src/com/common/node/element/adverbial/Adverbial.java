package com.common.node.element.adverbial;

import com.common.node.element.Element;

//状语父类
public class Adverbial extends Element {

    /**
     * 状语的执行，一般是根据关键词，返回相关数据到栈中，key是状语
     * @param methodName
     * @return
     */
    @Override
    public boolean run(String methodName) {
        return false;
    }
}
