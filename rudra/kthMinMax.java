package com.rudra;

import java.util.Arrays;
import java.util.PriorityQueue;

public class kthMinMax {
    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15};
        int k= 3;
        System.out.println(kthMin(arr,k));

    }
    static int kthMin(int[] arr,int k){
//        Arrays.sort(arr);
//        return arr[k-1];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);

        }
        for (int i = k; i <arr.length ; i++) {
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }

        }
        return pq.peek();
    }
}
