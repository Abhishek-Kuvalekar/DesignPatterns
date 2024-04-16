package com.example.singleton;

public class BillPughSingleton {
    private BillPughSingleton() {
        System.out.println("BillPughSingleton");
    }

    public static BillPughSingleton getInstance() {
        return BillPughSingletonHelper.instance;
    }

    private static class BillPughSingletonHelper {
        public static BillPughSingleton instance = new BillPughSingleton();
    }
}
