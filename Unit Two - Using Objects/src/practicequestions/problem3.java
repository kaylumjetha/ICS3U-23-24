package practicequestions;
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        double x = in.nextDouble();

        System.out.println("The square root of your number is: " + Math.sqrt(x));
    }
}
