package com.common.node.word.real.numerals;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;

//'数字'
public class Number extends Numerals {

    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        try {
            Integer num = Integer.valueOf(this.text);
            if (num != null){
                environment.add("宾语",num, BLObjType.RESULT_INTEGER, EnvironmentType.STACK);
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }
}
