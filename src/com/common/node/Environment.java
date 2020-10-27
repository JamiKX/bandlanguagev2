package com.common.node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//语境
public class Environment {
    //存储每句话的执行结果
    public HashMap<String,Object> result = new HashMap<String,Object>();

    //存储要显示给用户的内容
    public  HashMap<String,Object>  showForUser = new HashMap<String,Object>();

    //用来存储单句话的中间结果 （剧本执行完后，它应该是空的）
    //存储的内容和格式，由语句自己进行管理和控制
    public Stack resultForSingleNode = new Stack();

    //保存用户选择的句子的执行方法，按照句子顺序进行存储和拿取
    public Queue<String> methodChoosed = new LinkedList<String>();


    public Object getStoreValue(String name){
        if(result.containsKey(name)){
            return result.get(name);
        }else {
            return null;
        }
    }
}
