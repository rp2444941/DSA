package com.rudra;
import java.io.*;
import java.util.*;

import  java.util.*;

public class SubArray {
    //Kadane's Algorithm
    public static int solution(int[] arr) {


        int csum = arr[0];
        int maxSum = arr[0];


        for (int i = 1; i < arr.length; i++)
        {
            if (csum < 0)
            {
                csum = arr[i];
            }
            else
            {
                csum = csum + arr[i];
            }
            if (maxSum < csum)
            {
                maxSum = csum;
            }
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println( solution(arr));


    }
}


