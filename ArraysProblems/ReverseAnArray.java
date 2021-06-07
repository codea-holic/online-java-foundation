
import java.io.*;
import java.util.*;

public class ReverseAnArray {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] arr) {
    // write your code here
    for (int i = 0; i < arr.length / 2; i++) {
      int lastIdx = arr.length - 1 - i;
      int temp = arr[i];
      arr[i] = arr[lastIdx];
      arr[lastIdx] = temp;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    reverse(a);
    display(a);
  }

}