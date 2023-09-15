package Lesson3;

public class Example5 {
    public static void main(String[] args) {
        int mark1=80, mark2=88, mark3=97;
        double average= (mark1+mark2+mark3)/3.0;
        // we need to make sure to divide by 3.0 to do double math at get 88.33333 average
        // dividing by 3 does int math, and we get 88 average 
        System.out.println(average);
    }
}
