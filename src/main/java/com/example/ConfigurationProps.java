package com.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.EachProperty;
@ConfigurationProperties("properties")
public class ConfigurationProps {

    private String value;

    void setValue(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }
}
