package com.common.node.scentence;


import com.common.node.Context;
import com.common.node.Environment;
import com.common.node.word.object.Obj;
import com.common.node.word.verb.Verb;

import java.util.Stack;

//"谓宾"结构
public class DoSmtStmt extends Scentence {
    //谓语
    public Verb verb;
    //宾语
    public Obj obj;

    @Override
    public boolean run(String methodName){

        Environment environment = Context.getEnvironment();

        boolean res = true;
        environment.resultForSingleNode.push(obj);
        try {
            verb.run("");
        }catch (Exception e){
            res = false;
        }
        return res;
    }

}
