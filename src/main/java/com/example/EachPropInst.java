package com.example;

import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;

@EachProperty("each-prop")
public class EachPropInst implements EachProp {
    private final String nameQualifier;
    private String value;

    public EachPropInst(@Parameter String nameQualifier) {
        this.nameQualifier = nameQualifier;
    }

    public String getNameQualifier() {
        return nameQualifier;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
