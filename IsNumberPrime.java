import java.io.*;
import java.util.*;

/* If a number is not Prime then its one of the factor is definately before the sqrt(num) */
public class IsNumberPrime{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int howManyNumbers = scn.nextInt();

        while(howManyNumbers > 0){
            int num = scn.nextInt();
            int count = 0;
            for(int i = 2; i * i < num; i++){
                if(num % i == 0){
                    count++;
                    break;
                }
            }
            if(count == 1){
                System.out.println("not prime");
            } else{
                System.out.println("prime");
            }
            howManyNumbers--;
        }
        scn.close();
    }
}