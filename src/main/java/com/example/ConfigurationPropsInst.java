package com.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import jakarta.inject.Singleton;

@Singleton
public class ConfigurationPropsInst implements EachProp {
    private String value;

    public ConfigurationPropsInst(ConfigurationProps props) {
        this.value = props.getValue();
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
