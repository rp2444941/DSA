package com.rudra;

import java.util.Arrays;

public class Rearrange1 {
    public static void main(String[] args) {
        //Another Approach (Swap elements in Array) : Using cyclic sort
        int a[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        //int n= a.length;
        rearrange(a);
        System.out.println(Arrays.toString(a));

    }
    static void rearrange(int [] a){
        int j=0;
        int n=a.length;
        for (int i = 0; i <n; i++) {
            //2) If arr[i] >= 0 && arr[i] != i, put arr[i] at i ( swap arr[i] with arr[arr[i]])
            if (a[i]<0 ){
                if(a[i]!=a[j]) {
                    int element = a[i];
                    a[i] = a[j];
                    a[j] = element;
                }
                j++;
            }

        }

    }
}
