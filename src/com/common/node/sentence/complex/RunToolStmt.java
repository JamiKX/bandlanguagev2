package com.common.node.sentence.complex;

import com.common.node.script.ComplexStmt;
import com.common.node.sentence.simple.SimpleStmt3;
import com.common.node.sentence.simple.SimpleStmt4;
import com.common.node.word.real.compare.Compare;

import java.util.List;

//执行工具句
public class RunToolStmt extends ComplexStmt {
    public SimpleStmt4 mainStmt; //主句
    public List<Compare> conditionList ; //可能附带的条件
    public SimpleStmt4 saveStmt; //可能附带的后句

    
}
