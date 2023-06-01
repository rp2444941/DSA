package com.rudra;
public class MinimumLenSubArr {
    public static void main(String[] args) {
        int[] arr={2,3,1,1,-1,3,4};
        int k=7;
        int n= arr.length;
        Solution(arr,k,n);
    }
    static void Solution(int[] arr,int k,int n){
        int s=-1;
        int e=-1;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int curSum=0;
            for (int j =i; j < n && (j-i+1)<min; j++) {
                curSum+=arr[j];
                if(curSum==k){
                    s=i;
                    e=j;
                    min=e-s+1;
                    break;
                }

            }

        }
        if(s==-1 ||e==-1){
            System.out.println("No sunArray exist"+k);
            return;
        }
        System.out.print("[");
        while (s<=e){
            System.out.print(arr[s]+" ");
            s++;
        }
        System.out.println("]");

    }
}
