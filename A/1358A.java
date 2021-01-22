import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ans = new int[n];


        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            s.nextLine();

            int optimalNum = 0;

            if (b % 2 == 0) {
                optimalNum = (b/2) * a;

            }
            else {
                if (a % 2 == 0) {
                    optimalNum = ((b/2) * a) + a/2;
                } else {
                    optimalNum = ((b/2) * a) + (a/2) + 1;
                }
            }

            ans[i] = optimalNum;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }

    }
}
