package com.rudra;

public class subArraySum {
    public static void main(String[] args) {
        int[] arr={15,2,4,8,9,5,10,23};
        int n= arr.length;
        int sum=23;
        System.out.println(subArray(arr,sum,n));

    }
    static int subArray(int[] arr,int sum,int n){
        int curSum=0;
        int start=0;
        for (int i = 0; i <n ; i++) {
           while(curSum> sum && start<i-1){
               curSum=curSum-arr[start];
               start++;
           }
           if (curSum==sum){
               int p=i-1;
               System.out.println("Sum between index "+start+" and "+p);
              return 1;
           }
           if (i<n){
               curSum=curSum+arr[i];
           }

        }
        return 0;
    }
}
