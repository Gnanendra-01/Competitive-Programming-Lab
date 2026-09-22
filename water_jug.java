import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int T = scan.nextInt();
        if(T > Math.max(A, B)) System.out.println("NO");
        else{
            int gcd = gcd(A, B);
            if(T % gcd == 0){
                System.out.println("YES");
                return ;
            }
            System.out.println("NO");
        }
    }
    private static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
