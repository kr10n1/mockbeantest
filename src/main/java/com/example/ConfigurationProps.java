package com.example;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("configuration-properties")
public class ConfigurationProps {

    private String value;

    void setValue(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }
}
