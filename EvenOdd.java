package Conditionals;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =  in.nextInt();
        if(n % 2 == 0) {
            System.out.print("The number even : " +n);
        }
        if(n % 2 != 0) {
            System.out.println("The number odd : " +n);
        }
    }
}