package com.rudra;

import java.util.ArrayList;

public class LeaderArray {
    public static void main(String[] args) {
        int arr[]=  {10, 22, 12, 3, 0, 6};
        int n = 6;
        ArrayList<Integer> ans= printLeaders(arr,n);
        System.out.println(ans);
    }
    static ArrayList<Integer> printLeaders(int[] arr, int n){
        ArrayList<Integer> ans= new ArrayList<>();
        int mfr=arr[n-1];
        ans.add(arr[n-1]);
        for (int i = n-2;i>0;i--) {
            if (arr[i]>mfr){
                ans.add(arr[i]);
                mfr=arr[i];

            }

        }
        return ans;
    }

}
