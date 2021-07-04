package com.alevel.homework4.PlanetTask;

public class Earth extends Planet implements Gravity {
    @Override
    public void info(){
        System.out.println("The third nearest planet to the Sun.");
        System.out.println("The year on the Earth equals 365 days.");
        System.out.println("Weight of the Earth is: 5,972E24 kg.");
    }

    @Override
    public void lifeOnPlanet() {
        System.out.println("The only yet discovered planet with life on it.");
        System.out.println("The home of humanity.");
    }
    public double showFFA(){
        return 9.8;
    }
    public  void heat(){
        System.out.println("Earth is heating...");
    }

    @Override
    public void roll() {
        System.out.println("Earth is rolling...");;
    }
}
