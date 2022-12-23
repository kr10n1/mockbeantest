package com.example;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Named("value1")
public class SingletonImpl1 implements SingletonInterface {
    @Override
    public String getValue() {
        return "value1";
    }
}
