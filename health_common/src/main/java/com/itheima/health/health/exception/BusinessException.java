package com.itheima.health.health.exception;

public class BusinessException extends RuntimeException {
    private String msg;


    public BusinessException(String msg) {
        this.msg = msg;
    }

    public BusinessException() {
    }

    public String getMsg() {
        return this.msg;
    }
}
