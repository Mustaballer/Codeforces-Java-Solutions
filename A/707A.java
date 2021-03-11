import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        int n = s.nextInt();
        s.nextLine();


        boolean fail = false;

        for (int i = 0; i < m; i++) {
            String line = s.nextLine();
            line = line.replaceAll("\\s+","");

            for (int j = 0; j < n; j++) {
                char c = line.charAt(j);
                if (c=='C' || c=='M' || c=='Y') {
                    fail = true;
                }

            }
        }

        if (fail) {
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }

    }
}