package com.zy.mall.product.exception;

import com.zy.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一异常处理类
 */
@RestControllerAdvice(basePackages = "com.zy.mall.product.controller")
@Slf4j
public class MallExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleVaildException(MethodArgumentNotValidException e){
        BindingResult bindingResult = e.getBindingResult();
        Map<String, String> errorMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach((filedError)->{
            errorMap.put(filedError.getField(), filedError.getDefaultMessage());
        });
        return R.error(400,"参数校验失败").put("data",errorMap);
    }

}
