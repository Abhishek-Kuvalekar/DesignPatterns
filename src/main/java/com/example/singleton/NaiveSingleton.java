package com.example.singleton;

public class NaiveSingleton {
    private static NaiveSingleton instance = new NaiveSingleton();

    private NaiveSingleton() {
        System.out.println("NaiveSingleton");
    }

    public static NaiveSingleton getInstance() {
        return instance;
    }
}
