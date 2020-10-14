import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        int[] t1 = new int[5000];
        int[] t2 = new int[5000];
        int[] t3 = new int[5000];
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                t1[a] = i+1;
                a++;
            } else if (arr[i] == 2) {
                t2[b] = i+1;
                b++;
            } else if (arr[i] == 3) {
                t3[c] = i+1;
                c++;
            }
        }

        int w = Math.min(a, b);
        int we = Math.min(w, c);
        System.out.println(we);

        for (a = 0, b = 0, c = 0; a < we && b < we && c < we; a++, b++, c++) {
            System.out.println(t1[a] + " " + t2[b] + " " + t3[c]);
        }
    }
}