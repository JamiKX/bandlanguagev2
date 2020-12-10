package com.common.node.word.real.compare;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.word.real.verb.Verb;

//'不小于'
public class NoLessThan extends Compare {

    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        BLObj left = environment.findWithDelete("左值");
        BLObj right = environment.findWithDelete("右值");
        if(left == null || right == null){
            return false;
        }
        Integer l,r;
        try {
            l = Integer.valueOf(left.value.toString());
            r = Integer.valueOf(right.value.toString());
        }catch (Exception e){
            //不能转换为数字
            return false;
        }

        if(l>=r){
            environment.add("结果",true, BLObjType.RESULT_BOOLEAN, EnvironmentType.STACK);
        }else {
            environment.add("结果",false, BLObjType.RESULT_BOOLEAN,EnvironmentType.STACK);
        }
        return true;
    }

}
