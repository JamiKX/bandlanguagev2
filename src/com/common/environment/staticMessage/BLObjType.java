package com.common.environment.staticMessage;

/**
 * 记录词义的各类格式
 * 有：用户ID，工具ID，工具部件地址，机构ID，帮区ID，岗位ID，文档ID,各类工具返回结果
 */
public enum BLObjType {
    USERID("用户ID","string"),
    TOOLID("工具ID","string"),
    INTERFACEPLACE("工具调用地址","string"),
    ORGANIZATIONID("机构ID","string"),
    BANDID("帮区ID","string"),
    POST("岗位ID","string"),
    DOCUMENT("文档ID","string"),
    RESULT_STRING("string类型的结果","string"),
    RESULT_INTEGER("int类型的结果","int"),
    RESULT_JSONoBJECT("jsonObject类型的结果","jsonObject"),
    RESULT_JSONARRAY("jsonArray类型的结果","jsonArray"),
    RESULT_OBJECT("对象类型的结果","object");

    private String mean;
    private String format;

    BLObjType(String mean, String format) {
        this.mean = mean;
        this.format = format;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
