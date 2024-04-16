package com.example.singleton;

import java.util.function.Function;

public class SingletonTester {

    public static void main(String[] args) {
        Thread thread;
        int limit = 100;

        for (int i = 0; i < limit; ++i) {
            thread = new Thread(() -> NaiveSingleton.getInstance());
            thread.start();
        }

        for (int i = 0; i < limit; ++i) {
            thread = new Thread(() -> NaiveLazySingleton.getInstance());
            thread.start();
        }

        for (int i = 0; i < limit; ++i) {
            thread = new Thread(() -> ThreadSafeSingleton.getInstance());
            thread.start();
        }

        for (int i = 0; i < limit; ++i) {
            thread = new Thread(() -> BillPughSingleton.getInstance());
            thread.start();
        }

        for (int i = 0; i < limit; ++i) {
            thread = new Thread(() -> EnumSingleton.getInstance());
            thread.start();
        }
    }
}
