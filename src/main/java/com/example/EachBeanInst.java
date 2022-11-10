package com.example;

import io.micronaut.context.annotation.EachBean;

@EachBean(EachProp.class)
public class EachBeanInst {

    private final String value;

    public EachBeanInst(EachProp inst) {
        value = inst.getValue();
    }

    public String getValue() {
        return value;
    }
}
