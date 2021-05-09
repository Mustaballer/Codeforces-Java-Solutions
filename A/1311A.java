import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            int steps = 0;
            int a = s.nextInt();
            int b = s.nextInt();

            if (a == b) {
                steps = 0;
            }
            else if (a < b) {
                if ((b-a)%2 != 0) {
                    steps++;
                } else {
                    steps+=2;
                }
            }
            else if (a > b) {
                if ((a-b)%2 != 0) {
                    steps+=2;
                } else {
                    steps++;
                }
            }
            arr[i] = steps;
            s.nextLine();
        }

        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }
    }
}