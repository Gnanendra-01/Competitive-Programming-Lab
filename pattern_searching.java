import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String txt = scan.nextLine();
        String pat = scan.nextLine();
        List<Integer> occurrences = new ArrayList<>();
        
        int n = txt.length();
        int m = pat.length();
        long patHash = 0;
        long txtHash = 0;
        long h = 1;
        int d = 256;
        long q = 101;
        for(int i = 0;i < m - 1;i++){
          h = (h * d) % q;
        }
        for(int i = 0;i < m;i++){
          patHash = (d * patHash + pat.charAt(i)) % q;
          txtHash = (d * txtHash + txt.charAt(i)) % q;
        }
        for(int i = 0; i <= n - m;i++){
          if(patHash == txtHash){
            int j;
            for(j = 0;j < m;j++){
              if(txt.charAt(i + j) != pat.charAt(j)) break;
            }
            if(j == m) occurrences.add(i);
          }
          if(i < n - m){
            txtHash = (d * (txtHash - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
            if(txtHash < 0){
              txtHash += q;
            }
          }
        }
        for(int i:occurrences)
          System.out.println(i);
        
    }
}
