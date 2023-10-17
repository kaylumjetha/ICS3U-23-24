package stringproblems;
import java.util.Scanner;
public class problem15 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("Pleae enter the first string: "); 
    String a =in.next();
    System.out.println("");
    System.out.print("Please enter the second string: ");
    String b=in.next();
    System.out.println(" ");
        //
    int bLenght=b.length();
        //
    String results = a.substring(1)+b.substring(0,bLenght-1);
        //
    System.out.println("Your inputs combined minus the first and last characters is" );
    System.out.println(results);
    }
}
