package com.rudra;

public class MaxiProduct {
    public static void main(String[] args) {
        int[] arr = { 1, -2, -3, 0, 7, -8, -2 };
        int n= arr.length;
        System.out.println(maxProduct(arr,n));

    }
    static int maxProduct(int[] arr, int n){
        int max_ending=arr[0];
        int min_ending=arr[0];
        int max_so_far=arr[0];
        for (int i = 1; i <n ; i++) {
            int temp=Math.max(Math.max(arr[i],arr[i]*max_ending),arr[i]*min_ending);
            min_ending=Math.min(Math.min(arr[i],arr[i]*max_ending),arr[i]*min_ending);
            max_ending=temp;
            max_so_far=Math.max(max_so_far,max_ending);

        }
        return max_so_far;

    }

}
