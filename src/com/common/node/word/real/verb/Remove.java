package com.common.node.word.real.verb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.environment.Environment;
import com.common.environment.EnvironmentConst;
import com.common.environment.staticMessage.BLObjType;
import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;

//'去掉'
public class Remove extends Verb {

    @Override
    public boolean run(String methodName) {
        return remove();
    }

    /**
     * 如果有状语，则是在状语中删除对应的数据
     * 没有状语，则在语境中删除宾语所值的对象
     * @return
     */
    private boolean remove(){
        Environment environment = EnvironmentConst.environment.get();
        BLObj bing = environment.findWithDelete("宾语");
        BLObj zhuang = environment.findWithDelete("状语");
        //没有宾语
        if(bing == null){
            return false;
        }
        if(zhuang == null){
            //没有状语，则是删除语境中宾语所对应的具体内容
            boolean delete = false;
            //如果删除成功则后面的删除不会执行
            delete = environment.delete(bing.key, EnvironmentType.MEMORY)
                    || environment.delete(bing.key, EnvironmentType.BAND)
                    || environment.delete(bing.key, EnvironmentType.ORGANIZATION);
            return delete;
        }else {
            //有状语，一般是在状语所指定的对象中，删除和后面宾语相同的部分数据
            if(zhuang.type == BLObjType.RESULT_JSONARRAY){
                if(bing.type == BLObjType.RESULT_JSONARRAY){
                    //两者都是数组，则是删除记录
                    try {
                        JSONArray all = JSONArray.parseArray(zhuang.value.toString());
                        JSONArray part = JSONArray.parseArray(bing.value.toString());
                        return deleteRecordInArray(all,part);
                    }catch (Exception e){
                        return false;
                    }
                }else if(bing.type == BLObjType.RESULT_STRING){
                    //原对象是数组，宾语是字符串，则是删除属性
                    try {
                        JSONArray all = JSONArray.parseArray(zhuang.value.toString());
                        return deleteAttrInArray(all,bing.value.toString());
                    }catch (Exception e){
                        return false;
                    }
                }else {
                    //暂时没有其他情况
                    return false;
                }
            }else if(zhuang.type == BLObjType.RESULT_JSONOBJECT){
                //如果是对象，则只能是删除属性
                if(bing.type == BLObjType.RESULT_STRING){
                    try {
                        JSONObject all = JSONObject.parseObject(zhuang.value.toString());
                        all.remove(bing.value.toString());
                        return true;
                    }catch (Exception e){
                        return false;
                    }
                }else {
                    //暂时没有其他情况
                    return false;
                }
            }else {
                //状语不是上面两种
                return false;
            }
        }
    }

    /**
     * 在数组集合中，删除部分记录
     * @param all 原数组
     * @param part 待删除数组
     * @return
     */
    private boolean deleteRecordInArray(JSONArray all,JSONArray part){
        if(all == null || part == null){
            return false;
        }
        for (JSONObject a : part.toJavaList(JSONObject.class)){
            all.remove(a);
        }
        return true;
    }

    /**
     * 在数组集合中，删除某个属性
     * @param all 原数组
     * @param attribute 待删除的属性
     * @return
     */
    private boolean deleteAttrInArray(JSONArray all,String attribute){
        if(all == null || attribute == null){
            return false;
        }
        for (JSONObject a : all.toJavaList(JSONObject.class)){
            a.remove(attribute);
        }
        return true;
    }
}
