import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] grid = new int[n][n];

        int counter = 0;
        // set values for the first column.
        while (counter < n) {
            grid[0][counter++] = 1;
        }

        // max variable
        int max = 1;

        for (int i = 1; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (j == 0) {
                    grid[i][j] = 1;
                } else {
                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
                }
                max = Math.max(max, grid[i][j]);
            }
        }

        // THIS CODE PRINTS GRID TO CONSOLE
        // for (int i = 0; i < grid.length; i++) {
        //   for (int j = 0; j < grid[i].length; j++) {
        //     System.out.print(grid[i][j] + " ");

        //   }
        //   System.out.println();
        // }

        System.out.println(max);
    }
}