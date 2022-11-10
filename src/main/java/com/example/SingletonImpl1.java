package com.example;

import jakarta.inject.Singleton;

@Singleton
public class SingletonImpl1 implements SingletonInterface {
    @Override
    public String getValue() {
        return "value1";
    }
}
