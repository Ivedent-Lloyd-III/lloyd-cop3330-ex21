package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 21
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution<month> {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String outputMonth = outputFunction();

        System.out.println("The name of the month is "+outputMonth+".");

    }

    private static int inputMonth() {

        System.out.println("Please enter the number of the month: ");
        int inputMonth = in.nextInt();

        return inputMonth;

    }

    private static String outputFunction() {

        int month = inputMonth();

        switch(month){

            case 1 :
                return "January";

            case 2 :
                return "February";

            case 3 :
                return "March";

            case 4 :
                return "April";

            case 5 :
                return "May";

            case 6 :
                return "June";

            case 7 :
                return "July";

            case 8 :
                return "August";

            case 9 :
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";

        }
        return null;
    }
}



