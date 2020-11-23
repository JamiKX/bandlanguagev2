package com.common.node.sentence.complex;

import com.common.node.script.ComplexStmt;

//设定句
public class SetStmt extends ComplexStmt {
    public String mainString; //术语
    public Object value; //值
    public SetValueEnum enumType; //类型
}
