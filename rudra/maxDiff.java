package com.rudra;

public class maxDiff {
    public static void main(String[] args) {
        maxDiff max = new maxDiff();
        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n = arr.length;
        int maxDif = max.maxIndexDiff(arr, n);
        System.out.println(maxDif);
    }

    private static int maxIndexDiff(int[] arr, int n) {
        int maxdiff=-1;
        for (int i = 0; i <n ; i++) {
            for(int j=n-1;j>i;j--){
                if(arr[j]>arr[i] && maxdiff<(j-i))
                    maxdiff=j-i;
            }

        }
        return maxdiff;

    }
}
