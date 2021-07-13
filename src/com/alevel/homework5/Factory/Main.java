package com.alevel.homework5.Factory;

public class Main {
    public static void main(String[] args) {
        Creator[] creators  = {new UsingMachineA(),new UsingMachineB()};
        for (Creator creator : creators) {
            Chairs chairs  = creator.factoryMethod();
            System.out.printf("Created (%s)\n",chairs.getClass());
        }
    }
}
