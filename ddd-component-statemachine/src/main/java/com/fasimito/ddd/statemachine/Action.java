package com.fasimito.ddd.statemachine;

public interface Action<S, E, C> {

//    /**
//     * Execute action with a {@link StateContext}.
//     *
//     * @param context the state context
//     */
//    void execute(StateContext<S, E> context);

    public void execute(S from, S to, E event, C context);

}
