package com.alevel.homework5.Singleton;

public final class SingleTon {
    private static SingleTon instance;
    private SingleTon(){}

    public static SingleTon getInstance(){
    if (instance == null) {
        SingleTon instance = new SingleTon();
        System.out.println("New instance created");
    }
        return instance;

    }
}
