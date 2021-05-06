import java.util.*;

public class PrintFibonacciTillN {

  public static void main(String[] args) {
    // write your code here

    Scanner scn = new Scanner(System.in);
    int uptoWhere = scn.nextInt();

    int a = 0, b = 1, c = 0;
    for (int i = 0; i < uptoWhere; i++) {
      System.out.println(c);
      a = b;
      b = c;
      c = a + b;
    }
  }
}