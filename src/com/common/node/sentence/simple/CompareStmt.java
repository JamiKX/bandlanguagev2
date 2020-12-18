package com.common.node.sentence.simple;

import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.element.object.B_Object;
import com.common.node.script.SimpleStmt;
import com.common.node.sentence.complex.Compare;
import com.common.node.word.real.compare.Equals;

//疑问句
public class CompareStmt extends SimpleStmt {
    public Compare compare;


    @Override
    public boolean run(String methodName) {
        return compare.run(null);
    }

}
