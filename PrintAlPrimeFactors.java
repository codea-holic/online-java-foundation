import java.util.*;

public class PrintAllPrimeFactors{

public static void main(String[] args) {
  // write your code here
  Scanner scn = new Scanner(System.in);
  int num = scn.nextInt();
  for(int div = 2; div * div < num; div++){
      while(num % div == 0){
          num = num / div;
          System.out.print(div + " ");
      }
  }
  
  if(num != 1){ // if n is not equal to 1 then definately that remaining number is prime
      System.out.print(num);
  }
 }
}