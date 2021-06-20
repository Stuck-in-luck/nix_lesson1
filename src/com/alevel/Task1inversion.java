package com.alevel;


public class Task1inversion {
    private static int inverse(int value) {
        int result = 0;
        while(value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }

    private static void print(int value) {
        for (int i = inverse(value);i>0;i/=10){
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

    public static void main(String[] args) {

        print(347693485);

    }
}



