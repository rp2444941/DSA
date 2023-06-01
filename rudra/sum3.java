package com.rudra;

import java.util.ArrayList;

public class sum3 {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        ArrayList <ArrayList< Integer >> ans;
        ans = threeSum(arr);
        System.out.println("The triplets are as follows: ");
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
       private   static ArrayList<ArrayList<Integer>> threeSum(int[] arr) {
             ArrayList < ArrayList < Integer >> ans = new ArrayList < > ();
             int i,j,k;
             for ( i = 0; i < arr.length - 2; i++) {
                 for ( j = i+1; j <arr.length - 1 ; j++) {
                     for (k = j+1; k < arr.length ; k++) {
                         ArrayList < Integer > temp = new ArrayList < > ();
                         if (arr[i]+arr[j]+arr[k]==0){
                             temp.add(arr[i]);
                             temp.add(arr[j]);
                             temp.add(arr[k]);
                         }
                         if(temp.size()!=0)
                             ans.add(temp);
                     }

                 }


             }
           return ans;

       }

    }

