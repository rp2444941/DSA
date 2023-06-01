package com.rudra;

import java.util.Arrays;
import java.util.*;

public class Rearrange {
    public static void main(String[] args) {
        int a[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
     //  int  n = a.length;
      // RearrangeArray(a,n);
       // System.out.println(Arrays.toString(RearrangeArray(a)));
        RearrangeArray(a);
        System.out.println(Arrays.toString(a));


    }
   /* static void RearrangeArray(int[] a,int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i==a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                    break;

                }

            }

        }
        for (int i = 0; i < n; i++) {
            if (a[i]!=i){
                a[i]=-1;
            }

        }
        System.out.println("After array rearrange");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");

        }
    }*/

   // static int[] RearrangeArray(int[] a){
       /* for (int i = 0; i < a.length; i++) {
            if (a[i]!=-1 && a[i]!=i){
                int x=a[i];
                while(a[x]!=-1 && a[x]!=x){
                    int y=a[x];
                    a[x]=x;
                    x=y;
                }
                a[x]=x;
                if (a[i]!=i){
                    a[i]=-1;
                }

            }

        }
        return a;*/

        /*Set<Integer> s = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
           if (s.contains(i)){
               a[i]=i;
           }
           else {
               a[i]=-1;
           }

        }
        return a;*/
        static void RearrangeArray(int[] a){
        int i=0;
        int j=a.length;
        while(a[i]<0 && i<j){
            i++;
        }
       while(a[i]>0 && i<j){
            j--;
        }
        if (i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;



        }
    }
}
