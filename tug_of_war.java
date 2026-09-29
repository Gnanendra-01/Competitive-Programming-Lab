import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }
        int k = n / 2;
        int target = total / 2;
        boolean[][] dp = new boolean[k + 1][total + 1];
        dp[0][0] = true;
        for (int weight : a) {
            for (int count = k; count >= 1; count--) {
                for (int sum = total; sum >= weight; sum--) {
                    if (dp[count - 1][sum - weight]) {
                        dp[count][sum] = true;
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int sum = 0; sum <= total; sum++) {
            if (dp[k][sum]) {
                ans = Math.min(ans, Math.abs(total - 2 * sum));
            }
        }
        System.out.println(ans);
    }
}
