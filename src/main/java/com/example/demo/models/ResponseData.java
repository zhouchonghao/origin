package com.example.demo.models;

import lombok.Data;

@Data
public class ResponseData {
    private int code;
    private String message;
    private Object data;
    private long pageNumber;
    private long total;

}
