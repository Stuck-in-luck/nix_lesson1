package com.alevel.homework4.eNumTask;




public class Main {
    public static void main(String[] args) {

        for (Week week : Week.values()){
            System.out.println(week.day + " - " +week.typeOfDay);
        }
    }

}

