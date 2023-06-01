package com.rudra;

public class MaxProduct {
    public static void main(String[] args) {
        int [] arr = {1,2,-3,0,-4,-5};
      int res= maxProductSubArray(arr);
        System.out.println(res);
    }
    static int maxProductSubArray(int [] arr) {
        int l=1,r=1;
        int ans=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            l = (l == 0) ? 1 : l;
            r = (r == 0) ? 1 : r;
            l*=arr[i];
            r*=arr[arr.length-i-1];
           ans=Math.max(ans,Math.max(l,r));
        }
        return ans;

    }
}
