package javaInput;
import java.util.Scanner;
public class findRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend : ");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor : ");
        int divisor = sc.nextInt();
        int remainder = dividend / divisor;
        int sum = dividend - divisor * remainder;
        System.out.println("The remainder of the number is: " +sum);
    }
}
