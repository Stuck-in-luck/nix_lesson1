package com.alevel;

public class Main {

    public static void main(String []args){
        for (int i = 347693485;i>0;i/=10){
            int b = i%10;
            if ((b%2==0) && (b%3==0)){
                System.out.println("FizzBuzz");
            }
            else if (b%2==0){
                System.out.println("Fizz");
            }
            else if (b%3==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(b);
            }
        }
    }

}



