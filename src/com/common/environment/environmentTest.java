package com.common.environment;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;

public class environmentTest {
    public static void main(String[] args){
        Environment environment = new Environment();
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(environment);
        jsonObject.remove("showForUser");
        jsonObject.remove("methodChoosed");
        return;

//        environment.find("张三");
//        environment.find("张三", EnvironmentType.ORGANIZATION);
//        environment.delete("张三",EnvironmentType.BAND);
//        environment.add("工具","121", BLObjType.TOOLID,EnvironmentType.STACK);
    }
}
