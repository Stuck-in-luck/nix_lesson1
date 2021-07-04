package com.alevel;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String []args){
        int[] arr = new int[] {5,3,1,2,5,6,7,0};

        for (int i = 1; i <arr.length; i++){
            int current = arr[i];
            int j=i;
            while (j > 0 && arr[j-1] > current){
                arr[j] = arr[j-1];
                j--;

            }
            arr[j] = current;
            System.out.println(Arrays.toString(arr));
        }
    }
}
