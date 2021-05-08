import java.util.*;

public class GCDandLCM {

    public static int gcd(int num1, int num2) {
        if (num2 > num1) {
            int copy = num2;
            num2 = num1;
            num1 = copy;
        }

        while (num1 % num2 != 0) {
            int mod = num1 % num2;
            num1 = num2;
            num2 = mod;
        }

        return num2;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int gcd = gcd(num1, num2);
        int lcm = num1 * num2 / gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
}