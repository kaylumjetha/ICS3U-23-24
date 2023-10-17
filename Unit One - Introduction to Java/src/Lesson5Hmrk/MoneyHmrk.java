package Lesson5Hmrk;

import java.util.Scanner;

public class MoneyHmrk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an ammount of US currency: ");
        int USA = in.nextInt();

        double CAN = (double)USA*1.25;
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("$"+USA + " in US currency is $" + CAN + " Canadian dollars.");
    }
}
