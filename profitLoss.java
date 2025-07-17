package Conditionals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("Enter cost price : ");
        int cp = in.nextInt();
        System.out.print("Enter selling price : ");
        int sp = in.nextInt();
        if(sp > cp){
            System.out.print("Your profit is : ");
            int profit = sp - cp;
            System.out.println(profit);
        }
        else{
            System.out.println("Your loss is : ");
            int loss = cp - sp;
            System.out.println(loss);
        }
    }
}
