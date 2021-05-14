import java.io.*;
import java.util.*;

public class Abbrevation {

    public static void solution(String str, String asf, int count, int pos){
        //write your code here
        if(pos == str.length()){
            if(count == 0){
                System.out.println(asf);
            } else{
                System.out.println(asf + count);
            }
            return;
        }
        // yes count != 0 ? asf + count + str.charAt(pos) : asf + str.charAt(pos)
        solution(str, count > 0 ? asf + count + str.charAt(pos) : asf + str.charAt(pos), 0, pos + 1);
        // no
        solution(str, asf, count + 1, pos + 1);
        
    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str,"",0,0);
    }
    
    
}