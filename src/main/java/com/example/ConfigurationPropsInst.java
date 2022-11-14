package com.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import jakarta.inject.Named;
import jdk.jfr.Name;

@ConfigurationProperties("properties")
@Named("configuration-properties")
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
