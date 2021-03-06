package com.common.node.word.real.noun;

import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;

//'输入部件'
//一般用到这个词，都是已经在前面指定是哪个工具了
//用这个词的目的就是获取这个工具的所有输出部件的相关信息
public class OutputPart extends Noun {

    @Override
    public boolean run(String methodName) {
        return outputPart();
    }

    private boolean outputPart(){
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.findWithDelete("宾语");
        if(obj == null || obj.type != BLObjType.TOOLID){
            return false;
        }
        String toolID = obj.value.toString();

        JSONObject outPutPart = getOutPutPart(toolID);
        environment.add("宾语",outPutPart,BLObjType.RESULT_JSONOBJECT, EnvironmentType.STACK);
        return true;
    }

    //调用帮区接口来得到相关信息
    private JSONObject getOutPutPart(String toolID){
        return new JSONObject();
    }

}
