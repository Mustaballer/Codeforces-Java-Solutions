import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] ans = new int[t];

        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int m = s.nextInt();

            if (n == 1) ans[i] = 0;
            else if (n == 2) ans[i] = m;
            else ans[i] = m+m;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}