import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String border = "";
        int len = s.length();
        for(int i = 1;i < len;i++){
          String prefix = s.substring(0,i);
          String suffix = s.substring(len - i);
          if(prefix.equals(suffix))
            border = prefix;
        }
        System.out.println(border);
        scan.close();
    }
}
