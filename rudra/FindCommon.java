package com.rudra;

import java.util.HashSet;

public class FindCommon {
    public static void main(String[] args) {
        int a1[] = { 1, 5, 10, 20, 40, 80 };
        int a2[] = { 6, 7, 20, 80, 100 };
        int a3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
        System.out.println("Common Elements are ");
        findCommon(a1, a2, a3);


    }
    static void findCommon(int[]a1,int[]a2,int[]a3){
        // three sets to maintain frequency of elements
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for (int i = 0; i <a1.length ; i++) {
            set.add(a1[i]);
        }
        for (int i = 0; i <a2.length; i++) {
            set2.add(a2[i]);

        }
        // checking if elements of 3rd array are present in
        // first 2 sets
        for (int i = 0; i < a3.length ; i++) {
            if (set.contains(a3[i]) && set2.contains(a3[i])){
                // using a 3rd set to prevent duplicates
                if (set3.contains(a3[i])==false){
                    System.out.print(a3[i]+" ");
                    set3.add(a3[i]);
                }
            }

        }


    }

}
