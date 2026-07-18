import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = scan.nextInt();
        }
        int maxSum = arr[0],currSum = arr[0];
        for(int i = 1;i < n;i++){
            currSum += arr[i];
            if(arr[i] < arr[i - 1])currSum = 0;
            maxSum = Math.max(maxSum, currSum); 
        }
        System.out.print(maxSum);
        
    }
}
