import java.io.*;
import java.util.*;

public class PrintEncoding {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        printEncodings(scn.next(), "");
    }

    public static void printEncodings(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }

        String oneDigit = "" + str.charAt(0);
        int od = Integer.parseInt(oneDigit);
        if (od > 0) {
            char val = (char) ('a' + od - 1);
            printEncodings(str.substring(1), asf + val);
        }

        if (str.length() >= 2) {
            String twoDigit = str.substring(0, 2);

            int td = Integer.parseInt(twoDigit, 10);

            if (td >= 10 && td <= 26) {
                char val12 = (char) ('a' + od - 1);
                printEncodings(str.substring(2), asf + val12);
            }
        }
    }

}