package com.example;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Named("value2")
public class SingletonImpl2 implements SingletonInterface {
    @Override
    public String getValue() {
        return "value2";
    }
}
