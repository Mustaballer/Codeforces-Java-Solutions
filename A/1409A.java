import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        s.nextLine();
        long[] ans = new long[t];
        for (int i = 0; i < t; i++) {
            long a = s.nextLong();
            long b = s.nextLong();

            long diff = Math.abs(a-b);
            long counter = diff / 10;
            if (diff % 10 != 0) counter++;

            ans[i] = counter;
        }


        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}