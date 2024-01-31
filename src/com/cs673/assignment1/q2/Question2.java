package com.cs673.assignment1.q2;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
    This program calculates the multiplication table for numbers 1-12.
*/
public class Question2 {
    public static void main(String[] args) {
        int[][] table = new int[12][12];

        //calculate table and avoid duplicate calculations
        for (int i = 1; i <= 12; i++) {
            for (int j = i; j <= 12; j++) {
                int val = i * j;
                table[i-1][j-1] = val;
                table[j-1][i-1] = val;
            }
        }

        //display table
        for (int[] row : table) {
            System.out.println(Arrays.toString(row));
        }
    }
}
