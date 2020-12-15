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
import com.common.node.word.real.noun.Noun;

import java.util.LinkedList;
import java.util.List;

//(String|noun) (De noun)*  列表A的年龄的最大值  张三的父亲的妻子
public class ObjectSingle extends Element {
    public Str object_string;
    public List<Noun> noun_words = new LinkedList<>();

    @Override
    public boolean run(String methodName) {
        boolean res = true;
        Environment environment = EnvironmentConst.environment.get();
        if(object_string != null){
            boolean r = object_string.run(null);
            if(!r){
                return false;
            }
            BLObj blObj = environment.findWithDelete(object_string.text);
            if(blObj == null){
                return false;
            }
            environment.add("宾语",blObj.value,blObj.type,EnvironmentType.STACK);
        }
        for (Noun noun: noun_words) {
            res = noun.run(null);
        }
        return res;
    }
}
