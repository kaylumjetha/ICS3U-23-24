package lesson2;
import java.util.Scanner;
public class whileLoopsThree {
    public static void main(String[] args) {
        int result = exampleThree(1,100);
        System.out.println(result);
        int results=exampleFour(1,100);
        System.out.println(results);

    }

    private static int exampleFour(int min, int max) {
        int sum=0;
        int i=min;
        while(i<=max){
            sum+= i;
            i++;
        }

        return sum;
    }

    private static int exampleThree(int min, int max) {
       int sum=0;
        for(int i =1; i<= max; i++){
            sum+=1;

       }
       return sum;
    }
}
