import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int[] ans = new int[t];

        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int toOne = 0;
            int toZero = 0;

            for (int j = 0; j < n; j++) {
                int num = s.nextInt();
                if (j % 2 != num % 2) {
                    if (num % 2 == 1) {
                        toZero++;
                    } else {
                        toOne++;
                    }

                }
            }

            if (toOne != toZero) {
                ans[i] = -1;
            } else {
                ans[i] = toZero;
            }

        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}