package com.rudra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class longestSequence {
    public static void main(String[] args) {
     /*   Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=scn.nextInt();

        }
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int val: arr) {
            map.put(val, true);
        }
        for (int val: arr) {
            if (map.containsKey(val - 1)) {
                map.put(val, false);
            }
        }
        int msp = 0;
        int ml = 0;
        for (int val: arr) {
            if (map.get(val) == true) {
                int tl = 1;
                int tsp = val;
                while (map.containsKey(tsp + tl)) {
                    tl++;
                }
                if (tl > ml) {
                    msp = tsp;
                    ml = tl;
                }
            }
        }
        for (int i = 0; i < ml; i++) {
            System.out.println(msp + i);

        }*/

        int[] nums={1,9,3,10,4,20,2};
        int ans=longestConsecutive(nums);
        System.out.println(ans);

    }
    public static int longestConsecutive(int[] nums) {
        HashSet < Integer > set = new HashSet < Integer > ();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int num:nums){
            if (!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longest = Math.max(longest, currentStreak);
            }

        }
        return longest;
    }

}

