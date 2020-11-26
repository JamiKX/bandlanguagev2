package com.common;

import com.alibaba.fastjson.JSONObject;
import com.common.node.word.Word;
import com.common.node.word.real.verb.Show;

public class Test0 {
    public static void main(String[] args) {
        Word word0 = new Show();
        word0.text = "显示";
        JSONObject jo= (JSONObject) JSONObject.toJSON(word0);
        Word word = jo.toJavaObject(word0.getClass());
        return;
    }
}
