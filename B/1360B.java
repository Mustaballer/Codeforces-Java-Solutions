import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        s.nextLine();
        int[] ans = new int[t];

        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            s.nextLine();
            int[] nums = new int[n];
            for (int r = 0; r < n; r++) {
                nums[r] = s.nextInt();
            }
            Arrays.sort(nums);
            s.nextLine();

            int diff = 1000;

            for (int j = 1; j < n; j++) {
                diff = Math.min(Math.abs((nums[j])-nums[j-1]), diff);
            }

            ans[i] = diff;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}