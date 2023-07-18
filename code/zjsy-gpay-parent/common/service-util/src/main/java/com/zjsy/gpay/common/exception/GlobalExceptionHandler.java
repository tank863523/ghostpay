package com.zjsy.gpay.common.exception;

import com.zjsy.gpay.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.fail(null);
    }

    /**
     * 自定义异常处理
     */
    @ExceptionHandler(GapyException.class)
    @ResponseBody
    public Result error(GapyException e){
        return Result.fail(null);
    }
}
