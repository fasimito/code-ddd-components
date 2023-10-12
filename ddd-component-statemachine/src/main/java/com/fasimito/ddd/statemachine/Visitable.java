package com.fasimito.ddd.statemachine;

public interface Visitable {
    String accept(final Visitor visitor);
}
