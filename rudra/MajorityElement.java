package com.rudra;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 2,6,2,2,6,2,2,8,2,1 };


        // Function calling
      int ans=FindMajority(arr);
        System.out.println(ans);

    }
    static int FindMajority(int[] arr){
        /*int maxCount=0;
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    index = i;
                }

            }
            if (maxCount > arr.length / 2){
                return arr[index];
            }

        }
        return -1;*/



        // sorting method


       /* HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                int count=map.get(arr[i])+1;
                if(count> arr.length/2){
                    System.out.println("Majority found:-");
                    return arr[i];
                }
                else
                    map.put(arr[i],count);


            }
            else
                map.put(arr[i],1);

        }
        return 0;*/
        int ansIdx=0;
        int count=1;
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]==arr[ansIdx]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ansIdx=i;
                count=1;
            }
        }
        return ansIdx;
    }

}
