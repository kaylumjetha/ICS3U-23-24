package Lesson5;

import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        System.out.print("Please Enter a Number: ");
        int x = in.nextInt();

        System.out.println(x);

        System.out.print("Please enter a decimal: ");
        double y = in.nextDouble();

        System.out.println(y);
    }
}
