package Conditionals;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        if(n % 5 == 0) {
            System.out.print("The number you entered is divisible by 5 : " +n);
        }
        else {
            System.out.println("Not divisible by 5 : " +n);
        }
    }
}
