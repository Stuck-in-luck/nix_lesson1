package com.alevel;

public class ArrayNumbering {
    public static void main(String[] args) {

        String[] arr = new String[] { "кот", "пес", "слон", "утка", "удав" };

        arrayNumbering(arr);

    }

    public static void arrayNumbering (String[] array){

        for (int i=0;i<array.length;i++){

            System.out.print(((i > 0) ? ", " : "")+(i+1)+":" + array[i]);

        }

    }
}
