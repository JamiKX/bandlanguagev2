package com.common.node.element.object;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.Node;
import com.common.node.word.Word;

import java.util.LinkedList;
import java.util.List;

//
public class Object1 extends Object {
    public List<Word> list = new LinkedList<>(); // 各具体词
    public List<String> splits = new LinkedList<>(); //分割字符

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

    /**
     * 从记录中获取对应的属性来显示
     * @return
     */
    public boolean getValueFromData(){
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.find("定语");
        if(obj == null || obj.type != BLObjType.RESULT_JSONARRAY){
            return false;
        }
        JSONArray jsonArray = JSONArray.parseArray(obj.value.toString());
        JSONArray res = new JSONArray();
        for (int i=0;i<jsonArray.size();i++){
            JSONObject a = jsonArray.getJSONObject(i);
            environment.add("记录",a,BLObjType.RESULT_JSONOBJECT, EnvironmentType.STACK);
            JSONObject b = new JSONObject();
            for(Word node : list){
                boolean r = node.run(null);
                if(!r){
                    return false;
                }else {
                    BLObj nodeRes = environment.findWithDelete("结果");
                    b.putAll((JSONObject)nodeRes.value);
                }
            }
            res.add(b);
            environment.delete("记录",EnvironmentType.STACK);
        }
        environment.add("宾语",res,BLObjType.RESULT_JSONARRAY,EnvironmentType.STACK);
        return true;

    }

    /**
     * 获取语境中词所对应的具体内容
     * @return
     */
    public boolean getObj(){
        Environment environment = EnvironmentConst.environment.get();

        JSONObject jsonObject = new JSONObject();
        for (Word node : list){
            boolean r = node.run(null);
            if(!r){
                return false;
            }
            jsonObject.put(node.text,environment.findWithDelete("宾语").value);
        }
        environment.add("宾语",jsonObject,BLObjType.RESULT_JSONOBJECT,EnvironmentType.STACK);

        return true;
    }
}
