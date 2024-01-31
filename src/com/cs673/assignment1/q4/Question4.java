package com.cs673.assignment1.q4;

import java.util.Scanner;

/*
    This program prompts the user to enter two lists of the same length in the
    format [a,b,c],[1,2,3]. If the input is valid and the lists are the same length
    they are combined by alternating elements from both lists. The combined list or
    an error message is displayed.
*/
public class Question4 {
    public static void main(String[] args) {
        //get user input and split the lists
        System.out.print("Input two lists of equal lengths, in the format [a,b,c],[1,2,3], then press enter: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] lists = str.split("],\\[",0);

        //should have two lists, first list starts with open bracket, last list ends with closed bracket
        if (lists.length == 2 && lists[0].charAt(0) == '[' && lists[1].charAt(lists[1].length() - 1) == ']') {

            //split lists, if length is the same combine them by alternating elements
            String[] list1 = lists[0].split(",");
            String[] list2 = lists[1].split(",");
            if (list1.length == list2.length) {
                String[] combinedList = new String[list1.length * 2];
                for (int i = 0, j=0; i < list1.length; i++) {
                    combinedList[j] = list1[i];
                    j++;
                    combinedList[j] = list2[i];
                    j++;
                }
                System.out.println(String.join(",", combinedList));
            } else {
                System.out.println("The lists are not the same size.");
            }
        } else {
            System.out.println("Invalid format. Input two lists in the format [a,b,c],[1,2,3].");
        }

    }
}
