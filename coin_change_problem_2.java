import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int V = scan.nextInt();
        int N = scan.nextInt();
        int[] coins = new int[N];
        for(int i = 0;i < N;i++) coins[i] = scan.nextInt();
        int INF = 1_000_000_000;
        int[] dp = new int[V + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int i = 1; i <= V; i++) {
            for (int coin : coins) {
                if (i >= coin && dp[i - coin] + 1 < dp[i]) {
                    dp[i] = dp[i - coin] + 1;
                }
            }
        }
        if (dp[V] >= INF) {
            System.out.println("-1");
        } else {
            System.out.println(dp[V]);
        }
    }
}
