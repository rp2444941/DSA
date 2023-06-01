package com.rudra;

import java.util.Arrays;

public class LeaderElements {
    public static void main(String[] args) {
       //  LeaderElements lead=new LeaderElements();
        int[] arr={16,17,4,3,5,2};
        int n= arr.length;
       GetLeader(arr,n);


    }
    static void GetLeader(int[] arr,int n){
       // method 1

       /* for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == n)
                System.out.print(arr[i] + " ");


        }*/
        // Method 2
        int max_Right=arr[n-1];
        System.out.print(max_Right+" ");
        for (int i = n-1; i >=0 ; i--) {
            if (max_Right<arr[i]){
                max_Right=arr[i];
                System.out.print(max_Right+" ");
            }

        }
    }
}
