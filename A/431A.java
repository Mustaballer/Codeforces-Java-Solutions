import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = s.nextInt();
        }
        s.nextLine();

        String num = s.nextLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            sum += arr[digit-1];
        }


        System.out.println(sum);
    }
}