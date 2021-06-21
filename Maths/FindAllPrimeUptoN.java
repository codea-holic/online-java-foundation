package Maths;
import java.util.*;

// Sieve of Eratostheneses
public class FindAllPrimeUptoN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean [] barr = new boolean[n + 1];
        Arrays.fill(barr, true);
        for(int i = 2; i * i <= n; i++){
            if(barr[i] == true){
                for(int j = i + i; j <= n; j += i){
                    barr[j] = false;
                }
            }
        }

        for(int i = 2; i < barr.length; i++){
            if(barr[i] == true){
                System.out.print(i + " ");
            }
        }
        scn.close();
    }
}
