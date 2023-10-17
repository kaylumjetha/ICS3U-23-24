package Lesson5Hmrk;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // 
    System.out.print("Please enter the lenght of side 1: ");
    double SideOne = in.nextDouble();
    System.out.println("");
    System.out.print("Please enter the lenght of side 2: ");
    double SideTwo = in.nextDouble();

    double SideThree = (SideOne*SideOne)+(SideTwo*SideTwo);
    double SideThreeReal = SideThree*SideThree;
    System.out.println("");
    System.out.println("The length of the final side is " + SideThreeReal + " units.");
    }
}
