//package TwoDArray;

/* Question:- 1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.
*/


import java.io.*;
import java.util.*;

public class ExitPointofMatrix {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr = new int[n][m];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int direction = 0;  // 1 -- east, 2-- south, 3 -- west, 4-- north 
        int i = 0, j = 0;
        while(true){
            direction = (direction + arr[i][j]) % 4;
            
            if(direction == 0){ // east
                j++;
            } else if(direction == 1){ // south
                i++;
            } else if(direction == 2){ // west
                j--;
            } else{ // north
                i--;
            }
            
            
            if (i < 0){
                i++;
                break;
            } else if(j < 0){
                j++;
                break;
            } else if(i == arr.length){
                i--;
                break;
            } else if(j == arr.length){
                j--;
                break;
            }
        }
        
        System.out.println(i + "\n" + j);
    }

}