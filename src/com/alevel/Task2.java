package com.alevel;

public class Task2 {
    public static void main(String[] args) {
        long b1 = 1231234534345123123l;
        System.out.println(Long.toBinaryString(b1));
        String s1 = Long.toBinaryString(b1);
        int count=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '1') {
                count++;
                System.out.println("numOf1 =" + count);
            }
        }



    }

}
