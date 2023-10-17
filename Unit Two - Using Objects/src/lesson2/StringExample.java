package lesson2;

public class StringExample {
  public static void main(String[] args) {
    String s1="alphabet soup";

    int len = s1.length();
    System.out.println("The Lenght of s1 is " + len);
    System.out.println("The Lenght of s1 is " + s1.length());

    int index= s1.indexOf("bet");
    System.out.println("The index of bet in s1 is: " + index);
    String s2 = "happy";
    System.out.println("The index of bet in s1 is: " + s1.indexOf("s2"));

    // substring methods
    String subString1=s1.substring(5, 8);
    String subString2=s2.substring(0);
    System.out.println(subString1);
    System.out.println(subString2);

    System.out.println("desk".length());

    // equals method 
    System.out.println(s1.equals(s2));
    



}
}
