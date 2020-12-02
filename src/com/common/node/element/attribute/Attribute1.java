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


//情况一： (属性名称|对象名称) 的
//  年龄 的 最大值    ***工具 的 (输出部件)
//String De
public class Attribute1 extends Attribute {
    public Adjective adjective;
}
