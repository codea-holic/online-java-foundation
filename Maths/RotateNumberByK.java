import java.util.*;

public class RotateNumberByK {

    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int noOfDigits = countDigit(n);

        k = k % noOfDigits;
        if (k < 0) {
            k += noOfDigits;
        }

        int divisor = (int) Math.pow(10, k);
        int multiplier = (int) Math.pow(10, noOfDigits - k);

        int reqNum = n % divisor * multiplier + n / divisor;
        System.out.println(reqNum);
    }
}
