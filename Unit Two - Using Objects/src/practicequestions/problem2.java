package practicequestions;
import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        System.out.print("Please enter a number: ");
        double number = in.nextDouble();
        System.out.println("");
        System.out.println("Your number to the power of 2 is: " + Math.pow(number,2));
        
    }
}
