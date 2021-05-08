// package TwoDArray;

import java.util.*;

public class SpiralTraversal {

    public static void main(String[] args) throws Exception {
        // write your code here
        // Print Box by box
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int count = 0;
        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length - 1;
        int maxcol = arr[0].length - 1;
        while (count < n * m) {
            // left wall
            for (int i = minrow, j = mincol; i <= maxrow && count < n * m; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            mincol++;

            // bottom wall
            for (int i = maxrow, j = mincol; j <= maxcol && count < n * m; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxrow--;

            // right wall
            for (int i = maxrow, j = maxcol; i >= minrow && count < n * m; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxcol--;

            // top wall
            for (int i = minrow, j = maxcol; j >= mincol && count < n * m; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minrow++;
        }
        scn.close();
    }
}
