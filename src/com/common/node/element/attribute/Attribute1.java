package com.common.node.element.attribute;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.word.Str;

import java.util.LinkedList;
import java.util.List;


//情况一： (属性名称|对象名称) 的
//  年龄 的 最大值    ***工具 的 (输出部件)
//String De
public class Attribute1 extends Attribute {
    public Str str;

    @Override
    public boolean run(String methodName) {
        String runMethod = "";
        if(null == methodName || methodName.length()==0){  //如果没有传入方法名称
            Environment environment = EnvironmentConst.environment.get();
            runMethod = environment.methodChoosed.poll();
            //没有指定方法
            if(null == runMethod){
                return false;
            }
        }else {
            runMethod = methodName;
        }
        switch (runMethod){
            case "getValueFromData":
                return getValueFromData();
            case "getObj":
                return getObj();
            default:
                return false;
        }
    }

    //在有状语的情况下，获取状语，并获取str所对应的属性的值的集合
    public boolean getValueFromData(){
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.findWithDelete("状语");
        //不存在状语，或者状语的值不是集合
        if(null == obj || obj.type != BLObjType.RESULT_JSONARRAY){
            return false;
        }
        JSONArray jsonArray = JSONArray.parseArray(obj.value.toString());
        List<Object> res = new LinkedList<>();
        for (int i=0;i<jsonArray.size();i++){
            JSONObject a = jsonArray.getJSONObject(i);
            res.add(a.get(str.text));
        }
        environment.add("定语",res,BLObjType.RESULT_LIST,EnvironmentType.STACK);
        return true;
    }

    //str是某个对象
    public boolean getObj(){
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.find(str.text);
        if(obj == null){
            return false;
        }
        environment.add("定语",obj.value,obj.type,EnvironmentType.STACK);
        return true;
    }
}
