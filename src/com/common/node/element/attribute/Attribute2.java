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
        return false;
    }

}
