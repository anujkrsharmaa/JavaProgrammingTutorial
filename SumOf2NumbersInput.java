package javaInput;
import java.util.Scanner;
public class SumOf2NumbersInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        double first = sc.nextDouble();
        System.out.print("Enter the Second number: ");
        double second = sc.nextDouble();
        double sum = first + second;
        System.out.println("The sum of the numbers is: " + sum);
    }
}
// Taking input // SUM of 2 given numbers HW

//package javaInput;
//import java.util.Scanner;
//public class SumOf2NumbersInput {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = 2;
//        int y = 3;
//        System.out.print("Enter 1st number:");
//        x = sc.nextInt();
//        System.out.print("Enter 2nd number:");
//        y = sc.nextInt();
//        int m = x * y;
//        System.out.println("The sum of : " + m);
//    }
//}
