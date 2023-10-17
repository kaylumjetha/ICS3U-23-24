package Lesson5Hmrk;

import java.util.Scanner;

public class BMIHmrk {
    public static void main(String[] args) {
    Scanner in= new Scanner (System.in);

    int shape1=ShallowLenght*width*depthDeep;
    int shape2=transition*width*(depthDeep-depthShallow);
    int shape3=(lenght-ShallowLenght-transition)*width*depthShallow;
    int percent=(shape1+shape2+shape3)*0.1;
    int total1=(shape1+shape2+shape3)-percent;
        
    }
}
