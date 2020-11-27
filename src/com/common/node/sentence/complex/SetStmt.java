package com.common.node.sentence.complex;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.node.script.ComplexStmt;

//设定句
public class SetStmt extends ComplexStmt {
    public String mainString; //术语
    public Object value; //值
    public SetValueEnum enumType; //类型

    @Override
    public boolean run(String methodName) {
        return setStmt();
    }

    public boolean setStmt(){
        Environment environment = EnvironmentConst.environment.get();
        environment.add(mainString,value,enumType.getType(), EnvironmentType.MEMORY);
        return true;
    }
}
