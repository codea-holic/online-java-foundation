import java.util.*;\

// Don't give correct output for some of the test cases.
public class AnyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        // write your code here
        int total = 0;
        int p = 1;
        while (n2 > 0) {
            int n2digit = n2 % 10;
            int prd = GetProductwithSingleDigit(n1, n2digit, b);
            total = AnyBaseAddition(total, prd * p, b);
            n2 /= 10;
            p *= 10;
        }
        return total;
    }

    public static int GetProductwithSingleDigit(int n1, int digit, int base) {

        int retValue = 0;
        int shift = 1;
        int carry = 0;
        while (n1 > 0) {
            int mod = n1 % 10;
            int product = mod * digit;
            int sum = product % base + carry;
            carry = product / base;
            retValue += sum * shift;
            n1 /= 10;
            shift *= 10;
        }
        return retValue;
    }

    public static int AnyBaseAddition(int n1, int n2, int b) {

        int mod1, mod2, d, carry = 0, sum = 0, p = 1;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            mod1 = n1 % 10;
            mod2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            d = mod1 + mod2 + carry;
            carry = d / b;
            d = d % b;
            d = d * p;
            sum += d;
            p *= 10;
        }
        return sum;
    }
}
