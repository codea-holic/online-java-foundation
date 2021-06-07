import java.util.*;

public class CountSort {

  public static void countSort(int[] arr, int min, int max) {
   int [] farr = new int[max - min + 1];
   for(int i = 0; i < arr.length; i++){
       farr[arr[i] - min]++;
   }
   
   for(int i = 1; i < farr.length; i++){
    farr[i] += farr[i - 1];
   }
   int [] ans = new int[arr.length];
   
   for(int i = arr.length - 1; i >= 0; i--){
       int val = arr[i];
       int pos = farr[val - min];
       int idx = pos - 1;
       ans[idx] = val;
       farr[val - min]--;
   }
   
   for(int i = 0; i < arr.length; i++){
       arr[i] = ans[i];
   }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    scn.close();
    countSort(arr,min,max);
    print(arr);
  }

}