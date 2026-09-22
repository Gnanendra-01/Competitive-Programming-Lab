import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int q, r, s1 = 1, s2 = 0, s;
        int t1 = 0, t2 = 1, t;
        while(b > 0){
          q = a / b;
          r = a % b;
          t = t1 - (t2 * q);
          s = s1 - (s2 * q);
          a = b;
          b = r;
          s1 = s2;
          s2 = s;
          t1 = t2;
          t2 = t;
        }
        System.out.println(s1 + " " + t1 + " " + a);
    }
}
