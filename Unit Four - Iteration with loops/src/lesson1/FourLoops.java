package lesson1;
import java.util.Scanner;
public class FourLoops {
    public static void main(String[] args) {
        // exampleOne();

        // exampleTwo("This is the best day ever!");
        // System.out.println(numE);

        int answer = exampleThree();
    }

    private static int exampleThree() {
        System.out.println("Please enter a number [1-10]");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        for(;number<1 || number>10;){
        System.out.println("Please enter a number [1-10]");
        number = in.nextInt();
        }
        return number;
    }

    private static int exampleTwo(String str) {
        // count number of E's
        int numE = 0;
        
        for (int index=0; index < str.length(); index++){
            String letter=str.substring(index, index+1);

            if (letter.equals("E")||letter.equals("e"))
                numE++;
        }

        return numE;
    }

    private static void exampleOne() {
        // for loop is when you what to repeat code a specific number of times 
        // the loop counts to ensure it does it that number of times
        // below, i is our counter 
        for(int i=0; i<10; i++){ // start counting at 0, until 10, count up 1
            System.out.println(i);
        }
        }
    
    }

