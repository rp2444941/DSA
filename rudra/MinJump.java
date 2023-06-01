package com.rudra;

import java.util.ArrayDeque;

public class MinJump {
    public static class pair{
        int i;
        int s;
        int j;
        String psf;
        pair(int i,int s,int j ){
            this.i=i;
            this.s=s;
            this.j=j;
            this.psf=psf;
        }

    }
    public static void main(String[] args) {

    }
    static void Solution(int[] arr){
        Integer[] dp=new Integer[arr.length];
        dp[arr.length-1]=0;
        for (int i = arr.length-2; i >=0 ; i--) {
            int steps=arr[i];
            int min=Integer.MIN_VALUE;
            for (int j = 1; j <=steps && i-j< arr.length; j++) {
                if (dp[i+j]!=null&&dp[i+j]<min){
                    min=dp[i+j];
                }


            }
            if (min!=Integer.MAX_VALUE) {
                dp[i] = min + 1;
            }

        }
        System.out.println(dp[0]);
        ArrayDeque<pair> queue=new ArrayDeque<>();
       // queue.add(new pair(0,arr[0],dp[0],0+""));
        while(queue.size()>0){
            pair rem=queue.removeFirst();  
        }
    }
}
