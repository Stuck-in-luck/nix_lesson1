package com.alevel.homework5.Factory;

public class UsingMachineB extends Creator{
    @Override
    public Chairs factoryMethod() {
        return new OfficeChairs();
    }
}
