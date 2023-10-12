package com.fasimito.ddd.statemachine.builder;

import com.fasimito.ddd.statemachine.Action;

public interface When<S, E, C>{
    /**
     * Define action to be performed during transition
     *
     * @param action performed action
     */
    void perform(Action<S, E, C> action);
}
