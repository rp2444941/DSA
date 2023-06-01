package com.rudra;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] arr={10,20,30,40,50};
        //int n= arr.length;
      // Reverse(arr,n);
       reverse(arr);
      //  System.out.println(Arrays.toString(arr));

    }
    static void reverse(Integer [] arr){
        int[] temp=new int[arr.length];
        int j= arr.length;
        for (int i = 0; i < arr.length ; i++) {
            temp[j-1]=arr[i];
            j=j-1;

        }
        for (int k  = 0; k< arr.length; k++) {
            System.out.print(temp[k]+" ");

        }

        /*Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));*/
      /*  int i=0;
        int j= arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }*/

    }
}
