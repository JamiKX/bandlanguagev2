package com.common.node.element.object;

import com.common.node.Node;

import java.util.LinkedList;
import java.util.List;

//
public class Object1 extends Object {
    public List<Node> list = new LinkedList<>(); // 各具体词
    public List<String> splits = new LinkedList<>(); //分割字符
}
