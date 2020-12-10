package com.common.node.word.real.compare;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.word.real.verb.Verb;

//'不等于'
public class NoEquals extends Compare {
    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        BLObj left = environment.findWithDelete("左值");
        BLObj right = environment.findWithDelete("右值");
        if(left == null || right == null){
            return false;
        }
        //全部转换为字符串进行比较
        if(!left.value.toString().equals(right.value.toString())){
            environment.add("结果",true, BLObjType.RESULT_BOOLEAN, EnvironmentType.STACK);
        }else {
            environment.add("结果",false, BLObjType.RESULT_BOOLEAN,EnvironmentType.STACK);
        }
        return true;
    }
}
