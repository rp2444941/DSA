package com.rudra;

import java.util.Arrays;

public class MinDiff {
    public static void main(String[] args) {
        int[] arr={7,4,8,8,8,9};
        int k=6;
        int ans=getMinDiff(arr, arr.length, k);
        System.out.println(ans);

    }
    static int getMinDiff(int[] arr,int n,int k){
        Arrays.sort(arr);
        int minHeight=arr[0];
        int maxHeight=arr[n-1];
        int ans=arr[n-1]-arr[0];

        for (int i = 1; i <n ; i++) {
            if (arr[i]-k<0)
                continue;

            minHeight=Math.min(arr[0]+k,arr[i]-k);

            maxHeight=Math.max(arr[i-1]+k,arr[n-1]-k);
            ans=Math.min(ans,maxHeight-minHeight);

        }
        return ans;
    }
}
