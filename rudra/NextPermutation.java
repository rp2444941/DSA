package com.rudra;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr={2,4,1,7,5,0};
        int n=arr.length;
        NxtPerm(arr,n);

        for(int i:arr){
            System.out.print(i+" ");
        }


    }
    static void NxtPerm(int[] arr,int n){
        int j;
        for (int i = n-2; i >=0; i--) {
            if (arr[i]<arr[i+1]){
                break;
            }
            //check if pivot is found
            if (i<0){
                reverse(arr,0,n-1);
            }
            else{
                //find for the successor of pivot in suffix;
                for ( j = n-1; j >=i; j--) {
                    if (arr[j]>arr[i]){
                        break;
                    }

                }
                //swap the pivot and successor

                swap(arr,i, j);
                //Minimise the suffix part
                reverse(arr,i+1,n-1);
            }

        }
    }

    static void reverse(int[] arr, int start, int end) {
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

     static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
