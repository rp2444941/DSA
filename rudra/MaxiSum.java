package com.rudra;

public class MaxiSum {
    public static void main(String[] args) {
        int[] a={5,-4,-2,6,-1};
        int ans=MaxSumArray(a);
        System.out.println(ans);


    }
    static int MaxSumArray(int[] a){
        int MaxSum=0;
        int CurrentSum=0;
        for (int i = 0; i <a.length ; i++) {
            CurrentSum=CurrentSum+a[i];
            if (CurrentSum>MaxSum){
                MaxSum=CurrentSum;
            }
            if (CurrentSum<0){
                CurrentSum=0;
            }

        }
        return MaxSum;


    }
}
