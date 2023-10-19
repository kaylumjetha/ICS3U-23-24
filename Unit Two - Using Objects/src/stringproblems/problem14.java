package stringproblems;
import java.util.Scanner;
public class problem14 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Please enter the first String: ");
        String hi = in.next();
        System.out.println(" ");
        System.out.print("Please enter the second String: ");
        String bye = in.next();
        System.out.println(" ");

        int byeLenght=bye.length();

        String results = hi.substring(0,1)+bye.substring(byeLenght-1);
        System.out.println("The first character and the last character of your inputs are: " + results);
        in.close();
    }
}
