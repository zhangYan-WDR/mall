package com.zy.common.exception;


public enum BizCodeEnum {

    UNKNOW_EXCEPTION(10000, "系统出现未知异常"),
    VALID_EXCEPTION(10001, "参数格式校验失败");

    private int code;

    private String message;

    BizCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
