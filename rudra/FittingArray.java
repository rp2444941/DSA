package com.rudra;

import java.util.Arrays;

public class FittingArray {
    public static void main(String[] args) {
        int[] arr={7,5,3,2};
        int[] brr={5,4,8,7};
        int n= arr.length;
        if (fitting(arr,brr,n)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
    static boolean fitting(int[] arr,int[] brr,int  n){
        Arrays.sort(arr);
        Arrays.sort(brr);
        for (int i = 0; i <n ; i++) {
            if (arr[i]>brr[i]){
                return false;
            }

        }
        return true;

    }
}
