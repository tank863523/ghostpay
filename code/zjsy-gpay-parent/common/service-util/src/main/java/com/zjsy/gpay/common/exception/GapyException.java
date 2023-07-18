package com.zjsy.gpay.common.exception;

import com.zjsy.gpay.common.result.ResultCodeEnum;
import lombok.Data;

@Data
public class GapyException extends RuntimeException{

    //异常状态码
    private Integer code;


    /**
     * 通过状态码和错误信息创建异常对象
     */
    public GapyException(String message, Integer code){
        super(message);
        this.code = code;
    }


    /**
     * 接收枚举类对象
     */
    public GapyException(ResultCodeEnum resultCodeEnum){
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }


}
