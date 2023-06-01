package com.rudra;

import java.math.BigInteger;
import  java.util.Scanner;

public class BigFactorial {
    static BigInteger factorail(int N){
        BigInteger f=new BigInteger("1");
        //multiply f with 2,3,....N
        for (int i = 2; i <=N ; i++)
            f=f.multiply(BigInteger.valueOf(i));
        return f;

    }
    public static void main(String[] args)  {
        int N=20;
        System.out.println(factorail(N));
    }

}
