package com.common.node.word.real.verb;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.wetoband.BLObj;
import com.common.node.script.Script;

//'执行'
public class Execute extends Verb {
    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.findWithDelete("宾语");
        if(obj == null || obj.type != BLObjType.Node){
            return false;
        }
        try {
            Script script = (Script)obj.value;
            return script.run(null);
        }catch (Exception e){
            return false;
        }
    }
}
