package com.common.node.element.adverbial.placeadverbial;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.node.element.adverbial.PlaceAdverbial;

//地点状语情况一 At String (In)?
public class PlaceAdverbial1 extends PlaceAdverbial {
    public String string;//剧本中的词

    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.find(string);
        if(null == obj){
            return false;
        }else {
            environment.add("状语",obj.value,obj.type, EnvironmentType.STACK);
            return true;
        }
    }
}
