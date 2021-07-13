package com.alevel.homework4.PlanetTask;

public class Venus extends Planet implements Gravity {
    @Override
    public void info(){
        System.out.println("The second nearest planet to the Sun.");
        System.out.println("The year on the Venus equals 225 Eearth's days.");
        System.out.println("Weight of the Venus is: 4,867E24 kg.");
    }
    public double showFFA(){
        return 8.9;
    }
    public  void heat(){
        System.out.println("Venus is heating...");
    }

    @Override
    public void roll() {
        System.out.println("Venus is rolling...");;
    }
}
