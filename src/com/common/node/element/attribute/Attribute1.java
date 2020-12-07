package com.common.node.element.attribute;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.word.Str;
import com.common.node.word.real.adjective.Adjective;

import java.util.LinkedList;
import java.util.List;


//情况一： 形容词 的
// 损坏的 最大的 最小的
//adjective De
public class Attribute1 extends Attribute {
    public Adjective adjective;

    @Override
    public boolean run(String methodName) {
        boolean res = false;
        if(adjective.run(null)){
            res = true;
        }
        return res;
    }
}
