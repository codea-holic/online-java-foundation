import java.io.*;
import java.util.*;

public class Main {
    public static void MatrixMultiplication(int[][] a, int[][] b, int n1, int m1, int m2) {
        int[][] prd = new int[n1][m2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                int sum = 0;

                for (int k = 0; k < m1; k++) {
                    sum += a[i][k] * b[k][j];
                }
                prd[i][j] = sum;
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(prd[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] a1 = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                a1[i][j] = scn.nextInt();
            }
        }
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] a2 = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                a2[i][j] = scn.nextInt();
            }
        }
        // for(int i = 0; i < n; i++){
        // for(int j = 0; j < m; j++){
        // System.out.print(a[i][j] + " ");
        // }
        // System.out.println();
        // }

        if (m1 != n2) {
            System.out.println("Invalid input");
            return;
        }

        MatrixMultiplication(a1, a2, n1, n2, m2);
    }

}