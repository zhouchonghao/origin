package com.example.demo.configurations;


import com.example.demo.models.ResponseData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ResponseData handleException(Exception e) {
        ResponseData response = new ResponseData();
        response.setCode(1);
        response.setMessage("服务器错误");
        return response;
    }
}
