package com.rudra;

public class RotateByk {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int n = a.length;
        //method 1
      /*  rotate(a,2,n);
        for (int i = 0; i <n ; i++) {
            System.out.print(a[i]+" ");

        }*/
        //method 2
        int k = 2;
        rotate(a, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");

        }

    }
    //method 1
   /* static void rotate(int[] a,int k,int n){
        if(n==0) return;
        k=k%n;
        if(k>n){
            return;
        }
        int[] temp=new int[k];
        for (int i = n-k; i <n ; i++) {
            temp[i-n+k]=a[i];
        }
        for (int i = n-k-1; i >=0 ; i--) {
            a[i+k]=a[i];

        }
        for (int i = 0; i < k; i++) {
           a[i]=temp[i];

        }

    }*/

    //function to reverse
    static void Reverse(int[] a, int start, int end) {
        while(start<=end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    static void rotate(int[] a,int n,int k){
        Reverse(a,0,n-k-1);
        Reverse(a,n-k,n-1);
        Reverse(a,0,n-1);




    }

}
