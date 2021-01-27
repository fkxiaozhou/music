package com.fkxiaozhou.music.common.config;

public enum ResultCode {

    /* 成功状态码 */
    SUCCESS(0, "操作成功！"),

    /* 错误状态码 */
    FAIL(-1, "操作失败！"),

    GET_SESSION_STATUS_FAIL(50001,"code2session失效或无效"),

    /* 参数错误：10001-19999 */
    PARAM_IS_INVALID(10001, "参数无效"),

    /* 用户错误：20001-29999*/
    USER_NOT_LOGGED_IN(20001, "用户未登录，请先登录"),
    USER_IS_NULL(20002,"用户不存在"),

    PASSWORD_ERROR(20003,"密码错误"),

    /* 系统错误：40001-49999 */
    SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试");


    //操作代码
    int code;
    //提示信息
    String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
