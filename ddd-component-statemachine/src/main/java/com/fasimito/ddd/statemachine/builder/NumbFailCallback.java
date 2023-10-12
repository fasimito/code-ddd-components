package com.fasimito.ddd.statemachine.builder;

public class NumbFailCallback<S, E, C> implements FailCallback<S, E, C> {

    @Override
    public void onFail(S sourceState, E event, C context) {
        //do nothing
    }
}
