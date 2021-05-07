import java.io.*;
import java.util.*;

// Easy -> Difference between maximum and minimum Value of an Array
public class SpanOfArray{

    public static int spanOfArray(int [] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){ 
                min = arr[i]; 
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max - min;
    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = scn.nextInt();
    }
    int span = spanOfArray(arr);
    System.out.println(span);
    scn.close();
 }
}