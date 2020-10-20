import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        int[] ans = new int[t];
        for (int i = 0; i < ans.length; i++) {
            double n = s.nextDouble();
            int aS = 0;
            int bS = 0;

            if (n == 2) {
                ans[i] = 2;
            } else {
                int aMembers = (int)n/2 - 1;
                for (int num = 2, back = (int)Math.pow(2, n); num < back; num*=2) {
                    if (num == 2) {
                        aS += back;
                    }
                    if (aMembers > 0 ) {
                        aS += num;
                    } else {
                        bS += num;
                    }
                    aMembers--;
                }
                ans[i] = Math.abs(aS-bS);
            }

        }


        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}