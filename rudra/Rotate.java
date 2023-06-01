package com.rudra;

import java.util.Arrays;

public class Rotate{
    public static void main (String[] args) {
        int a[] = { 1, 2, 3, 4, 5};
        int n = a.length;
        //method 1
       // rotate(a,n);
        //method 2
      //  solve(a,n);
        rotate(a,n);
        System.out.println(Arrays.toString(a));
    }
    //method 1 tc=0(n) sc=0(n)
  /*  static void rotate(int[] a,int n){
        int[] temp=new int[n];
        for (int i = 1; i <n ; i++) {
            temp[i-1]=a[i];
        }
        temp[n-1]=a[0];
        for (int i = 0; i <n ; i++) {
            System.out.print(temp[i]+" ");

        }

    }*/
   /* static void solve(int[] a,int n){
        int temp=a[0];
        for (int i = 1; i < n; i++) {
            a[i]=a[i+1];
        }
        a[n-1]=temp;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");

        }
    }*/
    public static void rotate(int[] a,int n){
        int x=a[n-1];
        for (int i = n-1; i >0 ; i--) {
            a[i]=a[i-1];

        }
        a[0]=x;
    }


}