package com.rudra;

import java.util.Arrays;

public class ZeroToEnd {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,4,0};
       ZeroEnd(arr);

    }
    static void ZeroEnd(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];
        int k=0;
        for (int i = 0; i <n ; i++) {
            if (arr[i]!=0){
                temp[k]=arr[i];
                k++;

            }

        }
        while (k<n){
            temp[k]=0;
            k++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+" ");

        }

    }
}
