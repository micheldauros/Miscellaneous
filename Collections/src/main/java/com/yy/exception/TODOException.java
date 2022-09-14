package com.yy.exception;

public class TODOException extends Exception{
    public TODOException() {
        super();
        new TODOException("TODO 异常");
    }

    public TODOException(String message) {
        super(message);
    }
}
