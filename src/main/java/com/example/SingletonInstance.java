package com.example;

import io.micronaut.context.annotation.EachBean;

@EachBean(SingletonInterface.class)
public class SingletonInstance {
    private final SingletonInterface single;

    public SingletonInstance(SingletonInterface single){
        this.single = single;
    };

    public SingletonInterface getSingle() {
        return single;
    }
}
