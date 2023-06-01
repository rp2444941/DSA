package com.rudra;

import java.util.HashSet;

public class ZeroSumArrays {
    public static void main(String[] args) {
        int[] arr={4,2,-3,1,6};
        System.out.println(subArray(arr));

    }
    static Boolean subArray(int[] arr){
        // creates empty hashset
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        // traverse
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            // current element is 0;
            // sum of elements from 0 to i is 0
            //sum already present in hash set
            if (arr[i]==0 || sum==0 ||set.contains(sum))
                return true;

            set.add(sum);

        }
        return false;

    }
}
