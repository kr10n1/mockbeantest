package com.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.EachProperty;
import jakarta.inject.Named;

@ConfigurationProperties("properties")
@Named("properties")
public class ConfigurationProps {

    private String value;

    void setValue(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }
}
