package com.example;

import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;

@EachProperty("submodule")
public class LocalEach {

    private final String nameQualifier;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

    public LocalEach(@Parameter String nameQualifier) {

        this.nameQualifier = nameQualifier;
    }
}
