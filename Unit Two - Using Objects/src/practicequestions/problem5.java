package practicequestions;
import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(" ");
        //
        System.out.print("Please enter your first string: ");
        String x = in.next();
        System.out.println(" ");

        System.out.print("Please enter your second string: ");
        String y=in.next();
        System.out.println(" ");

        System.out.println("It is " + x.equals(y) + " that these strings are equal.");




    }
}
