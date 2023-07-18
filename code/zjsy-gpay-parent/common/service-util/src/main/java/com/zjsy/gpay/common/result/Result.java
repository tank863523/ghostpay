package com.zjsy.gpay.common.result;

import lombok.Data;

@Data
public class Result<T> {

    private Integer code;

    private String message;

    private T data;

    private Result(){}


    //设置数据，返回对象的方法
    public static<T> Result<T> build(T data,ResultCodeEnum resultCodeEnum){
        Result<T> result = new Result<>();
        //判断返回结果中是否需要数据
        if (data != null){
            result.setData(data);
        }

        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());

        return result;

    }

    //成功的方法
    public static<T> Result<T> ok(T data){
        return build(data, ResultCodeEnum.SUCCESS);
    }

    //失败的方法
    public static<T> Result<T> fail(T data){
        return build(data, ResultCodeEnum.FAIL);
    }

}
