import java.util.*;

/* Question Suppose this is given number 25134  ->(from last) 4 is at 1st postion,
 3 is at 2nd pos, 1 is at 3rd pos, 5 is at 4th pos, 2 is at 5 pos.
2(5), 4(4), 1(3), 5(2), 3(1)  
The inverse of the given number is ->  4(5) 1(4) 2(3) 5(2) 3(1) -> 41253 */

public class InverseOfNum {

public static void main(String[] args) {
    // write your code here 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int inv = 0;
    int op = 1;
    while(n != 0){
        int od = n % 10;
        int id = op;
        int ip = od;
        inv = inv + id * (int)Math.pow(10, ip - 1);
        
        n = n / 10;
        op++;
    }
    System.out.println(inv);
   }
}
