package com.rudra;

import java.util.Arrays;

public class MinimiseHeight {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 8, 8, 9 };
        int k = 6;
        int ans = getMinDiff(arr, arr.length, k);
        System.out.println(ans);
    }
    static int getMinDiff(int[] arr,int n,int k){
        Arrays.sort(arr);
        //max initial height
        int ans=arr[n-1]-arr[0];
        int tempMin=arr[0];
        int tempMax=arr[n-1];
        for (int i = 1; i <n; i++) {
            if (arr[i]-k<0)
                continue;
                tempMin=Math.min(arr[0]+k,arr[i]-k);
                tempMax=Math.max(arr[i-1]+k,arr[n-1]-k);
               ans=Math.min(ans,tempMax-tempMin);


        }
        return ans;

    }
}
