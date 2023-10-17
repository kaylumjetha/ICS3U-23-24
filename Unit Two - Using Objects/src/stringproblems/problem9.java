package stringproblems;
public class problem9 {
    public static void main(String[] args) {
        String hi = "Hamburgers";
        int hiLenght=hi.length();
        int x = (hiLenght/2);
        int y = x-1;

        String result = hi.substring(y,x+1);

        System.out.println(result);
    }
}
