package Recursion-Basics;

import java.io.*;
import java.util.*;

// You have to return an array that has all the indices where your given number found.
public class FindEveryIndexes {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf)     {
        if(idx == arr.length){
            return new int[fsf];
        }
        // write ur code here
        int [] res;
        if(arr[idx] == x){
            res = allIndices(arr, x, idx + 1, fsf + 1);
        } else{
			res = allIndices(arr, x, idx + 1, fsf);
		}
        
        if(arr[idx] == x){
            res[fsf] = idx;
        }
        
        return res;
    }
}