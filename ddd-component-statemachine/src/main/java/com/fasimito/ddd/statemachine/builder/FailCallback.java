package com.fasimito.ddd.statemachine.builder;

@FunctionalInterface
public interface FailCallback<S, E, C> {

    /**
     * Callback function to execute if failed to trigger an Event
     *
     * @param sourceState
     * @param event
     * @param context
     */
    void onFail(S sourceState, E event, C context);
}
