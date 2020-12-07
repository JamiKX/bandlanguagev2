package com.common.node.sentence.simple;

import com.common.node.element.object.B_Object;
import com.common.node.element.predicate.Predicate;
import com.common.node.script.SimpleStmt;

//predicate_object_stmt  谓宾句
public class SimpleStmt4 extends SimpleStmt {
    public Predicate predicate;
    public B_Object BObject;

    /**
     * 将整个句子的相关部分，放入语境中，之后执行单个节点
     * @param methodName
     * @return
     */
    @Override
    public boolean run(String methodName) {
        boolean res = BObject.run(null);
        if(res){
            res = predicate.run(null);
        }
        return res;
    }
}
