package com.alevel.homework5.Adapter;

/****Adapter pattern***
 Using the AdapterJavatoDatabase class, we are able to redefine methods in the implemented interface "Database"
for methods of the parent class "JavaApllication*/


public class Main {
    public static void main(String[] args) {

        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }

}
