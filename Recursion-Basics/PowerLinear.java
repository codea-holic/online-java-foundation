import java.io.*;
import java.util.*;

public class PowerLinear {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        System.out.println(power(scn.nextInt(), scn.nextInt()));
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int pow = power(x, n - 1);
        return pow * x;
    }
}