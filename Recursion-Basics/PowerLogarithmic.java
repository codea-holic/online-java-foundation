import java.io.*;
import java.util.*;

class PowerLog {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print(power(scan.nextInt(), scan.nextInt()));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int exponent = power(x, n / 2); // exponent = power of n/2
        if (n % 2 == 1) {
            return x * exponent * exponent;
        }
        else {
            return exponent * exponent;
        }
    }
}
