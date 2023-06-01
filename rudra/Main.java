package com.rudra;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr={8,10,5,7,9};
      int ans=  maxElement(arr);
        System.out.println(ans);

    }
    static int maxElement(int[] arr) {
       /* int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }

        }


        return max;



    }*/
        Arrays.sort(arr);

        return arr[arr.length - 1];
    }
}
