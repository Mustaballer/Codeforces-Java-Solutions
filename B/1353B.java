import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int[] ans = new int[t];

        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int k = s.nextInt();

            s.nextLine();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = s.nextInt();
            }

            s.nextLine();
            int[] b = new int[n];
            for (int m = 0; m < n; m++) {
                b[m] = s.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            for (int d = 0, end = a.length - 1; d < a.length && k > 0; d++, k--, end--) {
                if (a[d] < b[end]) {
                    a[d] = b[end];
                }
            }

            int sum = 0;
            for (int q = 0; q < a.length; q++) {
                sum += a[q];
            }

            ans[i] = sum;
        }

        for (int i = 0; i < ans.length; i++) System.out.println(ans[i]);
    }
}