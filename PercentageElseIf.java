package Conditionals;

import java.util.Scanner;

public class PercentageElseIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter percentage : ");
       int n = in.nextInt();
       if(n>90){
           System.out.println("Excellent");
       }
       else if(n>80){
           System.out.println("Very good");
       }
       else if(n>70){
           System.out.println("Good");
       }
       else if(n>60){
           System.out.println("Can do better");
       }
       else if(n>50){
           System.out.println("Average Marks");
       }
       else if(n>40){
           System.out.println("Below average");
       }
       else {
           System.out.println("Fail");
       }
    }
}
