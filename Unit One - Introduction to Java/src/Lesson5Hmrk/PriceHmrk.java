package Lesson5Hmrk;

import java.util.Scanner;

public class PriceHmrk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the price of the item: ");
        double OriginalPrice=in.nextDouble();

        double discount=OriginalPrice*0.2;
        double discountprice= OriginalPrice-discount;
        double FinalPrice=discountprice*1.13;
        System.out.println("The Final Price is " + FinalPrice + "$.");
    }
}
