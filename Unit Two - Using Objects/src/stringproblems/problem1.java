package stringproblems;

public class problem1 {
    public static void main(String[] args) {
        String tag = "[[]]";
        String word = "Hey";
        String result = tag.substring(0,2) + word + tag.substring(2);
        System.out.println(result);
    }
}

