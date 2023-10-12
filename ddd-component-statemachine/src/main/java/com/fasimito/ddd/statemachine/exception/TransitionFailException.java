package com.fasimito.ddd.statemachine.exception;

public class TransitionFailException extends RuntimeException {

    public TransitionFailException(String errMsg) {
        super(errMsg);
    }
}
