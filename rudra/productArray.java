package com.rudra;

public class productArray {
    public static void main(String[] args) {
        int [] a = {1,2,-3,0,-4,-5};
        int answer = maxProductSubArray(a);
        System.out.println(answer);
    }
    static int maxProductSubArray(int[] a){
        int l=1,r=1;
        int ans=a[0];
        for (int i = 0; i <a.length ; i++) {
            l = l == 0 ? 1 : l;
            r = r == 0 ? 1 : r;
            l*=a[i];
            r*=a[a.length-1-i];

            ans=Math.max(ans,Math.max(l,r));
        }
        return ans;
    }

}
