package com.alevel;
import java.util.Arrays;

public class InsertionSortReverse {
    public static void main(String []args){
        int[] arr = new int[] {4,3,1,2,5,6,100,0};

        for (int i = arr.length-2; i >= 0; i--){
            int current = arr[i];
            int j=i;
            while (j >= 0 && current < arr[j+1]){
                arr[j] = arr[j+1];
                j++;
            }
            arr[j]=current;
            System.out.println(Arrays.toString(arr));
        }
    }
}
