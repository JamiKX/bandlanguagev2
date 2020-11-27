package com.common.node.element.adverbial.timeadverbial;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.Node;
import com.common.node.element.adverbial.Adverbial;
import com.common.node.element.adverbial.TimeAdverbial;

//时间状语情况一 At time
public class TimeAdverbial1 extends TimeAdverbial {
    public Node time;

    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        boolean res = time.run(null);
        //执行错误
        if(!res){
            return false;
        }
        BLObj obj = environment.findWithDelete("时间");
        if(null == obj){
            return false;
        }else {
            environment.add("状语",obj.value,obj.type, EnvironmentType.STACK);
            return true;
        }
    }
}
