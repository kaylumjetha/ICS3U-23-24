package Lesson5Hmrk;

import java.util.Scanner;

public class TemperatureHmrk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter a Temperature in F: ");
        int f = in.nextInt();

        double c = ((double)f-32)*5/9;
        System.out.println("    ");
        System.out.println("    ");
        System.out.println(f + " degrees F to C is " + c);
    }
}   
