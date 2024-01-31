package com.cs673.assignment1.q6;

import java.util.Scanner;

/*
    This program asks the user to input a year then determines if that year is a leap year
*/
public class Question6 {
    public static void main(String[] args) {
        //get user input
        System.out.print("Input a year and press enter to determine if it is a leap year: ");
        Scanner scanner = new Scanner(System.in);

        //if input is valid, leap years are divisible by 4 and not 100 OR divisible by 400
        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.printf("The year %d %s a leap year.", year, (isLeapYear ? "is" : "is not"));
        } else {
            System.out.println("You must enter a valid numeric year value.");
        }
    }
}
