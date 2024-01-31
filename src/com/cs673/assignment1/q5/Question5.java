package com.cs673.assignment1.q5;

import java.math.BigInteger;

/*
    This program calculates the first 100 fibonacci numbers and displays the results
*/
public class Question5 {
    public static void main(String[] args) {
        //use BigInteger to avoid overflow
        BigInteger[] fibs = new BigInteger[100];
        fibs[0] = BigInteger.valueOf(1);
        fibs[1] = BigInteger.valueOf(1);
        for (int i = 2; i < 100; i++) {
            fibs[i] = fibs[i-1].add(fibs[i-2]);
        }

        //display results
        for (BigInteger fib : fibs) {System.out.println(fib);}
    }
}