import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int two = 2;
        int three = 3;

        System.out.println(n/2);
        if (n % 2 == 0) {
            for (int i = 0; i < n /2; i++) {
                System.out.print(two + " ");
            }
        }
        else {
            for (int i = 0; i < n /2 - 1; i++) {
                System.out.print(two + " ");
            }
            System.out.print(three + " ");
        }
    }
}