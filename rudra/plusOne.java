package com.rudra;

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] dig={1,2,3};
        int n=dig.length;
        System.out.println(Arrays.toString(solution(dig,n)));
    }
    static int[] solution(int[] dig,int n){
        for (int i = n-1; i >=0; i--) {
            if(dig[i]!=9){
                dig[i]++;
                break;
            }
            else {
                dig[i]=0;
            }

        }
        if (dig[0]==0){
            int[] res=new int[n+1];
            res[0]=1;
            return res;
        }
        return dig;

    }
}
