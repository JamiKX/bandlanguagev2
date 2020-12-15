package com.common.node.word;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;

//字符串
public class Str extends Word {
    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        BLObj blObj = environment.find(this.text);
        if(blObj == null){
            environment.showForUser.add("在语境中未找到:"+this.text);
            return false;
        }else {
            environment.add(this.text,blObj.value,blObj.type, EnvironmentType.STACK);
            return true;
        }
    }
}
