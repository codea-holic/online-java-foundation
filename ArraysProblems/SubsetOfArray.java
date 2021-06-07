package ArraysProblems;
import java.util.*;

public class SubsetOfArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int noOfSubsets = (int)Math.pow(2, n);
        for(int i = 0; i < noOfSubsets; i++){
            // Convert the number into binary in '0's and '1's to know which element should be printed.
            int copy = i;  // copy has taken becoz 'i' is control loop;
            String subset = "";
            for(int j = arr.length - 1; j >= 0; j--){
                int remainder = copy % 2;
                copy /= 2;
                if(remainder == 0){
                    subset = "-\t" + subset; 
                } else{
                    subset = arr[j] + "\t" + subset;
                }
            }
            scn.close();
            System.out.println(subset);
        }
    }
    
}
