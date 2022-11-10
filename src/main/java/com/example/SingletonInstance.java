package com.example;

import java.util.List;

import io.micronaut.context.annotation.Context;

@Context
public class SingletonInstance {
    private final List<EachBeanInst> list;

    public SingletonInstance(List<EachBeanInst> list){
        this.list = list;
    };
}
