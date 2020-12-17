package com.common.node.word.real.verb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.script.Script;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//'执行'
public class Execute extends Verb {
    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.findWithDelete("宾语");
        if(obj == null ){
            return false;
        }
        //如果是设定的剧本
        if(obj.type == BLObjType.Node){
            try {
                Script script = (Script)obj.value;
                return script.run(null);
            }catch (Exception e){
                return false;
            }
        }

        //如果是工具ID
        if(obj.type == BLObjType.TOOLID){
            String toolID = obj.value.toString();
            //判断是否有设定参数
            BLObj params = environment.find("参数", EnvironmentType.STACK);
            JSONObject pa = null;
            if(params != null && params.type == BLObjType.RESULT_JSONOBJECT){
                pa = JSONObject.parseObject(params.value.toString());
            }
            //判断是否有设定具体执行哪些
            BLObj toolPart = environment.find("指定接口", EnvironmentType.STACK);
            LinkedList<String> to = new LinkedList<String>();
            if(toolPart != null && toolPart.type == BLObjType.RESULT_JSONARRAY){
                JSONArray jsonArray = JSONArray.parseArray(toolPart.value.toString());
                for (BLObj a : jsonArray.toJavaList(BLObj.class)){
                    if(a.type == BLObjType.RESULT_STRING){
                        //如果是string类型，则认为是指定的要获取的结果的名称
                        to.add(a.value.toString());
                    }
                }
            }

            try {
                return runTool(toolID,pa,to);
            }catch (Exception e){
                return false;
            }
        }
        //如果是其他情况，暂时返回false
        return false;
    }

    /**
     * 根据工具ID和参数列表，执行工具，得到的结果先放在栈中
     * @param toolID 工具ID
     * @param params 参数列表
     * @param params 用户可能指定的具体接口
     * @return
     */
    private boolean runTool(String toolID, JSONObject params,List<String> toolPart){
        return false;
    }
}
