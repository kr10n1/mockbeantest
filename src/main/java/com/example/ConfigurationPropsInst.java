package com.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import jakarta.inject.Named;

@ConfigurationProperties("properties.testImpl1")
@Named("testImpl")
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
