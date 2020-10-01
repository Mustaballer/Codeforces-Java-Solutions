import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        s.nextLine();

        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            int n = s.nextInt();


            int a = n % x;
            if (a - y >= 0) {
                n = n - (a - y);
            } else {
                n = n - a - x + y;
            }
            ans[i] = n;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}