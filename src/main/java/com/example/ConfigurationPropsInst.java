package com.example;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("properties")
public class ConfigurationPropsInst implements EachProp {
    private String value;

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
