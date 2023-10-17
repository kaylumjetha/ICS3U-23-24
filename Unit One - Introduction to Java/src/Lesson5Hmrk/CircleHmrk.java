package Lesson5Hmrk;

import java.util.Scanner;

public class CircleHmrk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        int radius = in.nextInt();
        double area = 3.14*radius*radius;
        double circumference = 2*3.14*radius;
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("The area of the circle is " + area + " units and the circumference of the cirlce is " + circumference + " units");
    }
}
