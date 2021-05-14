import java.io.*;
import java.util.*;

/* Question: - An n (no. of elements of an array) is given in first line and next line contains elements
5
3 1 0 7 5
Print the Bar chart for corresponding elements

Required Answer: - (Below) 
            *
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*

You should print the bar chart with the help of asterick(*)
*/

public class PrintBarChart{

    public static void BarChart(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] >= i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = scn.nextInt();
    }
    BarChart(arr);
 }
}