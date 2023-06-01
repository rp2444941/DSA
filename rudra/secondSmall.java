package com.rudra;

public class secondSmall {
    public static void main(String[] args) {
        int [] arr={1,2,4,7,7,5};
        SecondElement(arr);



    }
    static void SecondElement(int[] arr){
        if (arr.length<2){
            System.out.println("-1"+" ");
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            small=Math.min(small,arr[i]);
            large=Math.max(large, arr[i]);

        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<second_small && arr[i]!=small){
                second_small=arr[i];
            }
            else if (arr[i]>second_large &&arr[i]!=large){
                second_large=arr[i];
            }

        }
        System.out.println("second small is: "+second_small);
        System.out.println("Second large is: "+second_large);

    }
}
