package com.blazemaple.easystartweb.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author BlazeMaple
 * @description 通用返回类
 * @date 2023/9/24 14:09
 */
@Data
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 4887078045405290846L;
    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(Error errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
