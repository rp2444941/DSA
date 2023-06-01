package com.rudra;

import java.util.Arrays;

public class Cyclically {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int n=a.length;
        int k=2;
        rotate(a,k,n);

    }
    static void rotate(int[] a,int k,int n){
        k=k%n;
        for (int i = 0; i <n ; i++) {
            if (i<k){
                System.out.print(a[n+i-k]+" ");
            }else{
                System.out.print(a[i-k]+" ");
            }

        }
        System.out.println();



    }
}