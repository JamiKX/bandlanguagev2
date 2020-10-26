package com.common.node.word.verb;

import com.common.node.Context;
import com.common.node.Environment;
import com.common.node.word.object.Obj;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Method;
import java.util.List;

//“显示”所对应的节点
public class Show extends Verb {

    @Override
    public boolean run(String methodName) {
        boolean res = false;
        Environment environment = Context.getEnvironment();
        if(StringUtils.isEmpty(methodName)){
            methodName = environment.methodChoosed.poll();
        }
        Class clazz = this.getClass();
        // 获取所有的执行方法
        Method[] MethodList = clazz.getDeclaredMethods();
        for (Method m : MethodList){
            if(m.getName().equals(methodName)){
                try {
                    res = (boolean)m.invoke(this);
                }catch (Exception e){
                    System.out.println(text+":利用反射调用函数出现异常");
                    res = false;
                }
                break;
            }
        }
        return res;
    }

    //显示内存中已有的
    public boolean showFromMemory(){
        Environment environment = Context.getEnvironment();
        Obj obj = (Obj)environment.resultForSingleNode.pop();
        obj.run("");
        environment.showForUser.put("result", environment.resultForSingleNode.pop());
        return true;
    }

    //调取工具接口获取
    public boolean showFromOutGet(){
        Environment environment = Context.getEnvironment();
        //请求接口...
        environment.showForUser.put("result", "");
        return true;
    }

    @Override
    public void checkSelf(List<String> nodes) {

    }
}
