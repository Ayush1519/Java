import java.util.*;
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Hello guys");

        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - i - 1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            
            //using set
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        sb.delete(0, 2);
        sb.append("e");
        System.out.println(sb);
    }
}
