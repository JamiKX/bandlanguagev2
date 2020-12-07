package com.common.node.element.object;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.element.Element;
import com.common.node.word.Str;
import com.common.node.word.Word;
import com.common.node.word.real.noun.Noun;

import java.util.LinkedList;
import java.util.List;

//(String|noun) (De noun)*  列表A的年龄的最大值  张三的父亲的妻子
public class ObjectSingle extends Element {
    public Str object_string;
    public List<Noun> noun_words = new LinkedList<>();

    @Override
    public boolean run(String methodName) {
        boolean res = false;
        Environment environment = EnvironmentConst.environment.get();
        BLObj blObj = environment.find("状语", EnvironmentType.STACK);
        JSONObject jo = JSONObject.parseObject(blObj.value.toString());
        ///////没有写判断parse以及边界问题
        if(object_string != null){
            Object o_str = jo.get(environment.find(object_string.text, EnvironmentType.STACK).value);
            jo = JSONObject.parseObject(o_str.toString());
            environment.add("object_string", object_string.text, BLObjType.RESULT_STRING, EnvironmentType.STACK);
        }
        for (Noun noun: noun_words) {
            if(noun.run(null)){
                Object o = jo.get(environment.find(noun.text, EnvironmentType.STACK).value);
                jo = JSONObject.parseObject(o.toString());
                //加判断
                environment.add("宾语", jo, BLObjType.RESULT_JSONOBJECT, EnvironmentType.STACK);
            }
        }
        return res;
    }
}
