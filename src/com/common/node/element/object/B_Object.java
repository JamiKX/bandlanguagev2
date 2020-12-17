package com.common.node.element.object;

import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.element.Element;

import java.util.ArrayList;
import java.util.List;

//'宾语'
public class B_Object extends Element {
    public ObjectSingle objectSingle;
    public List<ObjectSplit> objectSplitList = new ArrayList<>();
    public List<ObjectSingle> objectSingleList = new ArrayList<>();

    @Override
    public boolean run(String methodName) {
        boolean res = false;
        Environment environment = EnvironmentConst.environment.get();
        if(environment.find("状语", EnvironmentType.STACK) != null){
            environment.update("状语", "宾语", environment.find("状语", EnvironmentType.STACK), BLObjType.RESULT_JSONOBJECT, EnvironmentType.STACK);
        }else{
            //设定填充剧本环境到宾语?
            environment.add("宾语", environment.scriptEnvironment.toString(), BLObjType.RESULT_JSONOBJECT, EnvironmentType.STACK);
        }
        res = objectSingle.run(null);
        if(res){
            for (ObjectSingle obs: objectSingleList) {
                res = obs.run(null);
            }
        }
        return res;
    }
}
