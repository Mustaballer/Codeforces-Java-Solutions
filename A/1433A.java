import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        int[] ans = new int[t];

        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int dummy = n;
            int sum = 10 * (n%10);
            int digits = 0;
            while (dummy != 0) {
                dummy/=10;
                digits++;
            }
            int digitCounter = 4-digits;
            int subtract = 4;
            while (digitCounter > 0) {
                sum -= subtract--;
                digitCounter--;
            }

            ans[i] = sum;
        }


        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}