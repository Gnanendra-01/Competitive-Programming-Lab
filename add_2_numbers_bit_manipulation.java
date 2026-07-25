import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        while(b != 0){
          int carry = a & b;
          a = a ^ b;
          b = carry << 1;
        }
        System.out.println(a);
    }
}
