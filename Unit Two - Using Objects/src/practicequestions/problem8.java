package practicequestions;
import java.util.Scanner;
public class problem8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Please enter the first string: ");
        String x = in.next();
        System.out.println(" ");
        
        System.out.print("Please enter the second string: ");
        String y = in.next();
        System.out.println(" ");

        System.out.println("The two strings combined is " + x+y);
        in.close();

    }
}
