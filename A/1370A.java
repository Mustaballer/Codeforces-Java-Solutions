import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] ans = new int[t];

        for (int i = 0; i < t; i++) {
            ans[i] = (s.nextInt()) /2;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}