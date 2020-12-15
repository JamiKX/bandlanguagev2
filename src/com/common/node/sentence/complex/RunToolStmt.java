package com.common.node.sentence.complex;

import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.script.ComplexStmt;
import com.common.node.sentence.simple.CompareStmt;
import com.common.node.sentence.simple.SimpleStmt3;
import com.common.node.sentence.simple.SimpleStmt4;
import com.common.node.word.real.compare.Compare;

import java.util.List;

//执行工具句
public class RunToolStmt extends ComplexStmt {
    public SimpleStmt4 mainStmt; //主句
    public List<CompareStmt> conditionList ; //可能附带的条件
    public SimpleStmt4 saveStmt; //可能附带的后句

    @Override
    public boolean run(String methodName) {
        return runTool();
    }

    /**
     * 在工具集成场景中，只有执行工具句型符合该结构，
     * 即mainStmt是执行工具，conditionList是参数赋值，saveStmt是取得的数据对象
     * @return
     */
    public boolean runTool(){
        Environment environment = EnvironmentConst.environment.get();
        JSONObject params = new JSONObject();
        if(conditionList != null){
            for (CompareStmt a : conditionList){
                a.run("changeMap");
                BLObj aRes = environment.findWithDelete("结果");
                //执行出错
                if(aRes == null){
                    return false;
                }else {
                    //合并参数map
                    JSONObject json = JSONObject.parseObject(aRes.value.toString());
                    params.putAll(json);
                }
            }
        }
        environment.add("参数",params, BLObjType.RESULT_JSONOBJECT, EnvironmentType.STACK);
        //执行工具
        boolean success = mainStmt.run(null);
        if (!success){
            return false;
        }
        //在这里，执行完成之后，得到的数据应该是在栈中的，需要进行处理和筛选，看哪些需要放到剧本环境中
        if(null != saveStmt){
            success = saveStmt.run(null);
        }
        if (!success){
            return false;
        }
        return true;
    }
}
