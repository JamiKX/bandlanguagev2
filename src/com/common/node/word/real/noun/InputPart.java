package com.common.node.word.real.noun;

import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;

//'输入部件'
public class InputPart extends Noun {
    @Override
    public boolean run(String methodName) {
        return inputPart();
    }

    private boolean inputPart(){
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.findWithDelete("宾语");
        if(obj == null || obj.type != BLObjType.TOOLID){
            return false;
        }
        String toolID = obj.value.toString();

        JSONObject outPutPart = getInPutPart(toolID);
        environment.add("宾语",outPutPart,BLObjType.RESULT_JSONOBJECT, EnvironmentType.STACK);
        return true;
    }

    //调用帮区接口来得到相关信息
    private JSONObject getInPutPart(String toolID){
        return new JSONObject();
    }
}
