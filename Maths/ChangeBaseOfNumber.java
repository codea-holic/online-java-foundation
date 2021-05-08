import java.util.*;

public class ChangeBaseOfNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        long dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
    }

    public static long getValueInBase(int num, int base) {
        // write code here

        long shifter = 1; // for place value
        long reqValue = 0;
        while (num > 0) {
            int rem = num % base;
            reqValue += rem * shifter;
            shifter = shifter * 10;
            num /= base;
        }

        return reqValue;
    }
}