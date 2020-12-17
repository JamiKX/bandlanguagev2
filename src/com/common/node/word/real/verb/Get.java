package com.common.node.word.real.verb;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;

//'得到'
public class Get extends Verb {
    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.findWithDelete("宾语");
        if(obj == null){
            return false;
        }else {
            environment.add("结果",obj.value,obj.type, EnvironmentType.STACK);
            return true;
        }
    }
}
