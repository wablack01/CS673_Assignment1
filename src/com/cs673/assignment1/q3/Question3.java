package com.cs673.assignment1.q3;

import java.util.Scanner;
/*
    This program prompts the user to enter a string and determines if the string is a palindrome.
    If the user enters q the program exits.
*/
public class Question3 {
    public static void main(String[] args) {
        //get user input and change to lower case
        System.out.print("Type in a string a press enter to test if the string is a palindrome: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();

        //exit if user enters q
        if (str.equals("q")) {System.exit(0);}

        //pointers at start and end of string
        int ptr1 = 0;
        int ptr2 = str.length() - 1;
        boolean isPalindrome = true;

        //compare characters then increment and decrement pointers
        while (ptr1 <= ptr2 && isPalindrome) {
            if (str.charAt(ptr1) != str.charAt(ptr2)) {isPalindrome = false;}
            ptr1++;
            ptr2--;
        }

        System.out.printf("The string %s %s a palindrome", str, (isPalindrome ? "is" : "is not"));
    }
}
