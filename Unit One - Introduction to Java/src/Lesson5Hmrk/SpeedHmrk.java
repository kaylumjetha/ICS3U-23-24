package Lesson5Hmrk;
import java.util.Scanner;
public class SpeedHmrk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a distance in km: ");
        double distance=in.nextDouble();
        System.out.println("");
        System.out.print("Please enter a distance in hours: ");
        int time=in.nextInt();
        System.out.println("");
        double speed= distance/time;
        System.out.println("The speed is " + speed + " km/h.");
    }
}
