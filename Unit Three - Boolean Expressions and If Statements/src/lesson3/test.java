package lesson3;
public class test {
    public static void main(String[] args) {
        boolean a =true;
        boolean b=false;
        boolean c = false;
        
        System.out.println(a && (b||c));
        System.out.println((a&&b)||(a&&c));
    }
}
