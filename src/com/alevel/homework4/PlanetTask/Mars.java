package com.alevel.homework4.PlanetTask;

public class Mars extends Planet implements Gravity{
    @Override
    public void info(){
        System.out.println("The fourth planet of the Solar System.");
        System.out.println("The year on the Mars equals 687 Eearth's days.");
        System.out.println("Mars of the Venus is: 6,39E23 кг kg.");
    }
    public double showFFA(){
        return 3.7;
    }
    public  void heat(){
        System.out.println("Mars is heating...");
    }

    @Override
    public void roll() {
        System.out.println("Mars is rolling...");;
    }
}
