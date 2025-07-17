package Conditionals;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = in.nextInt();
        if (year % 4 == 0) {
            System.out.print("The number is leap year : " +year);
        }
        else {
            System.out.println("The number is not leap year : " +year);
        }
    }
}