package com.common.node.word.real.verb;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.wetoband.BLObj;

//'统计'
public class Count extends Verb {
    @Override
    public boolean run(String methodName) {
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.findWithDelete("宾语");
        boolean res = environment.showForUser.add(obj.value.toString());
        return res;
    }
}
