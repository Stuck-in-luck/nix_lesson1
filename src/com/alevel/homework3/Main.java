package com.alevel;




public class Main {


    public static void main (String[]args){
        StringArray array = new StringArray("1","2","qqqq");
        System.out.println(array.getArray());
        array.sortASC(array);
        System.out.println(array.getArray());
        }
    }






