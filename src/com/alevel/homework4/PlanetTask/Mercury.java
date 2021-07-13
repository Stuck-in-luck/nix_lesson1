package com.alevel.homework4.PlanetTask;

public class Mercury extends Planet implements Gravity{
    @Override
    public void info(){
        System.out.println("The smallest planet in our solar system and nearest to the Sun.");
        System.out.println("The year on the Mercury equals 88 Eearth's days.");
        System.out.println("Weight of the Mercury is: 3,285E23 kg.");
    }
    public double showFFA(){
       return 3.7;
    }
    public  void heat(){
       System.out.println("Mercury is heating...");
   }

    @Override
    public void roll() {
        System.out.println("Mercury is rolling...");;
    }
}
