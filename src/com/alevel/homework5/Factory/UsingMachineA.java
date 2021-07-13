package com.alevel.homework5.Factory;

public class UsingMachineA extends Creator{
    @Override
    public Chairs factoryMethod() {
        return new KitchenChairs();
    }
}
