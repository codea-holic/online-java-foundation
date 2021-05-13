import java.io.*;
import java.util.*;

// required [---, --c, -b-, -bc, a--, a-c, ab- , abc]
public class getSubsequences {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        ArrayList <String> al = gss(str);
        System.out.print(al);
    }

    // required [---, --c, -b-, -bc, a--, a-c, ab- , abc]
    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList <String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        char ch = str.charAt(0);
        String ss = str.substring(1);
        ArrayList <String> al = gss(ss);

        ArrayList <String> res = new ArrayList<>();
        for(String s : al){
            res.add("" + s);
        }
        for(String s: al){
            res.add(ch + s);
        }
        return res;
    }

}