package com.example.singleton;

import java.util.Objects;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        System.out.println("ThreadSafeSingleton");
    }

    public static ThreadSafeSingleton getInstance() {
        if (Objects.nonNull(instance)) return instance;
        synchronized(ThreadSafeSingleton.class) {
            if (Objects.nonNull(instance)) return instance;
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
