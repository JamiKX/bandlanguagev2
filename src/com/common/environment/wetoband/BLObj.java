package com.common.environment.wetoband;

/**
 * 语境中存放相关信息的对象
 */
public class BLObj {
    public String key; // 中文名称
    public Object value; //对应的值
    public BLObj(String key ,Object value){
        this.key = key;
        this.value = value;
    }
}
