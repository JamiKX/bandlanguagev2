package com.common.node.word.real.noun;

import com.alibaba.fastjson.JSONArray;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;

//'数量'
public class Amount extends Noun {
    @Override
    public boolean run(String methodName) {
        return getAmount();
    }

    private boolean getAmount(){
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.findWithDelete("宾语");
        //没有或者类型不对
        if(obj == null || obj.type != BLObjType.RESULT_JSONARRAY){
            return false;
        }

        try {
            JSONArray res = JSONArray.parseArray(obj.value.toString());
            environment.add("宾语",res.size(),BLObjType.RESULT_INTEGER, EnvironmentType.STACK);
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
