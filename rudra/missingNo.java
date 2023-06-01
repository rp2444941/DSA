package com.rudra;

import java.lang.reflect.Array;
import java.util.Arrays;

public class missingNo {
    static int x,y;
    public static void main(String[] args) {
        /*int[] arr={1,3,7,5,6,2};
        int n=arr.length;
        findMissing(arr,n);*/
        int arr[] = { 1, 2, 3, 5 };
        int n = arr.length;
       // getMissingNo(a,n);
       // System.out.println("Missing No:"+ x +" And the "+"Repeating No:"+ y);

        System.out.println(MissingNo(arr,n));



    }
   // public static void findMissing(int[] arr,int N){
       /* int i;
        int[] temp =new int[N+1];
        for ( i = 0; i <=N ; i++) {
            temp[i]=0;

        }
        for ( i = 0; i < N; i++) {
            temp[arr[i]-1]=1;

        }
        int ans=0;
        for ( i = 0; i <=N; i++) {
            if (temp[i]==0){
                ans=i+1;
            }

        }
        System.out.println(ans);*/
       /* static void getMissingNo(int a[], int n) {
            int xor;
            int set_bit_no;
             x=0;
             y=0;
            xor=a[0];
            for (int i = 1; i <n ; i++) {
                xor= xor^a[i];

            }
            for (int i = 1; i <=n ; i++) {
                xor= xor^i;

            }
            set_bit_no=xor&~(xor-1);
            for (int i = 0; i <n; i++) {
                if ((a[i]&set_bit_no)!=0)
                    x=x^a[i];
                else
                    y=y^a[i];

            }
            for (int i = 1; i <=n; i++) {
                if ((i&set_bit_no)!=0)
                    y=y^i;
                else
                    y=y^i;
            }
        }*/

    public static int MissingNo(int [] arr, int n){
        int sum=((n+1)*(n+2))/2;
        for (int i = 0; i <n; i++)
            sum-=arr[i];

        return sum;
    }
}
