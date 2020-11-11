package com.common.environment.wetoband;

import com.common.environment.staticMessage.BLObjType;

/**
 * 语境中存放相关信息的对象
 */
public class BLObj {
    public String key; // 中文名称
    public Object value; //对应的值
    public BLObjType type; //值的类型
    public BLObj(String key ,Object value,BLObjType type){
        this.key = key;
        this.value = value;
        this.type = type;
    }
}
