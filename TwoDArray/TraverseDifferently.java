package TwoDArray;

/* Question:- Different traversal:
1  2  3
4  5  6
7  8  9
Required Answer: - 1->4->7->8->5->2->3->6->9
*/
import java.io.*;
import java.util.*;

public class TraverseDifferently {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int j = 0;
        for (int i = 0; i < arr[0].length; i++) {
            while (j < arr.length && j >= 0) {
                System.out.println(arr[j][i]);

                if (i % 2 == 0) {
                    j++;
                } else {
                    j--;
                }
            }

            if (i % 2 == 0) {
                j--;
            } else {
                j++;
            }
        }
    }

}