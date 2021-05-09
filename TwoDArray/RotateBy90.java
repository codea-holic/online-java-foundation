import java.io.*;
import java.util.*;


// Rotate Matrix by 90 degree clockwise.
public class RotateBy90 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        rotate(arr);
        display(arr);
    }
    
    public static void swap(int [][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    
    public static void rotate(int [][] arr){
        
        // For Transpose of Matrix
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <= i; j++){
                if(i != j){
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}