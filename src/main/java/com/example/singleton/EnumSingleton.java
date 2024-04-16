package com.example.singleton;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        System.out.println("EnumSingleton");
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
