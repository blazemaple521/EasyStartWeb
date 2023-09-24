package com.blazemaple.easystartweb.common;
/**
 * @description 错误返回接口, 自定义错误枚举实现该接口
 *
 * @author BlazeMaple
 * @date 2023/9/24 14:11
 */
public interface Error {

    /**
     * 错误代码
     *
     * @return int
     */
    int getCode();

    /**
     * 错误描述
     *
     * @return {@link String}
     */
    String getMessage();

}