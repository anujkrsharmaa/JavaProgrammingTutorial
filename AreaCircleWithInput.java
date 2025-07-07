package javaInput;
import java.util.Scanner;
public class AreaCircleWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int radius;
        radius = sc.nextInt();
        double pi = 3.14159;
        double area = pi * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
}
