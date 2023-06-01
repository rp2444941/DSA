package com.rudra;

import java.util.HashSet;

public class DuplicateNo {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,3};
        int n= arr.length;
       // System.out.println("the duplicate array is "+findDuplicate(arr,n));

    }
    /*static int findDuplicate(int[] arr,int n){
        int temp[]=new int[n+1];
        for (int i = 0; i < n; i++) {
            if (temp[arr[i]]==0){
                temp[arr[i]]+=1;
            }
            else{
                return arr[i];
            }

        }
        return 0;
    }*/
    static boolean duplicate(int [] arr, int n){
        HashSet<Integer> set=new HashSet<Integer>();
        for (int i:arr){
            if (set.contains(i)){
                return true;
            }
            else{
                set.add(i);
            }

        }
        return false;

    }
}
