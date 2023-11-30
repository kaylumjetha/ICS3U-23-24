package lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
    // int number= ExampleOne(); 
    int number2= exampleTwo(1,10);
    }

    private static int exampleTwo(int min, int max) {
        int result=0;
        boolean isValid=false;
        Scanner in=new Scanner(System.in);
        while(!isValid){
            System.out.print("Please enter a number from "+min+ " to "+ max+": ");
            try{
                result=Integer.parseInt(in.nextLine()); // parse int takes a string and converts it to an int 
                if(result >= min || result<=max)
                    isValid=true;
            }catch(NumberFormatException ex){
                System.out.println("I said a Number!!!!!");
            }
        }
        
        return 0;
    }

    // private static int ExampleOne() {
    //     Scanner in=new Scanner(System.in);
    //     int result=-1;

    //     // while(result<1 || result >10){
    //         while(!(result>=1 && result<=10)){
    //         System.out.println("Please enter a number from one to ten: ");
    //         result = in.nextInt();
    //     }
    //     return result;
    // }
}

 
