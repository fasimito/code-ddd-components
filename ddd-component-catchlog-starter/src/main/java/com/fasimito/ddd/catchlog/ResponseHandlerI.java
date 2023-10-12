package com.fasimito.ddd.catchlog;

import com.fasimito.ddd.exception.BaseException;

public interface ResponseHandlerI {
    public Object handle(Class returnType, String errCode, String errMsg);
}
