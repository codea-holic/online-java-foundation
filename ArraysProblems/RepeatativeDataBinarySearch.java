package ArraysProblems;
import java.util.*;

// You have to find first and last Index of repeatative data through Binary Seach

public class RepeatativeDataBinarySearch{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] a = new int[n];
    for (int i = 0; i < a.length; i++) {
        a[i] = scn.nextInt();
    }
    int data = scn.nextInt();
    int low = 0;
    int high = a.length - 1;
    int found = -1;
    while(low <= high){
        int mid = (low + high) / 2;
        if(data < a[mid]){
            high = mid - 1;
        } else if( data > a[mid]){
            low = mid + 1;
        } else{
            found = mid;
            low = mid + 1;
        }
    }
    int first = found;
    if(found == -1){
        System.out.println(-1);
        System.out.print(-1);
        return;
    }
    while(a[first] == a[found]){
        first--;
    }
    System.out.println(first + 1);
    System.out.print(found);
 }
}