package Conditionals;

import java.util.Scanner;

public class AreaPerimeterGreater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length : ");
        int length = in.nextInt();
        System.out.print("Enter breadth : ");
        int breadth = in.nextInt();
        int area = (length * breadth);
        int perimeter = 2*(length+breadth);
        if(area < perimeter) {
            System.out.println("Area is greater than perimeter ");
        }
        if(perimeter < area) {
            System.out.println("Perimeter is greater than area of ");
        }
        else {
            System.out.println("perimeter and area are equal ");
        }
    }
}
