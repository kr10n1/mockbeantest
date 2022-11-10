package com.example;

import jakarta.inject.Singleton;

@Singleton
public class SingletonImpl2 implements SingletonInterface {
    @Override
    public String getValue() {
        return "value2";
    }
}
