package com.example;

import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;

@EachProperty("submodule")
public class SubmoduleEachImpl extends SubmoduleEach{
    public SubmoduleEachImpl(@Parameter String nameQualifier) {
        super(nameQualifier);

    }
}
