package com.common.node.word.real.verb;

import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.script.Script;

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
            try {
                return runTool(toolID,pa);
            }catch (Exception e){
                return false;
            }
        }

        //如果是其他情况，暂时返回false
        return false;
    }

    /**
     * 根据工具ID和参数列表，执行工具，得到的结果先放在栈中
     * @param toolID
     * @param params
     * @return
     */
    private boolean runTool(String toolID, JSONObject params){
        return false;
    }
}
