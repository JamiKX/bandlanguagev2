package com.common.node.sentence.simple;

import com.common.node.element.adverbial.Adverbial;
import com.common.node.element.attribute.Attribute;
import com.common.node.element.object.B_Object;
import com.common.node.element.predicate.Predicate;
import com.common.node.script.SimpleStmt;

//predicate_adverbial_attribute_object_stmt  谓状定宾句 执行 测试帮区中 可用的 请假工具
public class SimpleStmt1 extends SimpleStmt {
    public Predicate predicate;
    public Adverbial adverbial;
    public Attribute attribute;
    public B_Object BObject;

    /**
     * 将整个句子的相关部分，放入语境中，之后执行单个节点
     * @param methodName
     * @return
     */
    @Override
    public boolean run(String methodName) {
         //执行顺序 状语--宾语--定语--谓语run
        boolean res = adverbial.run(null);
        if(res){
            res = BObject.run(null);
            if(res){
                res = attribute.run(null);
                if(res){
                    res = predicate.run(null);
                }
            }
        }
        return res;
    }
}
