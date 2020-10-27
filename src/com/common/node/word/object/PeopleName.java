package com.common.node.word.object;

import com.common.antlrfile.Visitor;
import com.common.node.Context;
import com.common.node.Environment;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Method;

public class PeopleName extends Obj {

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

    /**
     * 获取该字符串本身，放到environment中
     * @param
     * @return
     */
    public boolean getItself(){
        Environment environment = Context.getEnvironment();
        environment.resultForSingleNode.push(text);
        return true;
    }

    public boolean getStackValue(){
        Environment environment = Context.getEnvironment();
        Object value = environment.getStoreValue("result");
        if(null == value || value.equals(null)){
            return false;
        }else {
            environment.resultForSingleNode.push(value);
            return true;
        }
    }

    //
    /**
     * 假设当前的字符串，代表的是当前记录中的某个属性，尝试取值，如果是，则返回true，否则返回false
     * @param
     * @return
     */
    public boolean getRecordParameter(){
        Environment environment = Context.getEnvironment();
        if(environment.resultForSingleNode.size()<=0){
            return false;
        }
        JSONObject a = (JSONObject) environment.resultForSingleNode.peek();
        if(null != a && a.containsKey(text)){
            environment.resultForSingleNode.push(a.get(text));
            return true;
        }
        else {
            return false;
        }
    }
}
