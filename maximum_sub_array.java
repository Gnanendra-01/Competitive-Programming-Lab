import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = scan.nextInt();
        }
        int maxSum = 0;
        int currSum = 0;
        for(int i = 0;i < n;i++){
            currSum += arr[i];
            currSum = (currSum < 0)?0:currSum;
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }
}
