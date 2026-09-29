import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++) arr[i][j] = scan.nextInt();
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(i == 0 && j == 0) continue;
                else if(i == 0) arr[i][j] += arr[i][j - 1];
                else if(j == 0) arr[i][j] += arr[i - 1][j];
                else arr[i][j] += Math.min(arr[i - 1][j],Math.min(arr[i][j -1],arr[i - 1][j - 1]));
            }
        }
        System.out.println(arr[n - 1][m - 1]);
    }
}
