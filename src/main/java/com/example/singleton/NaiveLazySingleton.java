package com.example.singleton;

import java.util.Objects;

public class NaiveLazySingleton {
    private static NaiveLazySingleton instance;

    private NaiveLazySingleton() {
        System.out.println("NaiveLazySingleton");
    }

    public static NaiveLazySingleton getInstance() {
        if (Objects.isNull(instance)) instance = new NaiveLazySingleton();
        return instance;
    }
}
