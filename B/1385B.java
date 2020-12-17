import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        String[] res=new String[t];
        for (int i = 0; i < res.length; i++) {
            res[i] = "";
        }


        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            s.nextLine();
            HashMap<Integer, Integer> map = new HashMap<>();

            String lines = s.nextLine();

            String[] strs = lines.trim().split("\\s+");
            int nums[] = new int[strs.length];
            for (int k = 0; k < strs.length; k++) {
                nums[k] = Integer.parseInt(strs[k]);
            }

            for (int j = 0; j < nums.length; j++) {
                if (map.containsKey(nums[j])) {
                    continue;
                } else {
                    map.put(nums[j], 0);
                    if (j == 0) {
                        res[i]=strs[j];
                    } else {
                        res[i]= res[i]+" "+strs[j];
                    }
                }
            }

        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}