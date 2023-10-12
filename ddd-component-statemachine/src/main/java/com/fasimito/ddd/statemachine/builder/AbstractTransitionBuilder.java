package com.fasimito.ddd.statemachine.builder;

import com.fasimito.ddd.statemachine.State;
import com.fasimito.ddd.statemachine.impl.StateHelper;
import com.fasimito.ddd.statemachine.impl.TransitionType;

import java.util.Map;

 abstract class AbstractTransitionBuilder<S,E,C> implements  From<S,E,C>,On<S,E,C>,To<S,E,C>{

    final Map<S, State<S, E, C>> stateMap;

    protected State<S, E, C> target;

    final TransitionType transitionType;

    public AbstractTransitionBuilder(Map<S, State<S, E, C>> stateMap, TransitionType transitionType) {
        this.stateMap = stateMap;
        this.transitionType = transitionType;
    }
    @Override
    public To<S, E, C> to(S stateId) {
        target = StateHelper.getState(stateMap, stateId);
        return this;
    }
}
