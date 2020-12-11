package com.common.node.word.real.noun;

import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;

//'元素'
public class Element extends Noun {
    @Override
    public boolean run(String methodName) {
        return getElement();
    }

    private boolean getElement(){
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.find("定语",EnvironmentType.STACK);
        //没有或者类型不对
        if(obj == null || obj.type != BLObjType.RESULT_JSONARRAY){
            return false;
        }
        environment.add("宾语",obj.value,BLObjType.RESULT_JSONARRAY, EnvironmentType.STACK);
        return true;
    }

}
