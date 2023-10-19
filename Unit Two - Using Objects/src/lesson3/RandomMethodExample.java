package lesson3;

public class RandomMethodExample {
    public static void main(String[] args) {
        System.out.println((int)(Math.random()*10)+1);// random number from 1-10
        System.out.println((int)(Math.random()*21)-10); 
        // genertic forumla is (int)(Math.random()*20)-10
        // the *21 is the number of possibilties you want 
        // the -10 is where you start from
        // so, if i want a number from 1 to 30, i write
        //(int)(Math.random()*30)+1
        // if i want a number from -10 to 30, i write
        //(int)(Math.random()*31)-10 (make sure you include 0, so its 31, not 30.)


        // very simplified 
        //System.out.println((int)(Math.random()*(upperbound-lowerbound+1)+lower bound)
    }
}
