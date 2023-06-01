package com.rudra;

import java.util.Arrays;

public class palindrome {
    public static void main(String[] args) {
        int [] arr={1,2,3,2,1};
        int n= arr.length;
        System.out.println(palin(arr,n));

    }
    static boolean palin(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            if (arr[i]==arr[n-i-1]){
                return true;
            }
        }
        return false;

    }
}
