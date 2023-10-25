package practicequestions;
import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        
        String x = "Waterbottle";

        Scanner in=new Scanner (System.in);
        System.out.println("The word is Waterbottle");
        System.out.print("Please enter a starting index between 1-10: ");
        int s1 = in.nextInt();
        System.out.println(" ");

        System.out.print("Please enter an ending index between 1-10: ");
        int s2 = in.nextInt();
        System.out.println(" ");

        System.out.println("The result is " + x.substring(s1-1,s2-1));

    }
}
