package com.rudra;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr={1,0,2,2,0,2,0,1};
        Sort(arr);
       // print(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Sort(int[] arr){
        int i=0;
        int j=0;
        int k= arr.length-1;
        while(i<=k){
            if (arr[i]==0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else if (arr[i]==1){
                i++;
            }
            else if (arr[i]==2){
                swap(arr,i,k);
                k--;
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index"+i+"and index"+j);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    /*static void print(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }*/
}
