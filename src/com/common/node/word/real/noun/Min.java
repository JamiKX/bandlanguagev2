package com.common.node.word.real.noun;

import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

//'最小值'
public class Min extends Noun {

    @Override
    public boolean run(String methodName) {
        return min();
    }

    private boolean min(){
        Environment environment = EnvironmentConst.environment.get();
        BLObj obj = environment.findWithDelete("宾语");
        if(obj == null || obj.type != BLObjType.RESULT_LIST){
            return false;
        }
        List<Integer> list = new LinkedList<>();

        //判断是否是数字列表
        if (obj.value instanceof ArrayList<?>) {
            try {
                list = (List<Integer>) obj.value;
            }catch (Exception e){
                //不能转换为数字
                return false;
            }
        }else {
            return false;
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2){
                    return 1;
                }else if(o1 == o2){
                    return 0;
                }else {
                    return -1;
                }

            }
        });
        environment.add("宾语",list.get(0),BLObjType.RESULT_INTEGER, EnvironmentType.STACK);
        return true;
    }
}
