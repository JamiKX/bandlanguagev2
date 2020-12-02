package com.common.node.element.attribute;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.sentence.simple.CompareStmt;
import com.common.node.word.Str;

import java.util.LinkedList;
import java.util.List;

//情况二: (条件判断句子) 的 元素 的 (属性名称 的)
// 年龄大于10 的 元素 的 个数     性别等于男的 元素 的  年龄 的 最大值
//compare_stmt De
public class Attribute2 extends Attribute {
    public CompareStmt compareStmt;

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
            case "judge":
                return judge();
            default:
                return false;
        }
    }

    public boolean judge(){
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.findWithDelete("状语");
        //不存在状语，或者状语的值不是集合
        if(null == obj || obj.type != BLObjType.RESULT_JSONARRAY){
            return false;
        }
        JSONArray jsonArray = JSONArray.parseArray(obj.value.toString());
        JSONArray res = new JSONArray();
        for (int i=0;i<jsonArray.size();i++){
            JSONObject a = jsonArray.getJSONObject(i);
            environment.add("记录",a,BLObjType.RESULT_JSONOBJECT,EnvironmentType.STACK);
            boolean r = compareStmt.run("compare");
            if(!r){//执行失败
                return false;
            }
            BLObj judgeResult = environment.findWithDelete("结果");
            if(judgeResult.type == BLObjType.RESULT_BOOLEAN && (boolean)judgeResult.value == true ){
                res.add(a);
            }
        }

        environment.add("定语",res,BLObjType.RESULT_LIST, EnvironmentType.STACK);
        return true;
    }
}
