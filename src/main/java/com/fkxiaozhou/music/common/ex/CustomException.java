package com.fkxiaozhou.music.common.ex;

import com.fkxiaozhou.music.common.config.ResultCode;

import java.text.MessageFormat;

public class CustomException extends RuntimeException{
    //错误代码
    ResultCode resultCode;

    public CustomException(ResultCode resultCode) {
        super(resultCode.getMsg());
        this.resultCode = resultCode;
    }

    public CustomException(ResultCode resultCode, Object... args) {
        super(resultCode.getMsg());
        String message = MessageFormat.format(resultCode.getMsg(), args);
        resultCode.setMsg(message);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

}
