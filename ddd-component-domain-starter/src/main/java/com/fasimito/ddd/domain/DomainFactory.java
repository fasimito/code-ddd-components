package com.fasimito.ddd.domain;

public class DomainFactory {

    public static <T> T create(Class<T> entityClz){
        return ApplicationContextHelper.getBean(entityClz);
    }

}
