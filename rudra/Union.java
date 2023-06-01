package com.rudra;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] a={7,1,5,2,3,6};
        int[] b={3,8,6,20,7};
        int n= a.length-1;
        int m= b.length-1;

        UnionElement(a,n,b,m);

    }
    static void UnionElement(int[] a,int n,int[] b,int m){
       HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < n; i++)
            set.add(a[i]);
            for (int j = 0; j <m ; j++)
                set.add(b[j]);
              //  System.out.println("Number of element after union "+set.size());
              //  System.out.println("the union set of Both  array is ");
                System.out.println(set.toString()+"");





    }
}
