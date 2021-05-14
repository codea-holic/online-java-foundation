import java.io.*;
import java.util.*;

// Merge Two Sorted Array code is already written you have to complete Merge sort code.
// (delete both the lines after making the changes)
public class MergeSort {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    int [] res = new int[a.length + b.length];
    int k = 0, i, j;
    i = j = 0;
    while(i < a.length && j < b.length){
        if(a[i] <= b[j]){
            res[k] = a[i];
            i++;
        } else if(b[j] < a[i]){
            res[k] = b[j];
            j++;
        }
        k++;
    }
    
    while(i < a.length){
        res[k] = a[i];
        i++;
        k++;
    }
    while(j < b.length){
        res[k] = b[j];
        j++;
        k++;
    }
    return res;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }

  //main
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}