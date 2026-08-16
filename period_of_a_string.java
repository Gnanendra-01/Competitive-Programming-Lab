import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = s.length();
        for(int P = 1;P <= n;P++){
          if(n % P != 0){
            continue;
          }
          boolean valid = true;
          for(int i = 0;i < n;i++){
            if(s.charAt(i) != s.charAt(i % P)){
              valid = false;
              break;
            }
          }
          if(valid){
            System.out.println(P);
            break;
          }
        }
        scan.close();
    }
}
