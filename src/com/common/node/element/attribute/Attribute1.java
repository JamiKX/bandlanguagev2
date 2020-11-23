package com.common.node.element.attribute;

import com.common.node.Node;

import java.util.LinkedList;
import java.util.List;

//情况一 ((String|simpleStmt|adjective|noun) De)+
public class Attribute1 extends Attribute {
    public List<Node> list = new LinkedList<>(); // 各具体词

}
