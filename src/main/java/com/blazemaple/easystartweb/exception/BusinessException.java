package com.blazemaple.easystartweb.exception;

import com.blazemaple.easystartweb.common.Error;

/**
 * @description 自定义异常类
 *
 * @author BlazeMaple
 * @date 2023/9/24 14:21
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -2970393916478025106L;
    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Error errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(Error errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}