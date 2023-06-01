package com.rudra;

public class CountInversion {
    public static void main(String[] args) {
        long[] arr={1,3,5,10,2,6,8,9};
        int n= arr.length;
        System.out.println( getInversions(arr,n));


      // int ans= Count(arr,n);
       // System.out.println(ans);

    }
    //Brute force methode
   /* static int Count(int[] arr, int n){
        int cnt=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i]>arr[j]){
                    cnt++;
                }

            }

        }
        return cnt;
    }*/
    static long merge(long[] arr,int left,int mid,int right){
        int i=left;
        int j=mid;
        int k=0;
        long invCount=0;
        long[] temp=new long[(right-left+1)];
        while ((i<mid) && (j<=right)){
            if (arr[i]<=arr[j]){
                temp[k]=arr[i];
                ++k;
                ++i;
            }
            else {
                temp[k]=arr[j];
                invCount+=(mid-i);
                ++k;
                ++j;
            }
        }
        while (i<mid){
            temp[k]=arr[i];
            ++k;
            ++i;

        }
        while (j<=right){
            temp[k]=arr[j];
            ++k;
            ++j;
        }
        for ( i = left, k=0;i<=right; i++,k++) {
            arr[i]=temp[k];

        }
        return invCount;
    }

    static long mergeSort(long[] arr,int left,int right){
        long invCount=0;
        if (right>left){
            int mid=(right+left)/2;
            invCount=mergeSort(arr,left,mid);
            invCount+=mergeSort(arr,mid+1,right);
            invCount+=merge(arr,left,mid+1,right);
        }
        return invCount;
    }
    static long getInversions(long[] arr,int n){

        return mergeSort(arr,0,n-1);
    }

}
