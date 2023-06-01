package com.rudra;

public class peakElement {
    public static void main(String[] args) {
        int[] arr={15,20,25,35,45,50,60};
        Integer peak=GetPeakElement(arr);
        System.out.println(peak!=null ? "Peak element is "+ peak:"No peak element");

    }
    public static Integer GetPeakElement(int[] arr){
        if (arr==null || arr.length==0){
            return null;
        }
        int n= arr.length;
       int start=0;
       int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (mid==0 || arr[mid-1]<=arr[mid] && (mid==n-1 || arr[mid]>=arr[mid+1])){
                return arr[mid];
            }
            else if (mid>0 && arr[mid-1]>arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return null;

    }
}
