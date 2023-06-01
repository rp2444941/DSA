package com.rudra;

public class SecondLarge {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,7,5};
        int ans=element(arr);
        System.out.println(ans);

    }
    static int element(int[] arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if (arr[i]>second && arr[i]!=first){
                second=arr[i];
            }

        }
        return second;
    }
}
