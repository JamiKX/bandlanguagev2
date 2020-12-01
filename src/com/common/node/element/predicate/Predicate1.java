package com.common.node.element.predicate;

import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.node.element.Element;
import com.common.node.word.real.verb.Verb;

//情况一 verb
public class Predicate1 extends Predicate {
    public Verb verb; //谓语

    @Override
    public boolean run(String methodName) {
        return verb.run(null);
    }
}
