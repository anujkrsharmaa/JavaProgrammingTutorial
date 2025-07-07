package Conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int n = in.nextInt();
        if(n<0){
            n = n * (-1);
        }
        System.out.println("The absolute value of "+n+" is "+(n));
    }
}
